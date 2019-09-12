package cn.edu.nsu.xiaoxueqi.db.test;

public class Test {
	private int test_id;
	private  int type_id;
	private  int subject_id;
	private  int unit_id;
    private String test_text;
	private String test_option;
	private String test_answer;
	private  int test_score;
	@Override
	public String toString() {
		return "Test [Test_Id=" + test_id + ", Type_id=" + type_id + ", Subject_Id=" + subject_id + ", Unit_ID="
				+ unit_id + ", Test_Text=" + test_text + ", Test_Option=" + test_option + ", Test_Answer=" + test_answer
				+ ", Test_Score=" + test_score + "]";
	}
	public int getTest_id() {
		return test_id;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}
	public String getTest_text() {
		return test_text;
	}
	public void setTest_text(String test_text) {
		this.test_text = test_text;
	}
	public String getTest_option() {
		return test_option;
	}
	public void setTest_option(String test_option) {
		this.test_option = test_option;
	}
	public String getTest_answer() {
		return test_answer;
	}
	public void setTest_answer(String test_answer) {
		this.test_answer = test_answer;
	}
	public int getTest_score() {
		return test_score;
	}
	public void setTest_score(int test_score) {
		this.test_score = test_score;
	}
	
	
	
}
