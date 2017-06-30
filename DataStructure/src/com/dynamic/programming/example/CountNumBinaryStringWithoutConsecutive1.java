/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 * Jan 25, 2015
 */
public class CountNumBinaryStringWithoutConsecutive1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=2;
		System.out.println(getCount(0,n-1)+getCount(1,n-1));

	}
	
	private static int getCount(int i,int j)
	{
		if(j==0) return 1;
		
		if(i==0) return getCount(i,j-1)+getCount(i+1,j-1);
		
		return getCount(i-1,j-1);
	}

}
