/**
 * 
 */
package com.creational.builder;

/**
 * @author aprasa03
 *
 */
public abstract class Burger implements Item {

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.Item#name()
	 */
	public abstract String name();

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.Item#pack()
	 */
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.Item#price()
	 */
	public abstract float price();

}
