package com.music.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.com.entity.Comment;
import com.music.com.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService{
	@Autowired
	CommentRepository comRepo;

	@Override
	public List<Comment> getAllCDetails() {
		// TODO Auto-generated method stub
		return comRepo.findAll();
	}

	@Override
	public Comment saveComment(Comment com) {
		// TODO Auto-generated method stub
		return comRepo.save(com);
	}

	@Override
	public Comment deleteComentById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
