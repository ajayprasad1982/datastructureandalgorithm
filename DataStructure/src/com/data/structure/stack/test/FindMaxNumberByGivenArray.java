/**
 * 
 */
package com.data.structure.stack.test;

import java.util.regex.Pattern;

/**
 * Largest Number Possible By Rearranging the Contents in The Array
 * @author aprasa03
 *
 *         Feb 8, 2015
 */
public class FindMaxNumberByGivenArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int array[] = { 1, 2, 3 };
		int array[]={78,99,101};

		System.out.println(findMaxNumber(array, 0));
		
		/*StringBuilder sb = new StringBuilder("INSERT INTO APP.PLAN_LOCKED_PRODUCTS (PLAN_ID,PRODUCT_ID,STATUS,DIFFUSION_ID) VALUES (PlanId,productId,1,DiffusionID)");
		System.out.println(Pattern.compile("PlanId").matcher(sb).replaceAll("Ajay"));
		System.out.println(sb);*/
		

	}

	private static int findMaxNumber(int array[], int i) {
		if (i == array.length - 1) {
			return getNumber(array, 0);
		}
		int max = Integer.MIN_VALUE;
		for (int k = i; k < array.length; k++) {
			swap(array, i, k);
			max = Math.max(max, findMaxNumber(array, i + 1));
			swap(array, i, k);

		}

		return max;
	}

	private static int getNumber(int array[], int i) {
		if (i == array.length - 1) {
			return array[i];
		}

		return new Integer(array[i] + "" + getNumber(array, i + 1));

	}

	private static void swap(int array[], int i, int j) {
		if (i == j)
			return;
		array[i] = array[i] ^ array[j];
		array[j] = array[i] ^ array[j];
		array[i] = array[i] ^ array[j];
	}

}
