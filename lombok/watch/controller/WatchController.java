package com.xworkz.watch.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.watch.dto.WatchDTO;
import com.xworkz.watch.service.WatchService;

@Component
@RequestMapping("/")
public class WatchController {

	@Autowired
	private WatchService watchService;

	public WatchController() {
		System.out.println(this.getClass().getSimpleName()+":Created");
	}

	@RequestMapping("/xyz.done")
	public String handler1(@ModelAttribute WatchDTO watchDTO,Model model) {
		System.out.println("Invoked The Handler");

		if  (this.watchService.validateWatchDTO(watchDTO)) {
			boolean isSaved = this.watchService.saveWatchDTO(watchDTO);
			if (isSaved) {
				model.addAttribute("messageValidtion","Details is SAVED Successfully");
			}

		}else {
			Map<String, String> map1 = this.watchService.map;
			
			model.addAttribute("messageForName",map1.get("Name"));
			model.addAttribute("messageForEmail",map1.get("Email"));
			model.addAttribute("messageForAddress",map1.get("Address"));
			model.addAttribute("messageForMobile",map1.get("MobileNumber"));
		}

		return "/welcome.jsp";
	}

	@RequestMapping ("/serach.done")
	public String onSearchClick(@RequestParam String serachByName,Model model) {
		System.out.println("Invoked On Search Click");
		if (watchService.validateName(serachByName)) {
			WatchDTO getWatchDTO = this.watchService.watchDTO(serachByName); 
			if (getWatchDTO!=null) {
				model.addAttribute("ENTERID",getWatchDTO.getEnterId());
				model.addAttribute("NAME",getWatchDTO.getName());
				model.addAttribute("EMAIL",getWatchDTO.getEmail());
				model.addAttribute("ADDRESS",getWatchDTO.getAddress());
				model.addAttribute("MOBILENUMBER",getWatchDTO.getMobileNumber());
				return "/welcome.jsp";
			}else {
				model.addAttribute("serachValidationMeassge","Not Found Enter Valid Details");
				return "/welcome.jsp";
			}	
		}else {
			model.addAttribute("serachValidationMeassge","NOt Found try again");
		}


		return "/welcome.jsp";	

	}
	
}