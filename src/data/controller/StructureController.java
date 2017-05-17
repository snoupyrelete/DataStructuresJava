package data.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import data.model.Customer;

public class StructureController 
{
	private Stack<String> stringStack;
	private Queue<Customer> customerQueue;
	
	public StructureController() 
	{
		stringStack = new Stack<String>();
		customerQueue = new LinkedList<Customer>();
	}
	
	public void start()
	{
		// STACK
		stringStack.push("Hello");
		stringStack.push("Not world");
		
		String temp = stringStack.peek();
		System.out.println(temp);
		
		stringStack.pop();
		
		String temp2 = stringStack.peek();
		System.out.println(temp);
		
		// QUEUE
		customerQueue.add(new Customer("Billy"));
		customerQueue.add(new Customer("Bob"));
		customerQueue.add(new Customer("Joe"));
		customerQueue.remove();
		
	}
}
