package com.hacker.rank.prog.array;

public class Print_All_Prime_Num_Smaller_Equal_To_n {

	public static void main(String[] args) {
		
		findPrimes(10);

	}

private static void findPrimes(int n)
{
	boolean a[] =new boolean[n+1];
	
	for(int p=2;p*p<=n;p++)
	{
		if(!a[p])
		{
			for(int i=p*2;i<=n;i=i+p)
			{
				a[i]=true;
			}
		}
	}
	
	for(int i=2;i<n;i++)
	{
		if(!a[i])
		{
			System.out.print(i+" ");
		}
	}
}
	
}
