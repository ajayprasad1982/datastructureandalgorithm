/**
 * 
 */
package com.hacker.rank.prog.array;

/**
 * @author aprasa03
 *
 */
public class LongestIncreasingSubSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[]={10,11,18,345,342,12,13,14,15,5,6,7,8,9,2};
		findLongestIncreasingSubSequence(a);

	}
private  static  void findLongestIncreasingSubSequence(int a[])
{
	int start=0;
	int end=0;
	for(int i=0;i<a.length;i++)
	{
		int j=i+1;
		for(;j<a.length;j++)
		{
			if(a[j-1]>a[j])
			{
				
				break;
			}
		}
		if((j-1)-i>end-start)
		{
			start=i;
			end=j-1;
		}
		
	}
	System.out.println(end-start+1);
	for(int i=start;i<=end;i++)
	{
		System.out.print(a[i]+",");
	}
	
	//System.out.println(res);
	
}
	

}
