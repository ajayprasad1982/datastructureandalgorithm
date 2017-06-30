/**
 * 
 */
package com.behavioral.command;

/**
 * @author aprasa03
 *
 */
public class OpenFileCommand implements Command {

	private FileSystemReceiver fsr=null;
	 public OpenFileCommand(FileSystemReceiver fs) {
		this.fsr=fs;
	}
	
	
	@Override
	public void execute() {
		fsr.openFile();
	}

}
