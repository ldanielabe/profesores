package com.platzi.hb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CrearSession {

	
	Session session;
	public CrearSession() {
		Configuration conf=new Configuration();
        conf.configure();
        SessionFactory sessionFactory=conf.buildSessionFactory();
        session =sessionFactory.openSession();
        session.beginTransaction();
        
	}

	public Session getSession() {
        
        return session;
	}
}
