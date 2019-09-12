package cn.edu.nsu.InfoManagement.db.grademajor;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.grademajor.GradeMajor;
import cn.edu.nsu.InfoManagement.db.grademajor.GradeMajorDAO;

public class GradeMajorDAOTest {

	private static GradeMajorDAO gradeMajorDAO = new GradeMajorDAO();
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
				gradeMajorDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(gradeMajorDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(gradeMajorDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		GradeMajor dataObj = new GradeMajor();
		
		dataObj.setGradeMajor_id(007);
		dataObj.setGrade_id(001);
		dataObj.setProfessions_id(001);
		dataObj.setGradeMajor_name("»Ìπ§“ª∞‡");
		gradeMajorDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		GradeMajor dataObj = new GradeMajor();
		
		dataObj.setGradeMajor_id(007);
		dataObj.setGrade_id(001);
		dataObj.setProfessions_id(001);
		dataObj.setGradeMajor_name("»Ìπ§2∞‡");
		
		gradeMajorDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		gradeMajorDAO.delete(007);
	}
}
