/**
 * 
 */
package com.structural.proxy;

/**
 * @author aprasa03
 *
 */
public class RealImage implements Image {
	private String filename;

	public RealImage(String fileName) {
		this.filename = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying ....." + filename);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading From disk... " + fileName);
	}
}
