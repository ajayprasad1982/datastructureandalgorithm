/**
 * 
 */
package com.structural.proxy;

/**
 * @author aprasa03
 *
 */
public class ProxyPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Image proxy =new ProxyImage("test.jpg");
        //load from disk
		proxy.display();
		System.out.println("");
		//not load from disk
		proxy.display();
	}

}
