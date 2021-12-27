package com.xworkz.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.xworkz.dao.TyreClassImpl;
import com.xworkz.dao.TyreDAO;
import com.xworkz.service.Service;
import com.xworkz.service.ServiceImpl;

public class TyreTester {

	private static final String TyreClass = null;

	public static void main(String[] args) {

		String springContainer = "applicationcontext.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springContainer);

		TyreClass tyreClass = new TyreClass();
//		tyreClass.setTyreID(3);
//		tyreClass.setName("FireStone");
//		tyreClass.setPrice(1700.0);
//		tyreClass.setWarranty(1);
//		tyreClass.setWidthTyre(155);
//		tyreClass.setTubeless(false);



		//Service remoteService = applicationContext.getBean(Service.class);
		//		boolean validateAll = remoteService.validateTyreClass(tyreClass);
		//		
		//		if (validateAll) {
		//			System.out.println("Data is Saved");
		//		} else {
		//			System.err.println("Data is Not Saved");
		//		}

		//	boolean validateTyreClassByName = remoteService.validateTyreClassByName(tyreClass);


//		TyreClassImpl bean = applicationContext.getBean(TyreClassImpl.class);
//		bean.updateTyreClassNameByID(tyreClass);
		
//		TyreClassImpl bean2 = applicationContext.getBean(TyreClassImpl.class);
//		bean2.deleteTyreClass();
		
		TyreClassImpl bean3 = applicationContext.getBean(TyreClassImpl.class);
		bean3.readTyreClassByID();

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) applicationContext;
		classPathXmlApplicationContext.close();

	}

}
