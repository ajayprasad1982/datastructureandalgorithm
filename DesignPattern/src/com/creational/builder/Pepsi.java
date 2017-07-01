/**
 * 
 */
package com.creational.builder;

/**
 * @author aprasa03
 *
 */
public class Pepsi extends ColdDrink {

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.ColdDrink#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 10.50f;
	}

}
