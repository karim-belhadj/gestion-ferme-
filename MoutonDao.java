package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.beans.Mouton;
import com.database.util.HibernateUtil;

public class MoutonDao {

	
	public List<Mouton> getAll() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query =session.createQuery("FROM Mouton");
		
		List<Mouton> allMoutons = query.list();
		session.close();

		return allMoutons;
	}

	public void addMouton(Mouton mouton) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//DateTimeFormatter formatter = DateTimeFormat.ForPattern("yyyy-MM-dd");
		//DateTime dt = formatter.parseDateTime(mouton)
		session.save(mouton);
		session.getTransaction().commit();

		session.close();
	}

	public Mouton getMoutonById(int id) {

		for (Mouton m : this.getAll()) {
			if (m.getNum_mouton() == id)
				return m;
		}
		return null;
	}


	
	public void updateMouton(Mouton mouton) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.update(mouton);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteMouton(Mouton mouton) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.delete(mouton);
		session.getTransaction().commit();

		session.close();
	}

	

	

}
