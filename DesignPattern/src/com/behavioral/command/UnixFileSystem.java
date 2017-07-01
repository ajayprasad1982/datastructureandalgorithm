/**
 * 
 */
package com.behavioral.command;

/**
 * @author aprasa03
 *
 */
public class UnixFileSystem implements FileSystemReceiver {

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.command.FileSystem#openFile()
	 */
	@Override
	public void openFile() {
		System.out.println("open File in Unix");

	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.command.FileSystem#writeFile()
	 */
	@Override
	public void writeFile() {
		System.out.println("write File in Unix");

	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.command.FileSystem#close()
	 */
	@Override
	public void close() {
		System.out.println("close File in Unix");

	}

}
