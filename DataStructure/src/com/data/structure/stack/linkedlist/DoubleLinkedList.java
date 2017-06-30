/**
 * 
 */
package com.data.structure.stack.linkedlist;

import com.data.structure.stack.linkedlist.LinkedList.Node;

/**
 * @author aprasa03
 *
 * Oct 25, 2015
 */
public class DoubleLinkedList {
	
	private Node first=null;
	private Node last=null;
	
public  void addFisrt(int data)
{
	Node node=new Node(data);
	if(first==null)
	{
		first=node;
		last=node;
	}else
	{
		first.prev=node;
		node.next=first;
		first=node;
	}
}
	
public boolean isEmpty() {return first==null;}
public void removeFirst(){
	
}


	class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		/**
		 * 
		 */
		private Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		
		private void display()
		{
			System.out.print(data+" ");
		}
	}
	

}
