/**
 * 
 */
package com.greedy.programming.example;

/**
 * @author aprasa03
 *
 *         Feb 15, 2015
 */
public class ActivitySelection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int finish[] = { 2, 4, 6, 7, 9, 9 };

		// printActivity(start,finish,0);
		printActivities(start, finish, 0, 1);
	}

	private static void printActivity(int start[], int finish[], int i) {
		System.out.print(i);

		for (int j = 1; j < finish.length; j++) {
			if (start[j] >= finish[i]) {
				System.out.print(j);
				i = j;
			}
		}
	}

	private static void printActivities(int start[], int finish[], int i, int j) {
		if (j >= finish.length)
			return;
		if (j == 1) {
			System.out.print(i);
		}
		if (start[j] >= finish[i]) {
			System.out.print(j);
			i = j;
		}
		printActivities(start, finish, i, j + 1);
	}

}
