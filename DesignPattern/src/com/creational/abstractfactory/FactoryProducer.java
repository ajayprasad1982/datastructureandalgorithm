/**
 * 
 */
package com.creational.abstractfactory;

/**
 * @author aprasa03
 *
 */
public class FactoryProducer {
	
public AbstractFactory getFactory(String factoryName)	
{
	if(ShapeFactory.class.getSimpleName().equalsIgnoreCase(factoryName))
	{
		return new ShapeFactory();
	}else if(ColorFactory.class.getSimpleName().equalsIgnoreCase(factoryName))
	{
		return new ColorFactory();
	}
	return null;
}
}
