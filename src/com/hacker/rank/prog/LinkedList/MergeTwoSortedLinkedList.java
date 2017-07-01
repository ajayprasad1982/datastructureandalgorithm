/**
 * 
 */
package com.hacker.rank.prog.LinkedList;

/**
 * @author aprasa03
 *
 */
public class MergeTwoSortedLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node = new Node();
		int a[] = { 1, 3, 5,2,4, 6, 7, 8 };

		for (int i : a) {
			node.insert(i);
		}

		node.display();
		System.out.println(node.getHead().getData());
		
	Node head=	sort(node.getHead());
	node.display(head);
		
	}
public static Node sort(Node head)
{
	Node node1=head;
	Node node2=null;
	Node result=null;
	while(head!=null)
	{
		
		if(node1.getNext()!=null && node1.getData()>node1.getNext().getData())
		{
			node2=node1.getNext();
			node1.setNext(null);
			break;
		}
		node1=node1.getNext();
	}
	node1=head;
	if(node2==null) return node1;
	
	//make the node1 always start node
	if(node1.getData()>node2.getData())
	{
		Node temp=node1;
		node1=node2;
		node2=temp;
	}
	result=node1;
	while(node1!=null && node2!=null)
	{
		while(node1.getNext()!=null && node1.getNext().getData()<node2.getData())
		{
			node1=node1.getNext();
		}
		Node temp=node1.getNext();
		node1.setNext(node2);
		node2=temp;
	}
	
	return result;
}
}
