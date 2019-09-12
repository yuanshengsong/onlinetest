package cn.edu.nsu.exam.roles;

public class Roles {
	private int roles_id;
	private String roles_name;
	private String roles_note;

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(roles_id+"\t")
		.append(roles_name+"\t").append(roles_note+"\n");
		return sb.toString();
		}
		
	public int getRoles_id() {
		return roles_id;
	}

	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}

	public String getRoles_name() {
		return roles_name;
	}

	public void setRoles_name(String roles_name) {
		this.roles_name = roles_name;
	}

	public String getRoles_note() {
		return roles_note;
	}

	public void setRoles_note(String roles_note) {
		this.roles_note = roles_note;
	}

	
	
	
	
	
	
}