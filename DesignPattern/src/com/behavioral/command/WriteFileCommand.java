/**
 * 
 */
package com.behavioral.command;

/**
 * @author aprasa03
 *
 */
public class WriteFileCommand implements Command {

	private FileSystemReceiver fsr=null;
	 public WriteFileCommand(FileSystemReceiver fs) {
		this.fsr=fs;
	}
	
	
	@Override
	public void execute() {
		fsr.close();
	}

}
