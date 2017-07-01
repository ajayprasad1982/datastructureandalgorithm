/**
 * 
 */
package com.behavioral.chainOfResponsibility;

/**
 * @author aprasa03
 *
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level=level;
	}
	
	
	@Override
	protected void write(String message) {
		System.out.println(this.getClass().getSimpleName()+"\t"+message);

	}

}
