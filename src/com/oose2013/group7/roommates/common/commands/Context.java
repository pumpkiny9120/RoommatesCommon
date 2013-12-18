package com.oose2013.group7.roommates.common.commands;

import com.oose2013.group7.roommates.common.interfaces.Game;


/*** Context interface*/
public interface Context {

	public Game<?> getGame();
	public void signIn(String username, String password);
	public void signUp(String username, String password, String email, String gender);
}
