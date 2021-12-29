package com.xworkz.watch;

import org.springframework.stereotype.Component;

@Component
public class Watch {
	
	public Watch() {
		
		System.out.println("Component created:"+this.getClass().getSimpleName());
	}
	

}
