package com.hyungseo.root.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.hyungseo.root.dao.BDao;
import com.hyungseo.root.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void excute(Model model) {
		
		BDao dao = new BDao();
		
		ArrayList<BDto> dtos = dao.list();
		int bidhap = dao.hap();
		
		model.addAttribute("bidhap", bidhap);
		model.addAttribute("list", dtos);
		
	}

}
