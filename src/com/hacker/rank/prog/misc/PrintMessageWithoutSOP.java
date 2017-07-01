/**
 * 
 */
package com.hacker.rank.prog.misc;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author aprasa03
 *
 */
public class PrintMessageWithoutSOP {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
		         FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		     long start = System.currentTimeMillis();
		     for (int i = 0; i < 1000000; i++) {
		       out.write("abcdefghijk ");
		       out.write(String.valueOf(i));
		       out.write('\n');
		     }
		     out.flush();
		     out.close();
		     System.err.println("Loop time: " +
		       (System.currentTimeMillis() - start));
		   }
}
