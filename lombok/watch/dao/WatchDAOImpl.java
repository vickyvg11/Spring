package com.xworkz.watch.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.xworkz.watch.entity.WatchEntity;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
@Component
public class WatchDAOImpl implements WatchDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public WatchDAOImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean saveWatchEntity(WatchEntity watchEntity) {
		System.out.println("INvoked Save Entity");
		Session session = null;
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(watchEntity);
			session.getTransaction().commit();
			System.out.println("Watch Entity is Saved");
			return true;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Rolled Back");
		}finally{
			if(	session!=null) {
				session.close();
				System.out.println("Session is Closed");

			}else {
				System.out.println("Session is NOT Closed");
			}

		}
		return false;
	}





	@Override
	public WatchEntity getWatchEntity(String watchName) {
		System.out.println("Invoked get WatchEntity");
		Session session = null;
		try {
			session= sessionFactory.openSession();
			String hqlQuery ="From WatchEntity where name=:name";
			Query createQuery = session.createQuery(hqlQuery);
			createQuery.setParameter("name",watchName);
			WatchEntity entity = (WatchEntity) createQuery.uniqueResult();
			System.out.println("Watch is "+entity);
			if (entity!=null) {
				return entity;
			}else {
				System.out.println("Watch Not Found");
			}
		} catch (HibernateException e) {
			System.out.println("Invoked Catch Block");
		}finally {
			if(	session!=null) {
				session.close();
				System.out.println("Session is Closed");

			}else {
				System.out.println("Session is NOT Closed");
			}
		}

		return null;
	}


}


