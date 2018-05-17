package net.member.db;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	// Data Access Object
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	
	public MemberDAO() {
		try {
			Context init=new InitialContext();
			ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		}catch(Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
	
	public int isId(String id, String pass) {
		try {
			conn=ds.getConnection();
			System.out.println("getConnection");
			
			String sql="select id, password from member where id = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				if(pass.equals(rs.getString("password"))) {
					result=1;
				}else {
					result=0;
				}
			}else {
				result=-1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)	pstmt.close();
				if(conn!=null)		conn.close();
				if(rs!=null)		rs.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		
		return result;
	} // isID
	
	public Member member_info(String id) {
		Member obj=new Member();
		try {
			conn=ds.getConnection();
			System.out.println("getConnection");
			
			String sql="select * from member where id = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				obj.setId(rs.getString(1));
				obj.setPassword(rs.getString(2));
				obj.setName(rs.getString(3));
				obj.setAge(rs.getInt(4));
				obj.setGender(rs.getString(5));
				obj.setEmail(rs.getString(6));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)	pstmt.close();
				if(conn!=null)		conn.close();
				if(rs!=null)		rs.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return obj;
	}	// member_info
	
	public List<Member> getList(){
		List<Member> list=new ArrayList<Member>();
		try {
			conn=ds.getConnection();
			String sql="select * from member";
			pstmt=conn.prepareStatement(sql);
			
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Member obj=new Member();
				obj.setId(rs.getString(1));
				obj.setPassword(rs.getString(2));
				obj.setName(rs.getString(3));
				obj.setAge(rs.getInt(4));
				obj.setGender(rs.getString(5));
				obj.setEmail(rs.getString(6));
				list.add(obj);
			}
			
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					if(pstmt!=null)	pstmt.close();
					if(conn!=null)		conn.close();
					if(rs!=null)		rs.close();
				}catch(Exception e) {e.printStackTrace();}
			}
		
		return list;
	} // getList
	
	public void delete(String id) {
		try {
			String sql="delete from member where id=?";
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					if(pstmt!=null)	pstmt.close();
					if(conn!=null)		conn.close();
					if(rs!=null)		rs.close();
				}catch(Exception e) {e.printStackTrace();}
			}
	}	// delete
	
	public int update(Member mem) {
		try {
			String sql="update member set name=?, age=?, gender=?, email=? where id=?";
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mem.getName());
			pstmt.setInt(2, mem.getAge());
			pstmt.setString(3, mem.getGender());
			pstmt.setString(4, mem.getEmail());
			pstmt.setString(5, mem.getId());
			
			result=pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)
				try{
					pstmt.close();
				}catch(Exception e){e.printStackTrace();}
			if(conn!=null)
				try{
					conn.close();
				}catch(Exception e){e.printStackTrace();}
		} 
		
		return result;
	} // update ----------------------------------
	
	
	public int insert(Member mem) {
		try {
			String sql="insert into member values(?,?,?,?,?,?)";
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPassword());
			pstmt.setString(3, mem.getName());
			pstmt.setInt(4, mem.getAge());
			pstmt.setString(5, mem.getGender());
			pstmt.setString(6, mem.getEmail());
			
			result=pstmt.executeUpdate();
			
		}catch(SQLIntegrityConstraintViolationException e1) {
			result=-1;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null)	conn.close();
			}catch(Exception e) {e.printStackTrace();}
		} 
		
		return result;
	}	// insert -----------------------
	
	public int idcheck(String id) {
		int result=0;
		System.out.println(id);
		try {
			conn=ds.getConnection();
			System.out.println("getConnection");
			
			String sql="select id from member where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next())
				result=1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)	rs.close();
				if(pstmt!=null)	pstmt.close();
				if(conn!=null)	conn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return result;
	}	// idCheck --------------------
	
}
