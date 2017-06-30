/**
 * 
 */
package com.data.structure.stack.linkedlist;

/**
 * @author aprasa03
 *
 * Oct 22, 2015
 */
public class LinkedListStackDemo{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListStack stack=new LinkedListStack();
		stack.push(2);stack.push(3);stack.push(4);
		stack.displayStack();
		stack.pop();
		stack.displayStack();
		stack.push(5);stack.push(6);
		stack.displayStack();
		
		
		
		
		
	}

}
