/**
 * 
 */
package com.recursion.test;

/**
 * @author aprasa03
 *
 * Sep 7, 2015
 */
public class Pallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
String input="atta";
System.out.println(isPallindrome(input));
	}

	
	
private static boolean isPallindrome(String input)
{
	if(input.length()<=1) return true;
	return input.charAt(0)==input.charAt(input.length()-1) &&
			isPallindrome(input.substring(1, input.length()-2));
}
	
}
