/**
 * 
 */
package com.behavioral.template;

/**
 * @author aprasa03
 *
 */
public abstract class Game {

	protected abstract void prepare();

	protected abstract void startPlay();

	protected abstract void endPlay();

	protected void play() {
		// preparation

		prepare();
		startPlay();
		endPlay();
	}
}
