/**
 * 
 */
package com.data.structure.stack.test;

import com.data.structure.stack.Stack;

/**
 * @author aprasa03
 *
 */
public class SortingUsingRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Stack stack=new Stack(10);
SortingUsingRecursion ss=new SortingUsingRecursion();

stack.push(3);
stack.push(2);
stack.push(1);
stack.push(4);
stack.push(1);
ss.sort(stack);
System.out.println(stack);
	}

private void sort(Stack stack)	
{
	if(stack.isEmpty())
		
	{
		return ;
	}
	else
	{
		int number=stack.pop();
		sort(stack);
		insert(stack,number);
	}
	
}
private void insert(Stack stack,int inputValue)	
{
	if(stack.isEmpty())
	{
		stack.push(inputValue);
		return;
		
	}
	else{
		int popValue=stack.pop();
		if(popValue>inputValue)
		{
			
			insert(stack,inputValue);
			stack.push(popValue);
		}else{
			stack.push(popValue);
			stack.push(inputValue);
		}
		
	}
}	
	
}
