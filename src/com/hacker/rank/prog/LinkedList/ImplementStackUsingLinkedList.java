/**
 * 
 */
package com.hacker.rank.prog.LinkedList;

import java.util.Scanner;

/**
 * @author aprasa03
 *
 */
public class ImplementStackUsingLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		LinkedStack ls=new LinkedStack();
		System.out.println("Linked Stack Test");
		
		char ch;
		do
		{
			
			System.out.println("\nLinked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");  
            System.out.println("6. print elements"); 
            int choice=scan.nextInt();
            switch(choice)
            {
            case 1: 
            	System.out.println("Enter integer element to push");
                ls.push( scan.nextInt() ); 
                break;                 
		case 2: 
			System.out.println("Popped Element = "+ ls.pop());
            break;
		case 3: 
			System.out.println("Peeked Element = "+ ls.peek());
            break; 
		case 4 : 
            System.out.println("Empty status = "+ ls.isEmpty());
            break;  
		 case 5 : 
             System.out.println("Size = "+ ls.getSize()); 
             break;  
		 case 6 : 
             ls.display();
             break; 
		 default : 
             System.out.println("Wrong Entry \n ");
             break;   
        }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0); 
		}while(ch=='Y' || ch=='y');
		
		

	}

}

class LinkedStack {
	Node top;
	int size;

	/**
	 * @return the top
	 */
	public Node getTop() {
		return top;
	}

	/**
	 * @param top
	 *            the top to set
	 */
	public void setTop(Node top) {
		this.top = top;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		Node node = new Node(data);
		if (top == null) {
			top = node;
		} else {
			node.setNext(top);
			top = node;
		}
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		}

		Node node = top;
		top = node.getNext();
		int data = node.getData();
		node = null;
		size--;
		return data;

	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}

		return top.getData();

	}

	public void display() {
		System.out.println("Stack:- ");

		if (top == null) {
			System.out.println("Empty");
			return;
		}

		Node node = top;
		while (node != null) {
			System.out.print(node.getData()+ " ");
			node = node.getNext();

		}

	}

}