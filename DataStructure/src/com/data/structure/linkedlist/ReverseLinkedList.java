/**
 * 
 */
package com.data.structure.linkedlist;

/**
 * @author aprasa03
 *
 *         Sep 25, 2015
 */
public class ReverseLinkedList {

	private static LinkedList finalRoot = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		LinkedList rootNode=insert(null,array[0]);
		for(int i=1;i<array.length;i++)
		{
			insert(rootNode,array[i]);
		}
//printLinkedList(rootNode);
reverseLinkedList(rootNode);
printLinkedList(finalRoot);
		
		
	}
public  static LinkedList reverseLinkedList(LinkedList node)
{
	if(node==null || node.getNext()==null)
	{
		finalRoot=node;
		return node;
	}
	
LinkedList previous=node;
LinkedList current=reverseLinkedList(node.getNext());
if(current!=null)
{
	current.setNext(previous);
	previous.setNext(null);
}
return previous;

	
	
}
	
	
	public static LinkedList insert(LinkedList node, int data) {
		if (node == null) {
			node = new LinkedList(data);
			return node;
		}
		node.setNext(insert(node.getNext(), data));
		return node;
	}

public static void printLinkedList(LinkedList node)
{
	if(node==null) return;
	System.out.println(node.getData());
	printLinkedList(node.getNext());
	
}
	
}
