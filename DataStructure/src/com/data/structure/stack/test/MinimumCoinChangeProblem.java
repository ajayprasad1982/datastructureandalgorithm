/**
 * 
 */
package com.data.structure.stack.test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author aprasa03
 *
 * Feb 22, 2015
 */
public class MinimumCoinChangeProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConcurrentHashMap<Long,String> map = new ConcurrentHashMap<Long,String>();
		
		int coins[]={3,5,10};
		int changeRequired=30;
System.out.println(getMinCoin(coins,changeRequired));
	}

	
private static int getMinCoin(int coins[],int changeRequired)	
{
	if(changeRequired<=0)
		return 0;
	
	int min=Integer.MAX_VALUE;
	
	for(int i=0;i<coins.length;i++)
	{
		if(changeRequired-coins[i]>=0)
		{
			int minChange=1+getMinCoin(coins,changeRequired-coins[i]);
			min=min>minChange?minChange:min;
		}
		
	}
	
	return min==Integer.MAX_VALUE?0:min;
}
	
}
