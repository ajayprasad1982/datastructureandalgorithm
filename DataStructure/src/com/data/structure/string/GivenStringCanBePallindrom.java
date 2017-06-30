/**
 * 
 */
package com.data.structure.string;

/**
 * @author aprasa03
 *
 * Feb 10, 2015
 */
public class GivenStringCanBePallindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String str="ABAA";
		String str="geeksorgeeks";
		
		char ch[]=str.toCharArray();
     int count[]=new int[256];
     generateCountChar(count,ch,0,ch.length-1);
     System.out.println(isPallindrome(count, 0, 0));
     
	}
	private static void generateCountChar(int count[],char ch[],int i,int j)
	{
		if(i>j)
			return;
		count[ch[i]]++;
		count[ch[j]]++;
		generateCountChar(count,ch,i+1,j-1);
		
	}
private static boolean isPallindrome(int count[],int counts,int i)	
{
	if(i>count.length-1)
	{
		return true;
	}
	if(counts==1)
	{
		return false;
	}
	return isPallindrome(count,((count[i]&1)==1?counts+1:counts),i+1);
}
	

}
