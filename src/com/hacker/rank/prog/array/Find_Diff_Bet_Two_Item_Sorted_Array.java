package com.hacker.rank.prog.array;

public class Find_Diff_Bet_Two_Item_Sorted_Array {

	public static void main(String[] args) {
           int a[]={2,5,9,12,14};
           int target=7;
           findDiff(a, target);
	}
	
    private static void findDiff(int a[],int target)
    {
    	int i=0,j=1;
    	while(i<j && j<a.length)
    	{
    		
    		if(a[j]-a[i]==target)
    		{
    			System.out.println(a[j]+" "+a[i]+" "+target);
    			i++;j++;
    		}else if(a[j]-a[i]<target)j++;
    		else if(a[j]-a[i]>target)i++;
    		
    	}
    }
	
	

}
