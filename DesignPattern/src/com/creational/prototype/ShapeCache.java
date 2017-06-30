/**
 * 
 */
package com.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aprasa03
 *
 */
public class ShapeCache {
	
	private static Map<String,Shape> shapeMap=new HashMap<String,Shape>();
	
public Shape getShape(String id)
{
Shape shape=shapeMap.get(id);

return shape.clone();
}

public void populateCache()
{
 Shape shape =new Circle();
 shape.setId("1");
 shapeMap.put(shape.getId(), shape);
 shape =new Rectangle();
 shape.setId("2");
 shapeMap.put(shape.getId(), shape);
 shape =new Square();
 shape.setId("3");
 shapeMap.put(shape.getId(), shape);
 
	
}
	

}
