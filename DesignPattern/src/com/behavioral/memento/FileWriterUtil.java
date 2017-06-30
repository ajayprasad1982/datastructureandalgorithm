/**
 * 
 */
package com.behavioral.memento;

/**
 * @author aprasa03
 *
 */
public class FileWriterUtil {
private String fileName;
private StringBuilder content;

public FileWriterUtil(String file) {
	this.fileName=file;
	content=new StringBuilder();
}

public Memento save()
{
	return new Memento(this.fileName,this.content);
}

public void write(String mesg){
	content.append(mesg);
}

public void undoToLastSave(Object obj)
{
	Memento mem=Memento.class.cast(obj);
	this.fileName=mem.fileName;
	this.content=mem.content;
}

@Override
public String toString()
{
	return content.toString();
}

private class Memento{
	private String fileName;
	private StringBuilder content;
	
	public Memento(String file,StringBuilder content) {
		this.fileName=file;
		this.content=new StringBuilder(content);
		
	}
}
	

}
