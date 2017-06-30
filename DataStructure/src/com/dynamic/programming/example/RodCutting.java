/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 */
public class RodCutting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int price[]={0,1,5,8};
System.out.println(rodCuttingSol(price,price.length-1));
	}

private static int rodCuttingSol(int price[],int j)	
{
	if(j==0)
		return 0;
	
	int max=Integer.MIN_VALUE;
	
	for(int i=1;i<=j;i++)
	{
		max=Math.max(max, price[i]+rodCuttingSol(price,j-i));
	}
	
	return max;
}
	
	
	
	
}
