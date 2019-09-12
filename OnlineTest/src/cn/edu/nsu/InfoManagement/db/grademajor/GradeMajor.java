package cn.edu.nsu.InfoManagement.db.grademajor;

public class GradeMajor {


	private int gradeMajor_id;
	private int grade_id;
	private int professions_id;
	private String gradeMajor_name;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(gradeMajor_id+"\t").append(grade_id+"\t").append(professions_id+"\t").append(gradeMajor_name+"\t");
		return sb.toString();
	}
	public int getGradeMajor_id() {
		return gradeMajor_id;
	}
	public void setGradeMajor_id(int gradeMajor_id) {
		this.gradeMajor_id = gradeMajor_id;
	}
	public int getGrade_id() {
		return grade_id;
	}
	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}
	public int getProfessions_id() {
		return professions_id;
	}
	public void setProfessions_id(int professions_id) {
		this.professions_id = professions_id;
	}
	public String getGradeMajor_name() {
		return gradeMajor_name;
	}
	public void setGradeMajor_name(String gradeMajor_name) {
		this.gradeMajor_name = gradeMajor_name;
	}
}
