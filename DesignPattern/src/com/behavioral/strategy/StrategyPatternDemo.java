/**
 * 
 */
package com.behavioral.strategy;

/**
 * @author aprasa03
 *
 */
public class StrategyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Context context=new Context(new AddOperation());

	System.out.println("Sum Of 2 Numbers \t"+context.executeStrategy(10, 20));
	context=new Context(new MultiplyOperation());

	System.out.println("Multiplication Of 2 Numbers \t"+context.executeStrategy(10, 2));
	}

}
