package cn.edu.nsu.InfoManagement.db.userroles;

import java.sql.SQLException;

public class UserrolesDAOTest {

	private static UserrolesDAO userrolesDAO = new UserrolesDAO();
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
				userrolesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(userrolesDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(userrolesDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Userroles dataObj = new Userroles();
		
		dataObj.setUserroles_id(1);
		dataObj.setUsers_id(1);
		dataObj.setRoles_id(1);
		
		userrolesDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Userroles dataObj = new Userroles();
		
		dataObj.setUserroles_id(1);
		dataObj.setUsers_id(1);
		dataObj.setRoles_id(3);
		
		userrolesDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		userrolesDAO.delete(5);
	}
}
