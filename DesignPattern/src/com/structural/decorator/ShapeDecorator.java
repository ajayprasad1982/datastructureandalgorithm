/**
 * 
 */
package com.structural.decorator;

/**
 * @author aprasa03
 *
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape shape;
	
	public ShapeDecorator(Shape shape)
	{
		this.shape=shape;
	}
	
	public abstract void draw();

}
