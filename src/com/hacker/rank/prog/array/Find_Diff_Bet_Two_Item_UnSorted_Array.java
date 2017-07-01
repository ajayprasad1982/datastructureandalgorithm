package com.hacker.rank.prog.array;

import java.util.HashSet;
import java.util.Set;

public class Find_Diff_Bet_Two_Item_UnSorted_Array {

	public static void main(String[] args) {
          // int a[]={1,5,3,4,2};
		 int a[]={8,12,16,4,0,20};
           int target=4;
           findDiff(a, target);
	}
	
    private static void findDiff(int a[],int target)
    {
    	Set<Integer> set=new HashSet<Integer>();
    	for(int i=0;i<a.length;i++)
    	{
    		set.add(a[i]);
    	}
    	
    	for(int i=0;i<a.length;i++)
    	{
    		int x=a[i];
    		if(set.contains(x-target))
    		{
    			System.out.println(x+" "+(x-target)+" "+target);
    		}
    		if(set.contains(x+target))
    		{
    			System.out.println(x+target+" "+x+" "+target);
    		}
    		set.remove(x);
    	}
    		
    	
    }
	

}
