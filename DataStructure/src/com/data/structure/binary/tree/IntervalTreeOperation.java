/**
 * 
 */
package com.data.structure.binary.tree;

/**
 * @author aprasa03
 *
 * Feb 4, 2015
 */
public class IntervalTreeOperation {
	
public static IntervalNode insert(IntervalNode rootNode,int array[])
{
	if(rootNode==null)
	{
		rootNode=new IntervalNode(array[0],array[1]);
		return rootNode;
	}
	else if(array[0]<rootNode.getLow())
	{
		rootNode.setLeft(insert(rootNode.getLeft(),array));
		return rootNode;
	}
	else if(array[0]>rootNode.getLow())
	{
		rootNode.setRight(insert(rootNode.getRight(),array));
		return rootNode;
	}
	if(rootNode.getLeft()!=null)
	{
		rootNode.setMax(Math.max(rootNode.getMax(),rootNode.getLeft().getMax()));
	}
	if(rootNode.getRight()!=null)
	{
		rootNode.setMax(Math.max(rootNode.getMax(),rootNode.getRight().getMax()));
	}
    return rootNode;	
	
}

public static IntervalNode  serach(IntervalNode rootNode,int array[])
{
	if(rootNode==null)
	return rootNode;
	if(array[0]>rootNode.getLow() && array[0]<rootNode.getHigh())
	{
		return rootNode;
	}
	if(array[0]<rootNode.getLow())
	{
		return serach(rootNode.getLeft(),array);
	}
	
	return serach(rootNode.getRight(),array);
}

}
