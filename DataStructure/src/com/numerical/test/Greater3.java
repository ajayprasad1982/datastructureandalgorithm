/**
 * 
 */
package com.numerical.test;

/**
 * @author aprasa03
 *
 * Mar 15, 2015
 */
public class Greater3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getCount(60,30,10));
		System.out.println(getCount(60,60,10));
		System.out.println(getCount(60,60,60));
		System.out.println(getCount(20,30,10));

	}

	private static int getCount(int a,int b,int c)
	{
		int count=0;
		if(a>=60){count+=1;}
		if(b>=60){count+=1;}
		if(c>=60){count+=1;}
		return count;
	}
	
	

}
