/**
 * 
 */
package com.data.structure.binary.tree;

/**
 * @author aprasa03
 *
 */
public class BinaryTree {

	/**
	 * @param args
	 */
	static Node root;
	static int postOrder[]=new int[9];
	static int index=0;

	public static void main(String[] args) {
		int[] data = { 8, 3, 1, 6, 7, 4, 10, 14, 13 };

		for (int da : data) {
			root = insertNode(root, da);
		}
		// System.out.println(root);
		System.out.println("In Order Traversal");
		inOrderTraversal(root);
		System.out.println("");

		System.out.println("Height Of Tree\t" + treeHeight(root));
		System.out.println("Numbers of Nodes" + countNodes(root));
		System.out.println("IS BST\t" + isBST(root));
		System.out.println("Min Value of BST \t" + minValue(root).getData()
				+ "\t Max Value of BST \t" + maxValue(root).getData());

		System.out.println("Search Node\t" + searchNode(root, 6));
		System.out.println("Is Leaf Node\t" + isLeaf(searchNode(root, 13)));
		System.out.println("Number of Leaves in tree \t" + countLeaves(root));
		System.out.println("Print the level order");
		printLevelOrder(root);

		/*
		 * System.out.println("Delete" + delete(root, 6));
		 * System.out.println("After delete ");
		 * System.out.println("In Order Traversal"); inOrderTraversal(root);
		 * System.out.println("");
		 */
		mirrorTree(root);
		System.out.println("Mirror Of Tree");
		System.out.println("In Order Traversal");
		inOrderTraversal(root);
		System.out.println("Sum Of Tree\t" + treeSum(root));
		Node avlTreeNode=null;
		for (int da : data) {
			avlTreeNode = AVLTreeInsert(avlTreeNode, da);
		}
System.out.println("AVL Tree");
printLevelOrder(avlTreeNode);

System.out.println("Construct BST From Post order Traversal");
root=null;
for (int da : data) {
	root = insertNode(root, da);
}

     postOrderTraversal(root);	
     
     printLevelOrder(constructBSTFromPostOrder(postOrder));  ;
     
     int nodes=3;
	System.out.println("How many BST form with Number "+nodes);	
	
	System.out.println(countTrees(nodes));

	}

	private static Node insertNode(Node node, int data) {
		if (node == null)
			return new Node(data);
		if (node.getData() == data) {
			return node;
		} else if (data < node.getData()) {
			Node leftNode = insertNode(node.getLeftNode(), data);
			node.setLeftNode(leftNode);
			leftNode.setParentNode(node);
		} else if (data > node.getData()) {
			Node rightNode = insertNode(node.getRightNode(), data);
			node.setRightNode(rightNode);
			rightNode.setParentNode(node);
		}
		return node;
	}

	private static Node delete(Node node, int data) {
		if (node == null) {
			return node;
		}
		if (node.getData() == data) {
			// case-1
			if (isLeaf(node))
				return null;
			// case-2
			else if (node.getLeftNode() == null) {
				return node.getRightNode();
			}
			// case-2
			else if (node.getRightNode() == null) {
				return node.getLeftNode();
			}

			else {
				// case-3
				// get the minimum node from rightnode of node
				Node minNode = minValue(node.getRightNode());
				// de-link minnode from parent
				delete(node, minNode.getData());
				// set the min node leftnode and right node
				minNode.setLeftNode(node.getLeftNode());
				minNode.setRightNode(node.getRightNode());
				// de-link the parent node
				node = null;
				return minNode;
			}
		} else if (data < node.getData())
			node.setLeftNode(delete(node.getLeftNode(), data));
		else if (data > node.getData())
			node.setRightNode(delete(node.getRightNode(), data));

		return node;
	}

	private static Node inOrderTraversal(Node node) {
		if (node == null) {
			return node;
		}
		inOrderTraversal(node.getLeftNode());
		printNodeValue(node);
		inOrderTraversal(node.getRightNode());
		return node;
	}

	private static Node postOrderTraversal(Node node) {
		if (node == null) {
			return node;
		}
		postOrderTraversal(node.getLeftNode());
		postOrderTraversal(node.getRightNode());
		printNodeValue1(node);

		return node;
	}

