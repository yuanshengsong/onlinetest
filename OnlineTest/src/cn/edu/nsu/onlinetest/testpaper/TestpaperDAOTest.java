/**
 * 
 */
package cn.edu.nsu.onlinetest.testpaper;

import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class TestpaperDAOTest {

	private static TestpaperDAO testpaperDAO = new TestpaperDAO();
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try 
		{
			//getAllTest();
			//getByIdTest();
			addTest();
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
				testpaperDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(testpaperDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(testpaperDAO.getById("17310920235004"));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Testpaper dataObj = new Testpaper();
		
		dataObj.settestpaper_Num(4);
		dataObj.settestpaper_id("测试用户");
		dataObj.setquestion1(12);
		dataObj.setquestion2(12);
		dataObj.setquestion3(12);
		
		dataObj.setquestion4(12);
		dataObj.setquestion5(12);
		dataObj.setquestion6(12);
		dataObj.setquestion7(7);
		dataObj.setquestion8(12);
		dataObj.setquestion9(12);
		dataObj.setquestion10(12);
		testpaperDAO.add(dataObj);
	}
//
//	private static void modifyTest() throws ClassNotFoundException, SQLException
//	{
//		testpaper dataObj = new testpaper();
//		
//		dataObj.settestpaper_id(8);
//		dataObj.setRoles_id(2);
//		dataObj.settestpaper_name("测试用户");
//		dataObj.settestpaper_sex("男");
//		dataObj.settestpaper_idNum("610404197711051154");
//		dataObj.settestpaper_mobile("13668270602");
//		dataObj.settestpaper_address("成都东软学院");
//		dataObj.settestpaper_postcode("611830");
//		dataObj.settestpaper_portraitImg(null);
//		dataObj.settestpaper_password("123456");
//		
//		TestpaperDAO.modify(dataObj);
//	}
//
//	private static void deleteTest() throws ClassNotFoundException, SQLException
//	{
//		TestpaperDAO.delete(8);
//	}
}
