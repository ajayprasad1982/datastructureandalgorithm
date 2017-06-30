/**
 * 
 */
package com.dynamic.programming.example;

import java.util.ArrayList;

/**
 * @author aprasa03
 *
 * Jan 24, 2015
 */
public class MinJumpEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[]={2,3,1,1,4};
		//int arr[] = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
		//int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		//int arr[] = {1, 3, 6, 1, 0, 9};
		System.out.println(getMinJump(arr,0,arr.length-1));
		System.out.println(Solve(arr));
		System.out.println(minJumpToReachEnd(arr, arr.length-1));

	}
	
private static int getMinJump(int arr[],int i,int j)
{
	if(i==j)return 0;
	if(arr[i]==0) return 9999;
	
	int min=9999;
	for(int k=i+1;k<=j && k<=i+arr[i];k++)
	{
		int jump=getMinJump(arr,k,j);
		min=Math.min(min, jump+1);
	}
		
return min;
}
public static int Solve(int arry[]) {
    int N = arry.length;
    int[] dp = new int[N];
    dp[0] = 0;

    for(int i = 1; i < N; ++i) {
        dp[i] = Integer.MAX_VALUE;
        for(int j = 1; j <= i; ++j) {
            if(arry[i-j] >= j)
                dp[i] = Math.min(dp[i], (dp[i-j] + 1));
        }
    }
    return dp[N-1];
}


private static int minJumpToReachEnd(int arr[],int dest)
{
	//if(arr[dest]==0) return Integer.MAX_VALUE;
	if(dest==0) return 0;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<dest; i++)
	{
		if(i+arr[i]>=dest)
		{
			min=Math.min(min,minJumpToReachEnd(arr,i)+1 );
			
		}
	}
	return min;
}


}