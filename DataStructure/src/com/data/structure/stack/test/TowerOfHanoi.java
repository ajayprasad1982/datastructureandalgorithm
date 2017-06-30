/**
 * 
 */
package com.data.structure.stack.test;

import com.data.structure.stack.Stack;

/**
 * @author aprasa03
 *
 */
public class TowerOfHanoi {
	String sol1,myStep,sol2,mySol="";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack t1=new Stack(10);
		Stack t2=new Stack(10);
		Stack t3=new Stack(10);

		t1.push(3);	
		t1.push(2);	
		t1.push(1);	
		TowerOfHanoi toh=new TowerOfHanoi();
		System.out.println(toh.hanoi(3, 1, 3));
		
	}
	
	private String hanoi(int disks,int fromPeg,int toPeg)
	{
		String sol1,myStep,sol2;
		
		if(disks==1)
		{
			return  fromPeg +"->" +toPeg+"\n";
		}
		else{
			
		int helpPeg=6-fromPeg-toPeg;
		sol1=hanoi(disks-1,fromPeg,helpPeg);
		//.out.println(sol1);
		
		myStep=fromPeg+"->"+toPeg+"\n";
		
		//System.out.println(myStep);
		sol2=hanoi(disks-1,helpPeg,toPeg);
		//System.out.println(sol2);
		//mySol=mySol+sol1+myStep+sol2;
		return sol1+myStep+sol2;
		}
	}
	
	/*private static Boolean isEven(Stack  stack)
	{
		return (((stack.getTop()+1)&1)==0);
	}

	private static Boolean isMovePossible(Stack t1,Stack t2)
	{
		if(t1.isEmpty())
			return false;
		if(t2.isEmpty())
			return true;
		

		int t1Poppedvalue=t1.pop();
		int t2Poppedvalue=t2.pop();
		
		t1.push(t1Poppedvalue);
		t2.push(t2Poppedvalue);
		
		return t1Poppedvalue<t2Poppedvalue;
	}
*/	
	
	
}
