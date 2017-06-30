/**
 * 
 */
package com.design;

/**
 * @author aprasa03
 *
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see com.design.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside  "+Circle.class.getSimpleName()+"::draw() method.");

	}

}
