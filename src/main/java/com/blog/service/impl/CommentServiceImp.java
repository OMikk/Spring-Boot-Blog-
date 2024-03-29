package com.blog.service.impl;

import com.blog.service.CommentService;
import com.blog.repository.CommentRepository;
import com.blog.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImp implements CommentService {
	
	private final CommentRepository commentRepository;
	
	@Autowired
	public CommentServiceImp(CommentRepository commentRepo) {
		this.commentRepository = commentRepo;
	}
	
	@Override
	public Comment save(Comment comment) {
		return commentRepository.saveAndFlush(comment);
	}

}
