/**
 * 
 */
package com.data.structure.stack.linkedlist;

/**
 * @author aprasa03
 *
 * Oct 22, 2015
 */
public class LinkedList {
	
	private Node first=null;
	private Node header=new Node(null,null);
	
	public LinkedList()
	{
	// header.next=header;
	}
	
	public void add(Integer e)
	{
		Node newNode=new Node(e,header);
		header=newNode;
	}
	
	public void insertFirst(int data)
	{
		Node node=new Node(data);
		node.next=first;
		first=node;
	}
	
	public void insert(int data)
	{
		Node node=new Node(data);
		if(first==null)
		{
			first=node;
			first.next=null;return;
		}
		while(first.next!=null)
		{
			first=first.next;
			
		}
		
		first.next=node;
		node.next=null;
		
	}
	public void deleteFirst()
	{
		Node temp=first;
		first=first.next;
		temp=null;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public void displayList()
	{
		Node current=header;
		while(current!=null)
		{
			current.display();
			current=current.next;
		}
		
		
		
	}
	
	public void displayList1()
	{
		print(first);
		
		
		
	}

private void print(Node current)
{
	if(current==null) return;
	
	print(current.next);
	System.out.print(current.data);
	System.out.print(" ");
}
	
class Node
{
	private Integer data;
	private Node next;
	
	private Node(Integer data,Node next) {
		this.data=data;
		this.next=next;
	}
	
	/**
	 * 
	 */
	private Node(int data) {
		this.data=data;
	}
	
	private void display()
	{
		if(data==null) return;
		System.out.print(data);
	    System.out.print("  ");
	}
	
}
}
