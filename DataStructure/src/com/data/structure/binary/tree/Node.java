/**
 * 
 */
package com.data.structure.binary.tree;

/**
 * @author aprasa03
 *
 */
public class Node {
private	int data;
private	Node leftNode=null;
private	Node rightNode=null;
private Node parentNode=null;
private int height=0;

public Node(int data)
{
	this.data=data;
}

/**
 * @return the data
 */
public int getData() {
	return data;
}

/**
 * @param data the data to set
 */
public void setData(int data) {
	this.data = data;
}

/**
 * @return the leftNode
 */
public Node getLeftNode() {
	return leftNode;
}

/**
 * @param leftNode the leftNode to set
 */
public void setLeftNode(Node leftNode) {
	this.leftNode = leftNode;
}

/**
 * @return the rightNode
 */
public Node getRightNode() {
	return rightNode;
}

/**
 * @param rightNode the rightNode to set
 */
public void setRightNode(Node rightNode) {
	this.rightNode = rightNode;
}

/**
 * @return the parentNode
 */
public Node getParentNode() {
	return parentNode;
}

/**
 * @param parentNode the parentNode to set
 */
public void setParentNode(Node parentNode) {
	this.parentNode = parentNode;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Node [data=" + data + ", leftNode=" + leftNode + ", rightNode="
			+ rightNode +  "]";
}


}