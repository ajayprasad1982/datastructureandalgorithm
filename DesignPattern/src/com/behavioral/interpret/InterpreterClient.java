/**
 * 
 */
package com.behavioral.interpret;

/**
 * @author aprasa03
 *
 */
public class InterpreterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterpreterContext ic=new InterpreterContext();
		
		Expression exp= new IntToBinaryExpression(2);
		System.out.println(exp.interpret(ic));
		exp= new IntToHexExpression(30);
		System.out.println(exp.interpret(ic));
		

	}

}
