/**
 * 
 */
package com.behavioral.memento;

/**
 * @author aprasa03
 *
 */
public class FileWriterClient {
	
	public static void main(String[] args) {
		FileWriterCaretaker caretaker=new FileWriterCaretaker();
		
		FileWriterUtil fileWriterUtil=new FileWriterUtil("test.txt");
		
		fileWriterUtil.write("Hi This first line in file");
		
		//lets save the file
		caretaker.save(fileWriterUtil);
		//write some more line
		fileWriterUtil.write("\nHi this second line in the file");
		
		System.out.println(fileWriterUtil);
		
		//undo the saved data
		caretaker.undo(fileWriterUtil);
		
		System.out.println(fileWriterUtil);
		
	}

}
