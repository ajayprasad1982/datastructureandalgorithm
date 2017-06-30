/**
 * 
 */
package com.behavioral.command;

/**
 * @author aprasa03
 *
 */
public class FileSystemReceiverUtil {
	
public static FileSystemReceiver getUnderLyingFileSystem()
{
	String osName=System.getProperty("os.name");
	System.out.println("Operating System:\t"+osName);
	if(osName.startsWith("Windows"))
			{
		return new WindowsFileSystem();
			}
	else
	{
		return new UnixFileSystem();
	}
	
}

}
