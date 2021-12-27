package com.xworkz.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.entity.TyreClass;

@Component
public class TyreClassImpl implements TyreDAO{

	@Autowired
	private SessionFactory factory;

	public TyreClassImpl() {

		System.out.println("Created"+this.getClass().getSimpleName());

	}

	public void addTyreEntity(TyreClass tyreClass) {
		System.out.println("Invoked addTyreEntity");
		Session session =null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(tyreClass);
			session.getTransaction().commit();

			System.out.println("Tyre Class Saved");

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

	@Override
	public void updateTyreClassNameByID(TyreClass tyreClass) {
		System.out.println("Invoked update Tyre Class By ID");
		Session session =null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			String hqlQuery="Update TyreClass set NAME='Ralco' where tyre_detailsID=3";

			Query query = session.createQuery(hqlQuery);
			int noOfRowsEffected = query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("No Of Rows Affected"+noOfRowsEffected);

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Rolled Back");
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("Session Closed");

			}else {
				System.out.println("Session is Not Closed");
			}
		}

	}

	@Override
	public void deleteTyreClass() {
		Session session = null;
		try {
			session=factory.openSession();
			session.beginTransaction();
			String deleteRowByID = "Delete TyreClass where tyre_detailsID=5";
			Query deleted = session.createQuery(deleteRowByID);
			int execute = deleted.executeUpdate();
			System.out.println("No of Rows Deleted:"+execute);


		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Rolled Back");
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("Session is Closed");
			}else {
				System.out.println("Session is not Closed");
			}
		}

	}

	@Override
	public void readTyreClassByID() {
		Session session =null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			String hql = "SELECT NAME FROM tyre_details";
			Query read = session.createQuery(hql);
			int read1 = read.executeUpdate();
			System.out.println("Reading the Data"+read1);
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Rolled Back");
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("Session is Closed");
			}else {
				System.out.println("Session is not Closed");
			}

		}
	}

	@Override
	public void updatePriceByName() {
	
		
		
	}
}

