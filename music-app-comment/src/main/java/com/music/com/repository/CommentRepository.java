package com.music.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.com.entity.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment,String>{

}
