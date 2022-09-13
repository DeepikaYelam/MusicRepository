package com.music.com.service;

import java.util.List;

import com.music.com.entity.Comment;

public interface CommentService {
	
    public List<Comment>getAllCDetails();
	
	public Comment saveComment(Comment com);
	
	public Comment deleteComentById(Integer cid);

}
