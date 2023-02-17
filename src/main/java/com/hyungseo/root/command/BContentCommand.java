package com.hyungseo.root.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.hyungseo.root.dao.BDao;
import com.hyungseo.root.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void excute(Model model) {
		
		Map<String, Object> map = model.asMap();	// model 객체 안에 있는 request를 map매핑
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String bid = request.getParameter("bid");
		
		BDao dao = new BDao();
		
		BDto dto = dao.contentView(bid);
		
		model.addAttribute("contentDto", dto);
		
		
	}

}
