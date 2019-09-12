package cn.edu.nsu.exam.admin;

public class Admin {
	private int admin_id;
	private int roles_id;
	private String admin_name;
	private String admin_phoneNum;
	private String admin_room;
	
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(admin_id+"\t").append(roles_id+"\t").append(admin_name+"\t")
		.append(admin_phoneNum+"\t").append(admin_room+"\t");
		return sb.toString();
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public int getRoles_id() {
		return roles_id;
	}

	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_phoneNum() {
		return admin_phoneNum;
	}

	public void setAdmin_phoneNum(String admin_phoneNum) {
		this.admin_phoneNum = admin_phoneNum;
	}

	public String getAdmin_room() {
		return admin_room;
	}

	public void setAdmin_room(String admin_room) {
		this.admin_room = admin_room;
	}
	
	
}

