/**
 * 
 */
package com.data.structure.stack.test;

/**
 * @author aprasa03
 *
 *         Feb 3, 2015
 */
public class SpiralMatrix_2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
		//int arr[][]={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
		/*int ar[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 } };*/
		
		
		//printSpiral(ar);
		printSol(ar);
		

	}

	private static void printSpiral(int arr[][]) {
		int n = arr.length;
		for (int i = n - 1, j = 0; i > 0; i--, j++) {
			// print first row
			for (int k = j; k < i; k++) {
				System.out.print(arr[j][k]+" ");
			}
			// print last column
			for (int k = j; k < i; k++) {
				System.out.print(arr[k][i]+" ");
			}
			// print last row
			for (int k = i; k > j; k--) {
				System.out.print(arr[i][k]+" ");
			}

			// print first column
			for (int k = i; k > j; k--) {
				System.out.print(arr[k][j]+" ");
			}

		}
	int middle=(n-1)/2;
	if(n%2==1)
	{
		System.out.print(arr[middle][middle]);
	}
		

	}
	
	
	

		public static void printSol(int ar[][]) {
		// TODO Auto-generated method stub

		
		// System.out.println(ar[2][3]);
		int ur = 0;
		int rc = ar[0].length-1;
		int lr = ar.length-1;
		int lc = 0;
		while (ur <= lr && rc >= lc) {
		for (int i = lc; i < rc; i++) {
		System.out.print(ar[ur][i] + " ");
		}
		for (int j = ur ; j <= lr; j++) {
		System.out.print(ar[j][rc] + " ");
		}
		if (ur < lr) {
		for (int k = rc - 1; k >= lc; k--) {
		System.out.print(ar[lr][k] + " ");
		}
		}
		if (rc > lc) {
		for (int l = lr - 1; l > ur; l--) {
		System.out.print(ar[l][lc] + " ");
		}
		}
		ur++;
		rc--;
		lr--;
		lc++;
		}
		}



}
