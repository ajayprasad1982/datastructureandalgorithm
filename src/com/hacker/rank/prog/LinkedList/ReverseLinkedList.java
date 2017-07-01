package com.hacker.rank.prog.LinkedList;


public class ReverseLinkedList {
	
	private static LinkedList rootNode1=null;

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		
	LinkedList rootNode=insert(null,a[0]);
	for(int i=1;i<a.length;i++)
	{
		rootNode=insert(rootNode,a[i]);
	}
print(rootNode);
reverse(rootNode);
System.out.println(" ");
System.out.println("Reverse Linked Using Recursion");
//reverseLinkedList(rootNode);
print(rootNode1);


	}
	
private static LinkedList insert(LinkedList rootNode,int data)
{
	if(rootNode==null)
	{
		rootNode=new LinkedList(data);
		return rootNode;
	}
	rootNode.setNext(insert(rootNode.getNext(),data));	
	
	return rootNode;
	
}
private static void print(LinkedList node)
{
	if(node==null)
	{
		return;
	}
	System.out.print(node.getData()+" ");
	print(node.getNext());
}

	
	/**
	 * Reverse LinkedList using Recursion
	 * @param node
	 * @return
	 */
	private static LinkedList reverse(LinkedList node)
	{
		if(node!=null && node.getNext()==null)
		{
			rootNode1=node;
			return node;
		}
		LinkedList temp=node;
		LinkedList curNode=reverse(node.getNext());
		curNode.setNext(temp);
		temp.setNext(null);
		return temp;
		
	}
/**
 * reverse linkedlist 
 * @param current
 */
private static void reverseLinkedList(LinkedList current)
{
	
	LinkedList next=null;
	LinkedList prev=null;
	while(current!=null)
	{
		next=current.getNext();
		current.setNext(prev);
		prev=current;
		current=next;
	}
	current=prev;
	print(current);
}

}
