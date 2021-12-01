package com.xworkz.engine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EngineTester {

	public static void main(String[] args) {


		String springConfig = "engine.xml";

		ApplicationContext springContain=new ClassPathXmlApplicationContext(springConfig);

		EngineClass engineClass=springContain.getBean(EngineClass.class);
		

		// Object obj=springContain.getBean("engineClass");
		
		System.out.println(engineClass.getClass().getSimpleName());

		System.out.println(engineClass.getCubicCapacity());
		
		EngineOil oils=springContain.getBean(EngineOil.class);
		System.out.println(oils.getBrand().concat(" ").concat(String.valueOf(oils.getGrade())).concat(" ").concat(String.valueOf(oils.getPrice())));
	

		

	}

}
