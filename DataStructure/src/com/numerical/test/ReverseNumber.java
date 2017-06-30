/**
 * 
 */
package com.numerical.test;

import java.util.Scanner;

/**
 * @author aprasa03
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//input number to reverse
        System.out.println("Please enter number to be reversed using Java program: ");
        int number = new Scanner(System.in).nextInt();


		System.out.println(reverse1(number));

	}

static int reverse(int number)
{
	int reverse=0;
	int remainder=0;
	
	while(number>0)
	{
		remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
	}
	
	return reverse;
}

static int reverse1(int number)
{
	int reverse=0;
	//int remainder=0;
	
	while(number>0)
	{
		reverse=reverse*10;
		reverse=reverse+number%10;
		//reverse=reverse*10+remainder;
		number=number/10;
	}
	
	return reverse;
}

	
}
