/**
 * 
 */
package com.structural.flyweight;

/**
 * @author aprasa03
 *
 */
public class Circle implements Shape {
	
	int x,y,radius;
	String color;
	public Circle(String color)
	{
		this.color=color;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	@Override
	public void draw() {
		System.out.println("Shape : Circle\t"+"X\t"+x+"\tY\t"+y+"\tradius\t"+radius+"\tcolor\t"+color);

	}

}
