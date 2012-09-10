package com.burnerpat.mcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class Program {
	
	public static void main(String[] args)
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Log.init(System.out);
		
		while (true)
		{
			String s;
			
			try
			{
				s = in.readLine();
			}
			catch (Exception ex)
			{
				Log.error("Unable to fetch input");
				return;
			}
			
			try
			{
				ANTLRStringStream stream = new ANTLRStringStream(s);
				TokenStream tokens = new CommonTokenStream(new ParserLexer(stream));
				
				ParserParser parser = new ParserParser(tokens);
				CommonTree tree = (CommonTree)parser.statement().getTree();
				
				Evaluator eval = new Evaluator(new CommonTreeNodeStream(tree));
				
				if (eval.statement() == true)
				{
					Log.write(Double.toString(Memory.getInstance().getResult()));
				}
			}
			catch (RuntimeException ex)
			{
				System.out.println("Input error");
			}
			catch (RecognitionException ex)
			{
				System.out.println("Input error");
			}
			catch (Exception ex)
			{
				Log.error(ex.getClass().getSimpleName() + ": " + ex.getMessage());
				ex.printStackTrace();
			}
		}
	}
}
