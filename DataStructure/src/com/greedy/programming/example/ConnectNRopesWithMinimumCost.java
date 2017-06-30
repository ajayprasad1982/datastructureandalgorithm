/**
 * 
 */
package com.greedy.programming.example;

/**
 * @author aprasa03
 *
 * Feb 11, 2015
 */
public class ConnectNRopesWithMinimumCost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int cost[]={1,2,3};
		
		//int cost[]={2,3,4,6};
		int cost[]={5,10,15,20,50,100};
		//System.out.println(MinCostPrint(cost,0,0));
		/*cost[1]=cost[0]+cost[1];
		MinCost(cost,2);
		System.out.println(add(cost,1));
		*/
		//int cost[]={5};
		System.out.println(MinCost1(cost,0,0));
		//calc(cost);

	}
private static void calc(int cost[])
{  
	cost[1]=cost[0]+cost[1];
	for(int i=2;i<cost.length;i++)
	{
		cost[i]=cost[i-1]+cost[i];
	}
	int add=0;
	System.out.println(add(cost,1));
}

//optimized one
private static int MinCost1(int cost[],int i, int sum)	
{
	if(cost.length <= 1 || i>=cost.length-1  )
		return sum;
	if(i == 0)
	{
		return  MinCost1(cost,i+1, cost[i]+cost[i+1]);
	}
	return  sum +MinCost1(cost,i+1, sum + cost[i+1]);
}

	private static void MinCost(int cost[],int i)	
	{
		if(i==cost.length)
			return;
		cost[i]=cost[i-1]+cost[i];
		MinCost(cost,i+1);
		return;
	}
private static int  add(int cost[],int i)
{
	if(i==cost.length-1)
		 
		return cost[i];
	
	return cost[i]+add(cost,i+1);
}
	
}
