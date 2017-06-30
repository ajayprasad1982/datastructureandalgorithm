/**
 * 
 */
package com.data.structure.binary.tree;

/**
 * @author aprasa03
 *
 * Feb 8, 2015
 */
public class ArrayPairSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arry[]={6,8,3,4};
		//sol1(arry,0);
		sol2(arry,arry.length-1);
		
	}
	private static void sol(int arry[])
	{
		
		for(int i=0;i<arry.length-1;i++)
		{
			for(int j=i+1;j<arry.length;j++)
			{
				System.out.print((arry[i]+arry[j])+" ");
			}
		}
		
		
	}
	
	
	private static void sol(int arry[],int k)
	{
		if(k==arry.length-1)
			return;
		for(int i=k+1;i<arry.length;i++)
		{
			System.out.print(arry[k]+arry[i]+" ");
		}
		sol(arry,k+1);
	}
	
	private static int sol1(int arry[],int k)
	{
		if(k==arry.length-1)
			return arry[k];
		int sum=0;
		for(int i=k+1;i<arry.length;i++)
		{
			sum=arry[k]+sol1(arry,i);
			System.out.print(sum+" ");
		}
		return arry[k];
	}
	
	private static int sol2(int arry[],int k)
	{
		if(k==0)
			return arry[k];
		int sum=0;
		for(int i=k-1;i>=0;i--)
		{
			sum=arry[k]+sol2(arry,i);
			System.out.print(sum+" ");
		}
		return arry[k];
	}
	
}
