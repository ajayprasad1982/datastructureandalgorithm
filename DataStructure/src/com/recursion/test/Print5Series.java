/**
 * 
 */
package com.recursion.test;

/**
 * @author aprasa03
 *
 * Sep 23, 2015
 */
public class Print5Series {
	//n=16
	//16 11 6 1 -4 1 6 11 16
	//n=10
	//10 5 0 5 10

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printPattern(false,16,16);

	}
	
static void printPattern(int num,int temp,boolean flag)
{
	System.out.print(temp+"\t");
	if(!flag && num==temp)
		return;
	
	if(flag)
	{
		if(temp>0)
		printPattern(num, temp-5,true);
		else
		printPattern(num, temp+5,false);	
	}else
	{
		printPattern(num, temp+5,false);
	}
	
}

static void printPattern(boolean flag,int target,int output)
{
	System.out.print(output+" ");
	if(flag && target==output)
		return;
	
	if(!flag && output>0)
	{
		printPattern(false,target,output-5);	
	}else
	{
		printPattern(true,target,output+5);
	}
	
}

}
