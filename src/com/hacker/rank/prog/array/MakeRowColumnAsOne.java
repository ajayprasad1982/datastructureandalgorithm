/**
 * 
 */
package com.hacker.rank.prog.array;

/**
 * @author aprasa03
 *
 */
public class MakeRowColumnAsOne {

	/**
	 * @param args
	 * 0 0 1 0 0
0 0 0 0 0
1 0 0 0 0
0 0 0 0 0
	 */
	public static void main(String[] args) {
		int matrix[][]={{0,0,1,0,0},
				        {0,0,0,0,0},
				        {1,0,0,0,0},
				        {0,0,0,0,0}};
		print(matrix);
		System.out.println("Print After Modification");
		modifyRowAndColAsOne(matrix);
		print(matrix);
	}
	private static void print(int matrix[][])
	{
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
private static void modifyRowAndColAsOne(int matrix[][])
{
	boolean row=false,col=false;
	int rowLen=matrix.length,colLen=matrix[0].length;
	//make row flag true
	for(int i=0;i<colLen;i++)
	{
		if(matrix[0][i]==1)
			{
			row=true;break;
			}
	}
	for(int i=0;i<rowLen;i++)
	{
		if(matrix[i][0]==1) 
			{
			col=true;break;
			}
	}
	
	for(int i=1;i<rowLen;i++)
	{
		for(int j=1;j<colLen;j++)
		{
			if(matrix[i][j]==1)
			{
				matrix[0][j]=1;
				matrix[i][0]=1;
			}
		}
	}
	for(int i=1;i<rowLen;i++)
	{
		for(int j=1;j<colLen;j++)
		{
			if(matrix[0][j]==1|| matrix[i][0]==1)
			{
				matrix[i][j]=1;
			}
		}
	}
	//column
	if(col)
	{
		for(int i=0;i<rowLen;i++)
		{
			matrix[i][0]=1;
		}
	}
	//row
		if(row)
		{
			for(int i=0;i<colLen;i++)
			{
				matrix[0][i]=1;
			}
		}
		
}
	

}
