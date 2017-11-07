package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import Project.ProjectVO;

public class ProjectDAO {
	String url ="localhost:1521:xe";
	String id = "java";
	String pw = "java";
	
	Connection con = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	String sql = null;
	
	public ProjectDAO() {
		// TODO Auto-generated constructor stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@"+url, id, pw );
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//전체목록 불러오기
	public ArrayList<ProjectVO> list(){
		ArrayList<ProjectVO> res =new ArrayList<>();

		try {
			sql = "select * from person_grade";
			stmt=con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				ProjectVO vo = new ProjectVO
				(rs.getString("user_id"), rs.getString("p_id"), rs.getInt("ability"), 
				rs.getInt("social"), rs.getInt("diligent"), rs.getInt("creativity"), 
				rs.getInt("sum"),rs.getInt("avg"));
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
	
	//아이디로 개인정보 전체 불러오기
	public ProjectVO detail(String user_id,String p_id){
		ProjectVO res =null;
		try {
			sql = "select * from person_grade where user_id = ? and p_id = ?";
			stmt=con.prepareStatement(sql);
			stmt.setString(1, user_id);
			stmt.setString(2, p_id);
			rs = stmt.executeQuery();
			
			if(rs.next()){
				res = new ProjectVO
				(rs.getString("user_id"), rs.getString("p_id"), rs.getInt("ability"), 
				rs.getInt("social"), rs.getInt("diligent"), 
				rs.getInt("creativity"), rs.getInt("sum"),rs.getInt("avg"));
			}
			System.out.println(stmt.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
	}
	//개인 등급 db 테이블에 추가
	public void partGrade(HashMap<String, String> hash, int[] evaluate ){
		try {
			sql = "insert into Person_grade values "
					+ "(?,?,?,?,?,?,?,?)";
					
			System.out.println(sql);
			stmt=con.prepareStatement(sql);
			Iterator<String> iterator = hash.keySet().iterator();
		    while (iterator.hasNext()) {
		        String key = (String) iterator.next();
		        System.out.print("key="+key);
		        System.out.println(" value="+hash.get(key));
		        stmt.setString(1,key);
		        stmt.setString(2,hash.get(key));
		    }
			for (int i = 0; i < evaluate.length; i++) {
				stmt.setInt(i+3,evaluate[i]);
			}
			System.out.println(stmt.executeUpdate());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	/*
	public boolean delete(ProjectVO mem )
	{
		boolean res = false;
		try {
			
			sql = "delete from person where id=? and pw = ?";
			stmt=con.prepareStatement(sql);
			stmt.setString(1, mem.getUser_id());
			stmt.setString(2, mem.getUser_pw());
			
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
	
	
	public boolean modify(ProjectVO mem )
	{
		boolean res = false;
		try {
			
			sql = "update person set gender = ?, email = ? , where user_id =? and user_pw =?";
			
			stmt = con.prepareStatement(sql);
	
			stmt.setString(1,mem.getGender() );
	
			stmt.setString(3, mem.getUser_email());
	
			stmt.setString(5,mem.getUser_id());
			stmt.setString(6, mem.getUser_pw());
			
			
		
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
	
	public boolean IDChecker(String User_id){
		boolean res=false;
		try{
			
			sql = "select * from person where User_id=?";
			stmt=con.prepareStatement(sql);
			stmt.setString(1, User_id);
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
			
		}*/
	
	
	
	
	
	
	
	public void close(){
		try { if(rs!=null) rs.close();} catch (SQLException e) {}
		try { if(stmt!=null) stmt.close();} catch (SQLException e) {}
		try { if(con!=null)	con.close();} catch (SQLException e) { }
	}
}
