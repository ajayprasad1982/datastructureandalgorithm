/**
 * 
 */
package com.data.structure.stack;

/**
 * @author aprasa03
 *
 */
public class ABC {

	/**
	 * @param args
	 */
	static int a=10;
	public static void main(String[] args) {
		
		String s="ABC";
		printPattern(s,"",0,s.length());
		
		int a=7;
		int b=7;
		/*a=a^b;
		b=a^b;
		a=a^b;
		*///.out.println("a ="+a+" b ="+b);
				
		
	}

private static void printPattern(String str ,String temp,int i,int n)
{
	temp=temp+str.charAt(i);
	
	if(i==n-1)
	{
		System.out.println(temp);
		return;
	}
	
	printPattern(str , temp, i+1,n);
	temp=temp+" ";
	printPattern(str , temp, i+1,n);
	
	return;
	
}
private static void printPattern1(String str ,String temp,int i,int n)
{
	temp=str.charAt(i)+temp;
	
	if(i==n-1)
	{
		System.out.println(temp);
		return;
	}
	temp=temp+" ";
	printPattern(str , temp, i+1,n);
	//temp=temp+" ";
	printPattern(str , temp, i+1,n);
	
	return;
	
}

	
}
