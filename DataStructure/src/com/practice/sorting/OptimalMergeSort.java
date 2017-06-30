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
public class OptimalMergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num[] = { 6, 5, 2, 2,7, 3 };

		mergeSort(num, 0, num.length - 1);
		System.out.println(Arrays.toString(mergeSort(num, 0, num.length - 1)));
		
	}

	
	
private static int[] merge(int array1[],int array2[])
{
	int array[]=new int[array1.length+array2.length];
	int i=0,j=0,k=0;
	
	while(i<=array1.length-1 && j<=array2.length-1)
	{
		if(array1[i]<array2[j])
		{
			array[k]=array1[i];
			i++;
		}
		else
		{
			array[k]=array2[j];
			j++;

		}
		k++;
	}
	
	while(i<=array1.length-1)
	{
		array[k]=array1[i];
		i++;
		k++;

	}
	while(j<=array2.length-1)
	{
		array[k]=array2[j];
		j++;
		k++;

	}
return array;
}

private static int[]  mergeSort(int array[],int i,int j)
{
	if(j<=i)
		return new int[]{array[j]};
	
	int mid=(i+j)/2;
	int array1[]=mergeSort(array,i,mid);
	int array2[]=mergeSort(array,mid+1,j);
	return  merge(array1,array2);

	
	
}
	
}
