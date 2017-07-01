/**
 * 
 */
package com.hacker.rank.prog.LinkedList;

/**
 * @author aprasa03
 *
 */
public class Node {
	private Node head;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	private int data;
	private Node next;

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int data) {
		this.data = data;
	}

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}
		Node tempNode = head;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.setNext(node);
	}

	public void display() {

		if(head!=null && head.next==null)
		{
			System.out.println(head.data);
		}
		Node node=head;
		while(node.next!=null)
		{
			System.out.print(node.data+"-> ");
			node=node.next;
		}
		
		System.out.println(node.data);
		
	}
	public void display(Node head) {

		if(head!=null && head.next==null)
		{
			System.out.println(head.data);
		}
		Node node=head;
		while(node.next!=null)
		{
			System.out.print(node.data+"-> ");
			node=node.next;
		}
		
		System.out.println(node.data);
		
	}
	
	
}
