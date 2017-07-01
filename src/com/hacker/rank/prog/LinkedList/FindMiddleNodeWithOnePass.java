/**
 * 
 */
package com.hacker.rank.prog.LinkedList;


/**
 * @author aprasa03
 *
 */
public class FindMiddleNodeWithOnePass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,2};
	LinkedList head=	LinkedList.insert(a);
	findMiddle(head);
	}
	
private static void findMiddle(LinkedList head)	
{
	
	LinkedList  current=head;
	LinkedList  middle=head;
	
	if(current==null || current.getNext()==null)
	{
		System.out.println("Middle is Zero");
		return;
	}
	current=current.getNext();
	while(current!=null && current.getNext()!=null && current.getNext().getNext()!=null)
	{
		current=current.getNext().getNext();
		middle=middle.getNext();
	}
	if(middle!=null)
	System.out.println(" Middle Element is "+middle.getData());
	else
		System.out.println(" Middle not found ");
	
}
}
