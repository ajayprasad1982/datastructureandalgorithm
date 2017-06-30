/**
 * 
 */
package com.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 */
public class ChatMediatorImpl implements ChatMediator {

	private List<ChatUser> users;
	public ChatMediatorImpl()
	{
		users=new ArrayList<ChatUser>();
	}
	
	
	@Override
	public void sendMessage(String msg, ChatUser user) {
		for(ChatUser u:users)
		{
			if(u!=user)
			{
				u.recieve(msg);
			}
		}
	}
	@Override
	public void addUser(ChatUser user) {
		users.add(user);

	}

}
