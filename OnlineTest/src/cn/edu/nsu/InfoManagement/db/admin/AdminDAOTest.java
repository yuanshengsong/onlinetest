package cn.edu.nsu.InfoManagement.db.admin;

import java.sql.SQLException;

public class AdminDAOTest {

	private static AdminDAO adminDAO = new AdminDAO();
	/**
	 * @param args
	 */
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
				adminDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(adminDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(adminDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Admin dataObj = new Admin();

		dataObj.setRoles_id(2);
		dataObj.setAdmin_name("admin2");
		dataObj.setAdmin_phoneNum("13461214398");
		dataObj.setAdmin_room("C2-312");
		
		adminDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Admin dataObj = new Admin();

		dataObj.setAdmin_id(2);
		dataObj.setRoles_id(1);
		dataObj.setAdmin_name("admin2");
		dataObj.setAdmin_phoneNum("13461214398");
		dataObj.setAdmin_room("C2-312");
	
		adminDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		adminDAO.delete(2);
	}
}
