package com.zjx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjx.dao.BloggerDao;
import com.zjx.entity.Blogger;
import com.zjx.service.BloggerService;

/**
 * 博主Service实现类
 * @author 断弯刀
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{

	@Resource
	private BloggerDao bloggerDao;
	
	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Blogger find() {
		return bloggerDao.find();
	}

	public Integer update(Blogger blogger) {
		return bloggerDao.update(blogger);
	}
}
