package cn.edu.nsu.InfoManagement.db.tclasses;

public class Tclasses {

	private int Tclasses_id;
	private int teacherCourse_id;
	private String Tclasses_year;
	private String Tclasses_semester;
	private String Tclasses_name;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(Tclasses_id+"\t").append(teacherCourse_id+"\t").append(Tclasses_year+"\t").append(Tclasses_semester+"\t").append(Tclasses_name+"\t");
		return sb.toString();
	}
	public int getTclasses_id() {
		return Tclasses_id;
	}
	public void setTclasses_id(int tclasses_id) {
		Tclasses_id = tclasses_id;
	}
	public int getTeacherCourse_id() {
		return teacherCourse_id;
	}
	public void setTeacherCourse_id(int teacherCourse_id) {
		this.teacherCourse_id = teacherCourse_id;
	}
	public String getTclasses_year() {
		return Tclasses_year;
	}
	public void setTclasses_year(String tclasses_year) {
		Tclasses_year = tclasses_year;
	}
	public String getTclasses_semester() {
		return Tclasses_semester;
	}
	public void setTclasses_semester(String string) {
		Tclasses_semester = string;
	}
	public String getTclasses_name() {
		return Tclasses_name;
	}
	public void setTclasses_name(String tclasses_name) {
		Tclasses_name = tclasses_name;
	}
}
