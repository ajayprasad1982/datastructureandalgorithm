/**
 * 
 */
package com.structural.bridge;

/**
 * @author aprasa03
 *
 */
public class BridgePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Circle red=new Circle(2, 1, 1, new RedCircle())	;
	Circle green=new Circle(4, 2, 2, new GreenCircle())	;
	
	red.draw();
	green.draw();

	}

}
