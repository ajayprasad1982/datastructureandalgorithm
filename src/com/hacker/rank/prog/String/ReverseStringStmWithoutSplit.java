/**
 * 
 */
package com.hacker.rank.prog.String;

/**
 * @author aprasa03
 *
 */
public class ReverseStringStmWithoutSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String st="this is a string";
		System.out.println(st);
		System.out.println("After Reverse");
		
		reverse(st.toCharArray());

	}
	private static void reverse(char [] ch)
	{
		
		String [] str=new String [10];
		int i=0;
		String temp="";
		for(char c:ch)
		{
			if(c==' ')
			{
				str[i++]=temp;
				temp="";
			}
			else
			{
				temp=temp+c;
			}
		}
		str[i++]=temp;
		StringBuilder sb=new StringBuilder();
		
	for(int j=i-1;j>=0;j--)
	{
		sb.append(str[j]);
		if(j!=0)
		{
			sb.append(" ");
		}
	}
		System.out.println(sb);
		
	}
	

}
