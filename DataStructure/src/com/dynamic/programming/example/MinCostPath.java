/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 */
public class MinCostPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*int path[][]={{1,8,3},
				{4,8,2},
				{1,5,3}
				};*/
		
		/*int path[][]={{1,2,3},
				{4,8,2},
				{1,5,3}};*/
		
		int path[][]={{1,3,5,8},
				{4,2,1,7},
				{4,3,2,3}
				};
		
		//System.out.println(getCostPath(path, path.length-1, path[0].length-1));
		System.out.println(getMinCostPathByDP(path));

	}

	private static int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	private static int getCostPath(int path[][],int i,int j)
	{
		if(i< 0 || j< 0)
			return 9999;
		if(i==0 && j==0)
		{
			return path[i][j];
		}
		
		int left=getCostPath(path,i-1,j);
		int right=getCostPath(path,i,j-1);
		int corner=getCostPath(path,i-1,j-1);
		int min=min(left,right,corner);
		//System.out.println("i\t"+i+"\tj\t"+j+"\t min\t"+min);
		return path[i][j]+min ;
		
		
	}
	
private static int getMinCostPath(int path[][],int i,int j)
{
	if(i< 0 || j< 0)
		return 9999;
	if(i==0 && j==0)
	{
		return path[i][j];
	}
	
	int left=getCostPath(path,i-1,j);
	int right=getCostPath(path,i,j-1);
	int min=Math.min(left, right);
	return path[i][j]+min ;
	
	
}
private static int getMinCostPathByDP(int path[][])	
{
	
	int m=path.length;
	int n=path[0].length;
	int temp[][]=new int [m][n];
	temp[0][0]=path[0][0];
	
	//fill first row with 1,2,3....cols
	for(int i=1;i<n;i++)
	{
		temp[0][i]=temp[0][i-1]+path[0][i];
	}
	//fill 1st column with 1,2,3....rows
	for(int i=1;i<m;i++)
	{
		temp[i][0]=temp[i-1][0]+path[i][0];
	}
	
	for(int i=1;i<m;i++)
	{
		for(int j=1;j<n;j++)
		{
			temp[i][j]=Math.min(temp[i][j-1], temp[i-1][j])+path[i][j];
		}
	}
	
	return temp[m-1][n-1];
	
}
	
	
}
