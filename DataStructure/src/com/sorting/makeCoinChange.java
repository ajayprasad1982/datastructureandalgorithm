/**
 * 
 */
package com.sorting;

/**
 * @author aprasa03
 *
 */
public class makeCoinChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int coins[]={1,2,3};
		int amount=5;
		change(coins,0,"",amount);

	}
	
private static boolean	change(int coins[],int highest,String res,int amount)
{
	if(amount<0)
		return false;
	
	if(amount==0)
		return true;
	String temp=res;
	
	for(int value:coins)
	{
		if(value>=highest)
		{
			res=res+value+"";
			if(change(coins,value,res,amount-value))
			{
				System.out.println(res);
			}
			
		}
		res=temp;
	}
	
	return false;
	
}
	

}
