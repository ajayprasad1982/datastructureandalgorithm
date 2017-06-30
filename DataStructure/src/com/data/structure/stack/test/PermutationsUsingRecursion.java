/**
 * 
 */
package com.data.structure.stack.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author aprasa03
 *
 */

public class PermutationsUsingRecursion {
	static int nextNum=Integer.MIN_VALUE;
	static int nextNum1=56;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] array ={1,2,3,4};
		Integer [] org={1,2,3,4};
		//permutations(array,0,new ArrayList(),0,org);
		//System.out.println(nextNum1);
		String str="1234";
		System.out.println(solve(str,new Integer(str),0,Integer.MAX_VALUE));
		//Combination(array,0,new ArrayList(),0);
		//Combination(array,0,new HashSet(),0,0);
	}
	
private static 	void Combination(Integer[] array,int c,Set<List<Integer>> set,int sum,int index)
{
	
	   if(array.length-1==c)
	   {
		   List<Integer> list=new ArrayList<Integer>();
		   list.add(array[c-1]);
			list.add(array[c]);
			//System.out.println("i\t"+index+"\tArray\t"+Arrays.toString(array));
			int tempSum=list.get(0)+list.get(1);
			set.add(list);
			System.out.println(set);
			/*if(tempSum!=sum)
			{
				
				//System.out.println(list);
			}
			sum=tempSum;		   list.clear();*/
	   }
	   else
	   { 
		   for(int i=c;i<array.length;i++)
		   {
			   swap(array,i,c);
			   Combination(array, c+1,set,array[i]+array[c],i);
			   swap(array,i,c);
			   
		   }
		   
	   }
	
}

private static 	void permutations(Integer[] array,int c,List<Integer> list,int sum,Integer[] org)
{
	
	   if(array.length-1==c)
	   {
		   list.add(array[c-1]);
			list.add(array[c]);
			getNextNumber(array,Integer.valueOf(getString(org)));
			//System.out.println(Arrays.toString(array));
			  list.clear();
			/*int tempSum=list.get(0)+list.get(1);
			if(tempSum!=sum)
			{
				
				System.out.println(list);
			}
			sum=tempSum;		   list.clear();*/
	   }
	   else
	   { 
		   for(int i=c;i<array.length;i++)
		   {
			   swap(array,i,c);
			   permutations(array, c+1,list,array[i]+array[c],org);
			   swap(array,i,c);
			   
		   }
		   
	   }
	
}


static void swap(Integer[] array,int i,int c)
{
	int swap=array[c];
	array[c]=array[i];
	array[i]=swap;
	
}

private  static String getString(Integer[] array)
{
	String temp="";
	for(Integer num:array)
	{
		temp+=num;
	}
	
	return temp;
}

private static void getNextNumber(Integer[] array,int org)
{
	
	int num=Integer.valueOf(getString(array));
	
	if(org!=num)
	{
		if(nextNum<=(org-num))
		{
			nextNum=(org-num);
			nextNum1=num;
			
		}
	}
}

private static int solve(String str,int num,int k,int min)
{
	if(k==str.length()-1) 
		{
		//System.out.println(num);
		return  new Integer(str);
		}
	
	int mainNum=num;
	for(int i=k;i<str.length();i++)
	{
		str=swap(str,i,k);
		//System.out.println(str);
	int number=solve(str,new Integer(str), k+1,min);
	if((number-mainNum)>0 && min>(number-mainNum))
	{
		min=(number-mainNum);
		mainNum=number;
	}
	
		str=swap(str,i,k);

		
	}
return mainNum;
}


static String swap(String str,int i,int j)
{
	char ch[]=str.toCharArray();
	char swap=ch[j];
	ch[j]=ch[i];
	ch[i]=swap;
	return new String (ch);
	
}

static int swap1(String str,int i,int j)
{
	char ch[]=str.toCharArray();
	char swap=ch[j];
	ch[j]=ch[i];
	ch[i]=swap;
	return new Integer(new String (ch));
	
}



}
