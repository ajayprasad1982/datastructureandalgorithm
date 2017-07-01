/**
 * 
 */
package com.behavioral.state;

/**
 * @author aprasa03
 *
 */
public class TVContext  {

    private State tvState;
	
	/**
	 * @return the tvState
	 */
	public State getTvState() {
		return tvState;
	}

	/**
	 * @param tvState the tvState to set
	 */
	public void setTvState(State tvState) {
		this.tvState = tvState;
	}

	public void doAction() {
		tvState.doAction();

	}

}
