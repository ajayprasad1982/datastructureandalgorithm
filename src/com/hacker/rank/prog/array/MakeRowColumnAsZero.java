/**
 * 
 */
package com.hacker.rank.prog.array;

/**
 * @author aprasa03
 *
 */
public class MakeRowColumnAsZero {

	/**
	 * @param args
	 * [[1, 0, 1, 1, 0],
     [0, 1, 1, 1, 0],
     [1, 1, 1, 1, 1],
     [1, 0, 1, 1, 1],
     [1, 1, 1, 1, 1]]
	 */
	public static void main(String[] args) {
		int matrix[][]={{1,0,1,1,0},
				        {0,1,1,1,0},
				        {1,1,1,1,1},
				        {1,0,1,1,1},
				        {1,1,1,1,1}};
		print(matrix);
		System.out.println("Print After Modification");
		modifyRowAndColAsZero(matrix);
		print(matrix);
		System.out.println();
		int matrix1[][]={{1,0,1,1,0},
		        {0,1,1,1,0},
		        {1,1,1,1,1},
		        {1,0,1,1,1},
		        {1,1,1,1,1}};
		modifyRowAndColAsZero_1(matrix1);
		print(matrix1);
		
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
	
	private static void modifyRowAndColAsZero_1(int matrix[][])
	{
		int row[]=new int[matrix.length];
		int col[]=new int[matrix[0].length];
		
		for(int i=0;i<row.length;i++)
		{
			for(int j=0;j<col.length;j++)
			{
				if(matrix[i][j]==0)
				{
					row[i]=1;col[j]=1;
				}
			}
		}
		
		for(int i=0;i<row.length;i++)
		{
			for(int j=0;j<col.length;j++)
			{
				if(row[i]==1|| col[j]==1)
				{
					matrix[i][j]=0;
				}
			}
		}
		
	}
	
private static void modifyRowAndColAsZero(int matrix[][])
{
	boolean row=false,col=false;
	int rowLen=matrix.length,colLen=matrix[0].length;
	//make row flag true
	for(int i=0;i<colLen;i++)
	{
		if(matrix[0][i]==0)
			{
			row=true;break;
			}
	}
	for(int i=0;i<rowLen;i++)
	{
		if(matrix[i][0]==0) 
			{
			col=true;break;
			}
	}
	
	for(int i=1;i<rowLen;i++)
	{
		for(int j=1;j<colLen;j++)
		{
			if(matrix[i][j]==0)
			{
				matrix[0][j]=0;
				matrix[i][0]=0;
			}
		}
	}
	for(int i=1;i<rowLen;i++)
	{
		for(int j=1;j<colLen;j++)
		{
			if(matrix[0][j]==0|| matrix[i][0]==0)
			{
				matrix[i][j]=0;
			}
		}
	}
	//column
	if(col)
	{
		for(int i=0;i<rowLen;i++)
		{
			matrix[i][0]=0;
		}
	}
	//row
		if(row)
		{
			for(int i=0;i<colLen;i++)
			{
				matrix[0][i]=0;
			}
		}
		
}
	

}
