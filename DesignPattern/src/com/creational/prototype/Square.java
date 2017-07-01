/**
 * 
 */
package com.creational.prototype;

/**
 * @author aprasa03
 *
 */
public class Square extends Shape {
	
	public Square()
	{
		type=Square.class.getSimpleName();
	}

	/* (non-Javadoc)
	 * @see com.creational.pattern.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside "+Square.class.getSimpleName()+"::draw() method.");

	}

}
