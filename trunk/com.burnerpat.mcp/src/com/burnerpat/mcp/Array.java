package com.burnerpat.mcp;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Array extends Variable {
	
	public Array(String name)
	{
		super(name, new TreeMap<Integer, Object>());
	}
	
	public Array(String name, Object value)
	{
		super(name);
		TreeMap<Integer, Object> t = new TreeMap<Integer, Object>();
		t.put(0, value);
		super.set(t);
	}
	
	@SuppressWarnings("unchecked")
	public Object get(int index)
	{
		TreeMap<Integer, Object> t = (TreeMap<Integer, Object>)super.get();
		
		if (t.containsKey(index))
		{
			return t.get(index);
		}
		else
		{
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(int index, Object value)
	{
		TreeMap<Integer, Object> t = (TreeMap<Integer, Object>)super.get();
		
		t.put(index, value);
	}
	
	@SuppressWarnings("unchecked")
	public Set<Entry<Integer, Object>> getAll()
	{
		return ((TreeMap<Integer, Object>)super.get()).entrySet();
	}
}
