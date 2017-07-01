/**
 * 
 */
package com.creational.abstractfactory;

import com.design.Circle;
import com.design.Shape;
import com.design.Square;

/**
 * @author aprasa03
 *
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory shapeFactory = factoryProducer
				.getFactory(ShapeFactory.class.getSimpleName());
		AbstractFactory colorFactory = factoryProducer
				.getFactory(ColorFactory.class.getSimpleName());
		Shape cirlce = shapeFactory.getShape(Circle.class.getSimpleName());
		Color red = colorFactory.getColor(RedColor.class.getSimpleName());
		Shape square = shapeFactory.getShape(Square.class.getSimpleName());
		Color blue = colorFactory.getColor(BlueColor.class.getSimpleName());

		cirlce.draw();
		red.fill();
		square.draw();
		blue.fill();
	}

}
