/**
 * 
 */
package com.hacker.rank.prog.String;

/**
 * @author aprasa03
 *
 */
public class PyramidWithStar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
        print(3,0);
	}
	private static void print(int n,int i)
	{
		if(i==n)
		{
			return;
		}
		System.out.print(String.format("%" + (n-i )+ "s", ""));
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		print(n,i+1);
	}
	
	

}
