/**
 * 
 */
package com.sorting;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.FutureTask;

/**
 * @author aprasa03
 *
 */
public class HeapSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 6, 5, 2, 7, 3 };
		int num1[] = { 5, 3,1,9,8,2,4,7 };

		// Locale locale = new Locale("fr");  
		
		heapSort(num1);
		System.out.println(Arrays.toString(num1));

	}
	
	private static void heapSort(int num[])
	{
		int n = num.length -1;
		heapify(num);
		for(int i=n;i>0;i--)
		{
   			swap(num, 0, i );
			n=n-1;
			maxHeap(num, 0,n);
		}
	}
	
	private static void heapify(int num[])
	{
		for(int i=num.length-1;i>=0;i--)
		{
			maxHeap(num,getParentIndex(i),num.length-1);
		}
		
		
	}
	
	private static  void maxHeap(int num [],int i,int n)
	{
		int max=i;
		int leftChild=getLeftChildIndex(i);
		int rightChild=getRightChildIndex(i);
		if(leftChild<=n && num[leftChild]>num[max])
		{
			max=leftChild;
		}
		if(rightChild<=n && num[rightChild]>num[max])
		{
			max=rightChild;
		}
		if(max!=i)
		{
			swap(num, i, max);
			maxHeap(num,max,n);
		}
	}
	
	private static void swap(int num[],int firstIndex,int lastIndex)
	{
		if(firstIndex==lastIndex)
			return;
		
		num[firstIndex]=num[firstIndex]^num[lastIndex];
		num[lastIndex]=num[firstIndex]^num[lastIndex];
		num[firstIndex]=num[firstIndex]^num[lastIndex];
	}
	private static int getParentIndex(int i)
	{
		return i/2;
	}
	
	private static int getLeftChildIndex(int i)
	{
		return 2*i;
	}
	private static int getRightChildIndex(int i)
	{
		return (2*i)+1;
	}
}
