/**
 * 
 */
package com.sorting;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class ShellSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num[] = { 6, 5, 2, 7, 3, 1 };

		shellSort(num);
		System.out.println(Arrays.toString(num));

	}
	
	private static void shellSort(int num[])
	{
		//6, 5, 2, 7, 3, 1 
		//gap=3
		
		int gap = num.length / 2;
		int j=0;
		while(gap>0)
		{
		for(int i=gap;i<num.length;i++)
		{
			int temp=num[i];
			
			for(j=i;j>=gap && num[j-gap]>temp;j=j-gap)
			{
				num[j]=num[j-gap];
			}
			num[j]=temp;
		}
		gap=gap/2;
		
		}
	}
	
	
	

	private static void shellSortWhileLoop(int num[]) {
		// { 6, 5, 2, 7, 3 ,1};
		//  6,3,1,7,5,2
		/*
		 * for (int i = 0; i < num.length/2; i++) {
		 * 
		 * for (int j = num.length/2; j < num.length; j++) {
		 * 
		 * if(num[i]>num[j]) { int temp=num[j]; num[j]=num[i]; num[i]=temp; }
		 * i++; }
		 */

		int gap = num.length / 2;
		int i = gap, j = i;
		while (gap > 0) {

			while (i < num.length) {
				int temp = num[i];
				j = i;
				while (j >= gap  && num[j-gap] > temp) {
					num[j] = num[j-gap];
					j=j-gap;
				}
				num[j] = temp;
				i++;

				

			}
			gap = gap / 2;
			i = gap;
			j = i;
		}

	}

}
