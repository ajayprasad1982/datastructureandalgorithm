/**
 * 
 */
package com.behavioral.mediator;

/**
 * @author aprasa03
 *
 */
public interface ChatMediator {
	public void sendMessage(String msg,ChatUser user);
	public void addUser(ChatUser user);

}
