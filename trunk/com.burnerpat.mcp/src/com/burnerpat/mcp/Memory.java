package com.burnerpat.mcp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BufferedTreeNodeStream;
import org.antlr.runtime.tree.CommonTree;

public class Memory {
	
	private Scope root;
	private Scope data;
	
	private HashMap<String, Function> globalFuncs;	//System functions, e.g. sin(x), cos(x), tan(x), ...
	private HashMap<String, Function> localFuncs;	//User-defined functions
	
	private double result;
	
	private static final Memory instance = new Memory();
	
	private Memory()
	{
		root = new Scope();
		Constants.fill(root);
		
		data = root.createSub();
		
		globalFuncs = new HashMap<String, Function>();
		
		for (String s : GlobalFunction.ALL)
		{
			globalFuncs.put(s, new GlobalFunction(s));
		}
		
		localFuncs = new HashMap<String, Function>();
	}
	
	public static Memory getInstance()
	{
		return instance;
	}
	
	public Function findFunction(String name)
	{
		if (globalFuncs.containsKey(name.toLowerCase()))
		{
			return globalFuncs.get(name.toLowerCase());
		}
		else if (localFuncs.containsKey(name))
		{
			return localFuncs.get(name);
		}
		else
		{
			return null;
		}
	}
	
	public boolean putFunction(Function f)
	{
		if (globalFuncs.containsKey(f.getName().toLowerCase()))
		{
			return false;
		}
		else
		{
			localFuncs.put(f.getName(), f);
			return true;
		}
	}

	public void setFunction(String name, HashSet<String> parameters, CommonTree tree)
	{
		Function f = new LocalFunction(name, parameters, tree);
		
		if (!putFunction(f))
		{
			//TODO: error handling
		}
	}
	
	public double callFunction(String name, ArrayList<Double> parameters)
	{
		Function f = findFunction(name);
		
		if (f != null)
		{
			return f.evaluate(parameters);
		}
		else
		{
			return Double.NaN; //ERROR
		}
	}
	
	public void setResult(double r)
	{
		result = r;
	}
	
	public double getResult()
	{
		return result;
	}
	
	public void clearFunctions()
	{
		localFuncs.clear();
	}

	public Variable findVariable(String name)
	{
		if (root.contains(name.toLowerCase()))
		{
			return root.getVariable(name.toLowerCase());
		}
		
		return data.findVariable(name);
	}
	
	public double getVariable(String name)
	{
		return getVariable(name, -1);
	}
	
	public double getVariable(String name, int index)
	{
		Variable v = findVariable(name);
		
		if (v != null)
		{
			Object value;
			
			if (index < 0)
			{
				value = v.get();
			}
			else
			{
				value = ((Array)v).get(index);
			}
			
			if (value == null)
			{
				return Double.NaN;
			}
			
			return evaluate(value);
		}
		else
		{
			return Double.NaN; //ERROR
		}
	}
	
	public double evaluate(Object value)
	{
		if (value instanceof Double)
		{
			return ((Double) value).doubleValue();
		}
		else if (value instanceof CommonTree)
		{
			Evaluator e = new Evaluator(new BufferedTreeNodeStream((CommonTree)value));
			
			try 
			{
				e.expression();
			} 
			catch (RecognitionException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return getResult();
		}
		else
		{
			return Double.NaN;
		}
	}
	
	public void setVariable(String name, Object value)
	{
		setVariable(name, -1, value);
	}
	
	public void setVariable(String name, int index, Object value)
	{
		if (!root.contains(name))
		{
			if (index < 0)
			{
				data.set(new Variable(name, value));
			}
			else
			{
				if (!data.contains(name))
				{
					Array a = new Array(name);
					a.set(index, value);
					data.set(a);
				}
				else
				{
					Variable v = data.getVariable(name);
					
					if (!(v instanceof Array))
					{
						Log.write("ERROR");
					}
					else
					{
						((Array)data.getVariable(name)).set(index, value);
					}
				}
			}
		}
		else
		{
			//TODO: error handling
		}
	}
	
	public void clearVariables()
	{
		data.clear();
	}
	
	public Collection<Function> getFunctions()
	{
		return localFuncs.values();
	}
	
	public Collection<Variable> getVariables()
	{
		return data.all();
	}
	
	public void push()
	{
		data.createSub();
	}
	
	public void pop()
	{
		data.dropSub();
	}
}

