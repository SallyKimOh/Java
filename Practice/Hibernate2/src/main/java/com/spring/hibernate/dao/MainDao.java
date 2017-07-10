package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.model.TbUser;



public interface MainDao {
	
	public List<TbUser> selectAll();
	public TbUser select(String userid);
}
