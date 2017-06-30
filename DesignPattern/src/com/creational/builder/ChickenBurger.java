/**
 * 
 */
package com.creational.builder;

/**
 * @author aprasa03
 *
 */
public class ChickenBurger extends Burger {

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.Burger#name()
	 */
	@Override
	public String name() {
		return "chicken Burger";
	}

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}

}
