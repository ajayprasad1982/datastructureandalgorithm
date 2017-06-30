/**
 * 
 */
package com.data.structure.string;

import static org.apache.commons.lang.StringUtils.remove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author aprasa03
 *
 * Jan 31, 2015
 */
public class LongestRepeatedSubString {

	/**
	 * @param args
	 */
	static String subStr="";
	public static void main(String[] args) {
		
		String str="banana";
		//String str="ATCGATCGA";
		//String str="AAAAAAAAAA ";
		//String str="ABCDEFG";
		
		//solve(str.toCharArray());
		//solve11(str.toCharArray(),0,0,new ArrayList<String>(),"");
		//solve111(str.toCharArray(), 0, 0);
		
		System.out.println("Result\t="+solve11(str.toCharArray(),0,0,new ArrayList<String>(),""));
		
	}
	
	private static String  solve11(char ch[],int i,int j,List<String> list,String st)
	{
		if(j>ch.length-1)
		{
			return st;
		}
        String str=print(ch,i,j);
        System.out.println(str);
       if(list.contains(str) && st.length()<str.length())
       {
    	   st=str;
       }
       else
       {
    	   list.add(str);  
       }
       
		if(i==j)
		{
			st=solve11(ch,i+1,j+1,list,st);
		}
		
		return solve11(ch,i,j+1,list,st);
	}

	
	
	
	/*private static void solve11(char ch[],int i,int j,List<String> list)
	{
		if(j>ch.length-1)
		{
			return;
		}
      String str=print(ch,i,j);
       if(list.contains(str) && subStr.length()<str.length())
       {
    	   subStr=str;
       }
       else
       {
    	   list.add(str);  
       }
		solve11(ch,i,j+1,list);
		if(i==j)
		{
			solve11(ch,i+1,j+1,list);
		}
		
		
	}
*/	
private static String print(char ch[],int i,int j)
{
	String str="";
	while(i<=j)
	{
		//System.out.print(ch[i]+"");
		str+=ch[i]+"";
		i++;
	}
	//System.out.println();
	
	return str;
}
	
	
	private static String solve1(char ch[],int i,String subStr)
	{
		String temp="";
		
		if(i==ch.length-1)
		{
			return subStr;
		}
		
			temp=new String(Arrays.copyOfRange(ch, 0,
					i+1));
			
			int j=i+1,k=j+temp.length()-1;
			while(k<ch.length)
			{
				String temp1=new String(Arrays.copyOfRange(ch, j,
						k+1));
				if(temp.equalsIgnoreCase(temp1))
				{
					subStr=temp;
				}
				j++;k++;	

			}
			
			return solve1( ch,i+1, subStr);
		
	}


	
	
	
	private static void solve(char ch[])
	{
		String temp="",subStr="";
		for(int i=0;i<ch.length;i++)
		{
			temp=new String(Arrays.copyOfRange(ch, 0,
					i+1));
			
			int j=i+1,k=j+temp.length()-1;
			while(k<ch.length)
			{
				String temp1=new String(Arrays.copyOfRange(ch, j,
						k+1));
				if(temp.equalsIgnoreCase(temp1))
				{
					subStr=temp;
				}
				j++;k++;	

			}
			
		}		
		System.out.println(subStr);
		
	}
	
private static String getString(char ch[],int src,int dest)
{
	String str=new String(ch);
	String subStr="";
	int count=0;
	while(count<dest)
	{
		subStr+= str.charAt(src)+"";
		count++;
	}
	
	
	return subStr;
}
	
	
}
