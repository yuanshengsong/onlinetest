/**
 * 
 */
package cn.edu.nsu.onlinetest.exam;

import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class ExamsDAOTest {

	private static ExamsDAO examsDAO = new ExamsDAO();
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try 
		{
			//getAllTest();
			getByIdTest();
			//addTest();
			//modifyTest();
			//deleteTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				examsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(examsDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(examsDAO.getById("611830"));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Exams dataObj = new Exams();
		
		dataObj.setunit_id(4);
		dataObj.setstudent_name("测试用户");
		dataObj.setstudent_id("1008611");
		dataObj.setcourse_name("610");
		dataObj.setcourse_id("13668270602");
		dataObj.setexam_id("都江堰");
		dataObj.setscore_id("611830");
		dataObj.setanswer_1(null);
		dataObj.setanswer_2("123456");
		dataObj.setanswer_3("123456");
		dataObj.setanswer_4("123456");
		dataObj.setanswer_5("123456");
		dataObj.setanswer_6("123456");
		dataObj.setanswer_7("123456");
		dataObj.setanswer_8("123456");
		dataObj.setanswer_9("123456");
		dataObj.setanswer_10("123456");
		dataObj.setanswer_11("123456");
		dataObj.setanswer_12("123456");
		dataObj.setscore(90);
		examsDAO.add(dataObj);
	}
//
//	private static void modifyTest() throws ClassNotFoundException, SQLException
//	{
//		Exams dataObj = new Exams();
//		
//		dataObj.setExams_id(8);
//		dataObj.setRoles_id(2);
//		dataObj.setExams_name("测试用户");
//		dataObj.setExams_sex("男");
//		dataObj.setExams_idNum("610404197711051154");
//		dataObj.setExams_mobile("13668270602");
//		dataObj.setExams_address("成都东软学院");
//		dataObj.setExams_postcode("611830");
//		dataObj.setExams_portraitImg(null);
//		dataObj.setExams_password("123456");
//		
//		ExamsDAO.modify(dataObj);
//	}
//
//	private static void deleteTest() throws ClassNotFoundException, SQLException
//	{
//		ExamsDAO.delete(8);
//	}
}
