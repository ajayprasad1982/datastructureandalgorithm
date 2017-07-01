/**
 * 
 */
package com.creational.abstractfactory;


/**
 * @author aprasa03
 *
 */
public class ColorFactory extends AbstractFactory {

	public Color getColor(String factoryName)
	{
		if(RedColor.class.getSimpleName().equalsIgnoreCase(factoryName))
		{
			return new  RedColor();
		}
		if(GreenColor.class.getSimpleName().equalsIgnoreCase(factoryName))
		{
			return new  GreenColor();
		}
		if(BlueColor.class.getSimpleName().equalsIgnoreCase(factoryName))
		{
			return new  BlueColor();
		}
		return null;
	}
	
	
}
