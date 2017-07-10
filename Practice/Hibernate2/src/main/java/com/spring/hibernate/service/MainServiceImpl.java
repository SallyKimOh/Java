package com.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.dao.MainDao;
import com.spring.hibernate.model.TbUser;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	MainDao dao;

	@Override
	public List<TbUser> selectAll() {
		return dao.selectAll();
	}

	@Override
	public TbUser select(String userid) {
		return dao.select(userid);
	}
	
	 
	
}
