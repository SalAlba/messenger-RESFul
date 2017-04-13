package com.sal.alba.Messenger.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message {

	// fields ...
	private long id;
	private String message;
	private Date created;
	private String author;
	private Map<Long, Comment> comments = new HashMap<>();
	
	// constructor...
	
	// 1) this should be 
	public Message(){}
	
	// 2)
	public Message(long id, String message, String author){
		this.id=id;
		this.message=message;
		this.author=author;
		this.created = new Date();
	}
	
	
	// get/set...
	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	public String getMessage() { return message; }
	public void setMessage(String message) { this.message = message; }
	public Date getCreated() { return created; }
	public void setCreated(Date created) { this.created = created; }
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }

	// this annotation show to comment just when we want if check just the message shoe will it's only
	@XmlTransient
	public Map<Long, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}
	
	
}