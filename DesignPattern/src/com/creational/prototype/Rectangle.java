/**
 * 
 */
package com.creational.prototype;

/**
 * @author aprasa03
 *
 */
public class Rectangle extends Shape {
	
	public Rectangle()
	{
		type=Rectangle.class.getSimpleName();
	}

	/* (non-Javadoc)
	 * @see com.creational.pattern.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside "+Rectangle.class.getSimpleName()+"::draw() method.");

	}

}
