package com.xworkz.watch.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.watch.dto.WatchDTO;

@Component
@RequestMapping("/")
public class WatchController {

	public WatchController() {
		System.out.println(this.getClass().getSimpleName()+":Created");
	}

	@RequestMapping("/xyz.done")
	public String handler1(@ModelAttribute WatchDTO watchDTO,Model model) {
		System.out.println("Invoked The Handler");


		model.addAttribute("NAME",watchDTO.getName());
		model.addAttribute("Email", watchDTO.getEmail());
		model.addAttribute("address",watchDTO.getAddress());
		model.addAttribute("mobileNumber",watchDTO.getMobileNumber());
		model.addAttribute("enterId",watchDTO.getEnterId());

		return "/WEB-INF/details.jsp";
	}
}
