/**
 * 
 */
package com.behavioral.command;

/**
 * @author aprasa03
 *
 */
public class CloseFileCommand implements Command {

	private FileSystemReceiver fsr=null;
	 public CloseFileCommand(FileSystemReceiver fs) {
		this.fsr=fs;
	}
	
	
	@Override
	public void execute() {
		fsr.writeFile();
	}

}
