package Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import Project.ProjectVO;

public class PersonVO {
	private String 
	user_id, user_pw, user_name, gender,
	user_phone, user_email, photo, 
	development, design, planning, specialty, 
	location, portfoliofile, user_emblem, user_grade, p_id;
	HashMap<String, String> user_proj = new HashMap<>();
	private Date birth;
	private int ability,social, diligent, creativity, user_sum, user_avg;
	public int[] evaluate= new int[6];//evaluate는 dao에 없지만 메소드때문에 만듬
	
	//디폴트 생성자
	public PersonVO() {}
	
	//회원 가입시 필요한 생성자
	public PersonVO(String user_id, String user_pw, String user_name, String gender, String user_phone,
			String user_email, String photo, String development, String design, String planning, String specialty,
			String location, String portfoliofile, Date birth) {
		
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.gender = gender;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.photo = photo;
		this.development = development;
		this.design = design;
		this.planning = planning;
		this.specialty = specialty;
		this.location = location;
		this.portfoliofile = portfoliofile;
		this.birth = birth;
	}
	//점수 받아올 때
	public PersonVO(int ability, int social, int diligent, int creativity) {
		
		calculate();
		this.user_sum = user_sum;
		this.user_avg = user_avg;
	}
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDevelopment() {
		return development;
	}

	public void setDevelopment(String development) {
		this.development = development;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getPlanning() {
		return planning;
	}

	public void setPlanning(String planning) {
		this.planning = planning;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPortfoliofile() {
		return portfoliofile;
	}

	public void setPortfoliofile(String portfoliofile) {
		this.portfoliofile = portfoliofile;
	}

	public HashMap<String, String> getUser_proj() {
		return user_proj;
	}

	public void setUser_proj(String user_name, String p_id) {
		
		this.user_proj.put(user_name, p_id);
	}

	public String getUser_emblem() {
		return user_emblem;
	}

	public void setUser_emblem(String user_emblem) {
		this.user_emblem = user_emblem;
	}

	public String getUser_grade() {
		return user_grade;
	}

	public void setUser_grade(String user_grade) {
		this.user_grade = user_grade;
	}

	public int getAbility() {
		return ability;
	}

	public void setAbility(int ability) {
		this.ability = ability;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public int getDiligent() {
		return diligent;
	}

	public void setDiligent(int diligent) {
		this.diligent = diligent;
	}

	public int getCreativity() {
		return creativity;
	}

	public void setCreativity(int creativity) {
		this.creativity = creativity;
	}

	public int getUser_sum() {
		return user_sum;
	}

	public void setUser_sum(int user_sum) {
		this.user_sum = user_sum;
	}

	public int getUser_avg() {
		return user_avg;
	}

	public void setUser_avg(int user_avg) {
		this.user_avg = user_avg;
	}

	public int[] getEvaluate() {
		return evaluate;
	}

	public void setEvaluate(int[] evaluate) {
		this.evaluate = evaluate;
	}

	private void calculate() {
		for (int i : evaluate) {
			user_sum+=i;
		}
		user_avg = user_sum/evaluate.length;
	}
	
	public String strBirth()
	{
		return new SimpleDateFormat("yyyy-MM-dd").format(birth);
	}
	
	public void parseBirth(String strBirth)
	{
		try {
			birth = new SimpleDateFormat("yyyy-MM-dd").parse(strBirth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
