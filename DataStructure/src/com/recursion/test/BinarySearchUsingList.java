/**
 * 
 */
package com.recursion.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 * Sep 7, 2015
 */
public class BinarySearchUsingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	List<Integer> tree=new ArrayList<Integer>();	
	tree.add(10);tree.add(20);tree.add(30);tree.add(40);tree.add(50);tree.add(60);tree.add(70);tree.add(80);	
	tree.add(90);tree.add(100);tree.add(110);tree.add(120);tree.add(130);tree.add(140);tree.add(150);tree.add(160);
	System.out.println(BinarySearch(tree,0,tree.size(),101));
	}
	private static int BinarySearch(List<Integer> node,int start,int stop,int find)
	{
		if(start>stop) return -1;
		int mid=(start+stop)/2;
		if(find==node.get(mid))	
			return node.get(mid);
		if(find<node.get(mid))
			return BinarySearch(node, start, mid-1, find);
		else
			return BinarySearch(node, mid+1, stop, find);
		
	}

}
