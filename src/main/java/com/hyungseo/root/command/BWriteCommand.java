package com.hyungseo.root.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.hyungseo.root.dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void excute(Model model) {
		
		Map<String, Object> map = model.asMap();	// model 객체 안에 있는 request를 map매핑
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		System.out.println(bname + btitle + bcontent);
		BDao dao = new BDao();
		
		dao.write(bname, btitle, bcontent);
		
	}

}

