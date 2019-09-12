package cn.edu.nsu.InfoManagement.db.tclassstudent;

public class Tclassstudent {

	private int TclassStudent_id;
	private int Tclasses_id;
	private int students_id;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(TclassStudent_id+"\t").append(Tclasses_id+"\t").append(students_id+"\t");
		return sb.toString();
	}
	public int getTclassStudent_id() {
		return TclassStudent_id;
	}
	public void setTclassStudent_id(int tclassStudent_id) {
		TclassStudent_id = tclassStudent_id;
	}
	public int getTclasses_id() {
		return Tclasses_id;
	}
	public void setTclasses_id(int tclasses_id) {
		Tclasses_id = tclasses_id;
	}
	public int getStudents_id() {
		return students_id;
	}
	public void setStudents_id(int students_id) {
		this.students_id = students_id;
	}
}
