/**
 * 
 */
package com.data.structure.stack.test;

import com.data.structure.stack.Stack;

/**
 * @author aprasa03
 *
 */


public class SumUsingRecursion {

	
	static int totalSum=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	Stack sumSet=new Stack(10);	
	
	sumSet.push(5);
	sumSet.push(5);
	sumSet.push(5);
	sumSet.push(5);
	//System.out.println(sum(sumSet));
	long sum=0;
	for(long i=1;i<=100000000000l;i++)
	{
		sum+=i;
	}
	System.out.println(sum);
	System.out.println(getSum( 1,100000000000l));
		
	}

private  static Integer sum(Stack sumSet)	
{
	if(sumSet.isEmpty())
	{
		return 0;
	}
	else
	{
		return sumSet.pop()+sum(sumSet);
	}
}

private static long getSum(long i,long n)
{ 

	if(i< n)
	{
		long temp=(i+n)/2;
		return getSum(i,temp)+getSum(temp+1,n);
		
		
	}
	
	return i;
	
	
}

}
