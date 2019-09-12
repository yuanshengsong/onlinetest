/**
 * 
 */
package cn.edu.nsu.onlinetest.marking;

import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class MarkingDAOTest {

	private static MarkingDAO markingDAO = new MarkingDAO();
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
				markingDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(markingDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(markingDAO.getById("17"));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
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
//		MarkingDAO.modify(dataObj);
//	}
//
//	private static void deleteTest() throws ClassNotFoundException, SQLException
//	{
//		MarkingDAO.delete(8);
//	}
}
