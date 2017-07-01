/**
 * 
 */
package com.structural.decorator;

/**
 * @author aprasa03
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	
	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		shape.draw();
		setRedBorder(shape);
	}
	
	 private void setRedBorder(Shape shape){
	      System.out.println("Border Color: Red");
	   }	

}
