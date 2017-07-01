/**
 * 
 */
package com.behavioral.memento;

/**
 * @author aprasa03
 *
 */
public class FileWriterCaretaker {
	
	private Object obj;
	
public void save(FileWriterUtil fileWriterUtil)
{
	this.obj=fileWriterUtil.save();
}

public void undo(FileWriterUtil fileWriterUtil)
{
	fileWriterUtil.undoToLastSave(obj);
}

}
