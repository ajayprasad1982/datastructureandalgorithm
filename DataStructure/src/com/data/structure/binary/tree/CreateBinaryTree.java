/**
 * 
 */
package com.data.structure.binary.tree;

/**
 * @author aprasa03
 *
 * Mar 22, 2015
 */
public class CreateBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]={2,5,8,0,9,0,5,7,0,4,6,0,0,3};
	Node root=createBinaryTree(array,0,null);
	System.out.println(root.getData());
	}
	
private static Node createBinaryTree(int array[],int i,Node rootNode) 
{
int left=(2*i)+1;	
int right=(2*i)+2;

if(left>array.length)
	return null;
if(right>array.length)
	return null;
if(rootNode==null)
{
	rootNode=new Node(array[i]);
}
if(rootNode.getLeftNode()==null && rootNode.getRightNode()==null)
{
	if(left<array.length && array[left]!=0 )
	{
		rootNode.setLeftNode(new Node(array[left]));
	}
	if(right<array.length && array[right]!=0 )
	{
		rootNode.setRightNode(new Node(array[right]));
	}

}
i=i+1;
createBinaryTree( array,left,rootNode.getLeftNode());
createBinaryTree( array,right,rootNode.getRightNode());
	return rootNode;
}
	

}
