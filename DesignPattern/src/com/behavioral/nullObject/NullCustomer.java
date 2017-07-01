/**
 * 
 */
package com.behavioral.nullObject;

/**
 * @author aprasa03
 *
 */
public class NullCustomer extends AbstractCustomer {
	
	public  NullCustomer(String name) {
		this.name=name;
	}
	
	@Override
	public String getName() {
		return this.name+" Not Available in the DB";
	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.nullObject.AbstractCustomer#isNull()
	 */
	@Override
	public boolean isNull() {
		return true;
	}

}
