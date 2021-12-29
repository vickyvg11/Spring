package com.xworkz.watch.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class WatchController {
	
	public WatchController() {
		System.out.println(this.getClass().getSimpleName()+":Created");
	}

	@RequestMapping("/xyz.done")
	public String handler1(@RequestParam String name,@RequestParam String email,@RequestParam String address,@RequestParam int mobileNumber,@RequestParam int enterId,Model model) {
		System.out.println("Invoked The Handler");
	System.out.println("Name of The Watch"+name);
	System.out.println("Email Id"+email);
	System.out.println("Address"+address);
	System.out.println("Mobile Number"+mobileNumber);
	System.out.println("Your ID"+enterId);
	
	model.addAttribute("NAME",name);
	model.addAttribute("Email", email);
	model.addAttribute("address",address);
	model.addAttribute("mobileNumber", mobileNumber);
	model.addAttribute("enterId", enterId);
	
	return "/WEB-INF/details.jsp";
	}
}
