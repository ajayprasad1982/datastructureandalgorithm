/**
 * 
 */
package com.behavioral.nullObject;

/**
 * @author aprasa03
 *
 */
public class Customer extends AbstractCustomer {
	
	public Customer(String name)
	{
		this.name=name;
	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.nullObject.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.nullObject.AbstractCustomer#isNull()
	 */
	@Override
	public boolean isNull() {
		return false;
	}

}
