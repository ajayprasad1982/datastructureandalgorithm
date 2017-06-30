/**
 * 
 */
package com.sorting;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author aprasa03
 *
 */
public class QuickSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Collections.sort(list);
		int num[] = { 6, 5, 2, 7, 3 };
		int num1[] = { 5, 3, 1, 9, 8, 2, 4, 7,10,34,23,43,13,17};
		int num3[]=new int [10000];
    	int	j=0;
		/*for(int i=10000;i>0;i--)
		{
			num3[j++]=i;
		}
		System.out.println(Arrays.toString(num3));*/
		int num2[] = { 5, 4, 3, 2,6,1 };

		quickSort(num2, 0, num2.length - 1);
		System.out.println(Arrays.toString(num2));

	}

	private static int getPivot(int num[], int left, int right) {
		int pivot = left;

		while (pivot != right && left < right) {

			while (num[pivot] < num[right]) {
				right--;
				continue;
			}
			pivot = getCurrentPivot(num, pivot, right);

			while (num[pivot] > num[left]) {
				left++;
				continue;
			}

			pivot = getCurrentPivot(num, pivot, left);
			if(pivot==left)
			{
				left++;
			}
		}

		return pivot;
	}

	private static int getCurrentPivot(int num[], int src, int dest) {
		int temp = num[dest];
		num[dest] = num[src];
		num[src] = temp;
		return dest;
	}

	private static void quickSort(int num[], int left, int right) {
		if (left < right) {
			int pivot = getPivot(num, left, right);
			quickSort(num, left, pivot - 1);
			quickSort(num, pivot + 1, right);

		}
	}

}
