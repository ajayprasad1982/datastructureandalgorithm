/**
 * 
 */
package com.hacker.rank.prog.binaryTree.traversal;

import java.util.Stack;

/**
 * @author aprasa03
 *
 */
public class InOrderUsingStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node=new Node(40);
		node.setLeftNode(new Node(30));
		node.setRightNode(new Node(60));
		node.getLeftNode().setLeftNode(new Node(10));
		node.getLeftNode().setRightNode(new Node(35));
		node.getRightNode().setLeftNode(new Node(50));
		node.getRightNode().setRightNode(new Node(70));
		inOrderTraversal(node);
		System.out.println();
		inOrderTraversalUsingStack(node);
		System.out.println();
		morrisTraversal(node);
		System.out.println();
		morrisInOrder(node);
		
	}
	
	private static void inOrderTraversal(Node node)
	{
		
		Node current=node;
		Stack<Node> stack=new Stack<Node>();
		while(true)
		{
			if(current!=null)
			{
				stack.push(current);
				current=current.getLeftNode();
			}
			else
			{
				if(stack.isEmpty()) return ;
				current=stack.pop();
				System.out.print(current.getData()+" ");
				current=current.getRightNode();
				
			}
			
		}
		
	}
	
/**
 * optimized in order traversal
 * @param root
 */
private static void inOrderTraversalUsingStack(Node root)
{
	
	Node cur=root;
	Stack<Node> stack=new Stack<Node>();
	while(true)
	{
		while(cur!=null)
		{
			stack.push(cur);
			cur=cur.getLeftNode();
			
		}
		if(stack.isEmpty()) break;
		cur=stack.pop();
		System.out.print(cur.getData()+" ");
		cur=cur.getRightNode();
		
	}
	
}
	public static void morrisTraversal(Node root)
	  {
	    while (root != null)
	    {
	      if (root.getLeftNode() == null)
	      {
	        System.out.print(root.getData()+" ");
	        root = root.getRightNode();
	      }
	      else
	      {
	        Node temp = root.getLeftNode();
	        while (temp.getRightNode() != null && temp.getRightNode() != root)
	        {
	          temp = temp.getRightNode();
	        }
	        if (temp.getRightNode() == null)
	        {
	          temp.setRightNode(root);
	          root = root.getLeftNode();
	        }
	        else
	        {
	          temp.setRightNode(null);
	          System.out.print(root.getData()+" ");
	          root = root.getRightNode();
	        }
	      }
	    }
	  }
	
	public static void morrisInOrder(Node root) {
        Node cur = root;
        Node pre;
        while (cur!=null){
            if (cur.getLeftNode()==null){
                System.out.print(cur.getData()+" ");      
                cur = cur.getRightNode(); // move to next right node
            }
            else {  // has a left subtree
                pre = cur.getLeftNode();
                while (pre.getRightNode()!=null){  // find rightmost
                    pre = pre.getRightNode();
                }
                pre.setRightNode(cur);  // put cur after the pre node
                Node temp = cur;  // store cur node
                cur = cur.getLeftNode();  // move cur to the top of the new tree
                temp.setLeftNode( null);   // original cur left be null, avoid infinite loops
            }        
        }
    }

}
