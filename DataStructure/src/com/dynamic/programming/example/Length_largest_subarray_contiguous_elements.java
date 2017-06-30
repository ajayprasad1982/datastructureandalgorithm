/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 * Feb 14, 2015
 */
public class Length_largest_subarray_contiguous_elements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={10,12,11};
		int b[]={1,12,3,10,11,2,13,14,15};
		int c[]={1,56,58,57,90,92,94,93,91,45};
		int d[] = {14, 12, 11, 20};
		int e[]={95, 1, 56, 58, 57, 90, 92, 91, 94, 93, 45, 96, 8};
		//System.out.println(findLength(a,a.length));
		findSubLength(e);
		//System.out.println(search(b,0,15));
		

	}
	
private	static int findLength(int a[],int n)
	{
	    int max_len=1;
	    int i,j;
	   
	    for(i=0;i<n;i++)
	    {
	       int mn=a[i],mx=a[i];
	      for(j=i+1;j<n;j++)
	      {
	          mn=Math.min(mn,a[j]);
	          mx=Math.max(mx,a[j]);
	        //  if(mx-mn > n) break;
	          if(mx-mn == j-i)
	          {
	              max_len=Math.max(max_len,mx-mn+1);
	          }
	          
	      }
	    
	    
	    }
	   return max_len; 
	}


private static void findSubLength(int a[])
{
	int count=1;
	int maxLen=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		int input=a[i]+1;
		while(search(a,0,input))
		{
			input=input+1;
			count++;
		}
		maxLen=Math.max(maxLen, count);
		count=1;
		
	}
	
	System.out.println(maxLen);
	
}






private static boolean search(int a[],int i,int input)
{
	if(i==a.length)
	{
		return false;
	}
	
 	if(a[i]==input)
 	{
 		return true;
 	}
 	else
 	{
 		return search(a, i+1,input);
 	}
	
}

}
