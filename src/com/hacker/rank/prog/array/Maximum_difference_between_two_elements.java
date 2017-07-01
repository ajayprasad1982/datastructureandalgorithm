/**
 * 
 */
package com.hacker.rank.prog.array;

/**
 * @author aprasa03
 *
 */
public class Maximum_difference_between_two_elements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
int a[]={80, 2, 6, 3, 100};
System.out.println(getMaxDiff(a));
	}
	
	private static int getMaxDiff(int[] a )
	{
		int maxDiff=a[1]-a[0];
		int minEle=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]-minEle> maxDiff)
			{
				maxDiff=a[i]-minEle;
			}
			if(a[i]<minEle)
			{
				minEle=a[i];
			}
			
		}
		return maxDiff;
	}
	

}
