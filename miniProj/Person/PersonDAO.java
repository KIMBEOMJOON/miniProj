package Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PersonDAO {

	
	String url ="localhost:1521:xe";
	String id = "java";
	String pw = "java";
	
	Connection con = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	String sql = null;
	
	public PersonDAO() {
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
	public ArrayList<PersonVO> list()
	{
		ArrayList<PersonVO> res =new ArrayList<>();

		try {
			sql = "select * from person";
			stmt=con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				PersonVO vo = new PersonVO();
				
				vo.setUser_id(rs.getString("user_id"));
				vo.setUser_email(rs.getString("user_email"));
				
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
	public PersonVO detail(String user_id)
	{
		PersonVO res =null;

		try {
			sql = "select * from person where user_id = ?";
			stmt=con.prepareStatement(sql);
			stmt.setString(1, user_id);
			rs = stmt.executeQuery();
			
			if(rs.next())
			{
				res = new PersonVO();
				
				res.setUser_id(rs.getString("user_id"));
				res.setUser_email(rs.getString("user_email"));
				res.setGender(rs.getString("gender"));
				res.setBirth(rs.getDate("birth"));
				res.setPhoto(rs.getString("photo"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	//유저 등록 (회원가입)
	public void insert(PersonVO mem )
	{
		try {
			sql = "insert into person (user_id,user_pw,user_name,user_phone, gender, user_email,birth, photo,development,design,planning,specialty,location,portfoliofile) values (" 
					+"?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
			System.out.println(sql);
			stmt=con.prepareStatement(sql);
			stmt.setString(1,mem.getUser_id());
			stmt.setString(2,mem.getUser_pw());
			stmt.setString(3, mem.getUser_name());
			stmt.setString(4, mem.getUser_phone());
			stmt.setString(5, mem.getGender());
			stmt.setString(6, mem.getUser_email());
			stmt.setString(7,mem.strBirth());
			stmt.setString(8,mem.getPhoto());
			stmt.setString(9,mem.getDevelopment());
			stmt.setString(10,mem.getDesign());
			stmt.setString(11,mem.getPlanning());
			stmt.setString(12,mem.getSpecialty());
			stmt.setString(13,mem.getLocation());
			stmt.setString(14,mem.getPortfoliofile());
			System.out.println(stmt.executeUpdate());
		

	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	
	public boolean delete(PersonVO mem )
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
	
	
	public boolean modify(PersonVO mem )
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
			
		}
	
	
	public void partGrade(HashMap<String, String> hash, int[] evaluate ){
		try {
			sql = "select avg(ability),avg(social),avg(diligent),"
				+ "avg(creativity),avg(sum),avg(avg) from person_grade";
					
			System.out.println(sql);
			stmt=con.prepareStatement(sql);
			Iterator<String> iterator = hash.keySet().iterator();
		    while (iterator.hasNext()) {
		        String key = (String) iterator.next();
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
	
	public void allGrade()
	{
		ArrayList<PersonVO> res =new ArrayList<>();

		try {
			sql = "select avg(ability),avg(social),avg(diligent),"
				+ "avg(creativity),avg(sum),avg(avg) from person_grade";
			stmt=con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				PersonVO vo = new PersonVO();
				
				vo.setUser_id(rs.getString("user_id"));
				vo.setUser_email(rs.getString("user_email"));
				
				res.add(vo);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		/*return res;*/
	}
	
	
	public void close(){
		try { if(rs!=null) rs.close();} catch (SQLException e) {}
		try { if(stmt!=null) stmt.close();} catch (SQLException e) {}
		try { if(con!=null)	con.close();} catch (SQLException e) { }
	}
	
}
