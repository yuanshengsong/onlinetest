package cn.edu.nsu.InfoManagement.db.eclasses;

public class Eclasses {
	private int Eclasses_id;
	private int teachers_id;
	private int gradeMajor_id;
	private String Eclasses_grade;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(Eclasses_id+"\t").append(teachers_id+"\t").append(gradeMajor_id+"\t").append(Eclasses_grade+"\t");
		return sb.toString();
	}
	public int getEclasses_id() {
		return Eclasses_id;
	}
	public void setEclasses_id(int eclasses_id) {
		Eclasses_id = eclasses_id;
	}
	public int getTeachers_id() {
		return teachers_id;
	}
	public void setTeachers_id(int teachers_id) {
		this.teachers_id = teachers_id;
	}
	public int getGradeMajor_id() {
		return gradeMajor_id;
	}
	public void setGradeMajor_id(int gradeMajor_id) {
		this.gradeMajor_id = gradeMajor_id;
	}
	public String getEclasses_grade() {
		return Eclasses_grade;
	}
	public void setEclasses_grade(String eclasses_grade) {
		Eclasses_grade = eclasses_grade;
	}
}
