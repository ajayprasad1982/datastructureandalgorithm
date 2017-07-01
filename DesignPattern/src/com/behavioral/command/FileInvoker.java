/**
 * 
 */
package com.behavioral.command;

/**
 * @author aprasa03
 *
 */
public class FileInvoker {
	private Command cmd;

	public FileInvoker(Command cmd) {
		this.cmd = cmd;
	}

	public void execute() {
		cmd.execute();
	}

}
