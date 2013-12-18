package com.oose2013.group7.roommates.common.commands;

import com.oose2013.group7.roommates.common.interfaces.Command;

public class SignUpCommand implements Command {
	private String username;
	private String password;
	private String email;
	private String gender;
	
	public SignUpCommand (String username, String password, String email, String gender) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public void execute(Context context) {
		// TODO Auto-generated method stub
		context.signUp(username, password, email, gender);
	}
}
