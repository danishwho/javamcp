package com.burnerpat.mcp;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map.Entry;

public class Environment {
	
	private static Environment instance = new Environment();
	
	private Environment()
	{

	}
	
	public static Environment getInstance()
	{
		return instance;
	}
	
	public void command(String cmd, List<String> params)
	{
		try
		{
			Method method = this.getClass().getMethod(cmd.toLowerCase(), List.class);
			
			try 
			{
				method.invoke(this, params);
			} 
			catch (IllegalAccessException e) 
			{
				Log.error("Access error");
			} 
			catch (IllegalArgumentException e) 
			{
				Log.error("Illegal argument(s)");
			} 
			catch (InvocationTargetException e) 
			{
				Log.error("Invocation error");
			}
		}
		catch (SecurityException ex)
		{
			Log.error("Security Exception");
		}
		catch (NoSuchMethodException ex)
		{
			Log.error("Unknown command");
		}
	}
	
	public void test(List<String> params)
	{
		Log.write("Test method invoked with params:");
		
		if (params == null)
		{
			Log.write("no params");
			return;
		}
		
		for (String s : params)
		{
			Log.write(s);
		}
	}

	public void cls(List<String> params)
	{
		try 
		{
			Runtime.getRuntime().exec("cmd");
		} 
		catch (IOException e) 
		{

		}
	}

	public void clear(List<String> params)
	{
		if (params == null || params.size() != 1)
		{
			Log.write("Usage: /CLEAR <target>");
			return;
		}
		
		String target = params.get(0).toLowerCase();
		
		switch (target)
		{
		case "vars":
		case "variables":
		case "v":
			Memory.getInstance().clearVariables();
			break;
		case "funcs":
		case "functions":
		case "f":
			Memory.getInstance().clearFunctions();
			break;
		case "all":
		case "everything":
			Memory.getInstance().clearFunctions();
			Memory.getInstance().clearVariables();
			break;
		default:
			Log.error("Illegal target");
			return;
		}
		
		Log.write("OK");
	}

	public void help(List<String> params)
	{
		for (Method m : this.getClass().getMethods())
		{
			if (!m.getName().equals("command") &&
				!m.getName().equals("getInstance") && 
				m.getDeclaringClass().getSimpleName().equals("Environment"))
			{
				Log.write(m.getName().toUpperCase());
			}
		}
	}
	
	public void exit(List<String> params)
	{
		System.exit(0);
	}
	
	public void list(List<String> params)
	{
		if (params == null || params.size() != 1)
		{
			Log.write("Usage: /LIST <array>");
			return;
		}
		
		String target = params.get(0);
		
		Variable v = Memory.getInstance().findVariable(target);
		
		if (v == null)
		{
			Log.write("<undefined>");
			return;
		}
		
		if (v instanceof Array)
		{
			for (Entry<Integer, Object> e : ((Array)v).getAll())
			{
				Log.write(v.name() + "[" + e.getKey() + "]\t= " + Memory.getInstance().evaluate(e.getValue()));
			}
		}
		else
		{
			Log.write("'" + v.name() + "' is not an array");
		}
	}
	
	/*public void list(List<String> params)
	{
		if (params == null || params.size() != 1)
		{
			Log.write("Usage: /LIST <target>");
			return;
		}
		
		String target = params.get(0).toLowerCase();
		
		switch (target)
		{
		case "vars":
		case "variables":
		case "v":
			Printer.printVariables();
			break;
		case "funcs":
		case "functions":
		case "f":
			Printer.printFunctions();
			break;
		case "all":
		case "everything":
			Printer.printFunctions();
			Printer.printVariables();
			break;
		default:
			Log.error("Illegal target");
			return;
		}
	}*/
}
