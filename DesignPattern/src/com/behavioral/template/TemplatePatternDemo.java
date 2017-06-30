/**
 * 
 */
package com.behavioral.template;

/**
 * @author aprasa03
 *
 */
public class TemplatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game=new Cricket();
		game.play();
		game=new Football();
		game.play();

	}

}
