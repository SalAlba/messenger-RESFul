package com.sal.alba.Messenger.model;

import java.util.Date;

public class Comment {

	// fields ...
	private long id;
	private String comment;
	private Date crated;
	private String author;
	
	// constructor ....
	public Comment(){}

	public Comment(long id, String comment, String author) {
		super();
		this.id = id;
		this.comment = comment;
		this.author = author;
		this.crated = new Date();
	}
	
	
	// get/set ...
	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	public String getComment() { return comment; }
	public void setComment(String comment) { this.comment = comment; }
	public Date getCrated() { return crated; }
	public void setCrated(Date crated) { this.crated = crated; }
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	
	
}
