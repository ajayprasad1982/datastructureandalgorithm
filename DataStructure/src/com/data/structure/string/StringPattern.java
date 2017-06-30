/**
 * 
 */
package com.data.structure.string;

/**
 * @author aprasa03
 *
 * Jul 26, 2015
 */
public class StringPattern {

	/**
	 * * - *
	 * - * -
	 * * - *
	 */
	public static void main(String[] args) {
 String str="-";
 String str1="*";
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		 if((i+j)%2==0)
		 System.out.print(str1+" ");
		 else
		 System.out.print(str+" "); 
	 }
	 System.out.println();
 }
	}

}
