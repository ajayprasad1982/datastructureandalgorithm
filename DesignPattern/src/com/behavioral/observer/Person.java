/**
 * 
 */
package com.behavioral.observer;

/**
 * @author aprasa03
 *
 */
public class Person implements Observer {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		this.name=name;
		}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.observer.Observer#update(java.lang.String)
	 */
	@Override
	public void update(String availability) {
	System.out.println("Hello "+name+"Product is now "+availability+ " SnapDeal");	

	}

}
