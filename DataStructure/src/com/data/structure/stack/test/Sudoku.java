/**
 * 
 */
package com.data.structure.stack.test;

/**
 * @author aprasa03
 *
 */
public class Sudoku {

	private static int nextRow = 0;

	private static int nextCol = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[][]={{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		
		int sol[][]=new int [9][9];
		//sol=array;
		solveSudoku(array, sol);
		printSol(array);
		
		

	}

	private static boolean findNextPosition(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				if (array[i][j] == 0) {
					nextRow = i;
					nextCol = j;
					return true;
				}

			}
		}

		return array[nextRow][nextCol] == 0;
	}

	private static boolean isSafeMove(int array[][], int row, int col, int num) {
		if (row < 0 && row >= array.length && col < 0 && col >= array.length
				&& array[row][col] != 0) {
			return false;
		}
		// row check
		for (int i = 0; i < array.length; i++) {
			if (array[row][i] == num) {
				return false;
			}
		}

		// col check
		for (int i = 0; i < array.length; i++) {
			if (array[i][col] == num) {
				return false;
			}
		}
	if (isUsed(array, row, col, num)) {
			return false;
		}
	return true;
	}

	private static boolean isUsed(int array[][], int row, int col, int num) {
		int startRow = row - row % 3;
		int startCol = col - col % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (array[i + startRow][j + startCol] == num) {
					return true;
				}
			}

		}
		return false;

	}

	private static boolean solveSudoku(int array[][], int sol[][]) {
		int row, col = 0;

		if (!findNextPosition(array)) {
			return true;
		}
		row = nextRow;
		col = nextCol;
		for (int i = 1; i <= array.length; i++) {
			if (isSafeMove(array, row, col, i)) {
				array[row][col] = i;
				if (solveSudoku(array, sol)) {
					return true;
				}
				array[row][col] = 0;

			}
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
	
	
	

}
