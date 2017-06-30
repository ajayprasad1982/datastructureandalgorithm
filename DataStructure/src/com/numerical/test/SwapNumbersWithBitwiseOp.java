/**
 * 
 */
package com.numerical.test;

/**
 * @author aprasa03
 *
 */
public class SwapNumbersWithBitwiseOp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=7,b=4;
		System.out.println("Before Swap "+" a="+a+"  b="+b);
		swap(a,b);
		

	}
	
	static void swap(int a,int b)
	{
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After Swap "+" a="+a+"  b="+b);
		
	}

}
