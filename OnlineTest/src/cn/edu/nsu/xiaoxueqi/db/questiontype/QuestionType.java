package cn.edu.nsu.xiaoxueqi.db.questiontype;

public class QuestionType {
	private int Type_id;
	private String Type_name;
	@Override
	public String toString() {
		return "Questiontype [Type_id=" + Type_id + ", Type_name=" + Type_name + "]";
	}
	public int getType_id() {
		return Type_id;
	}
	public void setType_id(int type_id) {
		Type_id = type_id;
	}
	public String getType_name() {
		return Type_name;
	}
	public void setType_name(String type_name) {
		Type_name = type_name;
	}
}
