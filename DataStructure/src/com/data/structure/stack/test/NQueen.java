/**
 * 
 */
package com.data.structure.stack.test;

import com.sun.org.apache.bcel.internal.classfile.Code;

/**
 * @author aprasa03
 *
 */
public class NQueen {

	/**
	 * 
	 * @param args
	 */
	private static int a[]={-1,-1,-1,-1 ,-1};
	
	public static void main(String[] args) {
		
		
		
//Nqueen();		
recursion(1);
		

	}
	private static void Nqueen()
	{
		
		int k=1;
		for(int i=1;i<a.length;i++)
		{
	       k=1;
		
		
			if(!isPossibleMove(k,i))
			{
				continue;
			}
			a[k]=i;
			for(int j=1;j<a.length;j++)
			{
			k=2;
			
				if(!isPossibleMove(k,j))
				{
					continue;
				}
				a[k]=j;
				for(int m=1;m<a.length;m++)
				{
				k=3;
				
					if(!isPossibleMove(k,m))
					{
						continue;
					}
					a[k]=m;
					
					for(int n=1;n<a.length;n++)
					{
					k=4;
					
						if(!isPossibleMove(k,n))
						{
							continue;
						}
						a[k]=n;
						if(a[1]==-1)
						{
							break;
						}
						System.out.print("[");	
						for(int result=1;result<a.length;result++)
						{
							
							System.out.print(a[result]+",");
							a[result]=-1;
						}
						
						System.out.println("]");
						//a[n]=-1;
					}	
					a[k]=-1;

				}	
				a[k]=-1;
			}
			a[k]=-1;
		}
		
		
	}
	
	
	private static Boolean isPossibleMove(int row,int col)
	{
		Boolean flag=true;
		for(int i=1;i<row;i++)
		{
			//same column
			if(a[i]==col)
			{
				return false;
			}
			//left diagonal      //right diagonal  
			if(a[i]-(row-i)==col || a[i] + (row-i)==col)
				return false;
		}
		return flag;
		
		
	}
	
private static void recursion(int row)
{
	if(row==a.length)
	{
		System.out.print("[");	
		for(int result=1;result<a.length;result++)
		{
			
			System.out.print(a[result]+",");
		}
		
		System.out.println("]");
		
	}else
	{
		for(int col=1;col<a.length;col++)
		{
			if(isPossibleMove(row, col))
			{
				a[row]=col;
				recursion(row+1);	
				a[row]=-1;
			}
		}
		
	}
	
}
	

}
