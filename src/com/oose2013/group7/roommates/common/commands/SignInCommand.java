package com.oose2013.group7.roommates.common.commands;

import com.oose2013.group7.roommates.common.interfaces.Command;

public class SignInCommand implements Command {
	private String username;
	private String password;
	
	public SignInCommand (String username, String password) {
		this.username = username;
		this.password = password;
	}
	

	@Override
	public void execute(Context context) {
		// TODO Auto-generated method stub
		context.signIn(username, password);
	}

}