	private static Node preOrderTraversal(Node node) {
		if (node == null) {
			return node;
		}
		printNodeValue(node);
		inOrderTraversal(node.getLeftNode());
		inOrderTraversal(node.getRightNode());
		return node;
	}

	/*
	 * private static void levelOrder(Node node) { StringBuilder sb=new
	 * StringBuilder(); while(node!=null ) {
	 * 
	 * sb.append(node.getData()).append(","); node=node }
	 * 
	 * //return node;
	 * 
	 * }
	 */

	private static int treeHeight(Node node) {
		if (node == null)
			return -1;
		return 1 + Math.max(treeHeight(node.getLeftNode()),
				treeHeight(node.getRightNode()));
	}

	private static int countNodes(Node node) {

		if (node == null)
			return 0;
		return 1 + countNodes(node.getLeftNode())
				+ countNodes(node.getRightNode());
	}

	private static Boolean isBST(Node node) {
		if (node == null)
			return false;
		// case 1
		else if (node.getLeftNode() == null && node.getRightNode() == null) {
			return true;

		}// case 2
		else if (node.getLeftNode() != null && node.getRightNode() != null) {
			int leftNodeData = node.getLeftNode().getData();
			int rightNodeData = node.getRightNode().getData();
			int nodeData = node.getData();
			return leftNodeData < nodeData && rightNodeData > nodeData
					&& isBST(node.getLeftNode()) && isBST(node.getRightNode());
		}
		// case 3
		else if (node.getLeftNode() != null && node.getRightNode() == null) {
			int leftNodeData = node.getLeftNode().getData();
			int nodeData = node.getData();
			return leftNodeData < nodeData && isBST(node.getLeftNode());
		}
		// case 4
		else if (node.getLeftNode() == null && node.getRightNode() != null) {
			int rightNodeData = node.getRightNode().getData();
			int nodeData = node.getData();
			return rightNodeData > nodeData && isBST(node.getRightNode());
		}

		return false;
	}

	private static Node minValue(Node node) {
		while (node != null && node.getLeftNode() != null) {
			node = node.getLeftNode();
		}
		return node;
	}

	private static Node maxValue(Node node) {
		while (node != null && node.getRightNode() != null) {
			node = node.getRightNode();
		}
		return node;
	}

	private static Node searchNode(Node node, int data) {
		if (node == null)
			return node;
		else if (data < node.getData()) {
			return searchNode(node.getLeftNode(), data);
		} else if (data > node.getData())
			return searchNode(node.getRightNode(), data);
		else {
			return node;
		}
	}

	private static int countLeaves(Node node) {
		if (node == null)
			return 0;
		if (node.getLeftNode() == null && node.getRightNode() == null) {
			return 1;
		}
		return countLeaves(node.getLeftNode())
				+ countLeaves(node.getRightNode());

	}

	private static boolean isLeaf(Node node) {
		return node != null && node.getLeftNode() == null
				&& node.getRightNode() == null;
	}

	private static void mirrorTree(Node node) {
		if (node == null) {
			return;
		}
		mirrorTree(node.getLeftNode());
		mirrorTree(node.getRightNode());
		Node temp = node.getLeftNode();
		node.setLeftNode(node.getRightNode());
		node.setRightNode(temp);
	}

	private static void printLevelOrder(Node node) {
		for (int i = 0; i <= treeHeight(node); i++) {
			printLevel(node, i);
			System.out.println();
		}

	}

	private static void printLevel(Node node, int depth) {
		if (node == null)
			return;

		if (depth == 0) {
			System.out.print(node.getData() + " ");
		}
		printLevel(node.getLeftNode(), depth - 1);
		printLevel(node.getRightNode(), depth - 1);
	}

	private static int treeSum(Node node) {
		if (node == null)
			return 0;

		int sum = treeSum(node.getLeftNode()) + treeSum(node.getRightNode());

		if (sum > 0) {
			node.setData(sum);

		}

		return sum == 0 ? node.getData() : sum;
	}

