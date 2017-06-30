/**
 * 
 */
package com.recursion.test;

/**
 * @author aprasa03
 *
 * Sep 7, 2015
 */
public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(power(5,2));
		System.out.println(optimizePower(5,2));

	}
private static long power(long base,long exp)
{
	if(exp==0)
		return 1;
	return base*power(base,exp-1);
}
private static long optimizePower(long base,long exp)
{
	if(exp==0)
		return 1;
	else
	{
		long half=optimizePower(base,exp/2);
		if(exp%2==0)
		{
			return half*half;
		}else
		{
			return base*half*half;
		}
	}
	
	
}
	

}
