/**
 * 
 */
package cn.edu.nsu.InfoManagement.db.departments;

/**
 * @TNum °¢Õ½
 *
 */
public class Departments {
	private int departments_id;
	private String departments_name;
	private int departments_TNum;
	private int departments_SNum;
	private String departments_address;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(departments_id+"\t").append(departments_name+"\t").append(departments_TNum+"\t")
		.append(departments_SNum+"\t").append(departments_address+"\t");
		return sb.toString();
	}
	/**
	 * @return the departments_id
	 */
	public int getDepartments_id() {
		return departments_id;
	}
	/**
	 * @param departments_id the departments_id to set
	 */
	public void setDepartments_id(int departments_id) {
		this.departments_id = departments_id;
	}
	/**
	 * @return the departments_name
	 */
	public String getDepartments_name() {
		return departments_name;
	}
	/**
	 * @param departments_name the departments_name to set
	 */
	public void setDepartments_name(String departments_name) {
		this.departments_name = departments_name;
	}
	/**
	 * @return the departments_TNum
	 */
	public int getDepartments_TNum() {
		return departments_TNum;
	}
	/**
	 * @param departments_TNum the departments_TNum to set
	 */
	public void setDepartments_TNum(int departments_TNum) {
		this.departments_TNum = departments_TNum;
	}
	/**
	 * @return the departments_SNum
	 */
	public int getDepartments_SNum() {
		return departments_SNum;
	}
	/**
	 * @param departments_SNum the departments_SNum to set
	 */
	public void setDepartments_SNum(int departments_SNum) {
		this.departments_SNum = departments_SNum;
	}
	/**
	 * @return the departments_address
	 */
	public String getDepartments_address() {
		return departments_address;
	}
	/**
	 * @param departments_address the departments_address to set
	 */
	public void setDepartments_address(String departments_address) {
		this.departments_address = departments_address;
	}
	
}
