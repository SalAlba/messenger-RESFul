package com.sal.alba.Messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sal.alba.Messenger.model.Comment;
import com.sal.alba.Messenger.service.CommentSrvice;

@Path("/")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {

	// fields ...	
	private CommentSrvice commentSrvice = new CommentSrvice();
	private long messageId;
	
	// constructor ...
	public CommentResource(){
			
		}
	
	public CommentResource(long messageId){ this.messageId = messageId; }
	
	
	// methods ...
	@GET
	public List<Comment> getAllComments(){
		System.out.println("messages/"+messageId+"/comments/");
		return commentSrvice.getAllComments(messageId);
	}
	
	@GET
	@Path("{commentId}")
	public Comment getComment(@PathParam("commentId") long commentId){
		System.out.println("messages/"+messageId+"/comments/"+commentId);
		return commentSrvice.getComment(messageId, commentId);
	}
	
	@POST
	//@Path("/comments")
	public Comment addComment(Comment comment){
		System.out.println("messages/"+messageId+"/comments/"+comment.getId());
		System.out.println(comment.getComment());
		return commentSrvice.addComment(messageId, comment);
	}
	
}
