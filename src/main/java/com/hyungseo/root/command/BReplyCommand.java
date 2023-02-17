package com.hyungseo.root.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.hyungseo.root.dao.BDao;

public class BReplyCommand implements BCommand {

	@Override
	public void excute(Model model) {
		
		Map<String, Object> map = model.asMap();	// model 객체 안에 있는 request를 map매핑
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String bid = request.getParameter("bid");	//원글 번호
		String bname = request.getParameter("bname");	//답변자이름
		String btitle = request.getParameter("btitle");	 //답변제목
		String bcontent = request.getParameter("bcontent");	//답변내용
		String bgroup = request.getParameter("bgroup");	//원글의 그룹아이디
		String bstep = request.getParameter("bstep");	//원글의 댓글스텝
		String bindent = request.getParameter("bindent");	//댓글의 들여쓰기
		
		System.out.println(bname + btitle + bcontent);
		BDao dao = new BDao();
		
		dao.reply(bid, bname, btitle, bcontent, bgroup, bstep, bindent);
		
	}

}
