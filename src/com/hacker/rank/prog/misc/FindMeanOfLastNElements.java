/**
 * 
 */
package com.hacker.rank.prog.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 */
public class FindMeanOfLastNElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(){{add(1);add(2);add(3);add(4);add(5);add(6);add(7);}};
		System.out.println(findMean(list,4));
	}

	
	
private static int findMean(List<Integer> list,int n)	
{
	int sum=0;
	if(list.isEmpty()) return -1;
	if(list.size()==1) return list.get(0);
	int len=list.size();
	for(int i=1;i<=n;i++)
	{
		sum+=list.get(len-i);
	}
	
	
	return sum/n;
}
	
}
