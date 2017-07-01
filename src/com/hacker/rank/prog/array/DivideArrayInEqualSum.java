package com.hacker.rank.prog.array;

public class DivideArrayInEqualSum {

	public static void main(String[] args) {
		
		int a[]={6,3,2,1};
		divideArray(a);

	}
	
	private static void print(int a[],int startIndex,int endIndex)
	{
		System.out.print("[");
		for(int i=startIndex;i<endIndex;i++)
		{
			
			System.out.print(a[i]+",");
		}
		System.out.println("]");
	}
	
private static void divideArray(int a[])
{
	int sum=0;
	for(int val:a)
	{
		sum+=val;
	}
	int sumSofar=0;
	for(int i=0;i<a.length;i++)
	{
		if(2*sumSofar-a[i]==sum)
		{
			print(a,0,i);
			print(a,i+1,a.length);
			return;
		}
		sumSofar+=a[i];
	}
	System.out.println("Array can not divide by equal sum");
}

}
