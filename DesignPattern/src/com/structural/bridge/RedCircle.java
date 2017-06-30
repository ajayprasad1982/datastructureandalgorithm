/**
 * 
 */
package com.structural.bridge;

/**
 * @author aprasa03
 *
 */
public class RedCircle implements DrawAPI {

	/* (non-Javadoc)
	 * @see com.structural.pattern.bridge.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
