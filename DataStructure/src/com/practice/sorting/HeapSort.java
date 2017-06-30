/**
 * 
 */
package com.practice.sorting;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 *         Mar 22, 2015
 */
public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 6, 5, 2, 1,7, 3 };
		heapSort(num);
		System.out.println(Arrays.toString(num));

	}
	
	private static void heapSort(int array[])
	{ 
		heapyfy(array);
		for(int i=array.length-1;i>=0;i--)
		{
			swap(array,0,i);
			maxHeap(array, 0, i-1);
		}
	}

	private static void heapyfy(int array[])
	{
		for(int i=array.length/2;i>=0;i--)
		{
			maxHeap(array,i, array.length-1);
		}
	}
	
private static void maxHeap(int array[],int i,int size)
{
	int left=getLeftChild(i);
	int right=getRightChild(i);
	int max=i;
	
	if(left<=size && array[left]>array[max])
	{
		max=left;
	}
	if(right<=size && array[right]>array[max])
	{
		max=right;
	}
	if(max!=i)
	{
		swap(array,max,i);
		maxHeap(array,max, size);
		
	}
}
	private static void swap(int array[],int i,int j)
	{
		if(array[i]==array[j])
			return;
		array[i]=array[i]^array[j];
		array[j]=array[i]^array[j];
		array[i]=array[i]^array[j];
	}

	private static int getLeftChild(int i) {
		return (2 * i);
	}

	private static int getRightChild(int i) {
		return getLeftChild(i) + 1;
	}
}
