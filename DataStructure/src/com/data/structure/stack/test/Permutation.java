/**
 * 
 */
package com.data.structure.stack.test;

import java.util.Arrays;
import java.util.Set;

import com.test.disctionary.Dictionary;

/**
 * @author aprasa03
 *
 * Sep 5, 2015
 */
public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str="ABC";
		permutation("",str);
		//System.out.println(""+"123".charAt(0));
		//subSet("", str);
	   //Set<String> dic=Dictionary.getDictionary();
	////System.out.println(isAnagram("","army",dic));
		//permutation("","Army");
		
		/*int i,j,k; 
		for(i=0;i<=5;i++) 
		{ 
		for(j=i;j<=5;j++) 
		{ 
		System.out.print(" "); 
		} 

		for(j=1,k=2*i-1; j<=2*i-1; j++,k--) 

		{ 
		if (j <= k) 
		System.out.print(j); 
		else 
		System.out.print(k); 
		} 
		System.out.println(" "); 
		} 
*/
	}
	private static void permutation(String soFar,String rest)
	{
		//System.out.println(soFar+ "  "+rest);
		if(rest.length()==0)
		{
		System.out.println(soFar);
			return;
		}
		for(int i=0;i<rest.length();i++)
		{
			String next=soFar+rest.charAt(i);
			String remaining=rest.substring(0, i)+
					rest.substring(i+1);
			
			permutation(next,remaining);
			
		}
		
	}
	
	//0, 3
	//1, 2
	//2 ,1
	//3 ,0
	
	
	private static  boolean isAnagram(String soFar,String rest,Set<String> dic)
	{
		if(rest.length()==0)
		{
			if(dic.contains(soFar))
			{
				System.out.println(soFar);
				//return dic.contains(soFar);
			}
			
		}
		for(int i=0;i<rest.length();i++)
		{
			String next=soFar+rest.charAt(i);
			String remaining=rest.substring(0, i)+
					rest.substring(i+1);
			
			if(isAnagram(next,remaining,dic)) return true;
			
		}
		return false;
		
	}	
	
	private static void subSet(String soFar,String rest)
	{
		if(rest.length()==0)
		{
			System.out.println(soFar);
		}else
		{
			//add to subset and remove from rest,call recursion
		subSet(soFar+rest.charAt(0),rest.substring(1));
		//do not add to subset and remove from rest,call recusrsion
		subSet(soFar,rest.substring(1));
		}
	}
		
	
	
}