/**
 * 
 */
package com.hacker.rank.prog.LinkedList;

/**
 * @author aprasa03
 *
 */
public class ImplementQueueUsingLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
class LinkedQueue
{
	Node front,rear;
	int size;
	/**
	 * @return the front
	 */
	public Node getFront() {
		return front;
	}
	/**
	 * @param front the front to set
	 */
	public void setFront(Node front) {
		this.front = front;
	}
	/**
	 * @return the rear
	 */
	public Node getRear() {
		return rear;
	}
	/**
	 * @param rear the rear to set
	 */
	public void setRear(Node rear) {
		this.rear = rear;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void enQueue(int data)
	{
		Node node=new Node(data);
		if(front==null)
		{
			front=node;
			rear=node;
		}
		else
		{
			rear.setNext(node);
			rear=rear.getNext();
		}
		size++;
	}
	
	public int deQueue()
	{
		if(isEmpty())
			return -1;
		Node node=front;
		front=front.getNext();
		if(front==null)
		{
			rear=null;
		}
		size--;
		int data=node.getData();
		node=null;
		return data;
	}
public int peek()
{
	if(isEmpty()) return -1;
	return front.getData();
}
	
}