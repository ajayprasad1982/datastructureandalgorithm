package com.data.structure.stack.test;

public class Test {

	public static void main(String[] args) {
		
String str="0123456";
System.out.println(str.substring(1,3));
	}

private static  void sum(Integer a[] ,int k,int r,int s)	
{
	
	if(s+a[k]==6)
	{
		System.out.print("[");
		for(int i=0;i<k;i++)
		{
			System.out.println(a[i]+",");
		}
		System.out.println("[");
	}
	
}
	
	
}
