/**
 * 
 */
package com.numerical.test;

/**
 * @author aprasa03
 *
 */
public class Add2Num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
System.out.println(subtract(1,2));
System.out.println(5<<2);
	}
	
	static  int sum(int x, int y)
	{
	    // Iterate till there is no carry 
	    while (y != 0)
	    {
	        // carry now contains common set bits of x and y
	        int carry = x & y; 
	 
	        // Sum of bits of x and y where at least one of the bits is not set
	        x = x ^ y;
	 
	        // Carry is shifted by one so that adding it to x gives the required sum
	        y = carry << 1;
	    }
	    return x;
	}
	static int subtract(int x, int y)
	{
	if (y == 0)
	return x;

	int sub = x ^ y;
	int sub_carry = (sub & y) << 1;
	return subtract(sub, sub_carry);
	}
	
	int Add(int x, int y)
	{
	    if (y == 0)
	        return x;
	    else
	        return Add( x ^ y, (x & y) << 1);
	}

}
