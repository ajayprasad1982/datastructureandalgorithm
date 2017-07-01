/**
 * 
 */
package com.behavioral.nullObject;

/**
 * @author aprasa03
 *
 */
public class CustomerFactory {
	
private final static String []	names={"ajay","imran","dibya"};

public static AbstractCustomer getCustomer(String name)
{
	for(String na:names)
	{
		if(na.equalsIgnoreCase(name))
			return new Customer(name);
	}
	
	return new NullCustomer(name);
}

}
