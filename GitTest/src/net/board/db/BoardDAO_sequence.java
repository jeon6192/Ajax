package net.board.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO_sequence {
	// Data Access Object
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	
	public BoardDAO_sequence() {
		try {
			Context init=new InitialContext();
			ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
	
	public int getListCount() {
		try {
			conn=ds.getConnection();
			String sql="select count(*) from board11";
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) 
				result=rs.getInt(1);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)	rs.close();
				if(pstmt!=null)	pstmt.close();
				if(conn!=null)		conn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return result;
	}	// getListCount() -----------


	public List<BoardBean> getBoardList(int page, int limit) {
		// page : 페이지
		// limit : 페이지 당 게시글 수
		List<BoardBean> list=new ArrayList<BoardBean>();
		int startrow=(page-1)*limit+1;
		int endrow=startrow+limit-1;
		/*
			1 페이지 1 / 10
			2 페이지 11/ 20
		*/
		try {
			conn=ds.getConnection();
			String sql="select * from "
					+ "(select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, "
					+ "BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF, BOARD_RE_LEV, "
					+ "BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE from "
					+ "(select * from board11 order by BOARD_RE_REF desc, BOARD_RE_SEQ asc)) "
					+ "where rnum>=? and rnum<=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardBean board=new BoardBean();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getDate("BOARD_DATE"));
				list.add(board);
			}
			return list;
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					if(pstmt!=null)	pstmt.close();
					if(conn!=null)		conn.close();
					if(rs!=null)		rs.close();
				}catch(Exception e) {e.printStackTrace();}
			}
		
		return null;
	}	// getListCount() -----------
	
	
	public boolean boardInsert(BoardBean board) {
		boolean result2=false;
		String num="board11_seq.nextval";
		String sql="";
		try {
			conn=ds.getConnection();
			sql="insert into board11 "
					+ "(BOARD_NUM, BOARD_NAME, BOARD_PASS, BOARD_SUBJECT, "
					+ "BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF, BOARD_RE_LEV, "
					+ "BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE) "
					+ "values(board11_seq.nextval, ?, ?, ?, ?, ?, board11_seq.nextval, ?, ?, ?, sysdate)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());
			pstmt.setString(5, board.getBOARD_FILE());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 0);
			
			result=pstmt.executeUpdate();
			
			if(result==1)
				result2=true;
			else
				result2=false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)	rs.close();
				if(pstmt!=null)	pstmt.close();
				if(conn!=null)		conn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		
		return result2;
	} // boardInsert -------------
	
	
	public BoardBean getDetail(int num) {
		BoardBean board=new BoardBean();
		try {
			conn=ds.getConnection();
			String sql="select * from board11 where BOARD_NUM=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getDate("BOARD_DATE"));
				
				return board;
			}else {
				return null;
			}
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)	rs.close();
				if(pstmt!=null)	pstmt.close();
				if(conn!=null)		conn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		
		return null;
	} // getDetail --------------
	
	
	public void setReadCountUpdate(int num) {
		String sql="";
		try {
			conn=ds.getConnection();
			sql="update board11 set BOARD_READCOUNT=BOARD_READCOUNT+1 where BOARD_NUM=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)	rs.close();
				if(pstmt!=null)	pstmt.close();
				if(conn!=null)		conn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	}	// setReadCountUpdate ------------
	
	
	public int boardReply(BoardBean board) {
		String num="board11_seq.nextval";
		String sql="";
		try {
			conn=ds.getConnection();
			
			sql="update board11 "
				     + "set BOARD_RE_SEQ=BOARD_RE_SEQ + 1 "
				     + "where BOARD_RE_REF = ? "
				     + "and BOARD_RE_SEQ > ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBOARD_RE_REF());
			pstmt.setInt(2, board.getBOARD_RE_SEQ());
			result=pstmt.executeUpdate();
			
			System.out.println(result+"개 게시글 수정 완료");
			
			pstmt.close();
			
			sql="insert into board11 "
				      + "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
				      + " BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF,"
				      + " BOARD_RE_LEV, BOARD_RE_SEQ,"
				      + " BOARD_READCOUNT,BOARD_DATE) "
				      + "values(board11_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());
			pstmt.setString(5, board.getBOARD_FILE());
			pstmt.setInt(6, board.getBOARD_RE_REF());
			pstmt.setInt(7, board.getBOARD_RE_LEV()+1);
			pstmt.setInt(8, board.getBOARD_RE_SEQ()+1);
			pstmt.setInt(9, 0);
			
			result=pstmt.executeUpdate();
			
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)	rs.close();
				if(pstmt!=null)	pstmt.close();
				if(conn!=null)		conn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		
		return 0;
	} // boardReply --------
	
	
	public boolean isBoardWriter(int num, String pass) {
	      String board_sql = "select * from board11 where BOARD_NUM = ? ";
	      try {
	         conn = ds.getConnection();
	         pstmt = conn.prepareStatement(board_sql);
	         pstmt.setInt(1, num);
	         rs = pstmt.executeQuery();
	         rs.next();
	         if(pass.equals(rs.getString("BOARD_PASS"))) {
	            return true;
	         }
	      }catch(Exception e) {
	         System.out.println("isboardwriter() 에러 :" + e);
	         e.printStackTrace();
	      }finally {
	         if(rs != null) try {rs.close();}catch(SQLException ex) {ex.printStackTrace();}
	         if(pstmt != null) try {pstmt.close();}catch(SQLException ex) {ex.printStackTrace();}
	         if(conn != null) try {conn.close();}catch(SQLException ex) {ex.printStackTrace();}
	      }
	      return false;
	   } // isBoardWriter --------
	
	

	   public boolean boardModify(BoardBean modifyboard) {
	      String sql = "update board11 "
	            + "set BOARD_SUBJECT= ?, "
	            + "BOARD_CONTENT= ? "
	            + "where BOARD_NUM=? ";
	      try {
	         conn = ds.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, modifyboard.getBOARD_SUBJECT());
	         pstmt.setString(2, modifyboard.getBOARD_CONTENT());
	         pstmt.setInt(3, modifyboard.getBOARD_NUM());
	               
	         pstmt.executeUpdate();
	         
	      }catch(Exception e) {
	         System.out.println("boardmodify() 에러 :" + e);
	         e.printStackTrace();
	      }finally {
	         if(rs != null) try {rs.close();}catch(SQLException ex) {ex.printStackTrace();}
	         if(pstmt != null) try {pstmt.close();}catch(SQLException ex) {ex.printStackTrace();}
	         if(conn != null) try {conn.close();}catch(SQLException ex) {ex.printStackTrace();}
	      }
	      return true;
	   } // boardModify -------------
	   
	
	public boolean boardDelete(int num) {
		String sql="delete from board11 where BOARD_NUM=?";
		try {
	         conn = ds.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, num);
	               
	         int result=pstmt.executeUpdate();
	         
	         if(result!=0) {
	        	 System.out.println("boardDelete 성공");
	        	 return true;
	         }
	         
	      }catch(Exception e) {
	         System.out.println("boardDelete() 에러 :" + e);
	         e.printStackTrace();
	      }finally {
	         if(rs != null) try {rs.close();}catch(SQLException ex) {ex.printStackTrace();}
	         if(pstmt != null) try {pstmt.close();}catch(SQLException ex) {ex.printStackTrace();}
	         if(conn != null) try {conn.close();}catch(SQLException ex) {ex.printStackTrace();}
	      }
		return false;
	}
	
}
