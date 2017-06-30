/**
 * 
 */
package com.data.structure.stack.test;

/**
 * @author aprasa03
 *
 * Feb 3, 2015
 */
public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	int arr[][] = { {1,  2,  3},
		        {4,5,6},
		        {7,8,9}
		    };*/
		 
		int arr[][] = { {1,  2,  3,4},
		        {12,13,14,5},
		        {11,16,15,6},
		        {10,9,8,7}
		    };	
		printSpiral(arr,arr.length);
		System.out.println();
		printZigZag(arr);
	}
	
	static void printSpiral(int arr[][],int N)
	{
	    int i,j,k;
	    for(i=N-1, j=0; i>0; i--, j++)
	    {
	        //print top row
	        for(k  =j; k<i; k++) System.out.print( arr[j][k]+" ");
	        //print last column
	        for(k=j; k<i; k++) System.out.print( arr[k][i]+" ");
	        //print last row
	        for(k=i; k>j; k--) System.out.print( arr[i][k]+" ");
	        //print first column
	        for(k=i; k>j; k--) System.out.print( arr[k][j]+" ");
	 
	    }
	    //if odd size matrix print the middle value
	    int n=arr.length;
	     int middle = (n-1)/2;
	     if (n% 2 == 1) System.out.print( arr[middle][middle]+" ");
	}
	
	
	private static void printZigZag(int arr[][])
	{
		int row=0,trow=arr.length-1,col=0,tcol=arr[0].length-1;
		while(row<=trow && col<=tcol)
		{
			for(int i=col;i<=tcol;i++)
			{
				System.out.print(arr[row][i]+" ");
			}
			row++;
			for(int j=row;j<=trow;j++)
			{
				System.out.print(arr[j][tcol]+" ");
			}
			tcol--;
			for(int k=tcol;k>=col;k--)
			{
				System.out.print(arr[trow][k]+" ");
			}
			trow--;
			for(int l=trow;l>=row;l--)
			{
				System.out.print(arr[l][col]+" ");
			}
			col++;
		}
	}
	
	

}
