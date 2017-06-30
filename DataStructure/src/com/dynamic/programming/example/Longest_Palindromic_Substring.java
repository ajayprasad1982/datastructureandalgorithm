/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 * Jan 25, 2015
 */
public class Longest_Palindromic_Substring {

	/**
	 * @param args
	 */
	static String str="";
	public static void main(String[] args) {
		//char ch[]="sajays".toCharArray();
		char ch[]="forgeeksskeegfor".toCharArray();
		System.out.println(getLongestPalindromicSubstring(ch,0,ch.length-1));
		

	}
	private static boolean isPallindrom(char ch[],int i,int j)
	{
		if(i==j) return true;
		if(i==j-1) return ch[i]==ch[j];
		
		return ch[i]==ch[j] && isPallindrom(ch,i+1,j-1);
	}

private static int getLongestPalindromicSubstring(char ch[],int i,int j)
{
	int max=0;
	int start=0;
	int end=0;
	 while(i<=j)
	 {
		 for(int k=i;k<j;k++)
		 {
			 int part1=isPallindrom(ch,i,k)?(k-i)+1:0;
			 int part2=isPallindrom(ch, k+1, j)?(j-(k+1))+1:0;
			 max=Math.max(max, Math.max(part1, part2));
			 if(part1>=max)
			 {
				 start=i;
				 end=k;
			 }
			 else if(part2>=max)
			 {
				 start=k+1;
				 end=j;

			 }
			
			 
		 }
		 
		 i++;
	 }
	 getSubstring(ch,start,end);
	 System.out.println("start\t"+start+"\tend\t"+end+"\tSubstring\t"+getSubstring1(ch,start,end));
	return max;
}
	
private static void getSubstring(char ch[],int start,int end)
{
	if(start==end)
	{
		str+=ch[start];
		return ;

	}
	str+=ch[start];
	getSubstring(ch,start+1,end);		
}

private static String getSubstring1(char ch[],int start,int end)
{
	if(start==end)
	{
		return ch[start]+"";

	}
	return ch[start]+""+getSubstring1(ch,start+1,end);		
}


}
