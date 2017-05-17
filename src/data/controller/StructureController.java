package data.controller;

import java.util.Stack;

public class StructureController 
{
	private Stack<String> stringStack;

	public StructureController() 
	{
		stringStack = new Stack<String>();
	}
	
	public void start()
	{
		stringStack.push("Hello");
		stringStack.push("Not world");
		
		String temp = stringStack.peek();
		System.out.println(temp);
		
		stringStack.pop();
		
		String temp2 = stringStack.peek();
		System.out.println(temp);
	}
}
