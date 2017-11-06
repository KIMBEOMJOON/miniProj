package kbj;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class FreejoinDAO {

	Connection con = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	String sql = null;
	
	public FreejoinDAO() {
		// TODO Auto-generated constructor stub
		
		try {
			Context init =  new InitialContext();
			Context env = (Context)init.lookup("java:/comp/env");
			DataSource ds = (DataSource)env.lookup("jdbc/OracleDB");
			con = ds.getConnection();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public ArrayList<FreejoinVO> list()
	{
		ArrayList<FreejoinVO> res =new ArrayList<>();

		try {
			sql = "select * from memeber";
			stmt=con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				FreejoinVO vo = new FreejoinVO();
				
				vo.setId(rs.getString("id"));
				vo.setEmail(rs.getString("email"));
				
				res.add(vo);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	
	public FreejoinVO detail(String id)
	{
		FreejoinVO res =null;

		try {
			sql = "select * from memeber where id = ?";
			stmt=con.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next())
			{
				res = new FreejoinVO();
				
				res.setId(rs.getString("id"));
				res.setEmail(rs.getString("email"));
				res.setGender(rs.getString("gender"));
				res.setHobby(rs.getString("hobby"));
				res.setContent(rs.getString("content"));
				res.setRegDate(rs.getTimestamp("reg_date"));
				res.setBirth(rs.getDate("birth"));
				res.setGrade(rs.getInt("grade"));
				res.setProfile(rs.getString("profile"));
				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	public void insert(FreejoinVO mem )
	{
		try {
			
			sql = "insert into memeber (id, pw, gender, hobby, email, content, birth, reg_date, grade, profile, oriprofile) values (" 
					+"?,?,?,?,?,?,?,sysdate,?,?,?)";
					
			System.out.println(sql);
			stmt=con.prepareStatement(sql);
			stmt.setString(1,mem.getId());
			stmt.setString(2,mem.getPw() );
			stmt.setString(3, mem.getGender());
			stmt.setString(4,mem.getHobby() );
			stmt.setString(5, mem.getEmail());
			stmt.setString(6, mem.getContent());
			stmt.setString(7, mem.strBirth());
			//stmt.setString(8,mem.strRegDate());
			stmt.setInt(8,mem.getGrade() );
			stmt.setString(9,mem.getProfile() );
			stmt.setString(10,mem.getOriprofile() );
			System.out.println(stmt.executeUpdate());
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	
	public boolean delete(FreejoinVO mem )
	{
		boolean res = false;
		try {
			
			sql = "delete from memeber where id=? and pw = ?";
			stmt=con.prepareStatement(sql);
			stmt.setString(1, mem.getId());
			stmt.setString(2, mem.getPw());
			
			System.out.println(sql);
			if(stmt.executeUpdate()>0)
				res = true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
	}
	
	
	public boolean modify(FreejoinVO mem )
	{
		boolean res = false;
		try {
			
			sql = "update memeber set gender = ?, hobby = ?, email = ? ,content = ? where id =? and pw =?";
			
			stmt = con.prepareStatement(sql);
	
			stmt.setString(1,mem.getGender() );
			stmt.setString(2,mem.getHobby() );
			stmt.setString(3, mem.getEmail());
			stmt.setString(4, mem.getContent());
			stmt.setString(5,mem.getId());
			stmt.setString(6, mem.getPw());
			
			
		
			System.out.println(sql);
			if(stmt.executeUpdate()>0)
				res = true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
	}
	
	public boolean IDChecker(String id){
		boolean res=false;
		try{
			
			sql = "select * from memeber where id=?";
			stmt=con.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()){
				res= true;
				System.out.println(res);
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close();
			
			}
			return res;
			
		}
	
	
	
	
	public void close()
	{
		try { if(rs!=null) rs.close();} catch (SQLException e) {}
		try { if(stmt!=null) stmt.close();} catch (SQLException e) {}
		try { if(con!=null)	con.close();} catch (SQLException e) { }
	}
	
}
