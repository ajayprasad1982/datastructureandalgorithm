/**
 * 
 */
package com.hacker.rank.prog.String;

/**
 * @author aprasa03
 *
 */
public class PrintAllCombinationOfParenthesis {

	/**
	 * @param args
	 */
	private static String[] str=new String[100];
	public static void main(String[] args) {
print(3,0,0,0);
	}
	
private static void print(int n,int pos,int open,int close)	
{
	if(close==n)
	{
		for(String st:str)
		{
			if(st!=null)
			{
				System.out.print(st);
			
			}
		}
		System.out.println();
		return;
	}
	else {
		if(open>close)
{
	str[pos]=")";
	print(n,pos+1,open,close+1);
}
		if(open<n)
{
	str[pos]="(";
	print(n,pos+1,open+1,close);
}
}
}	

}
