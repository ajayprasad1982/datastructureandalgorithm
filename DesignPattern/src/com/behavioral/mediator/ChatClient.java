/**
 * 
 */
package com.behavioral.mediator;

/**
 * @author aprasa03
 *
 */
public class ChatClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	ChatMediator mediator=new ChatMediatorImpl();
	ChatUser user1=new ChatUserImpl(mediator,"Ajay");
	ChatUser user2=new ChatUserImpl(mediator,"Imran");
	ChatUser user3=new ChatUserImpl(mediator,"Dibya");
	ChatUser user4=new ChatUserImpl(mediator,"Bijay");
	
	mediator.addUser(user1);
	mediator.addUser(user2);
	mediator.addUser(user3);
	mediator.addUser(user4);
	
	user2.send("Hi All");
	
		

	}

}
