package cn.edu.nsu.onlinetest.marking;

public class Marking 
{
	private int test_num;
	private String test_ans;
	private String test_que;
	private String test_xuan2;
	private String test_xuan1;
	private String test_xuan3;
	private String test_xuan4;
	//================================================
	
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(test_num+"\t").append(test_ans+"\t").append(test_que+"\t")
		.append(test_xuan2+"\t").append(test_xuan1+"\t").append(test_xuan3+"\t")
		.append(test_xuan4+"\t");
		return sb.toString();
	}
//	
	/**
	 * @return the users_id
	 */
	public int gettest_num() {
		return test_num;
	}
	/**
	 * @param users_id the users_id to set
	 */
	public void settest_num(int test_num) {
		this.test_num = test_num;
	}
	/**
	 * @return the roles_id
	 */

	/**
	 * @return the users_name
	 */
	public String gettest_ans() {
		return test_ans;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void settest_ans(String test_ans) {
		this.test_ans = test_ans;
	}
	/**
	 * @return the users_sex
	 */
	public String gettest_que() {
		return test_que;
	}
	/**
	 * @param users_sex the users_sex to set
	 */
	public void settest_que(String test_que) {
		this.test_que = test_que;
	}
	/**
	 * @return the users_idNum
	 */
	public String gettest_xuan2() {
		return test_xuan2;
	}
	/**
	 * @param users_idNum the users_idNum to set
	 */
	public void settest_xuan2(String test_xuan2) {
		this.test_xuan2 = test_xuan2;
	}
	public String gettest_xuan1() {
		return test_xuan1;
	}
	/**
	 * @param users_idNum the users_idNum to set
	 */
	public void settest_xuan1(String test_xuan1) {
		this.test_xuan1 = test_xuan1;
	}
	public String gettest_xuan3() {
		return test_xuan3;
	}
	/**
	 * @param users_idNum the users_idNum to set
	 */
	public void settest_xuan3(String test_xuan3) {
		this.test_xuan3 = test_xuan3;
	}
	public String gettest_xuan4() {
		return test_xuan4;
	}
	/**
	 * @param users_idNum the users_idNum to set
	 */
	public void settest_xuan4(String test_xuan4) {
		this.test_xuan4 = test_xuan4;
	}
	/**
	 * @return the users_mobile
	 */
}