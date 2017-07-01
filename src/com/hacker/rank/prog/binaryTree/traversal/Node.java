/**
 * 
 */
package com.hacker.rank.prog.binaryTree.traversal;

/**
 * @author iali
 *
 */
public class Node {
	
	
	public enum Color
	{
		BLACK, RED
	}
		
	
	private Node leftNode ;
	
	private Node rightNode;
	
	private Node parentNode;
	
	private int data;
	
	private int height;
	
	private char stringData;
	
	private Color color =  Node.Color.RED;
	
	public Node(int data) {
		super();
		this.data = data;
	}
	
	public Node(char stringData,int data) {
	    this(data);
		this.stringData = stringData;
	}
	
	
	public Node(int data,Node parentNode) {
		this(data);
		this.parentNode  = parentNode;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

	public Node getParentNode() {
		return parentNode;
	}

	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public char getStringData() {
		return stringData;
	}

	public void setStringData(char stringData) {
		this.stringData = stringData;
	}

	@Override
	public String toString() {
		return "Node [leftNode=" + leftNode + ", rightNode=" + rightNode
				+ ", parentNode=" + parentNode + ", data=" + data + ", height="
				+ height + ", stringData=" + stringData + ", color=" + color
				+ "]";
	}
	
	
}
