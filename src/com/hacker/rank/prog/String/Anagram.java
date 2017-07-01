/**
 * 
 */
package com.hacker.rank.prog.String;

/**
 * @author aprasa03
 *
 */
public class Anagram {
	private final static int NO_OF_CHARS=256;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1 = "abc123";
	    String str2 = "cba321";
	    if ( areAnagram(str1, str2) )
	      System.out.println("The two strings are anagram of each other");
	    else
	      System.out.println("The two strings are not anagram of each other");

	}
	
	private static boolean areAnagram(String a, String b)
	{
		
		//if both string is null, then considering it as anagram.
		  if(a.equalsIgnoreCase(b)){
		   return true;
		  }
		  
		  //if any one string is null, then they are not anagram.
		  if(a==null || b==null)
		   return false;
		   
		  //If length of both strings are not same then obviously they are not anagrams.
		  if(a.length()!=b.length())
		   return false;
		int count1[] =new int[NO_OF_CHARS];int count2[] =new int[NO_OF_CHARS];
		
		for(int i=0;i<a.length();i++)
		{
			count1[a.codePointAt(i)]++;
			count2[b.codePointAt(i)]++;
		}
		
		for(int i=0;i<NO_OF_CHARS;i++)
		{
			if(count1[i]!=count2[i])return false;
		}
		return true;
	}

}
