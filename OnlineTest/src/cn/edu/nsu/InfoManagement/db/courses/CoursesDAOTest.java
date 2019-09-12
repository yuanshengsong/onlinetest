package cn.edu.nsu.InfoManagement.db.courses;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.courses.Courses;
import cn.edu.nsu.InfoManagement.db.courses.CoursesDAO;

public class CoursesDAOTest {

	private static CoursesDAO coursesDAO = new CoursesDAO();
	public static void main(String[] args) 
	{
		try 
		{
			getAllTest();
			//getByIdTest();
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
				coursesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(coursesDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(coursesDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Courses dataObj = new Courses();
		
		dataObj.setCourses_id(004);
		dataObj.setCourses_NO("001004");
		dataObj.setCourses_name("Linux基础");
		dataObj.setCourses_bookname("《Linux基础》");
		coursesDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Courses dataObj = new Courses();
		
		dataObj.setCourses_id(004);
		dataObj.setCourses_NO("001005");
		dataObj.setCourses_name("Linux基础");
		dataObj.setCourses_bookname("《Linux基础》");
		
		coursesDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		coursesDAO.delete(004);
	}
}
