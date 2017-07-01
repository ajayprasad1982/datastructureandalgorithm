/**
 * 
 */
package com.hacker.rank.prog.LinkedList;

/**
 * @author aprasa03
 *
 */
public class DetectLoopInLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		Node head = insert(null, a[0]);
		for (int i = 1; i < a.length; i++) {
			insert(head, a[i]);
		}
		//create loop
		head.getNext().getNext().getNext().getNext().setNext(head.getNext().getNext());
		detectLoop(head);

	}
	private static Node insert(Node head, int data) {
		if (head == null) {
			head = new Node(data);
			return head;
		}
		head.setNext(insert(head.getNext(), data));
		return head;
	}
private static void  detectLoop(Node head) 	
{
	Node slow=head;
	Node fast=head.getNext();
	boolean isLoop=false;
	while(fast!=null && fast.getNext()!=null)
	{
		if(slow.getData()==fast.getData())
		{
			isLoop=true;
			break;
		}
		slow=slow.getNext();
		fast=fast.getNext().getNext();
	}
	if(isLoop)
		System.out.println("Loop Detected");
	else
		System.out.println("Loop Not Detected");
	
}
	

}
