package com.hyungseo.root.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.hyungseo.root.dto.BDto;

public class BDao {
	
	DataSource dataSource;
	
	
	
	public BDao() {
		super();
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public ArrayList<BDto> list(){
		
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = dataSource.getConnection(); //dataSource로 connection 연결
			
			String sql = "select * from mvc_board ORDER BY bid DESC";
			
			pstmt = conn.prepareStatement(sql); //pstmt와 conn연결
			pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			System.out.println("안녕하세요");
			System.out.println(rs.next());
			 while(rs.next()) {//rs에 들어있는 글들의 수만큼 반복            
		            int bid = rs.getInt("bid");
		            String bname = rs.getString("bname");
		            String btitle = rs.getString("btitle");
		            String bcontent = rs.getString("bcontent");
		            Timestamp bdate = rs.getTimestamp("bdate");
		            int bhit = rs.getInt("bhit");
		            int bgroup = rs.getInt("bgroup");
		            int bstep = rs.getInt("bstep");
		            int bindent = rs.getInt("bindent");
		            System.out.println(btitle);
		            BDto dto = new BDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);
		            dtos.add(dto);
		         }
			 System.out.println("안녕하세요");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e2){
			e2.printStackTrace();	
			}
		}
		
		return dtos; 
	}
}
