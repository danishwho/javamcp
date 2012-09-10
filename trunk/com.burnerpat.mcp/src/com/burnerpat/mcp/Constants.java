package com.burnerpat.mcp;

public class Constants {
	
	public static void fill(Scope scope)
	{
		scope.put(new Variable("pi", new Double(Math.PI)));
		scope.put(new Variable("e", new Double(Math.E)));
	}
}
