/**
 * 
 */
package com.creational.abstractfactory;

import com.design.Circle;
import com.design.Rectangle;
import com.design.Shape;
import com.design.Square;

/**
 * @author aprasa03
 *
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String factoryName)
	{
		if(Circle.class.getSimpleName().equalsIgnoreCase(factoryName))
		{
			return new  Circle();
		}
		if(Square.class.getSimpleName().equalsIgnoreCase(factoryName))
		{
			return new  Square();
		}
		if(Rectangle.class.getSimpleName().equalsIgnoreCase(factoryName))
		{
			return new  Rectangle();
		}
		return null;
	}

}
