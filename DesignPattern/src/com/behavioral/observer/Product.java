/**
 * 
 */
package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 */
public class Product implements Subject {
private List<Observer> observers = new ArrayList<Observer>(); 	
private String name;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
private String type;
private String availability;

public Product(String name,String type,String availability) {
	this.name=name;
	this.type=type;
	this.availability=availability;
	
}

	public String getAvailability() {
	return availability;
}

public void setAvailability(String availability) {
	this.availability = availability;
	notifyObservers();
}

	@Override
	public void registerObserver(Observer e) {
		observers.add(e);
	}

	@Override
	public void unRegisterObserver(Observer o) {
		observers.remove(o);

	}
	@Override
	public void notifyObservers() {
		System.out.println("Notifying all the registered observers");
		for(Observer ob:observers)
		{
			ob.update(availability);
		}

	}

}
