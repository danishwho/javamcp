tree grammar TreeWriter;

options
{
	tokenVocab = Parser;
	language = Java;
	ASTLabelType = CommonTree;
}

@header
{
	package com.burnerpat.mcp;
}

@members
{

}

expression returns [String result]
:
	^(o=addOp a=expression b=expression) {$result = $a.result + $o.value + $b.result;}
	| ^(o=mulOp a=followUpExpr b=followUpExpr) {$result = $a.result + $o.value + $b.result;}
	| NUMBER {$result = $NUMBER.text;}
	| ^(VARIABLE ID) {$result = $ID.text;}
	| functionCall {$result = $functionCall.result;}
;

followUpExpr returns [String result]
:
	^(o=addOp a=expression b=expression) {$result = "(" + $a.result + $o.value + $b.result + ")";}
	| ^(o=mulOp a=followUpExpr b=followUpExpr) {$result = $a.result + $o.value + $b.result;}
	| NUMBER {$result = $NUMBER.text;}
	| ^(VARIABLE ID) {$result = $ID.text;}
	| functionCall {$result = $functionCall.result;}
;

mulOp returns [String value]
@after
{
	$value = " " + $value + " ";
}
:
	'*' {$value = "*";}
	| '/' {$value = "/";}
	| '%' {$value = "\%";}
	| '^' {$value = "^";}
;

addOp returns [String value]
@after
{
	$value = " " + $value + " ";
}
:
	'+' {$value = "+";}
	| '-' {$value = "-";}
;

functionCall returns [String result]
:
	^(CALL ID parameters?)
	{
		$result = $ID.text + "(";
		$result += ($parameters.result != null) ? ($parameters.result) : "";
		$result += ")";
	}
;

parameters returns [String result]
@init
{
	$result = null;
}
:
	^(PARAMETERS (p=expression 
	{
		if ($result != null)
		{
			$result += ", " + $p.result;
		}
		else
		{
			$result = $p.result;
		}
	})+)
;