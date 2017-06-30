/**
 * 
 */
package com.sorting;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class BubbleSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 6, 5, 2, 7, 3 };
		int num1[] = { 5, 3, 1, 9, 8, 2, 4, 7 };
		int a=5,b=5;
		a=a^b;
		b=a^b;
		a=a^b;
System.out.println("a\t"+a+"\tb\t"+b);
		// bubbleSort(num);
		bubbleSort1(num1, 0);
		//insertionSort(num1);
		// selectionSort(num1);
		System.out.println(Arrays.toString(num1));

	}

	private static void bubbleSort(int num[]) {
		for (int i = 0; i < num.length; i++) {

			for (int j = 1; j < num.length - i; j++) {
				if (num[j - 1] > num[j]) {
					num[j] = num[j] ^ num[j - 1];
					num[j - 1] = num[j] ^ num[j - 1];
					num[j] = num[j] ^ num[j - 1];
				}

			}

		}

	}

	private static void bubbleSort1(int num[], int i) {

		if (num.length - 1 == i)
			return;
		swap(num, 1, i);
		bubbleSort1(num, i + 1);

	}

	private static void swap(int num[], int j, int i) {
		if (num.length - i == j)
			return;

		if (num[j - 1] > num[j]) {
			num[j] = num[j] ^ num[j - 1];
			num[j - 1] = num[j] ^ num[j - 1];
			num[j] = num[j] ^ num[j - 1];
		}
		swap(num, j + 1, i);

	}

	private static void selectionSort(int num[]) {
		for (int i = 0; i < num.length - 1; i++) {
			int pos = i;
			for (int j = i; j < num.length; j++) {
				if (num[j] < num[pos]) {

					pos = j;
				}

			}
			num[pos] = num[pos] ^ num[i];
			num[i] = num[pos] ^ num[i];
			num[pos] = num[pos] ^ num[i];

		}
		
			}
	
	
	private static void insertionSort(int num[]) {
		//{ 6, 5, 2, 7, 3 };
		for(int i=1;i<num.length;i++)
		{
			 int val=num[i];
			 
			 int j=i-1;
			while (j>=0 && val<num[j])
			{
				num[j+1]=num[j];
				j--;
			}
			
			num[j+1]=val;
		}

	}


}
