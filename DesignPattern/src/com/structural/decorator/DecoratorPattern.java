/**
 * 
 */
package com.structural.decorator;

/**
 * @author aprasa03
 *
 */
public class DecoratorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape shape=new Circle();
		ShapeDecorator redShapeDecorator= new RedShapeDecorator(shape);
		
		redShapeDecorator.draw();
		
	}

}
