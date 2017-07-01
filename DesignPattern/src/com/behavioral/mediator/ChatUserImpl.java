/**
 * 
 */
package com.behavioral.mediator;

/**
 * @author aprasa03
 *
 */
public class ChatUserImpl extends ChatUser {

	/**
	 * @param med
	 * @param name
	 */
	public ChatUserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.mediator.ChatUser#send(java.lang.String)
	 */
	@Override
	public void send(String msg) {
		System.out.println(name+": Sending Message.."+msg);
		chatMediator.sendMessage(msg, this);

	}

	/* (non-Javadoc)
	 * @see com.behavioral.pattern.mediator.ChatUser#recieve(java.lang.String)
	 */
	@Override
	public void recieve(String msg) {
		System.out.println(name+" :Recieved Message.."+msg);

	}

}
