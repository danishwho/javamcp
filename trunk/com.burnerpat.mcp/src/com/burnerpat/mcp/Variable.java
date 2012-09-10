package com.burnerpat.mcp;

public class Variable {
	
	private Object value;
	private String name;
	
	public Variable(String pName, Object pValue)
	{
		name = pName;
		value = pValue;
	}
	
	public Variable(String pName)
	{
		this(pName, 0.0);
	}
	
	public Object get()
	{
		return value;
	}
	
	public void set(Object pValue)
	{
		value = pValue;
	}
	
	public String name()
	{
		return name;
	}
}
