package com.zjx.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjx.dao.BlogTypeDao;
import com.zjx.entity.BlogType;
import com.zjx.service.BlogTypeService;

@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {

	@Resource
	private BlogTypeDao blogTypeDao;
	
	public List<BlogType> counTypeList() {
		// TODO Auto-generated method stub
		return blogTypeDao.countTypeList();
	}
	
	public List<BlogType> list(Map<String, Object> map) {
		return blogTypeDao.list(map);
	}

	public long getTotal(Map<String, Object> map) {
		return blogTypeDao.getTotal(map);
	}
	
	public Integer add(BlogType blogType) {
		return blogTypeDao.add(blogType);
	}

	public Integer update(BlogType blogType) {
		return blogTypeDao.update(blogType);
	}

	public Integer delete(Integer id) {
		return blogTypeDao.delete(id);
	}

}
