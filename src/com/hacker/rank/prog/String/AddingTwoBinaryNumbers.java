package com.hacker.rank.prog.String;

public class AddingTwoBinaryNumbers {

	public static void main(String[] args) {
		String str="001";
		String str1="101";
		
		int a=1^1^0;
		int b=1^1^1;
		int c=0^0^0;
		System.out.println((100&1)==0);
		System.out.println(convertDecimalToBinary(12));
		//add(str,str1);
	}
	
private static String convertDecimalToBinary(int input)
{
	
		if (input == 1 || input == 0) {
           return ""+input;
		}
		String result="";
	while(input!=1 && input!=0)
	{
		
		int rem=input%2;
		result=rem+result;
		input=input/2;
	}
	
	return input+result;
}
	private static void add(String s1,String s2)
	{
		int a=Integer.parseInt(s1,2);
		int b=Integer.parseInt(s2,2);
		int sum=a+b;
		System.out.println(sum);
	}
	

}
