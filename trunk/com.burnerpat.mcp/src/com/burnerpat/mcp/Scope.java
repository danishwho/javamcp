package com.burnerpat.mcp;

import java.util.Collection;
import java.util.HashMap;

public class Scope {
	
	private HashMap<String, Variable> variables;	//System constants, e.g. PI or E
	
	private Scope subScope;
	
	public Scope()
	{
		variables = new HashMap<String, Variable>();
	}
	
	public Variable findVariable(String name)
	{
		if (subScope != null)
		{
			Variable v = subScope.findVariable(name);
			
			if (v != null)
			{
				return v;
			}
		}
		
		if (variables.containsKey(name))
		{
			return variables.get(name);
		}
		else
		{
			return null;
		}
	}

	public void set(Variable v)
	{
		if (subScope != null)
		{
			subScope.set(v);
		}
		else
		{
			variables.put(v.name(), v);
		}
	}

	public Object get(String name)
	{
		return findVariable(name).get();
	}
	
	public Variable getVariable(String name)
	{
		if (variables.containsKey(name))
		{
			return variables.get(name);
		}
		else
		{
			return null;
		}
	}
	
	public void put(Variable v)
	{
		variables.put(v.name(), v);
	}

	public boolean contains(String name)
	{
		return variables.containsKey(name);
	}
	
	public void clear()
	{
		variables.clear();
	}
	
	public void dropSub()
	{
		if (subScope != null)
		{
			subScope.clear();
			subScope.dropSub();
		}
		
		subScope = null;
	}

	public Scope createSub()
	{
		if (subScope != null)
		{
			return subScope.createSub();
		}
		else
		{
			subScope = new Scope();
			return subScope;
		}
	}
	
	public Collection<Variable> all()
	{
		return variables.values();
	}
}
