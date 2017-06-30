/**
 * 
 */
package com.practice.sorting;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 * Mar 19, 2015
 */
public class OptimalQuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 6, 5, 2, 7, 3 };
		int num1[] = { 5, 3, 1, 9, 8, 2, 4, 7,10,34,23,43,13,17};
		int num2[] = { 5, 4, 3, 2,6,1 };

		quickSort(num, 0, num.length - 1);
		System.out.println(Arrays.toString(num));


	}
	
	
private static int getPivot(int array[],int left,int right)
{
	int pivot=array[left];
	int pivotPosition=left;
	left=left+1;
	while(true)
	{
		if(array[left]<pivot)
		{
			left++;
			if(left>right) break;
		}
		else if(array[right]>pivot)
		{
			right--;
			if(right<left) break;
		}
		else
		{
			swap(array,left, right);
		}
			}
	
	array[pivotPosition]=array[right];
	array[right]=pivot;

	
	return right;
}
	
private static void swap(int num[], int src, int dest) {
	int temp = num[dest];
	 num[dest] = num[src];
	num[src] = temp;
	//return dest;
}	
private static void  quickSort(int array[],int i,int j)	
{
	if(i>=j)
		return;
	
	int pivot=getPivot(array, i, j);
	quickSort(array, i,pivot-1);
	quickSort(array, pivot+1,j);
}

}
