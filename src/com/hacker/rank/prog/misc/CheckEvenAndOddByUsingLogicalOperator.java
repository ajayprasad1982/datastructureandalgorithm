package com.hacker.rank.prog.misc;

public class CheckEvenAndOddByUsingLogicalOperator {

	public static void main(String[] args) {
		
System.out.println(isEven(10));
	}
	
	private static boolean isEven(int n)
	{
		return ((n&1)==0);
	}

}
