/**
 * 
 */
package com.data.structure.stack.test;

/**
 * @author aprasa03
 *
 * Feb 5, 2015
 */
public class SpiralMatrix_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  /*  int a[][] = { {1,  2,  3,  4,  5,  6},
	            {7,  8,  9,  10, 11, 12},
	            {13, 14, 15, 16, 17, 18}
	        };*/
	  int a[][]={{1,2,3},
			     {4,5,6},
			     {7,8,9}};
	    int row=a.length;
	    int col=a[0].length;
	        spiralPrint(row, col, a);


	}
	
	
	static void spiralPrint(int m, int n, int a[][])
	{
	 int i,j;
	 for(i=0;i<m;i++){
	 	if(i%2==0){
	 		for(j=0;j<n;j++)
	 			System.out.print(a[i][j]+" ");
	 	}else{
	 		for(j=n-1;j>=0;j--)
	 			System.out.print(a[i][j]+" ");
	 	}
	 	System.out.println();
	 }
	}	

}
