/**
 * 
 */
package com.numerical.test;

import java.util.regex.Pattern;

/**
 * @author aprasa03
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		        for (int runs = 0; runs < 2; runs++) {
		            Pattern pattern = Pattern.compile("(0*)*A");
		            // Run from 5 to 25 characters
		            for (int length = 5; length < 25; length++) {
		                // Build input of specified length
		                String input = "";
		                for (int i = 0; i < length; i++) { input += "0"; }
		               
		                // Measure the average duration of two calls... 
		                long start = System.nanoTime();
		                for (int i = 0; i < 2; i++) {
		                    pattern.matcher(input).find();
		                }
		                System.out.println(input + ": " 
		                       + ((System.nanoTime() - start) / 2000000d) 
		                       + "ms");
		            }
		        }
		    }
		

}
