package cn.edu.nsu.onlinetest.testpaper;

public class Testpaper 
{
	private int testpaper_num;
	private String testpaper_id;
	private int question10;
	private int question9;
	private int question8;
	private int question7;
	private int question6;
	private int question5;
	private int question4;
	private int question3;
	private int question2;
	private int question1;
	
	//================================================
	
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(testpaper_num+"\t").append(testpaper_id+"\t").append(question10+"\t")
		.append(question9+"\t").append(question8+"\t").append(question7+"\t")
		.append(question6+"\t").append(question5+"\t").append(question4+"\t").append(question3+"\t").append(question2+"\t").append(question1+"\t");
		return sb.toString();
	}
//	
	/**
	 * @return the users_id
	 */
	public int gettestpaper_Num() {
		return testpaper_num;
	}
	/**
	 * @param users_id the users_id to set
	 */
	public void settestpaper_Num(int testpaper_num) {
		this.testpaper_num = testpaper_num;
	}
	/**
	 * @return the roles_id
	 */
public String gettestpaper_id()
{
	return testpaper_id;
}
public void settestpaper_id(String testpaper_id) {
	this.testpaper_id=testpaper_id;
}
	/**
	 * @return the users_name
	 */
	public int getquestion1() {
		return question1;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion1(int question1) {
		this.question1 = question1;
	}
	public int getquestion2() {
		return question2;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion2(int question2) {
		this.question2 = question2;
	}
	public int getquestion3() {
		return question3;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion3(int question3) {
		this.question3 = question3;
	}
	public int getquestion4() {
		return question4;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion4(int question4) {
		this.question4 = question4;
	}
	public int getquestion5() {
		return question5;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion5(int question5) {
		this.question5 = question5;
	}
	public int getquestion6() {
		return question6;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion6(int question6) {
		this.question6 = question6;
	}
	public int getquestion7() {
		return question7;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion7(int question7) {
		this.question7 = question7;
	}
	public int getquestion8() {
		return question8;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion8 (int question8) {
		this.question8 = question8;
	}
	public int getquestion9() {
		return question9;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion9(int question9) {
		this.question9 = question9;
	}
	public int getquestion10() {
		return question10;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setquestion10(int question10) {
		this.question10 = question10;
	}
}