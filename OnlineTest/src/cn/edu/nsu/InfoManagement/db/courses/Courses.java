package cn.edu.nsu.InfoManagement.db.courses;

public class Courses {

	private int courses_id;
	private String courses_NO;
	private String courses_name;
	private String courses_bookname;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(courses_id+"\t").append(courses_NO+"\t").append(courses_name+"\t").append(courses_bookname+"\t");
		return sb.toString();
	}
	public int getCourses_id() {
		return courses_id;
	}
	public void setCourses_id(int courses_id) {
		this.courses_id = courses_id;
	}
	public String getCourses_NO() {
		return courses_NO;
	}
	public void setCourses_NO(String courses_NO) {
		this.courses_NO = courses_NO;
	}
	public String getCourses_name() {
		return courses_name;
	}
	public void setCourses_name(String courses_name) {
		this.courses_name = courses_name;
	}
	public String getCourses_bookname() {
		return courses_bookname;
	}
	public void setCourses_bookname(String courses_bookname) {
		this.courses_bookname = courses_bookname;
	}
}
