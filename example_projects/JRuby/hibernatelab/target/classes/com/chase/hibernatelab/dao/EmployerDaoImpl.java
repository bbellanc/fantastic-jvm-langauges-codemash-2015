package com.manifest.hibernatelab.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.manifest.hibernatelab.model.Employer;

public class EmployerDaoImpl implements EmployerDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void save(Employer employer) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(employer);
		tx.commit();
		session.close();
	}

}
