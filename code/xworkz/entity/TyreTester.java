package com.xworkz.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.xworkz.dao.TyreClassImpl;
import com.xworkz.dao.TyreDAO;




public class TyreTester {

	public static void main(String[] args) {

		String springContainer = "applicationcontext.xml" ;

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springContainer);

		TyreClass tyreClass = new TyreClass();
		tyreClass.setTyreID(6);
		tyreClass.setName("GoodYear");
		tyreClass.setPrice(1800.00);
		tyreClass.setWarranty(2);
		tyreClass.setTubeless(true);
		tyreClass.setWidthTyre(185);

		TyreClassImpl bean = applicationContext.getBean(TyreClassImpl.class);
		bean.addTyreEntity(tyreClass);
		
	
		ClassPathXmlApplicationContext classPathXmlApplicationContext =(ClassPathXmlApplicationContext)applicationContext;
		classPathXmlApplicationContext.close();


	}

}
