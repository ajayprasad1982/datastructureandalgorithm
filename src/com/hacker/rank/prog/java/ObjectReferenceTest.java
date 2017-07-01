/**
 * 
 */
package com.hacker.rank.prog.java;

/**
 * @author aprasa03
 *
 */
public class ObjectReferenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Integer i=new Integer(10);
	Integer j=new Integer(20);
	swap(i,j);
System.out.println("i "+i+" "+"j "+j);
System.out.print("Y"+"O");
System.out.print('L'+'O');
//System.out.println('O');

	}
private static void swap(Integer i,Integer j)	
{
	Integer temp=new Integer(i);
	i=j;
	j=temp;
	//System.out.println(i + " " +j);	
	
}
private static void swap1(Integer i,Integer j)	
{
	Integer temp=i;
	i=j;
	j=temp;
//	System.out.println(i + " " +j);
	
}	

}
