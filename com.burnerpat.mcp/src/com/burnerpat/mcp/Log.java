package com.burnerpat.mcp;

import java.io.OutputStream;
import java.io.PrintWriter;

public class Log {
	
	private static PrintWriter writer = null;
	
	private Log()
	{
		
	}
	
	public static void init(OutputStream out)
	{
		if (writer == null)
		{
			writer = new PrintWriter(out, true);
		}
	}
	
	public static void error(String message)
	{
		writer.println("ERROR: " + message);
	}
	
	public static void warning(String message)
	{
		writer.println("WARNING: " + message);
	}
	
	public static void write(String message)
	{
		writer.println(message);
	}
}
