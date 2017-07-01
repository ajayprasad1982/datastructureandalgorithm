/**
 * 
 */
package com.creational.abstractfactory;

/**
 * @author aprasa03
 *
 */
public class GreenColor implements Color {

	/* (non-Javadoc)
	 * @see com.creational.pattern.abstractfactory.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
