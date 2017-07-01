/**
 * 
 */
package com.design;

/**
 * @author aprasa03
 *
 */
public class Square implements Shape {

	/* (non-Javadoc)
	 * @see com.design.pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		
		System.out.println("Inside  "+Square.class.getSimpleName()+"::draw() method.");

	}

}
