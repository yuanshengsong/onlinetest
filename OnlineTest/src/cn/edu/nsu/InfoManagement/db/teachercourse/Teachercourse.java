package cn.edu.nsu.InfoManagement.db.teachercourse;

public class Teachercourse {


	private int teacherCourse_id;
	private int teachers_id;
	private int courses_id;
	private String teacherCourse_fromDate;
	private String teacherCourse_endDate;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(teacherCourse_id+"\t").append(teachers_id+"\t").append(courses_id+"\t").append(teacherCourse_fromDate+"\t").append(teacherCourse_endDate+"\t");
		return sb.toString();
	}
	public int getTeacherCourse_id() {
		return teacherCourse_id;
	}
	public void setTeacherCourse_id(int teacherCourse_id) {
		this.teacherCourse_id = teacherCourse_id;
	}
	public int getTeachers_id() {
		return teachers_id;
	}
	public void setTeachers_id(int teachers_id) {
		this.teachers_id = teachers_id;
	}
	public int getCourses_id() {
		return courses_id;
	}
	public void setCourses_id(int courses_id) {
		this.courses_id = courses_id;
	}
	public String getTeacherCourse_fromDate() {
		return teacherCourse_fromDate;
	}
	public void setTeacherCourse_fromDate(String teacherCourse_fromDate) {
		this.teacherCourse_fromDate = teacherCourse_fromDate;
	}
	public String getTeacherCourse_endDate() {
		return teacherCourse_endDate;
	}
	public void setTeacherCourse_endDate(String teacherCourse_endDate) {
		this.teacherCourse_endDate = teacherCourse_endDate;
	}
}
