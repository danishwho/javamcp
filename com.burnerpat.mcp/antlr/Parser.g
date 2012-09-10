grammar Parser;

options
{
	output = AST;
	language = Java;
}

tokens
{
	NEGATE;
	ASSIGN;
	FUNCTION;
	VARIABLE;
	CALL;
	PARAMETERS;
	COMMAND;
	INDEX;
}

@parser::header
{
	package com.burnerpat.mcp;
}

@parser::members
{

  @Override
  protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    throw new MismatchedTokenException(ttype, input);
  }

  @Override
  public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    throw e;
  }
}

@rulecatch {
    catch (RecognitionException e) {
        throw e;
    }
}

@lexer::header
{
  package com.burnerpat.mcp;
}

@lexer::members
{
    @Override
    public void reportError(RecognitionException e) {
        throw new RuntimeException(e);
    }
}

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

NUMBER
:
	DIGIT+ ('.' DIGIT+)? |
	'.' DIGIT+
;

fragment DIGIT
:
	'0'..'9'
;

ID
:
	(LETTER | '_') (LETTER | DIGIT | '_')*
;

fragment LETTER
:
	'A'..'Z' | 'a'..'z'
;

statement
:
	expression |
	assignment |
	command
;

expression
:	
	addExpression
;

addExpression
:
	mulExpression (('+'^ | '-'^) mulExpression)*
;

mulExpression
:
	atomExpression (('*'^ | '/'^ | '%'^ | '^'^) atomExpression)*
;

atomExpression
:
	'-' atomExpression -> ^(NEGATE atomExpression) 
	| NUMBER^
	| variable
	| functionCall
	| '(' addExpression ')' -> addExpression
;

assignment
:
	variable '=' expression -> ^(ASSIGN variable expression)
	| functionDef '=' expression -> ^(ASSIGN functionDef expression)
;

variable
:
	ID index? -> ^(VARIABLE ID index?)
;

index
:
	'[' NUMBER ']' -> ^(INDEX NUMBER)
;

functionCall
:
	ID '(' parameters? ')' -> ^(CALL ID parameters?)
;

parameters
:
	expression (',' expression)* -> ^(PARAMETERS expression*)
;

functionDef
:
	ID '(' parameterDef? ')' -> ^(FUNCTION ID parameterDef?)
;

parameterDef
:
	(ID (',' ID)*) -> ^(PARAMETERS ID*)
;

command
:
	'/' ID commandParams? -> ^(COMMAND ID commandParams?)
;

commandParams
:
	ID+ -> ^(PARAMETERS ID+)
;