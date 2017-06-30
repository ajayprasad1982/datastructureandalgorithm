/**
 * 
 */
package com.sorting;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class InsertionSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num[] = { 6, 5, 2, 7, 3 };

		//insertionSort(num);
		//System.out.println(Arrays.toString(num));
		
		System.out.println(getNthDigit(450,10, 1));
	}

	private static void insertionSort(int[] num) {
		for (int i = 1; i < num.length; i++) {
			int temp = num[i];
			int j = i - 1;

			while (j >= 0 && temp < num[j]) {
				num[j + 1] = num[j];
				--j;
			}
			num[j + 1] = temp;
		}

	}


static char getDigitPlace(int a, int b) {
   String s=a+"";
    return s.charAt(b-1);
 }

static char digit(int a,int b)
{
    String x=a+"";
    char x1[]=x.toCharArray();
    int length=x1.length;
    char result=x1[length-b];
    return result;
}

public static int getNthDigit(int number, int base, int n) {  
	
	double powCal=Math.pow(base, n - 1);
	double div=number / powCal;
	
	  return (int) (div%base);
	}
	
	
	
	
	
	
	

}
