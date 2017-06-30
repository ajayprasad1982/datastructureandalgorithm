/**
 * 
 */
package com.sorting;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class MergeSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 6, 5, 2, 2,7, 3 };

		m_sort(num, 0, num.length - 1);
		//System.out.println(Arrays.toString(num));
		int num3[]=new int [100000];
    	int	j=0;
		/*for(int i=100000;i>0;i--)
		{
			num3[j++]=i;
		}
		System.out.println(Arrays.toString(num3));*/
		m_sort(num, 0, num.length - 1);
		System.out.println(Arrays.toString(num));

	}

	private static void merge(int num[], int left, int mid, int right) {
		// int temp[]=new int[num.length];
		int k = 0, i = 0, j = 0;
		int left_range = mid - left + 1;
		int right_range = right - mid;

		int left_Array[] = new int[left_range];
		int right_Array[] = new int[right_range];

		// copy num array to left and right array
		for (i = 0; i < left_range; i++) {
			left_Array[i] = num[left + i];
		}

		for (j = 0; j < right_range; j++) {
			right_Array[j] = num[mid + 1 + j];
		}

		i = 0;
		j = 0;
		k = left;
		while (i < left_range && j < right_range) {
			if (left_Array[i] < right_Array[j]) {
				num[k] = left_Array[i];
				i++;
			} else {
				num[k] = right_Array[j];
				j++;
			}
			k++;
		}
		while (i < left_range) {
			num[k] = left_Array[i];
			i++;
			k++;
		}
		while (j < right_range) {
			num[k] = right_Array[j];
			j++;
			k++;
		}

	}

	private static void m_sort(int num[], int left, int right) {

		if (left < right)

		{
			int middle = (left + right) / 2;

			m_sort(num, left, middle);

			m_sort(num, middle + 1, right);

			merge(num, left, middle, right);

		}

	}

}
