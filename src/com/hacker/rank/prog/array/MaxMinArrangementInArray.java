/**
 * 
 */
package com.hacker.rank.prog.array;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class MaxMinArrangementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		arrange(a);
	}

	private static void arrange(int a[]) {
		int temp[] = new int[a.length];

		int i = 0, index = 0;
		int j = a.length - 1;

		while (i < j) {
			temp[index] = a[j];
			temp[index + 1] = a[i];
			index = index + 2;
			i++;
			j--;

		}
		if (i == j) {
			temp[index] = a[j];

		}
		System.out.println(Arrays.toString(temp));
	}

}
