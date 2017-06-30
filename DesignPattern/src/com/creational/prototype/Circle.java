/**
 * 
 */
package com.creational.prototype;

/**
 * @author aprasa03
 *
 */
public class Circle extends Shape {
	
	public Circle()
	{
		type=Circle.class.getSimpleName();
	}

	/* (non-Javadoc)
	 * @see com.creational.pattern.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside "+Circle.class.getSimpleName()+"::draw() method.");

	}

}
