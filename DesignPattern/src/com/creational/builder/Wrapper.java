/**
 * 
 */
package com.creational.builder;

/**
 * @author aprasa03
 *
 */
public class Wrapper implements Packing {

	/* (non-Javadoc)
	 * @see com.creational.pattern.builder.Packing#pack()
	 */
	@Override
	public String pack() {
		return "wrapper";
	}

}
