/**
 * 
 */
package com.data.structure.stack.test;

/**
 * @author aprasa03
 *
 * Sep 8, 2015
 */
public class TowerOfHanoiLatest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TOH(3, "A", "B", "C");

	}
	
/*private static void solveTOH(int disks,String fromPeg,String toPeg,String withPeg)
{
	if(disks>=1)
	{
		solveTOH(disks-1, fromPeg, withPeg, toPeg);
		moveDisk(fromPeg, toPeg);
		solveTOH(disks-1, withPeg, toPeg, fromPeg);
	}
	return;
}
*/	
private static void TOH(int disks,String startPeg,String auxPeg,String endPeg)
{
	if(disks==1)
	{
		moveDisk(startPeg, endPeg);
		
	}
	else
	{
	TOH(disks-1, startPeg, endPeg, auxPeg);
	moveDisk(startPeg, endPeg);
	TOH(disks-1, auxPeg, startPeg, endPeg);
	}
}


private static void moveDisk(String fromPeg,String toPeg)
{
	System.out.println("moving disk from Peg\t"+fromPeg +"\tto\t"+toPeg);
}
	

}
