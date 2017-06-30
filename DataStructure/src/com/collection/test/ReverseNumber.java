/**
 * 
 */
package com.collection.test;

/**
 * @author aprasa03
 *
 * Sep 30, 2015
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getReverseNumber(100));

	}
	
private static int getReverseNumber(int n)	
{
	int remainder=0;
	int reverse=0;
	while (n>0)
	{
		remainder=n%10;
		reverse=reverse*10+remainder;
		n=n/10;
	}
	
	return reverse;
}
	

}
