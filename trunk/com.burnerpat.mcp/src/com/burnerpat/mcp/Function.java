package com.burnerpat.mcp;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Function {
	
	private String name;
	private HashSet<String> parameters;
	
	public Function(String pName, HashSet<String> pParameters)
	{
		name = pName;
		parameters = pParameters;
	}
	
	public String getName()
	{
		return name;
	}
	
	public HashSet<String> getParameters()
	{
		return parameters;
	}
	
	public boolean checkParameters(ArrayList<Double> p)
	{
		return p.size() == parameters.size();
	}
	
	public abstract double evaluate(ArrayList<Double> p);
}
