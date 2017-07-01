/**
 * 
 */
package com.hacker.rank.prog.misc;

import java.util.Stack;

/**
 * @author aprasa03
 *
 */
public class AddTwoVeryBigNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num1="999999";
		String num2="1111111";
		System.out.println((int)('z'));
		add(num1, num2);

	}
private static void add(String num1,String num2)
{
	
	int max=Math.max(num1.length(), num2.length());
	
	int [] n1=new int[max];
	int [] n2=new int[max];
	int k=0;
	for(int i=num1.length()-1;i>=0;i--)
	{
		n1[k++]=num1.codePointAt(i)-48;
	}
	k=0;
	for(int i=num2.length()-1;i>=0;i--)
	{
		n2[k++]=num2.codePointAt(i)-48;
	}
	k=0;
	Stack<Integer> stack=new Stack<Integer>();
	int carry=0;
	for(k=0;k<max;k++)
	{
		int num=n1[k]+n2[k]+carry;
		stack.push(num%10);
		if(num>=10)
		{
			carry=1;
		}
		else
		{
			carry=0;
		}
		
	}
    stack.push(carry);
    while(!stack.isEmpty())
    {
    	System.out.print(stack.pop());
    }
  
	
}
	

}
