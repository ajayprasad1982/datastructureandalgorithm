/**
 * 
 */
package com.data.structure.binary.tree;



/**
 * @author aprasa03
 *
 * Feb 2, 2016
 */
public class IsBST {
	
	private static Node rootNode;
	private static Node prev=null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        int data[] =  new int[]{3,2,5,1,4};
		
		/*for(int i: data)
		{
			rootNode  = insert(rootNode,i);
		}*/
		rootNode=new Node(3);
		rootNode.setLeftNode(new Node(2));
		rootNode.setRightNode(new Node(5));
		rootNode.getLeftNode().setLeftNode(new Node(1));
		rootNode.getLeftNode().setRightNode(new Node(4));
		boolean flag=isBST(rootNode,Integer.MIN_VALUE,Integer.MAX_VALUE);
		if(flag)
			System.out.println("Tree is BST");
		else
			System.out.println("Tree is not BST");

	}
	
	private static Node insert(Node node, int data) {
		// 1. if root node is null then create root node and return
		// 2. get the root node and check the data
		// 2. if data == root.data return;
		// 2. data < root.data get leftChild then call insert
		// 3. data > root.data get rightChild then call insert

		if (node == null) {
			node = new Node(data);
		} else if (node.getData() == data) {
			return node;
		} else if (data < node.getData()) {
			Node leftNode = insert(node.getLeftNode(), data);
			node.setLeftNode(leftNode);
			leftNode.setParentNode(node);

		} else if (data > node.getData()) {
            Node rightNode  = insert(node.getRightNode(), data);
			node.setRightNode(rightNode);
			rightNode.setParentNode(node);
		}
		return node;
	}	
	
	 private static boolean IsBSTUsingInOrder(Node node) {
			
			if (node != null) {
						
			if(!IsBSTUsingInOrder(node.getLeftNode()))
			{
				return false;
			}
	       if(prev!=null && node.getData()<=prev.getData())
			{
	    	   return false;
			}
			
			prev=node;
			return IsBSTUsingInOrder(node.getRightNode());

		}
			return true;
	 }
private static boolean isBST(Node node,int min,int max)
{
	if(node==null) return true;
	
	if(node.getData()> max || node.getData()<min)
		return false;
	return isBST(node.getLeftNode(),min,node.getData()) && isBST(node.getRightNode(),node.getData(),max);
}
	 
	
private static void inOrder(Node node)	
{
	if(node==null) return;
	inOrder(node.getLeftNode());
	if(node!=null)
	{
		System.out.print(node.getData()+" ");
	}
	inOrder(node.getRightNode());
}

}
