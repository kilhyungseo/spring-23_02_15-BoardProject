package com.hyungseo.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyungseo.root.command.BCommand;
import com.hyungseo.root.command.BListCommand;

@Controller
public class BController {
	
	BCommand bCommand = null;
	
	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		System.out.println("/list");
		bCommand = new BListCommand();
		bCommand.excute(model);
		
		return "list";
	}
}
