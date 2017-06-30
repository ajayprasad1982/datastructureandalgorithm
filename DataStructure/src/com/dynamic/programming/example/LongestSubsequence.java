/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 */
public class LongestSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sub[]={22,9,33,21,50,41,60,10,80};
		//int sub[]={2,7,3,4,9,8,12};
		
		//int sub[]={1,4,2,4,3};
		
//System.out.println(longestSubSequence(array));
System.out.println(longestIncreasingSubsequence(sub,0));
	}
	
	private static String longestSubSequence(int array[])
	{ int max=-9999;
		String temp="",res="";
		for(int i=0;i<array.length;i++)
		{
			int a=array[0];
			max=a;
			temp=a+" ";
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]>max)
				{
					max=array[j];
					temp=temp+" "+max;
				}
				
			}
			if(temp.length()>res.length())
			{
				res=temp;
			}
			temp="";
		}
		
		
		return res;
	}

private static int longestIncreasingSubsequence(int sub[],int i)	
{
	if(i==sub.length-1)
		return 1;
	
	int max=1;
	for(int k=i+1;k<sub.length;k++)
	{
		if(sub[i]<sub[k])
		{
			max=Math.max(max, 1+longestIncreasingSubsequence(sub,k));
		}
	}
	return max;
}
	
	
	
	
	
	
	
private static void longestSubsequence(int sub[]){
	int max=0;
	String res="",temp="";
	for(int i=0;i<sub.length;i++)
	{
		temp=temp+sub[i]+"";
		int subSequence=longestSubsequence(sub,i,temp);
		max=Math.max(subSequence, max);
		res=temp.length()>res.length()?temp:res;
		temp="";

	}
	System.out.println(res);
	System.out.println(max);
	
}
//int array[]={80,22,9,33,21,50,41,60,10};
private static int longestSubsequence(int sub[],int index,String res)
{
	String temp=res;
	int max=0;
	if(index==sub.length-1)
	{
		//res=res+sub[index];
		return 1;
	}
		
	for(int i=index+1;i<sub.length;i++)
	{
		if(sub[i]>sub[index])
		{
			System.out.println("Before\t"+res);
			//temp=res+sub[i]+"";
			System.out.println("After\t"+temp);
			int subSequence=longestSubsequence(sub,i,res+sub[i]);
			max=Math.max(subSequence, max);
			res=temp.length()>res.length()?temp:res+sub[i];
			System.out.println("After Result\t"+res);
			
		}
	}
	
	return 1+max;
}
	
	
	

}
