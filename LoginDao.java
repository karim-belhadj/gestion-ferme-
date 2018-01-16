package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.beans.LoginModel;

import com.database.util.HibernateUtil;

public class LoginDao {

	
	public List<LoginModel> getAll() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query =session.createQuery("FROM LoginModel");
		
		List<LoginModel> allLogs = query.list();
		session.close();

		return allLogs;
	}
	public LoginModel login(String login, String pwd)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query =session.createQuery("FROM LoginModel l WHERE l.login = :login AND l.pwd = :pwd").setParameter("login", login).setParameter("pwd", pwd);
		LoginModel user = (LoginModel) query.uniqueResult();
		return user;
	}

	

	

}
