/**
 * 
 */
package com.dynamic.programming.example;

/**
 * @author aprasa03
 *
 */
public class EditDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char x[] = "ABC".toCharArray();
		char y[] = "CAB".toCharArray();
		System.out.println(minEditDistance(x, y, x.length - 1, y.length - 1));

	}

	private static int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	private static int minEditDistance(char[] x, char[] y, int i, int j) {
		if (i == 0 && j == 0)
			return 0;
		if (i == 0)
			return j;
		if (j == 0)
			return i;
		int left = minEditDistance(x, y, i, j - 1) + 1;
		int right = minEditDistance(x, y, i - 1, j) + 1;
		int corner = minEditDistance(x, y, i - 1, j - 1)
				+ (x[i] == y[j] ? 0 : 1);

		return min(left, right, corner);

	}

}
