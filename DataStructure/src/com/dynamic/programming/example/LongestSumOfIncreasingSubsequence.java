/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 */
public class LongestSumOfIncreasingSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sub[]={1,4,2,4,3};
		
		//System.out.println(longestSubSequence(array));
		System.out.println(longestSumIncreasingSubsequence(sub,0));
	}
	
	private static int longestSumIncreasingSubsequence(int sub[],int i)	
	{
		if(i==sub.length-1)
			return sub[i];
		
		int max=sub[i];
		for(int k=i+1;k<sub.length;k++)
		{
			if(sub[i]<sub[k])
			{
				max=Math.max(max, sub[i]+longestSumIncreasingSubsequence(sub,k));
			}
		}
		return max;
	}

}
