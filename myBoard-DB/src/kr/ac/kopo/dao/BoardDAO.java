package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.day.util.ConnectionFactory;
import kr.ac.kopo.vo.BoardVO;

//Data Access Object
public class BoardDAO {
	

	public void insert(BoardVO board) {
	
		StringBuilder sql = new StringBuilder();
		sql.append("insert into tbl_board(no, title, writer) ");
		sql.append(" values(seq_tbl_board_no.nextval, ?, ?) ");
		
		
		try(
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {
			    pstmt.setString(1, board.getTitle());
			    pstmt.setString(2, board.getWriter());
			    pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public List<BoardVO> selectAll() {
		
		List<BoardVO> list = new ArrayList<>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select no, title, writer, to_char(reg_date, 'yyyy-mm-dd') reg_date  ");
		sql.append(" from tbl_board ");
		
		try(
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		   ) {
		    ResultSet rs = pstmt.executeQuery();
		    
		    while(rs.next()) {
		    	int no = rs.getInt("no");
		    	String title = rs.getString("title");
		    	String writer = rs.getString("writer");
		    	String regDate = rs.getString("reg_date");
		    	
		    	BoardVO board = new BoardVO(no, title, writer, regDate);
		    	list.add(board);
		    	
		    }
		    
		} catch (Exception e) {
			e.printStackTrace();		
	    }
		return list;
	}

	public BoardVO selectOne(int no) {
		return null;
	}

	public void update(int no, String title, String writer) {
		
	}

	public void delete(int no) {
		
	}
}
