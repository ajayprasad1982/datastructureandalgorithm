/**
 * 
 */
package com.creational.builder;

/**
 * @author aprasa03
 *
 */
public class Coke extends ColdDrink {

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.ColdDrink#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 9.50f;
	}

}
