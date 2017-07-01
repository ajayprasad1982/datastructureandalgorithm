/**
 * 
 */
package com.behavioral.template;

/**
 * @author aprasa03
 *
 */
public class Football extends Game {

	/* (non-Javadoc)
	 * @see com.behavioral.template.Game#prepare()
	 */
	@Override
	protected void prepare() {
		System.out.println(this.getClass().getSimpleName()+" Game Initialized! Start playing.");

	}

	/* (non-Javadoc)
	 * @see com.behavioral.template.Game#startPlay()
	 */
	@Override
	protected void startPlay() {
		 System.out.println(this.getClass().getSimpleName()+" Game Started. Enjoy the game!");

	}

	/* (non-Javadoc)
	 * @see com.behavioral.template.Game#endPlay()
	 */
	@Override
	protected void endPlay() {
		System.out.println(this.getClass().getSimpleName()+" Game Finished!");

	}

}
