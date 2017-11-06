package kbj;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FreejoinVO {

	String id, pw, gender, hobby, email, content,profilepic,oriprofilepicpic;
	
	
	

	public String getoriprofilepicpic() {
		return oriprofilepicpic;
	}

	public void setoriprofilepicpic(String oriprofilepicpic) {
		this.oriprofilepicpic = oriprofilepicpic;
	}

	public String getprofilepic() {
		return profilepic;
	}

	public void setprofilepic(String profilepic) {
		this.profilepic = profilepic;
	}

	Integer grade;
	
	Date birth, regDate;
	
	boolean Check;
	
	public boolean isCheck() {
		return Check;
	}

	public void setCheck(boolean check) {
		Check = check;
	}

	public String strRegDate()
	{
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(regDate);
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
	
	public void parseRegDate(String strRegDate)
	{
		try {
			regDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strRegDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
