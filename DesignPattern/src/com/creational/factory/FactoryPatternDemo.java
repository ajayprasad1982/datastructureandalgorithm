/**
 * 
 */
package com.creational.factory;

import com.design.Circle;
import com.design.Rectangle;
import com.design.Shape;
import com.design.Square;

/**
 * @author aprasa03
 *
 */
public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		 ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShapeFactory(Circle.class.getSimpleName());

	      //call draw method of Circle
	      shape1.draw();

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShapeFactory(Rectangle.class.getSimpleName());

	      //call draw method of Rectangle
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShapeFactory(Square.class.getSimpleName());

	      //call draw method of circle
	      shape3.draw();
	}

}
