/**
 * 
 */
package com.creational.prototype;

/**
 * @author aprasa03
 *
 */
public class PrototypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ShapeCache shapeCache=new ShapeCache();
		shapeCache.populateCache();
		Shape circle=shapeCache.getShape("1");
		System.out.println(circle.getType());
		circle=shapeCache.getShape("2");
		System.out.println(circle.getType());
		/*circle=shapeCache.getShape("4");
		System.out.println(circle.getType());*/
		
		Class reflectionClass=PrototypeDemo.class;
		try {
			reflectionClass.getConstructor(int.class);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
