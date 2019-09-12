package cn.edu.nsu.InfoManagement.db.professions;

public class Professions {
	private int professions_id;
	private int teams_id;
	private String professions_name;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(professions_id+"\t").append(teams_id+"\t").append(professions_name+"\t");
		return sb.toString();
	}
	public int getProfessions_id() {
		return professions_id;
	}
	public void setProfessions_id(int professions_id) {
		this.professions_id = professions_id;
	}
	public int getTeams_id() {
		return teams_id;
	}
	public void setTeams_id(int teams_id) {
		this.teams_id = teams_id;
	}
	public String getProfessions_name() {
		return professions_name;
	}
	public void setProfessions_name(String professions_name) {
		this.professions_name = professions_name;
	}
}