	private static Node AVLTreeInsert(Node node, int data) {
		// apply BST rule 1st in AVL tree for insert data
		if (node == null)
		{	node = new Node(data);
		} else if (data < node.getData()) {
			node.setLeftNode(AVLTreeInsert(node.getLeftNode(), data));
		} else if (data > node.getData()) {
			node.setRightNode(AVLTreeInsert(node.getRightNode(), data));
		} else {
			return node;
		}

		int height = 1 + Math.max(getAVLTreeNodeHeight(node.getLeftNode()),
				getAVLTreeNodeHeight(node.getRightNode()));
		node.setHeight(height);
		int balance = getAVLTreeNodeHeight(node.getLeftNode())
				- getAVLTreeNodeHeight(node.getRightNode());

		// case left left rotate
		if (balance > 1 && data < node.getLeftNode().getData()) {
			return rightRotate(node);
		}
		// case of right right rotate
				else if (balance < -1 && data > node.getRightNode().getData()) {
					return leftRotate(node);
		}
		// case of left Right rotate
		else if (balance > 1 && data > node.getLeftNode().getData()) {
			node.setLeftNode(leftRotate(node.getLeftNode()));
			return rightRotate(node);
		}
		// case of right left rotate
		else if (balance < -1 && data < node.getRightNode().getData()) {
			node.setRightNode(rightRotate(node.getRightNode()));
			return leftRotate(node);
		}

		return node;
	}

	private static Node rightRotate(Node node) {
		// get the left-node of input
		// node i.e newroot
		Node newRoot = node.getLeftNode();
		// get the right-node of newly created newroot .i.e tempNode
		Node tempNode = newRoot.getRightNode();
		// set right-node of new node(newRoot)
		newRoot.setRightNode(node);
		// set left-node of input node
		node.setLeftNode(tempNode);
		// set height of Input node
		int nodeHeight = 1 + Math.max(getAVLTreeNodeHeight(node.getLeftNode()),
				getAVLTreeNodeHeight(node.getRightNode()));
		node.setHeight(nodeHeight);
		// set height of newRoot node
		int newRootHeight = 1 + Math.max(
				getAVLTreeNodeHeight(newRoot.getLeftNode()),
				getAVLTreeNodeHeight(newRoot.getRightNode()));
		newRoot.setHeight(newRootHeight);

		return newRoot;
	}

	private static Node leftRotate(Node node) {
		// get the right-node of input
		// node i.e newroot
		Node newRoot = node.getRightNode();
		// get the left-node of newly created newroot .i.e tempNode
		Node tempNode = newRoot.getLeftNode();
		// set left-node of new node(newRoot)
		newRoot.setLeftNode(node);
		// set right-node of input node
		node.setRightNode(tempNode);
		// set height of Input node
		int nodeHeight = 1 + Math.max(getAVLTreeNodeHeight(node.getLeftNode()),
				getAVLTreeNodeHeight(node.getRightNode()));
		node.setHeight(nodeHeight);
		// set height of newRoot node
		int newRootHeight = 1 + Math.max(
				getAVLTreeNodeHeight(newRoot.getLeftNode()),
				getAVLTreeNodeHeight(newRoot.getRightNode()));
		newRoot.setHeight(newRootHeight);

		return newRoot;
	}
	
	private static Node constructBSTFromPostOrder(int postOrder[])
	{
		Node node=null;
		for(int i=postOrder.length-1;i>=0;i--)
		{
			node=insertNode(node, postOrder[i]);
		}
		
		
		return node;
	}

	private static int getAVLTreeNodeHeight(Node node) {
		return node == null ? -1 : node.getHeight();
	}
	private static void printNodeValue1(Node node) {
          postOrder[index++]=node.getData();
	}

	/*
	 1         3     3      2      1
	    \       /     /      / \      \
	     3     2     1      1   3      2
	    /     /       \                 \
	   2     1         2                 3  */
	
	/*
	 * how many ways we can form BST with given nodes
	 */
	private static int countTrees(int nodes)
	{
		if(nodes <=1)
			return 1;
		// there will be one value at the root, with whatever remains
		// on the left and right each forming their own subtrees.
		// Iterate through all the values that could be the root...
		int sum=0,left=0,right=0;
		for(int root=1;root<=nodes;root++)
		{
			left=countTrees(root-1);
			right=countTrees(nodes-root);
			sum=sum+left*right;
		}
					
		return sum;
	}
	
	private static void printNodeValue(Node node) {
		System.out.print(" " + node.getData());
	}

}
