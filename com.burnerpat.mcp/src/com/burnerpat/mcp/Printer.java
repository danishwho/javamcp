package com.burnerpat.mcp;

public class Printer {
	
	public static void printFunctions()
	{
		Log.write("Functions:\n===============");
		
		for (Function f : Memory.getInstance().getFunctions())
		{
			Log.write(f.toString());
		}
	}
	
	public static void printVariables()
	{
		
	}
}
