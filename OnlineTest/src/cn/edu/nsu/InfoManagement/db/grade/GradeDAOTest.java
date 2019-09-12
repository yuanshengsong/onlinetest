package cn.edu.nsu.InfoManagement.db.grade;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.grade.GradeDAO;
import cn.edu.nsu.InfoManagement.db.grade.Grade;

public class GradeDAOTest {

	private static GradeDAO gradeDAO = new GradeDAO();
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
				gradeDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(gradeDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(gradeDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Grade dataObj = new Grade();
		
		dataObj.setGrade_id(004);
		dataObj.setGrade_name("2017Äê");
		gradeDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Grade dataObj = new Grade();
		
		dataObj.setGrade_id(004);
		dataObj.setGrade_name("2018Äê");
		
		gradeDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		gradeDAO.delete(004);
	}

}
