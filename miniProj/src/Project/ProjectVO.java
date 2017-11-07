package Project;

public class ProjectVO {
	String user_id, com_id, p_id, 
	pro_subject, rank;
	int term, input_num, pro_salary,ability,social,diligent,creativity,sum,avg;
	public ProjectVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectVO(String user_id, String p_id, 
			int ability, int social, int diligent, int creativity, 
			int sum, int avg) {
		super();
		this.user_id = user_id;
		this.p_id = p_id;
		this.ability = ability;
		this.social = social;
		this.diligent = diligent;
		this.creativity = creativity;
		this.sum = sum;
		this.avg = avg;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCom_id() {
		return com_id;
	}
	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getPro_subject() {
		return pro_subject;
	}
	public void setPro_subject(String pro_subject) {
		this.pro_subject = pro_subject;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public int getInput_num() {
		return input_num;
	}
	public void setInput_num(int input_num) {
		this.input_num = input_num;
	}
	public int getPro_salary() {
		return pro_salary;
	}
	public void setPro_salary(int pro_salary) {
		this.pro_salary = pro_salary;
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
		
}