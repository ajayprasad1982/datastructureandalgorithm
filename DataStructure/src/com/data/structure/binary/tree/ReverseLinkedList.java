/**
 * 
 */
package com.data.structure.binary.tree;

/**
 * @author aprasa03
 *
 *         Feb 8, 2015
 */
public class ReverseLinkedList {

	/**
	 * @param args
	 */
	private static Node finalRootNode=null;
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		Node rootNode = insertNode(null, a[0]);

		for (int i = 1; i < a.length; i++) {
			insertNode(rootNode, a[i]);
		}
		reverseLinkedList(rootNode);
		printLinkedList(finalRootNode);

	}

	private static Node insertNode(Node rootNode, int data) {
		if (rootNode == null) {
			rootNode = new Node(data);
			return rootNode;
		}

		rootNode.setLeftNode(insertNode(rootNode.getLeftNode(), data));

		return rootNode;
	}

	private static void printLinkedList(Node rootNode) {
		if (rootNode == null)
			return;
		System.out.print(rootNode.getData()+"\t");
		printLinkedList(rootNode.getLeftNode());
		
	}

private static Node reverseLinkedList(Node rootNode)
{
	if(rootNode!=null && rootNode.getLeftNode()==null)
	{
		finalRootNode=rootNode;
		return rootNode;
	}
	Node currentNode=rootNode;
	Node node=reverseLinkedList(rootNode.getLeftNode());
		node.setLeftNode(currentNode);
		currentNode.setLeftNode(null);
	return currentNode;
}
	
	

}
