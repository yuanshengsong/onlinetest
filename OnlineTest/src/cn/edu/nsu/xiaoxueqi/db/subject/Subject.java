package cn.edu.nsu.xiaoxueqi.db.subject;

public class Subject {
	private int Subject_Id;
	private String Subject_name;
	@Override
	public String toString() {
		return "Subject [Subject_Id=" + Subject_Id + ", Subject_name=" + Subject_name + "]";
	}
	public int getSubject_Id() {
		return Subject_Id;
	}
	public void setSubject_Id(int subject_Id) {
		Subject_Id = subject_Id;
	}
	public String getSubject_name() {
		return Subject_name;
	}
	public void setSubject_name(String subject_name) {
		Subject_name = subject_name;
	}
}
