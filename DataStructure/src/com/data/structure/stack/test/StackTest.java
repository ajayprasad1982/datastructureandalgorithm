package com.data.structure.stack.test;

import com.data.structure.stack.Stack;

public class StackTest {

	public static void main(String[] args) {

	Stack stack=new Stack(10);
	
	for(int i=0;i<20;i++)
	{
		stack.push(i+1);
	}
System.out.println(stack);	
stack.pop();
stack.pop();
System.out.println(stack);	
		
for(int i=0;i<20;i++)
{
	stack.push(i+1);
}
System.out.println(stack);
	}

}
