/**
 * 
 */
package com.behavioral.visitor;

/**
 * @author aprasa03
 *
 */
public class VisitorDemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	ShoppingCart cart=new ShoppingCart();
	
	Book book=new Book(3d,5d);
	DVD dvd=new DVD(2,2);
	cart.addItems(book);
	cart.addItems(dvd);
	System.out.println("Total Postage cost for above Items\t"+cart.calculatePostage());

	}

}
