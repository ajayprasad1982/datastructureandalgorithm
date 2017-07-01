/**
 * 
 */
package com.behavioral.interpret;

/**
 * @author aprasa03
 *
 */
public class IntToHexExpression implements Expression {

	int value;
	
	public IntToHexExpression(int val)
	{
		this.value=val;
		
	}
	
	@Override
	public String interpret(InterpreterContext ic) {
		
		return ic.getHexadecimalFormat(value);
	}

}
