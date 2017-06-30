/**
 * 
 */
package com.data.structure.binary.tree;

/**
 * @author aprasa03
 *
 * Feb 4, 2015
 */
public class ConflictAppointments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//int array[][]={{1, 5}, {3, 7}, {2, 6}, {10, 15},{5, 6}, {4, 100}};
		int array[][]={{1, 100}, {5,1000}, {3, 200}};
		
		printConflict(array);
	}

private static void printConflict(int array[][])	
{
	
	IntervalNode rootNode=IntervalTreeOperation.insert(null, array[0]);
	System.out.println("Following are conflicting intervals");
	
	for(int i=1;i<array.length;i++)
	{
	IntervalNode node=IntervalTreeOperation.serach(rootNode, array[i]);
		if(node!=null)
		{
			System.out.println("["+array[i][0]+","+array[i][1]+"] conflict meeting with"+"["+node.getLow()+","+node.getHigh()+"]");
			
		}
		rootNode=IntervalTreeOperation.insert(rootNode, array[i]);
	}
}
	
}
