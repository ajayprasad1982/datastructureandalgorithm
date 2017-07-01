/**
 * 
 */
package com.structural.decorator;

/**
 * @author aprasa03
 *
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see com.structural.pattern.decorator.Shape#draw()
	 */
	@Override
	public void draw() {
     System.out.println("Draw Circle");
	}

}
