/**
 * 
 */
package com.behavioral.mediator;

/**
 * @author aprasa03
 *
 */
public abstract class ChatUser {
	protected ChatMediator chatMediator;
	protected String name;
	
	public ChatUser(ChatMediator med, String name) {
		this.chatMediator = med;
		this.name = name;
	}
	
public abstract void send(String msg);
public abstract void recieve(String msg);

}
