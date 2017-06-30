/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 * Jan 26, 2015
 */
public class LargestSumContiguosSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		System.out.println(getNegativeSum(arr));

	}
	
	
	private static int getSum(int arr[])
	{
		int cur_max=0,max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			max=max+arr[i];
			if(max<0)
			{
				max=0;
			}
			else if(cur_max<max)
			{
				cur_max=max;
			}
			
		}
		
		return cur_max;
	}
	

	/**
	 * handle negative values too
	 * @param arr
	 * @return
	 */
	private static int getNegativeSum(int arr[])
	{
		int cur_max=arr[0],max_so_far=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			cur_max=Math.max(arr[i], cur_max+arr[i]);
			max_so_far=Math.max(max_so_far, cur_max);
		}
		
		return max_so_far;
	}
	

}
