package com.burnerpat.mcp;

import java.util.ArrayList;
import java.util.HashSet;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BufferedTreeNodeStream;
import org.antlr.runtime.tree.CommonTree;

public class LocalFunction extends Function {
	
	private CommonTree tree;
	
	public LocalFunction(String name, HashSet<String> parameters, CommonTree pTree)
	{
		super(name, parameters);
		
		tree = pTree;
	}
	
	public double evaluate(ArrayList<Double> p)
	{
		if (!super.checkParameters(p))
		{
			return 0.0; //ERROR
		}
		
		Memory memory = Memory.getInstance();
		memory.push(); //Increase Scope level
		
		String[] pars = super.getParameters().toArray(new String[super.getParameters().size()]);
		
		for (int i = 0; i < super.getParameters().size(); i++)
		{
			memory.setVariable(pars[i], p.get(i));
		}
		
		Evaluator e = new Evaluator(new BufferedTreeNodeStream(tree));
		
		try 
		{
			e.statement();
		} 
		catch (RecognitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return Double.NaN;
		}
		
		memory.pop();
		
		return memory.getResult();
	}
	
	public String toString()
	{
		String str = super.getName() + "(";
		
		String[] params = super.getParameters().toArray(new String[super.getParameters().size()]);
		
		if (params != null)
		{
			for (int i = 0; i < params.length; i++)
			{
				if (i != 0)
				{
					str += ", ";
				}
				
				str += params[i];
			}
		}
		
		str += ") = ";
		
		TreeWriter writer = new TreeWriter(new BufferedTreeNodeStream(tree));
		
		try
		{
			str += writer.expression();
		}
		catch (Exception ex)
		{
			str += "<ERROR>";
		}
		
		return str;
	}
}
