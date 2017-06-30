/**
 * 
 */
package com.data.structure.string;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class FindEvenLenghtPathBy2K {

	/**
	 * @param args
	 */
	static String result=""; 
	static int sum=0;
	public static void main(String[] args) {

		//String str = "1538023";
		 String str = new StringBuffer("153802367672323895895").reverse().toString();
		// String str = "1538023";
		//getLogestEvenString(str);
		//System.out.println(result);
		getLogestEvenString(str.toCharArray(),0);
		System.out.println(result);
		//System.out.println(getLogestEvenString1(str.toCharArray(),0));
	}

	private static int getSum(char[] str, int i, int j) {
		int sum = 0;
		while (i < str.length && j < str.length &&  i <= j) {
			sum = sum + Integer.valueOf(str[i] + "");
			i++;
		}

		return sum;
	}

	private static String getLogestEvenString(String string) {
		char str[] = string.toCharArray();

		for (int i = 0; i < str.length; i++) {
			int len = (str.length / 2 - i) - 1;
			for (int j = len; j > 0; j--) {
				int leftSrc = i;
				int leftDest = leftSrc + j;
				int rightSrc = leftDest + 1;
				int rightDest = rightSrc + j;

				if (getSum(str, leftSrc, leftDest) == getSum(str, rightSrc,
						rightDest)) {
					return new String(Arrays.copyOfRange(str, leftSrc,
							rightDest + 1));
				}

			}
		}

		return "Not Found";

	}
	
	private static void getLogestEvenString(char str[],int leftSrc)
	{
		
		if(leftSrc==str.length-1)
		{
			return ;
		}
		int len = (str.length / 2) - 1;
		for (int j = len; j >0; j--) {
			
			int leftDest = leftSrc + j;
			int rightSrc = leftDest + 1;
			int rightDest = rightSrc + j;
			
			int leftSum=getSum(str, leftSrc, leftDest);	
			int rightSum=getSum(str, rightSrc,
					rightDest);
			
			if (leftSum==rightSum) {
				if(sum<rightSum)
				{
					sum=rightSum;
					result=new String(Arrays.copyOfRange(str, leftSrc,
							rightDest + 1));
					
				}
								
			}
		}

		getLogestEvenString(str, leftSrc+1);
		
		
		
		return; 
	}
	
	private static String getLogestEvenString1(char str[],int leftSrc)
	{
		
		if(leftSrc==str.length-1)
		{
			return "Not Found";
		}
		int len = (str.length / 2) - 1;
		for (int j = len; j > 0; j--) {
			
			int leftDest = leftSrc + j;
			int rightSrc = leftDest + 1;
			int rightDest = rightSrc + j;
			
			if (getSum(str, leftSrc, leftDest) == getSum(str, rightSrc,
					rightDest)) {
				return new String(Arrays.copyOfRange(str, leftSrc,
						rightDest + 1));
			}
		}

		
		return getLogestEvenString1(str, leftSrc+1);
	}	
	
}
