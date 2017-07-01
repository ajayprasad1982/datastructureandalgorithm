/**
 * 
 */
package com.behavioral.command;

/**
 * @author aprasa03
 *
 */
public class FileSystemClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	FileSystemReceiver fsr=FileSystemReceiverUtil.getUnderLyingFileSystem();
	
	
	OpenFileCommand ofc=new OpenFileCommand(fsr);
	FileInvoker file=new FileInvoker(ofc);
	file.execute();
	
	WriteFileCommand wfc=new WriteFileCommand(fsr);
	file=new FileInvoker(wfc);
	file.execute();
	
	CloseFileCommand cfc=new CloseFileCommand(fsr);
	file=new FileInvoker(cfc);
	file.execute();

	}

}
