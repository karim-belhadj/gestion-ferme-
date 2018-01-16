package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.beans.Mouton;



public class App {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Mouton.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		tx.commit();
	

		
		System.out.println("END....");

	}

}
