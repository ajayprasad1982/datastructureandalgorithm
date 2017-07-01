/**
 * 
 */
package com.hacker.rank.prog.patternSearching;

/**
 * @author aprasa03
 *
 */
public class Search_a_word_in_a_2d_grid_of_characters {

	/**
	 * @param args
	 */
	private static int x[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
	private static int y[] = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void main(String[] args) {
		char grid[][] = { "GEEKSFORGEEKS".toCharArray(),
				"GEEKSQUIZGEEK".toCharArray(), "IDEQAPRACTICE".toCharArray() };
		String word = "GEEKS";
		searchPattern(grid, word);

	}

	private static void searchPattern(char grid[][], String word) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if(petternSearch(grid, row, col, word))
				{
					//System.out.println(row+" "+ col);
				}
			}
		}
	}

	private static boolean petternSearch(char grid[][], int row, int col,
			String word) {
		if (grid[row][col] != word.charAt(0))
			return false;

		int len = word.length();
		for (int dir = 0; dir < x.length; dir++) {
			int k, rd = row + x[dir], cd = col + y[dir];

			for (k = 1; k < len; k++) {
				if (rd >=grid.length || rd < 0 || cd >=grid[0].length || cd < 0)
					break;
				if (grid[rd][cd] != word.charAt(k))
					break;
				rd = rd + x[dir];
				cd = cd + y[dir];
				
			}
			if (k == len)
			{	System.out.println(x[rd] +" "+y[cd]);
				return true;
			}
		}

		return false;
	}

}
