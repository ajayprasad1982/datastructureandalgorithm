/**
 * 
 */
package com.sorting;

import java.util.Arrays;
import java.util.Calendar;

/**
 * @author aprasa03
 *
 */
public  class BucketSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int bucket[][] = new int[10][10];
		int num[] = { 50, 31, 1000, 19, 8, 2, 4, 17 };

		Calendar sdate = Calendar.getInstance();
		populateBucketArray(num,bucket,getMax(num));
		System.out.println(Arrays.toString(num));
		
		System.out.println(getNthDigit(123,10,3));

		//System.out.println(getValue("40", "1  00"));

	}


	private static void populateBucketArray(int num[], int bucket[][],int maxValue) {
		int pass=(maxValue+"").length();
		for(int k=1;k<=pass;k++)
		{
			for (int i = 0; i < num.length; i++) {
				int row=getNthDigit(num[i], 10, k);
				int col=0;
				while(col<num.length && bucket[row][col]!=0)
				{
					col++;
				}
				//col++;
				bucket[row][col]=num[i];

			}
			populate(num,bucket);
			
		}
		
	}
	
private static void populate(int num[],int bucket[][])
{
	int count=0;
	for(int i=0;i<bucket.length;i++)
	{
		for(int j=0;j<bucket.length;j++)
		{
			if(bucket[i][j]!=0)
			{
				num[count++]=bucket[i][j];
				bucket[i][j]=0;
			}
		}
	}
}
	
	private static int getMax(int num[]) {
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]> max) {
				max = num[i];
			}
		}
		return max;
	}

	
	public static int getNthDigit(int number, int base, int n) {

		double powCal = Math.pow(base, n - 1);
		double div = number / powCal;

		return (int) (div % base);
	}
	

}
