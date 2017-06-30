/**
 * 
 */
package com.data.structure.stack.linkedlist;

/**
 * @author aprasa03
 *
 * Oct 22, 2015
 */
public class LinkedListStack {
	
LinkedList llist=new LinkedList();

public void push(int data)
{
	llist.insertFirst(data);
}
public void pop()
{
	if(!llist.isEmpty())
	{
		llist.deleteFirst();
	}
}
public void displayStack()
{
	System.out.println("  ");
	llist.displayList();
}

}
