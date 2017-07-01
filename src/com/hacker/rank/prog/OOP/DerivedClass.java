/**
 * 
 */
package com.hacker.rank.prog.OOP;

/**
 * @author aprasa03
 *
 */
public class DerivedClass extends BaseClass {
	
	private void print()
	{
		System.out.println("print From Class A");
	}
	
	public static void main(String[] args) {
		BaseClass base=new DerivedClass();
		
		
		//DerivedClass d= b; complile time errror
		DerivedClass d=(DerivedClass) base;
		d.print();
		
		byte a = 127;
		byte b = 127; 
		//b = a + b; // error : cannot convert from int to byte b += a; // ok
		a+=b;
		double ff=3*0.1;
		double f=0.3;
		System.out.println(ff);
		System.out.println(f);
		System.out.println(ff==f);
		

	}

}
