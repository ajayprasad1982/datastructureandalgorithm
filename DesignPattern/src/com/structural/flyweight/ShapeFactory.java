/**
 * 
 */
package com.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aprasa03
 *
 */
public class ShapeFactory {

	private static Map<String, Shape> map = new HashMap<String, Shape>();

	public static Shape getShapeFactory(String color) {
		Shape shape = map.get(color);

		if (shape == null) {
			shape = new Circle(color);

			map.put(color, shape);
		}
		return shape;
	}

}
