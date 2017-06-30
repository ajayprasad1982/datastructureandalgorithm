/**
 * 
 */
package com.behavioral.chainOfResponsibility;

/**
 * @author aprasa03
 *
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level=level;
	}
	
	
	@Override
	protected void write(String message) {
		System.out.println(this.getClass().getSimpleName()+"\t"+message);

	}

}
