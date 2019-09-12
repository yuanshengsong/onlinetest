package cn.edu.nsu.InfoManagement.db.teams;

import java.sql.SQLException;

public class TeamsDAOTest {

	private static TeamsDAO teamsDAO = new TeamsDAO();
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
				teamsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(teamsDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(teamsDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Teams dataObj = new Teams();
		
		dataObj.setDepartments_id(1);
		dataObj.setTeams_name("信息工程团队");
		
		teamsDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Teams dataObj = new Teams();
		
		dataObj.setDepartments_id(1);
		dataObj.setTeams_name("软件工程团队");
		
		teamsDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		teamsDAO.delete(4);
	}
}
