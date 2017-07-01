/**
 * 
 */
package com.hacker.rank.prog.misc;

/**
 * @author aprasa03
 *
 */
public class FindNumberOfSquaresNXNMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findNumberOfSquares(8));
	}

	private static int findNumberOfSquares(int n) {
		if (n == 1)
			return 1;

		return n * n + findNumberOfSquares(n - 1);
	}

}
