package com.oose2013.group7.roommates.common.interfaces;

public class UserEvent implements Event {
	private String message;
	
	public UserEvent(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
