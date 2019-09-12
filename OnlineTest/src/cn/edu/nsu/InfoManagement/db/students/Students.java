package cn.edu.nsu.InfoManagement.db.students;

public class Students {

	private int students_id;
	private int roles_id;
	private int Eclasses_id;
	private String students_name;
	private String students_photo;
	private String students_sex;
	private String students_phone;
	private String students_idNum;
	private String students_Email;
	private String students_birth;
	private String students_address;
	private String students_room;
	
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(students_id+"\t").append(roles_id+"\t").append(Eclasses_id+"\t").append(students_name+"\t").append(students_photo+"\t").append(students_sex+"\t")
		.append(students_phone+"\t").append(students_idNum+"\t").append(students_Email+"\t").append(students_birth+"\t").append(students_address+"\t").append(students_room+"\t");
		return sb.toString();
	}

	public int getStudents_id() {
		return students_id;
	}

	public void setStudents_id(int students_id) {
		this.students_id = students_id;
	}

	public int getRoles_id() {
		return roles_id;
	}

	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}

	public int getEclasses_id() {
		return Eclasses_id;
	}

	public void setEclasses_id(int eclasses_id) {
		Eclasses_id = eclasses_id;
	}

	public String getStudents_name() {
		return students_name;
	}

	public void setStudents_name(String students_name) {
		this.students_name = students_name;
	}

	public String getStudents_photo() {
		return students_photo;
	}

	public void setStudents_photo(String students_photo) {
		this.students_photo = students_photo;
	}

	public String getStudents_sex() {
		return students_sex;
	}

	public void setStudents_sex(String students_sex) {
		this.students_sex = students_sex;
	}

	public String getStudents_phone() {
		return students_phone;
	}

	public void setStudents_phone(String students_phone) {
		this.students_phone = students_phone;
	}

	public String getStudents_idNum() {
		return students_idNum;
	}

	public void setStudents_idNum(String students_idNum) {
		this.students_idNum = students_idNum;
	}

	public String getStudents_Email() {
		return students_Email;
	}

	public void setStudents_Email(String students_Email) {
		this.students_Email = students_Email;
	}

	public String getStudents_birth() {
		return students_birth;
	}

	public void setStudents_birth(String students_birth) {
		this.students_birth = students_birth;
	}

	public String getStudents_address() {
		return students_address;
	}

	public void setStudents_address(String students_address) {
		this.students_address = students_address;
	}

	public String getStudents_room() {
		return students_room;
	}

	public void setStudents_room(String students_room) {
		this.students_room = students_room;
	}
}
