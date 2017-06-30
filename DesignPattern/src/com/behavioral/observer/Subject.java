/**
 * 
 */
package com.behavioral.observer;

/**
 * @author aprasa03
 *
 */
public interface Subject {
public void registerObserver(Observer observer);
public void unRegisterObserver(Observer observer);
public void notifyObservers();
	

}
