/**
 * 
 */
package com.data.structure.stack;

/**
 * @author aprasa03
 *
 *         Nov 30, 2015
 */
public class ImplementQUsingStack {

	Stack head = null;
	Stack tail =null;
	ImplementQUsingStack(int size)
	{
		 head = new Stack(size);
		 tail = new Stack(size);
	}
	

	public void addItem(int val) {
		head.push(val);
	}

	public int getItem() {
		int retVal = -1;
		if (tail.isEmpty()) {
			while (!head.isEmpty()) {
				tail.push(head.pop());
			}
		}
		retVal = tail.pop();
		return retVal;
	}
	
public static void main(String[] args) {
	ImplementQUsingStack  queue=new ImplementQUsingStack(10);
	
	queue.addItem(1);queue.addItem(2);queue.addItem(3);queue.addItem(4);
	
	System.out.println(queue.getItem());
	queue.addItem(5);queue.addItem(6);
	System.out.println(queue.getItem());
	System.out.println(queue.getItem());
	System.out.println(queue.getItem());
	System.out.println(queue.getItem());
	System.out.println(queue.getItem());
}	
	

}
