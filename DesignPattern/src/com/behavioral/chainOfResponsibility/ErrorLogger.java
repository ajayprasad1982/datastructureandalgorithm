/**
 * 
 */
package com.behavioral.chainOfResponsibility;

/**
 * @author aprasa03
 *
 */
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level=level;
	}
	
	
	@Override
	protected void write(String message) {
		System.out.println(this.getClass().getSimpleName()+"\t"+message);

	}

}
