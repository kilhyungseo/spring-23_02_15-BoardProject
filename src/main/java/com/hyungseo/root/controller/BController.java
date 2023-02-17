package com.hyungseo.root.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hyungseo.root.command.BCommand;
import com.hyungseo.root.command.BContentCommand;
import com.hyungseo.root.command.BDeleteCommand;
import com.hyungseo.root.command.BListCommand;
import com.hyungseo.root.command.BModifyCommand;
import com.hyungseo.root.command.BReplyCommand;
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
	@RequestMapping(value = "/contentView")
	public String contentView(HttpServletRequest request, Model model) {
		System.out.println("contentView");
		
		model.addAttribute("request", request);
		bCommand = new BContentCommand();
		bCommand.excute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value = "/modifyView")
	public String modifyView(HttpServletRequest request, Model model) {
		System.out.println("modifyView");
		
		model.addAttribute("request", request);
		bCommand = new BContentCommand();
		bCommand.excute(model);
		
		return "content_modify";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST )
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify");
		
		model.addAttribute("request", request);
		bCommand = new BModifyCommand();
		bCommand.excute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete");
		
		model.addAttribute("request", request);
		bCommand = new BDeleteCommand();
		bCommand.excute(model);
		
		return "redirect:list";
	}
	@RequestMapping(value = "/replyWrite")
	public String replyWrite(HttpServletRequest request, Model model) {
		System.out.println("replyWrite");
		
		model.addAttribute("request", request);
		bCommand = new BContentCommand();
		bCommand.excute(model);
		
		return "reply_write";
	}
	
	@RequestMapping(value = "/reply", method = RequestMethod.POST )
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply");
		
		model.addAttribute("request", request);
		bCommand = new BReplyCommand();
		bCommand.excute(model);
		
		return "redirect:list";
	}
}
