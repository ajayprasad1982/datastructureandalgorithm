/**
 * 
 */
package com.hacker.rank.prog.String;

/**
 * @author aprasa03
 *
 */
public class CompressionOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="AABBBBBBBBBBBCCC";
		compress(str);
	}
	
	
	private static void compress(String str)
	{
		String res="";
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(i+1<str.length() && count<=8 && str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else 
			{
				if(count!=1)	
			{
					res=res+count+str.charAt(i);
			}else
			{
				res=res+str.charAt(i);
			}
				count=1;
			}
		}
		
		System.out.println(res);
		
		
	}

}
