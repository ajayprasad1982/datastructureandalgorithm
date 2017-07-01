/**
 * 
 */
package com.creational.builder;

/**
 * @author aprasa03
 *
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "veg Burger";
	}

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
