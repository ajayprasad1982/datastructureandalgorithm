/**
 * 
 */
package com.behavioral.observer;

/**
 * @author aprasa03
 *
 */
public class ObserverPatternClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person ajay=new Person("Ajay Prasad");
		Person imran=new Person("MD Imran Ali");
		
		Product subject=new Product("iPhone 6s", "Mobile", "Not available");
		
		subject.registerObserver(ajay);
		subject.registerObserver(imran);
		
		subject.setAvailability("available");

	}

}
