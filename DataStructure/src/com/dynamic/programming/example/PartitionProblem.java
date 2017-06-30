/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 * Jan 23, 2015
 */
public class PartitionProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[]={3, 1, 5, 9, 12};
		int sum=getSum(arr,0,arr.length-1);
		if(sum%2==0)
		{
			System.out.println(isPartitionPossible(arr,sum/2,arr.length));
		}
		else
		{
			System.out.println(Boolean.FALSE);
		}
		

	}
private static boolean isPartitionPossible(int arr[],int i,int j)
{
	if((i==0 && j==0) || i==0) return true;
	if(j==0)return false;
	
	return arr[j-1]<=i?(isPartitionPossible(arr,i,j-1)||isPartitionPossible(arr,i-arr[j-1],j-1)):isPartitionPossible(arr,i,j-1);
}
	
	

private static int getSum(int arr[],int i,int j)
{
	if(j<i)
		return 0;
	if(i==j)
		return arr[i];
	
	return arr[i]+arr[j]+getSum(arr,i+1,j-1);
	
	
	
	
}
	
	
}
