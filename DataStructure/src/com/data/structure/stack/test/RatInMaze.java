/**
 * 
 */
package com.data.structure.stack.test;

/**
 * @author aprasa03
 *
 */
public class RatInMaze {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[][]={
				{1,1,1,1},
				{0,1,0,0},
				{1,1,0,0},
				{1,1,1,1}				
		};
		int sol[][]=new int[4][4];
		maze(array,0,0,sol);
		printSol(sol);

	}

	private static boolean maze(int array[][], int row, int col, int sol[][]) {
		if (row == array.length - 1 && col == array.length - 1) {
			sol[row][col] = 1;
			return true;
		}

		if (isSafe(array, row, col)) {
			sol[row][col] = 1;
			if (maze(array, row, col + 1, sol))
				return true;

			if (maze(array, row + 1, col, sol))
				return true;

			sol[row][col] = 0;
		}
		
		return false;

	}

	private static void printSol(int sol[][]) {

		for (int i = 0; i < sol.length; i++) {
			System.out.print("[");
			for (int j = 0; j < sol.length; j++) {
				System.out.print(sol[i][j] + " ");
			}
			System.out.println("]");
		}

	}

	private static boolean isSafe(int array[][], int row, int col) {
		if (row >= 0 && row < array.length && col >= 0 && col < array.length
				&& array[row][col] == 1)
			return true;
		return false;
	}

}
