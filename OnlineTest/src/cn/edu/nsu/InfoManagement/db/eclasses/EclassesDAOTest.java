package cn.edu.nsu.InfoManagement.db.eclasses;

import java.sql.SQLException;

public class EclassesDAOTest {

	private static EclassesDAO eclassesDAO = new EclassesDAO();
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
				eclassesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(eclassesDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(eclassesDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Eclasses dataObj = new Eclasses();

		dataObj.setTeachers_id(2);
		dataObj.setGradeMajor_id(1);
		dataObj.setEclasses_grade("2017¼¶");
		
		eclassesDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Eclasses dataObj = new Eclasses();
		dataObj.setEclasses_id(1);
		dataObj.setTeachers_id(2);
		dataObj.setGradeMajor_id(1);
		dataObj.setEclasses_grade("2017¼¶");
		
		eclassesDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		eclassesDAO.delete(3);
	}
}