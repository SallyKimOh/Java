package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.model.TbUser;


public interface MainService {
	
	public List<TbUser> selectAll();
	public TbUser select(String userid);
}
