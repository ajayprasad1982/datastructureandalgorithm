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
public class ShapeFactory {
	
	public Shape  getShapeFactory(String factorName)
	{
		if(Circle.class.getSimpleName().equalsIgnoreCase(factorName))
		{
			return new  Circle();
		}
		if(Square.class.getSimpleName().equalsIgnoreCase(factorName))
		{
			return new  Square();
		}
		if(Rectangle.class.getSimpleName().equalsIgnoreCase(factorName))
		{
			return new  Rectangle();
		}
		return null;
	}
	

}
