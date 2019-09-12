package cn.edu.nsu.exam.function;

/**
 * @author YSS
 *
 */
public class Function {
	private int function_id;
	private String function_name;
	private String function_URI;
	private String function_note;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(function_id+"\t").append(function_name+"\t")
		.append(function_URI+"\t").append(function_note+"\n");
		return sb.toString();
	}
	/**
	 * @return the function_id
	 */
	public int getFunction_id() {
		return function_id;
	}
	/**
	 * @param function_id the function_id to set
	 */
	public void setFunction_id(int function_id) {
		this.function_id = function_id;
	}
	/**
	 * @return the function_name
	 */
	public String getFunction_name() {
		return function_name;
	}
	/**
	 * @param function_name the function_name to set
	 */
	public void setFunction_name(String function_name) {
		this.function_name = function_name;
	}
	/**
	 * @return the function_URI
	 */
	public String getFunction_URI() {
		return function_URI;
	}
	/**
	 * @param function_URI the function_URI to set
	 */
	public void setFunction_URI(String function_URI) {
		this.function_URI = function_URI;
	}
	/**
	 * @return the function_note
	 */
	public String getFunction_note() {
		return function_note;
	}
	/**
	 * @param function_note the function_note to set
	 */
	public void setFunction_note(String function_note) {
		this.function_note = function_note;
	}
	
	
	
	
}
