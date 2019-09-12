package cn.edu.nsu.InfoManagement.db.userroles;

public class Userroles {
	private int userroles_id;
	private int users_id;
	private int roles_id;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(userroles_id+"\t").append(users_id+"\t").append(roles_id+"\t");
		return sb.toString();
	}
	/**
	 * @return the userroles_id
	 */
	public int getUserroles_id() {
		return userroles_id;
	}
	/**
	 * @param userroles_id the userroles_id to set
	 */
	public void setUserroles_id(int userroles_id) {
		this.userroles_id = userroles_id;
	}
	/**
	 * @return the users_id
	 */
	public int getUsers_id() {
		return users_id;
	}
	/**
	 * @param users_id the users_id to set
	 */
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
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
}

