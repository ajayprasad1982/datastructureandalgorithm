/**
 * 
 */
package com.data.structure.stack.test;

import static org.apache.commons.lang.StringUtils.isEmpty;

/**
 * @author aprasa03
 *
 */
public class SubsetOfSumK {

	/**
	 * @param args
	 */
	private static Integer a[] = { 3,5,10};
	private static Integer b[] = { 0, 0, 0 };
	private static int target = 20;
	private static int r=2;

	public static void main(String[] args) {
		subsetOfSum(0, 0);
		int arr[]={2,3,7,8,10};
		System.out.println(subset(arr,arr.length-1,14));
		//subset(0);
		//combination(0,0);
		String sql= "select"+ 
					"*     "+
					"from  "+
					"ddhh  "+
					"where "
		                   ;
		SubsetOfSumK  ssK=new SubsetOfSumK();
		
		
	}

	private static void subsetOfSum(int k, int sum) {

		if (k <= a.length && sum == target) {
			System.out.print("[");
			for (int i = 0; i < b.length; i++) {
				if (b[i] == 1) {
					System.out.print(a[i] + ",");
				}
			}
			System.out.println("]");
		} else {
			for (int i = k; i < a.length; i++) {
				if (sum + a[i] <= target) {
					b[i] = 1;
					subsetOfSum(i + 1, sum + a[i]);
					b[i] = 0;

				} else {
					break;
				}
			}

		}

	}
	

	private static void combination(int k, int ii) {

		if (k ==r) {
			System.out.print("[");
			for (int i = 0; i < b.length; i++) {
				if (b[i] == 1) {
					System.out.print(a[i] + ",");
				}
			}
			System.out.println("]");
		} else {
			for (int i = ii; i < a.length; i++) {
					b[i] = 1;
					combination(k + 1, i+1);
					b[i] = 0;

			}

		}

	}	

	private static void subset(int k) {

		for (int i = k; i < a.length; i++) {
			b[i] = 1;
			System.out.print("[");
			for (int j = 0; j < b.length; j++) {
				if (b[j] == 1) {
					System.out.print(a[j] + ",");
				}
			}
			System.out.println("]");

			subset(i + 1);
			b[i] = 0;

		}

	}
	private static boolean subset(int arr[],int len,int target)
	{
		if(target==0)
			return true;
		if(len<0 || target<0)
		{
			return false;
		}
		return subset(arr,len-1,target-arr[len]) ||subset(arr,len-1,target);
	}

}
