/**
 * 
 */
package com.practice.sorting;

import java.util.Arrays;

import com.data.structure.stack.Stack;

/**
 * @author aprasa03
 *
 * May 6, 2015
 */
public class SortingByStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//{ 6, 5, 2, 7, 3 }
	Stack stack=new Stack(5);
	
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
System.out.println(Arrays.asList(stack));
sort(stack);
System.out.println(Arrays.asList(stack));
	}
	
private static void sort(Stack stack)	
{
	if(stack.isEmpty())
		return;
	
	int number=stack.pop();
	sort(stack);
	sort(stack,number);
	
}
private static void sort(Stack stack,int val)
{
	if(stack.isEmpty())
	{
		stack.push(val);
		return;
	}
	
	int temp=stack.pop();
	if(temp>val)
	{
		sort(stack,val);
		stack.push(temp);
		
	}
	else
	{
		stack.push(temp);
		stack.push(val);
	}
	
}

}
