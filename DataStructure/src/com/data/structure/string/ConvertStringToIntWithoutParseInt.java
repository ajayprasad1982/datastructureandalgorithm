/**
 * 
 */
package com.data.structure.string;

/**
 * @author aprasa03
 *
 * Jul 12, 2015
 */
public class ConvertStringToIntWithoutParseInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="1234";
		char m = '5';
		System.out.println((int)'1');
		int output=0;
		//Integer.parseInt(s)
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			output*=10;
			//output+=Character.digit(ch[i], 10);
			output+=ch[i]-'0';
		}
		
		System.out.println(output);

	}

}
