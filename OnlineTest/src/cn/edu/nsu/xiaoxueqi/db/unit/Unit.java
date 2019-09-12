package cn.edu.nsu.xiaoxueqi.db.unit;

public class Unit {
	private int Unit_ID;
	private  int Subject_Id;
	private  int Unit_Number;
	private String Unit_name;
	@Override
	public String toString() {
		return "Unit [Unit_ID=" + Unit_ID + ", Subject_Id=" + Subject_Id + ", Unit_Number=" + Unit_Number
				+ ", Unit_name=" + Unit_name + ", Remarks=" + Remarks + "]";
	}
	private String Remarks;
	public int getUnit_ID() {
		return Unit_ID;
	}
	public void setUnit_ID(int unit_ID) {
		Unit_ID = unit_ID;
	}
	public int getSubject_Id() {
		return Subject_Id;
	}
	public void setSubject_Id(int subject_Id) {
		Subject_Id = subject_Id;
	}
	public int getUnit_Number() {
		return Unit_Number;
	}
	public void setUnit_Number(int unit_Number) {
		Unit_Number = unit_Number;
	}
	public String getUnit_name() {
		return Unit_name;
	}
	public void setUnit_name(String unit_name) {
		Unit_name = unit_name;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
		
}
