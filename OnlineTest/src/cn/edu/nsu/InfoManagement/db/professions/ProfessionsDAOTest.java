package cn.edu.nsu.InfoManagement.db.professions;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.professions.Professions;
import cn.edu.nsu.InfoManagement.db.professions.ProfessionsDAO;

public class ProfessionsDAOTest {

	private static ProfessionsDAO professionsDAO = new ProfessionsDAO();
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
				professionsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(professionsDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(professionsDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Professions dataObj = new Professions();
		
		dataObj.setProfessions_id(4);
		dataObj.setTeams_id(1);
		dataObj.setProfessions_name("软件工程");
		professionsDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Professions dataObj = new Professions();
		
		dataObj.setProfessions_id(4);
		dataObj.setTeams_id(1);
		dataObj.setProfessions_name("软件工程2");
		
		professionsDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		professionsDAO.delete(4);
	}

}
