/**
 * 
 */
package com.hacker.rank.prog.String;

/**
 * @author aprasa03
 *
 */
public class FindDublicatesInString {
	private final static int NO_OF_CHARS=256;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
String str="abc123abc123";	
findDublicates(str);

	}
	private static void findDublicates(String str)
	{
		int count[]=new int [NO_OF_CHARS];
		for(int i=0;i<str.length();i++)
		{
			count[str.codePointAt(i)]++;
		}
		for(int i=0;i<NO_OF_CHARS;i++)
		{
			if(count[i]>1)
			{
				System.out.format("%c,Count %d", i,count[i]);
				System.out.println();
			}
		}
	}
	

}
