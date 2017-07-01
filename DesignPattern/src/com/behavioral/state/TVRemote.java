/**
 * 
 */
package com.behavioral.state;

/**
 * @author aprasa03
 *
 */
public class TVRemote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TVContext context=new TVContext();
		 State start=new TVStartState();      
		 State stop=new TVStopState();  
		 
		 context.setTvState(start);
		 context.doAction();
		 context.setTvState(stop);
		 context.doAction();

	}

}
