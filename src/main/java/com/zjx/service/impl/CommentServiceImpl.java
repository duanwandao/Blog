package com.zjx.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjx.dao.CommentDao;
import com.zjx.entity.Comment;
import com.zjx.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Resource
	private CommentDao commentDao;
	
	public List<Comment> list(Map<String, Object> map) {
		return commentDao.list(map);
	}

	public int add(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.add(comment);
	}
	
	public Long getTotal(Map<String, Object> map) {
		return commentDao.getTotal(map);
	}

	public int update(Comment comment) {
		return commentDao.update(comment);
	}

	public Integer delete(Integer id) {
		return commentDao.delete(id);
	}
}
