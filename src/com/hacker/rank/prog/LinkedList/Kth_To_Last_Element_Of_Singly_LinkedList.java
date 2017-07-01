/**
 * 
 */
package com.hacker.rank.prog.LinkedList;

/**
 * @author aprasa03
 *
 */
public class Kth_To_Last_Element_Of_Singly_LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int k = 1;
		LinkedList head = insert(null, a[0]);
		for (int i = 1; i < a.length; i++) {
			insert(head, a[i]);
		}
		print(head);
		System.out.println();
		findKthElementFromLast(head, k);
		System.out.println();
		findKthElement(head, k);
		System.out.println();
		findKthElementUsing2Pointers(head,k);
	}

	private static LinkedList insert(LinkedList head, int data) {
		if (head == null) {
			head = new LinkedList(data);
			return head;
		}
		head.setNext(insert(head.getNext(), data));
		return head;
	}

	private static void print(LinkedList head) {
		if (head == null)
			return;

		System.out.print(head.getData() + " ");
		print(head.getNext());

	}

	private static void findKthElementFromLast(LinkedList head, int k) {

		if (k <= 0)
			return;
		LinkedList temp = head;
		int len = 0;
		// calculate the length of Linked List
		while (temp != null) {
			temp = temp.getNext();
			len++;
		}
		if (len < k) {
			System.out.println(k + " is greater than the length of LinkedList "
					+ len);
			return;
		}

		temp = head;
		for (int i = 1; i < len - k + 1; i++) {
			temp = temp.getNext();
		}
		System.out.println(k + " Element is " + temp.getData());

	}

	static int i = 0;

	private static void findKthElement(LinkedList head, int k) {
		if (k <= 0 || head == null)
			return;
		findKthElement(head.getNext(), k);
		if (++i == k) {
			System.out.println(k + " Element is " + head.getData());
		}

	}

private static void findKthElementUsing2Pointers(LinkedList head,int k)	
{
	if(k<=0)return;
	LinkedList mainHead=head;
	LinkedList refHead=head;
	int count=0;
	
		while(refHead!=null && count<k)
		{
			refHead=refHead.getNext();
			count++;
			
		}
	if(count<k) return;
	while(refHead!=null)
	{
		mainHead=mainHead.getNext();
		refHead=refHead.getNext();
	}
	System.out.println(k + " Element is " + mainHead.getData());
}
	

}
