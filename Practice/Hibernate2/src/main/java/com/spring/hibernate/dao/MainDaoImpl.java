package com.spring.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hibernate.model.TbUser;

@Repository
public class MainDaoImpl implements MainDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<TbUser> selectAll(){
		Session session = sessionFactory.openSession();
		List<TbUser> result = (List<TbUser>) session.createQuery("from TbUser").list();
		session.close();
		return result;
	}

	@Override
	public TbUser select(String userid) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from TbUser where userid = :userid");
		query.setString("userid", userid);
		TbUser user = (TbUser) query.uniqueResult();
		session.close();
		return user;
	}
	
    public static void main(String[] args) {
    	
    	MainDao dao = new MainDaoImpl();
    	
    	int a = dao.selectAll().size();
    	System.out.println("a==>"+a);
		
	}
	
	
}
