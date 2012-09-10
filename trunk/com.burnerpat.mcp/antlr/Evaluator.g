tree grammar Evaluator;

options
{
	tokenVocab = Parser;
	language = Java;
	ASTLabelType = CommonTree;
}

@header
{
	package com.burnerpat.mcp;
	
	import java.util.HashSet;
	import java.util.ArrayList;
}

@members
{
	Memory memory = Memory.getInstance();
	Environment env = Environment.getInstance();
}

statement returns [boolean wasExpression]
@init
{
	wasExpression = false;
}
:
	expression {$wasExpression = true;}
	| assignment
	| command
;

expression returns [double value]
@after
{
	memory.setResult($value);
}
:
	^('+' a=expression b=expression) {$value = $a.value + $b.value;}
	| ^('-' a=expression b=expression) {$value = $a.value - $b.value;}
	| ^('*' a=expression b=expression) {$value = $a.value * $b.value;}
	| ^('/' a=expression b=expression) {$value = $a.value / $b.value;}
	| ^('%' a=expression b=expression) {$value = $a.value \% $b.value;}
	| ^('^' a=expression b=expression) {$value = Math.pow($a.value, $b.value);}
	| NUMBER {$value = Double.parseDouble($NUMBER.text);}
	| ^(NEGATE a=expression) {$value = -$a.value;}
	| ^(VARIABLE ID) {$value = memory.getVariable($ID.text);}
	| ^(VARIABLE ID index) {$value = memory.getVariable($ID.text, $index.result);}
	| ^(CALL ID parameters?) {$value = memory.callFunction($ID.text, $parameters.result);}
;

parameters returns [ArrayList<Double> result]
@init
{
	$result = new ArrayList<Double>();
}
:
	^(PARAMETERS (p=expression {$result.add(new Double($p.value));})+)
;

index returns [int result]
@init
{
	result = -1;
}
:
	^(INDEX NUMBER) {$result = Integer.parseInt($NUMBER.text);}
;

assignment 
:	
	^(ASSIGN ^(VARIABLE ID) expression) {memory.setVariable($ID.text, -1, $expression.start);}
	| ^(ASSIGN ^(VARIABLE ID index) expression) {memory.setVariable($ID.text, $index.result, $expression.start);}
	| ^(ASSIGN ^(FUNCTION ID paramDef?) expression) {memory.setFunction($ID.text, $paramDef.result, $expression.start);}
;

paramDef returns [HashSet<String> result]
@init
{
	$result = new HashSet<String>();
}
:
	^(PARAMETERS (p=ID {$result.add($p.text);})+)
;

command
:
	^(COMMAND ID commandParams?) {env.command($ID.text, $commandParams.result);}
;

commandParams returns [ArrayList<String> result]
@init
{
	$result = new ArrayList<String>();
}
:
	^(PARAMETERS (p=ID {$result.add($p.text);})+)
;