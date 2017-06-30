package com.dynamic.programming.example;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		char x[]={'A','G','G','T','A','B'};
		char y[]={'G','X','T','X','A','Y','B'};
		System.out.println(lcs(x,y,0,0));

	}

	private static int lcs(char x[],char y[],int index1,int index2)
	{
		if(index1==x.length ||index2==y.length)
		return 0;
		
		if(x[index1]==y[index2])
		{
			return 1+lcs(x,y,index1+1,index2+1);
		}
		else
		{
			return Math.max(lcs(x,y,index1,index2+1), lcs(x,y,index1+1,index2));
		}
		
	}
	
}
