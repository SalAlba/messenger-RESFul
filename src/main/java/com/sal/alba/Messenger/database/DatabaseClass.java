package com.sal.alba.Messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.sal.alba.Messenger.model.Comment;
import com.sal.alba.Messenger.model.Message;
import com.sal.alba.Messenger.model.Profile;

public class DatabaseClass {

	// fields ...
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profile = new HashMap<>();
	private static Map<Long, Comment> comment = new HashMap<>();
	
	// get/set ...
	public static Map<Long, Message> getMessages() { return messages; }
	public static Map<String, Profile> getProfile() { return profile; }
	public static Map<Long, Comment> getComment() { return comment; }
	
}