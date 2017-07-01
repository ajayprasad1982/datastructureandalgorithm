/**
 * 
 */
package com.structural.facade;

/**
 * @author aprasa03
 *
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see com.structural.pattern.facade.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Shape :"+getClass().getSimpleName());

	}

}
