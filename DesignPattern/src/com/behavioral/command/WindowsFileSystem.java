/**
 * 
 */
package com.behavioral.command;

/**
 * @author aprasa03
 *
 */
public class WindowsFileSystem implements FileSystemReceiver {
	String os=System.getProperty("os.name");

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.command.FileSystem#openFile()
	 */
	@Override
	public void openFile() {
		System.out.println("open File in Windows");

	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.command.FileSystem#writeFile()
	 */
	@Override
	public void writeFile() {
		System.out.println("write File in Windows");

	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.command.FileSystem#close()
	 */
	@Override
	public void close() {
		System.out.println("close File in Windows");

	}

}
