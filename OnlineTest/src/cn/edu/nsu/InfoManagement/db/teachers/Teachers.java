package cn.edu.nsu.InfoManagement.db.teachers;

public class Teachers {

	private int teachers_id;
	private int roles_id;
	private int teams_id;
	private String teachers_name;
	private String teachers_photo;
	private String teachers_sex;
	private String teachers_profession;
	private String teachers_phone;
	private String teachers_idNum;
	private String teachers_email;
	private String teachers_birth;
	private String teachers_address;
	private String teachers_room;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(teachers_id+"\t").append(roles_id+"\t").append(teams_id+"\t").append(teachers_name+"\t").
		append(teachers_photo+"\t").append(teachers_sex+"\t").append(teachers_profession+"\t").append(teachers_phone+"\t")
		.append(teachers_idNum+"\t").append(teachers_email+"\t").append(teachers_birth+"\t").append(teachers_address+"\t")
		.append(teachers_room+"\t");
		return sb.toString();
	}
	/**
	 * @return the teachers_id
	 */
	public int getTeachers_id() {
		return teachers_id;
	}
	/**
	 * @param teachers_id the teachers_id to set
	 */
	public void setTeachers_id(int teachers_id) {
		this.teachers_id = teachers_id;
	}
	/**
	 * @return the roles_id
	 */
	public int getRoles_id() {
		return roles_id;
	}
	/**
	 * @param roles_id the roles_id to set
	 */
	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}
	/**
	 * @return the teams_id
	 */
	public int getTeams_id() {
		return teams_id;
	}
	/**
	 * @param teams_id the teams_id to set
	 */
	public void setTeams_id(int teams_id) {
		this.teams_id = teams_id;
	}
	/**
	 * @return the teachers_name
	 */
	public String getTeachers_name() {
		return teachers_name;
	}
	/**
	 * @param teachers_name the teachers_name to set
	 */
	public void setTeachers_name(String teachers_name) {
		this.teachers_name = teachers_name;
	}
	/**
	 * @return the teachers_photo
	 */
	public String getTeachers_photo() {
		return teachers_photo;
	}
	/**
	 * @param teachers_photo the teachers_photo to set
	 */
	public void setTeachers_photo(String teachers_photo) {
		this.teachers_photo = teachers_photo;
	}
	/**
	 * @return the teachers_sex
	 */
	public String getTeachers_sex() {
		return teachers_sex;
	}
	/**
	 * @param teachers_sex the teachers_sex to set
	 */
	public void setTeachers_sex(String teachers_sex) {
		this.teachers_sex = teachers_sex;
	}
	/**
	 * @return the teachers_profession
	 */
	public String getTeachers_profession() {
		return teachers_profession;
	}
	/**
	 * @param teachers_profession the teachers_profession to set
	 */
	public void setTeachers_profession(String teachers_profession) {
		this.teachers_profession = teachers_profession;
	}
	/**
	 * @return the teachers_phone
	 */
	public String getTeachers_phone() {
		return teachers_phone;
	}
	/**
	 * @param teachers_phone the teachers_phone to set
	 */
	public void setTeachers_phone(String teachers_phone) {
		this.teachers_phone = teachers_phone;
	}
	/**
	 * @return the teachers_idNum
	 */
	public String getTeachers_idNum() {
		return teachers_idNum;
	}
	/**
	 * @param teachers_idNum the teachers_idNum to set
	 */
	public void setTeachers_idNum(String teachers_idNum) {
		this.teachers_idNum = teachers_idNum;
	}
	/**
	 * @return the teachers_email
	 */
	public String getTeachers_email() {
		return teachers_email;
	}
	/**
	 * @param teachers_email the teachers_email to set
	 */
	public void setTeachers_email(String teachers_email) {
		this.teachers_email = teachers_email;
	}
	/**
	 * @return the teachers_birth
	 */
	public String getTeachers_birth() {
		return teachers_birth;
	}
	/**
	 * @param teachers_birth the teachers_birth to set
	 */
	public void setTeachers_birth(String teachers_birth) {
		this.teachers_birth = teachers_birth;
	}
	/**
	 * @return the teachers_address
	 */
	public String getTeachers_address() {
		return teachers_address;
	}
	/**
	 * @param teachers_address the teachers_address to set
	 */
	public void setTeachers_address(String teachers_address) {
		this.teachers_address = teachers_address;
	}
	/**
	 * @return the teachers_room
	 */
	public String getTeachers_room() {
		return teachers_room;
	}
	/**
	 * @param teachers_room the teachers_room to set
	 */
	public void setTeachers_room(String teachers_room) {
		this.teachers_room = teachers_room;
	}
}
