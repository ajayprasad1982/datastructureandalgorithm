/**
 * 
 */
package com.numerical.test;

/**
 * @author aprasa03
 *
 * Feb 18, 2015
 */
public class Replaced_1_get_longest_continuous_sequence_1_binary_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int  arr[] =  {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1};
		//int arr[]={1,1,0,0,1,1,1,0,0,1,1,1,1,0};
		//int arr[]={1,1,0,1,1,1,0,1,1,1,1,0};
		//int arr[] =  {1, 1, 1, 1, 0};
		int arr[]={1,1,0,1,1,1,0,0,1,1,1,1,1,0,1};
		print(arr,1);
		
	}

private static int printIndex(int a[],int i,int index,int count_1s)
{
	if(i>=a.length)
	{
		return index;
	}
	int max=Integer.MIN_VALUE;
	if(a[i-1]!=a[i] && a[i]==0)
	{
		int counts=count_1s+count(a,i+1);
		if(max<counts)
		{
			index=i;
			max=counts;
		}
		
		count_1s=0;
	}
	else if(a[i]==1)
	{
		count_1s++;
	}
	printIndex(a,i+1,index,count_1s);
	return index;
}
	
	
private static void print(int a[],int i)
{
	int max=Integer.MIN_VALUE;
	int index=0;
	int count_1s=0;
	
	while(i<a.length)
	{
		
		if(a[i-1]!=a[i] && a[i]==0)
		{
			int counts=count_1s+count(a,i+1);
			if(max<counts)
			{
				index=i;
				max=counts;
			}
			
			count_1s=0;
		}
		else if(a[i]==1)
		{
			count_1s++;
		}
		i++;
		}
	
	System.out.println(index);
}

private static int count(int a[],int i)
{
	if(i>=a.length)
		return 1;
	if(a[i]==0)
		return 0;
	return 1+count(a,i+1);
	
}

}
