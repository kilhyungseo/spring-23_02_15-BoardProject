package com.hyungseo.root.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.hyungseo.root.dao.BDao;
import com.hyungseo.root.dto.BDto;

public class BModifyCommand implements BCommand {

	@Override
	public void excute(Model model) {
		
		Map<String, Object> map = model.asMap();	// model 객체 안에 있는 request를 map매핑
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String bid = request.getParameter("bid");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BDao dao = new BDao();
		
		dao.modify(bid, btitle, bcontent);		
		
	}

}
