/**
 * 
 */
package com.hacker.rank.prog.thread;

import java.util.Set;

/**
 * @author aprasa03
 *
 */
public class GetNumberOfRunningThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Set<Thread> threads=	Thread.getAllStackTraces().keySet();
	for(Thread thread:threads)
	{
		System.out.println(thread.getId()+" "+thread.getName()+" "+thread.getState().name()+" "+thread.getPriority()+" "+thread.isDaemon());
	}

	}

}
