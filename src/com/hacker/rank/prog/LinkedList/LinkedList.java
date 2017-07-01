/**
 * 
 */
package com.hacker.rank.prog.LinkedList;

/**
 * @author aprasa03
 *
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
	
public static LinkedList insert(int a[])
{
	LinkedList head = insert(null, a[0]);
	for (int i = 1; i < a.length; i++) {
		insert(head, a[i]);
	}
	
	return head;
	
}
private static LinkedList insert(LinkedList head, int data) {
	if (head == null) {
		head = new LinkedList(data);
		return head;
	}
	head.setNext(insert(head.getNext(), data));
	return head;
}
}
