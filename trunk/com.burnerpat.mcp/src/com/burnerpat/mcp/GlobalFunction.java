package com.burnerpat.mcp;

import java.util.ArrayList;

public class GlobalFunction extends Function {
	
	public static final String[] ALL = new String[] {
			"sin",
			"cos",
			"tan",
			"asin",
			"arcsin",
			"acos",
			"arccos",
			"atan",
			"arctan",
			"sqrt",
			"sqr"
	};
	
	public GlobalFunction(String name)
	{
		super(name, null);
	}
	
	public double evaluate(ArrayList<Double> parameters)
	{
		try
		{
			switch (super.getName())
			{
			case "sin":
				return Math.sin(parameters.get(0));
			case "cos":
				return Math.cos(parameters.get(0));
			case "tan":
				return Math.tan(parameters.get(0));
			case "asin":
			case "arcsin":
				return Math.asin(parameters.get(0));
			case "acos":
			case "arccos":
				return Math.acos(parameters.get(0));
			case "atan":
			case "arctan":
				return Math.atan(parameters.get(0));
			case "sqrt":
				return Math.sqrt(parameters.get(0));
			case "sqr":
				return parameters.get(0) * parameters.get(0);
			default:
				return Double.NaN;
			}
		}
		catch (Exception ex)
		{
			return Double.NaN; //error handling... maybe
		}
	}
}
