/**
 * 
 */
package com.behavioral.interpret;

/**
 * @author aprasa03
 *
 */
public class IntToBinaryExpression implements Expression {

	int value;
	
	public IntToBinaryExpression(int val)
	{
		this.value=val;
		
	}
	
	@Override
	public String interpret(InterpreterContext ic) {
		
		return ic.getBinaryFormat(value);
	}

}
