package cn.edu.nsu.InfoManagement.db.teams;

public class Teams {

	private int teams_id;
	private int departments_id;
	private String teams_name;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(teams_id+"\t").append(departments_id+"\t").append(teams_name+"\t");
		return sb.toString();
	}
	public int getTeams_id() {
		return teams_id;
	}
	public void setTeams_id(int teams_id) {
		this.teams_id = teams_id;
	}
	public int getDepartments_id() {
		return departments_id;
	}
	public void setDepartments_id(int departments_id) {
		this.departments_id = departments_id;
	}
	public String getTeams_name() {
		return teams_name;
	}
	public void setTeams_name(String teams_name) {
		this.teams_name = teams_name;
	}
}
