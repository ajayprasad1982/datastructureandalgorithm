/**
 * 
 */
package com.greedy.programming.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 *         Feb 20, 2015
 */
public class CountScoreGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = { 3, 5, 10 };
		//solve(a, 20, "", 0);
		solve1(a, 20,0, "", 0);
		// System.out.println(Count(20));
	}

	// Returns the count of ways we can sum S[0...m-1] coins to get sum n
	static int count(int S[], int m, int n) {
		// If n is 0 then there is 1 solution (do not include any coin)
		if (n == 0) {
			// System.out.println(S[m]);
			return 1;
		}

		// If n is less than 0 then no solution exists
		if (n < 0)
			return 0;

		// If there are no coins and n is greater than 0, then no solution exist
		if (m <= 0 && n >= 1)
			return 0;

		// count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
		int c = count(S, m - 1, n);
		System.out.println("C\t" + c);
		int c1 = count(S, m, n - S[m - 1]);
		System.out.println("C1\t" + c1);
		System.out.println("C+C1\t" + (c + c1));
		return c + c1;
	}

	private static void solve1(int a[], int target,int sum, String result, int prev) {
		if (sum == target) {
			System.out.println(result);
		}

		for (int k = 0; k < a.length; k++) {
			if (prev <= a[k] && sum+ a[k] <= target) {
				solve1(a, target,sum +a[k], result + " " + a[k], a[k]);
			}
		}

	}
	
	
	
	private static void solve(int a[], int target, String result, int prev) {
		if (target == 0) {
			System.out.println(result);
		}

		for (int k = 0; k < a.length; k++) {
			if (prev <= a[k] && target - a[k] >= 0) {
				solve(a, target - a[k], result + " " + a[k], a[k]);
			}
		}

	}

	/*
	 * static int Count(int n) { if (n < 3) return 0; if (n == 3 || n == 5)
	 * return 1; if (n == 10) return 2;
	 * 
	 * return Count(n-3) + Count(n-5) + Count(n-10);
	 * 
	 * }
	 */
	/*
	 * def recMC(int a[],int change) minCoins = change if change in
	 * coinValueList: return 1 else: for i in [c for c in coinValueList if c <=
	 * change]: numCoins = 1 + recMC(coinValueList,change-i) if numCoins <
	 * minCoins: minCoins = numCoins return minCoins
	 */

}
