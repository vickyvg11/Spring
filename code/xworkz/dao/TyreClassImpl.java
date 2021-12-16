package com.xworkz.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.entity.TyreClass;

@Component
public class TyreClassImpl implements TyreDAO{

	@Autowired
	private SessionFactory factory;
	
	public TyreClassImpl() {
		super();
		this.factory=factory;
		System.out.println("Created");
	}

	public void addTyreEntity(TyreClass tyreClass) {
		System.out.println("Invoked Entity");
		Session session =null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(tyreClass);
			session.getTransaction().commit();

			System.out.println("Saved");

		} catch (HibernateException e) {
			session.getTransaction().rollback();

		}finally {
			if(session!=null) {
				System.out.println("Session Closed");
				session.close();
			}else {
				System.out.println("Session is not Closed");
			}
		}

	}


}
