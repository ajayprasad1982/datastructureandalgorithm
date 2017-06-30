package com.data.structure.stack;

public class Closet1000 {

	public static void main(String[] args) {
		System.out.println(getCloset1000(900, 600));
		System.out.println(getDoubledString("abcadse"));
		String s=allStar("abcadse");
		 //s=;
		System.out.println(s);
		
		System.out.println(reverseString("TATA"));
		

	}
	private static String reverseString(String str)
	{
		if(str==null || str.length()<2)
		{
			return str;
		}
		char c=str.charAt(0);
		
		return reverseString(str.substring(1))+c;		
	}
	
	
	
	public static String allStar(String word) {
		  // null or the empty string, bail out (e.g. stop recursion).
		  if (word == null || word.length() < 1) {
		    return word;
		  }
		  if(word.length()==1)
		  {
			  return word;
		  }
		  // The first character.
		  char c = word.charAt(0);
		  
		  // pass the character through and recurse.
		  return c +"*"+ allStar(word.substring(1));
		}

	private static int getCloset1000(int a, int b) {
		int adiff = 0, bdiff = 0;

		adiff = 1000 - a;
		bdiff = 1000 - b;

		if (adiff < bdiff)
			return a;
		else
			return b;

	}
private static String getDoubledString(String str)	
{
	StringBuilder sb=new StringBuilder();
	char ch;
	for(int i=0;i<str.length();i++)
	{
		ch=str.charAt(i);
		sb.append(ch).append(ch);
	}
	
	return sb.toString();
}
	
}
