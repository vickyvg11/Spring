package com.xworkz.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dao.TyreClassImpl;
import com.xworkz.dao.TyreDAO;




public class TyreTester {

	public static void main(String[] args) {

		String springContainer = "applicationcontext.xml" ;

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springContainer);

		TyreClass tyreClass = new TyreClass();
		tyreClass.setTyreID(1);
		tyreClass.setName("MRF");
		tyreClass.setPrice(2000.00);
		tyreClass.setWarranty(5);
		tyreClass.setTubeless(true);
		tyreClass.setWidthTyre(195);

		TyreClassImpl bean = applicationContext.getBean(TyreClassImpl.class);
		bean.addTyreEntity(tyreClass);

		ClassPathXmlApplicationContext classPathXmlApplicationContext =(ClassPathXmlApplicationContext)applicationContext;
		classPathXmlApplicationContext.close();


	}

}
