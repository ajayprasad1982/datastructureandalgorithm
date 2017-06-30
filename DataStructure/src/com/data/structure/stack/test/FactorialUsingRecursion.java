/**
 * 
 */
package com.data.structure.stack.test;

/**
 * @author aprasa03
 *
 */
public class FactorialUsingRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(fact(3));
	}

	private static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
		{
			return n*fact(n-1);
		}
	}
	
}
