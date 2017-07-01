/**
 * 
 */
package com.hacker.rank.prog.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author aprasa03
 *
 */
public class RemoveDuplicateFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		String str="geeks for geeks";
		removeDuplicates(str);
		
		
		List<String> items = new ArrayList();
		items.add("biscuits");
		String item = items.get(0);
		
		List item1 = new ArrayList<String>();
		item1.add("biscuits");
		String itm = (String) item1.get(0);

		
		

	}
	
	
	private static void removeDuplicates(String str)
	{
		int ch[]=new int[256];
		String st="";
		for(int i=0;i<str.length();i++)
		{
			ch[str.codePointAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[str.codePointAt(i)]>=1)
			{
				st=st+str.charAt(i);
				ch[str.codePointAt(i)]=0;
			}
			
			
		}
		
		System.out.println(st);
		
	}

}
