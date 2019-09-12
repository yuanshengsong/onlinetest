package cn.edu.nsu.onlinetest.exam;

public class Exams 
{
	private int unit_id;
	private int score;
	private String student_name;
	private String student_id;
	private String course_name;
	private String course_id;
	private String exam_id;
	private String score_id;
	private String answer_1;
	private String answer_2;
	private String answer_3;
	private String answer_4;
	private String answer_5;
	private String answer_6;
	private String answer_7;
	private String answer_8;
	private String answer_9;
	private String answer_10;
	private String answer_11;
	private String answer_12;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(student_name+"\t").append(student_id+"\t").append(course_name+"\t")
		.append(course_id+"\t").append(unit_id+"\t").append(exam_id+"\t").append(score_id+"\t")
		.append(answer_1+"\t").append(answer_2+"\t").append(answer_3+"\t")
		.append(answer_4).append(answer_5).append(answer_6)
		.append(answer_7).append(answer_8).append(answer_9).append(answer_10).append(answer_11).append(answer_12);
		return sb.toString();
	}
	
	/**
	 * @return the users_id
	 */
	public String getstudent_name() {
		return student_name;
	}
	/**
	 * @param users_id the users_id to set
	 */
	public void setstudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @return the student_id
	 */
	public String getstudent_id() {
		return student_id;
	}
	/**
	 * @param roles_id the roles_id to set
	 */
	public void setstudent_id(String student_id) {
		this.student_id = student_id;
	}
	/**
	 * @return the users_name
	 */
	public String getcourse_name() {
		return course_name;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setcourse_name(String course_name) {
		this.course_name = course_name;
	}
	/**
	 * @return the users_sex
	 */
	public String getcourse_id() {
		return course_id;
	}
	/**
	 * @param users_sex the users_sex to set
	 */
	public void setcourse_id(String course_id) {
		this.course_id = course_id;
	}
	/**
	 * @return the users_idNum
	 */
	public int getscore() {
		return score;
	}
	public void setscore(int score) {
		// TODO Auto-generated method stub
		this.score = score;
	}	

	public int getunit_id() {
		return unit_id;
	}
	public void setunit_id(int unit_id) {
		this.unit_id = unit_id;
	}
	public String getexam_id() {
		return exam_id;
	}
	/**
	 * @param users_idNum the users_idNum to set
	 */
	public void setexam_id(String exam_id) {
		this.exam_id = exam_id;
	}
	/**
	 * @return the users_mobile
	 */
	public String getscore_id() {
		return score_id;
	}
	/**
	 * @param users_mobile the users_mobile to set
	 */
	public void setscore_id(String score_id) {
		this.score_id = score_id;
	}
	/**
	 * @return the users_address
	 */
	public String getanswer_1() {
		return answer_1;
	}
	/**
	 * @param users_address the users_address to set
	 */
	public void setanswer_1(String answer_1) {
		this.answer_1 = answer_1;
	}
	/**
	 * @return the users_postcode
	 */
	public String getanswer_2() {
		return answer_2;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_2(String answer_2) {
		this.answer_2 = answer_2;
	}
	/**
	 * @return the users_portraitImg
	 */
	public String getanswer_3() {
		return answer_3;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_3(String answer_3) {
		this.answer_3 = answer_3;
	}
	/**
	 * @return the users_password
	 */
	public String getanswer_4() {
		return answer_4;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_4(String answer_4) {
		this.answer_4 = answer_4;
	}
	public String getanswer_5() {
		return answer_5;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_5(String answer_5) {
		this.answer_5 = answer_5;
		
	}
	public String getanswer_6() {
		return answer_6;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_6(String answer_6) {
		this.answer_6 = answer_6;
	}
	public String getanswer_7() {
		return answer_7;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_7(String answer_7) {
		this.answer_7 = answer_7;
	}
	
	public String getanswer_8() {
		return answer_8;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_8(String answer_8) {
		this.answer_8 = answer_8;
	}
	public String getanswer_9() {
		return answer_9;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_9(String answer_9) {
		this.answer_9 = answer_9;
	}
	public String getanswer_10() {
		return answer_10;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_10(String answer_10) {
		this.answer_10 = answer_10;
	}
	public String getanswer_11() {
		return answer_11;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_11(String answer_11) {
		this.answer_11 = answer_11;
	}
	public String getanswer_12() {
		return answer_12;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setanswer_12(String answer_12) {
		this.answer_12 = answer_12;
	}

}