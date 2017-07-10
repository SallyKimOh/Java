package com.spring.hibernate.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.hibernate.model.TbUser;
import com.spring.hibernate.service.MainService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	@Autowired
	MainService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<TbUser> list = service.selectAll();
		for(TbUser user : list){
			System.out.println(user.getName());
		}
		
		logger.info("cnt====>"+service.selectAll().size());
		return "home";
	}
}
