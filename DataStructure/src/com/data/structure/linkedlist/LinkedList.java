/**
 * 
 */
package com.data.structure.linkedlist;

/**
 * @author aprasa03
 *
 * Sep 25, 2015
 */
public class LinkedList {
	
private int data;
private LinkedList next;

public LinkedList(int data)
{
	this.data=data;
}

/**
 * @return the data
 */
public int getData() {
	return data;
}
/**
 * @param data the data to set
 */
public void setData(int data) {
	this.data = data;
}
/**
 * @return the next
 */
public LinkedList getNext() {
	return next;
}
/**
 * @param next the next to set
 */
public void setNext(LinkedList next) {
	this.next = next;
}



}
