package com.xworkz.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeTester {

	public static void main(String[] args) {

		String springFile = "home.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springFile);

		HomeClass bean = springContainer.getBean(HomeClass.class);
		System.out.println(bean);
		System.out.println(bean.hashCode());
		System.out.println(bean);
		
		
	}

}
