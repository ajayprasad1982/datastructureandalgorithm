/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 */
public class PallindromPartitioning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char ch[] = "abab".toCharArray();
		System.out.println(pallindromPartioning(ch, 0, ch.length - 1));
		System.out.println(pallindromPartioning1(ch, 0, ch.length - 1));

	}

	private static boolean isPallindrom(char ch[], int i, int j) {
		if (i == j)
			return true;
		if (i == j - 1) {
			return ch[i] == ch[j];
		}
		return ch[i] == ch[j] && isPallindrom(ch, i + 1, j - 1);
	}
	
	private static int pallindromPartioning(char ch[],int i,int j)
	{
		if(isPallindrom(ch, i, j))
		return 0;
	
	int min=Integer.MAX_VALUE;
	for(int k=i;k<j;k++)
	{
		min=Math.min(min,( pallindromPartioning(ch,i,k)+pallindromPartioning(ch,k+1,j))+1);
	}
	return min ;

}
	private static int pallindromPartioning1(char ch[],int i,int j)
	{
		if(isPallindrom(ch, i, j))
		return 0;
	
	int max=Integer.MIN_VALUE;
	for(int k=i;k<j;k++)
	{
		max=Math.max(max,( pallindromPartioning(ch,i,k)+pallindromPartioning(ch,k+1,j))+1);
	}
	return max ;

}
	
	
	
	
}