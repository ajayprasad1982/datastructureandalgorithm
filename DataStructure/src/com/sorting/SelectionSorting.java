/**
 * 
 */
package com.sorting;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class SelectionSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 6, 5, 2, 7, 3 };

		selectionSort(num);
		System.out.println(Arrays.toString(num));
	}

	private static void selectionSort(int num[]) {
		for (int i = 0; i < num.length; i++) {
			int pos = i;

			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[pos]) {
					pos = j;
				}

			}
			int temp=num[pos];
			num[pos]=num[i];
			num[i]=temp;

		}
	}

}
