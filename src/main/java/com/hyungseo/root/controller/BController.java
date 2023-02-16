package com.hyungseo.root.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hyungseo.root.command.BCommand;
import com.hyungseo.root.command.BListCommand;
import com.hyungseo.root.command.BWriteCommand;

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
	
	@RequestMapping(value = "/writeForm")
	public String writeForm() {
		System.out.println("writeForm");
		
		return "write_form";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(Model model, HttpServletRequest request ) {
		System.out.println("write");
		
		model.addAttribute("request", request);
		bCommand = new BWriteCommand();
		bCommand.excute(model);
				
		return "redirect:list";
	}
}
