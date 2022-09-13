package com.music.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.com.entity.Comment;
import com.music.com.service.CommentService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/com")
public class CommentController {
	
	@Autowired
	CommentService comServ;
	
	
 @GetMapping("/all")
	 
	 public List<Comment> getAllCommentDetails() {
	 		return comServ.getAllCDetails();
		}
	 
	 @PostMapping("/addcom")
	 public Comment saveComment(@RequestBody Comment c) {
			return comServ.saveComment(c);
		}
	 
	 @DeleteMapping("/deletecom/{cid}")
		public Comment deleteComentById(@RequestBody Integer cid) {
			return comServ.deleteComentById(cid);
		}


}
