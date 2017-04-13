package com.sal.alba.Messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sal.alba.Messenger.database.DatabaseClass;
import com.sal.alba.Messenger.model.Comment;
import com.sal.alba.Messenger.model.Message;

public class CommentSrvice {

	// fields ...
	private Map<Long, Message> messages = DatabaseClass.getMessages();	
	
	// methods ...
	// GET
	public List<Comment> getAllComments(long messageId){
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return new ArrayList<>(comments.values());
	}
	
	public Comment getComment(long messageId, long commentId){		
		return messages.get(messageId).getComments().get(commentId);
	}
	
	// POST
	public Comment addComment(long messageId, Comment comment){		
		comment.setId(messages.get(messageId).getComments().size()+1);		
		messages.get(messageId).getComments().put(comment.getId(), comment);
		return comment;
	}
	
	// PUT
	public Comment updateComment(long messageId, Comment comment){
		if(comment.getId() < 0) return null;
		messages.get(messageId).getComments().put(comment.getId(), comment);
		return comment;
	}
	
	// DELETE
	public Comment removeComment(long messageId, long commentId){		
		return messages.get(messageId).getComments().remove(commentId);
	}
}
