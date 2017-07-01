/**
 * 
 */
package com.hacker.rank.prog.misc;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class RemoveDuplicatesFromCharacterArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	char a[]={'a','b','b','b','c','a','d','e','e','d'};
	
	String str="abc abc";
	String res="";
	int count[]=new int[256];
	for(int i=0;i<str.length();i++)
	{
		//System.out.println(str.codePointAt(i)-'a');
		count[str.codePointAt(i)-'a']++;
	}
	//System.out.println(Arrays.toString(count));
	for(int i=0; i<str.length(); i++ )
	  {
	  	if(count[str.charAt(i)-'a']!=0)
	  	 {
	  	 	res +=str.charAt(i);
	  	 	count[str.charAt(i)-'a']=0;
	  	 }	
	  }  
	  System.out.println(res);
	removeDup(a);
	//System.out.println(Arrays.toString(a));

	}

private static  void removeDuplicates(char a[])
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==' ') return;
		int j=i+1;
		while(j<a.length)
		{
			if(a[i]==a[j])
			{
				arrange(j,a);
			}
			else
			{
				j++;
			}
		}
	}
}

private static void arrange(int i,char a[])
{
	while(i<a.length-1)
	{
		a[i++]=a[i];
	}
	a[i]=' ';
}

private static void  removeDup(char a[])
{
	int prevIndex=0;
	
	for(int i=1;i<a.length;i++)
	{
		while(i< a.length-2 && a[i]<=a[prevIndex])
		{
			i=1+i;
		}
		
		prevIndex=prevIndex+1;
		a[prevIndex]=a[i];
	}
	for(int i=prevIndex-1;i<a.length;i++)
	{
		a[i]=' ';
	}
	System.out.println(Arrays.toString(a));
	
 }
	
	


}
