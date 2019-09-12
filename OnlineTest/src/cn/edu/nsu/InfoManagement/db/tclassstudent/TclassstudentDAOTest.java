package cn.edu.nsu.InfoManagement.db.tclassstudent;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.tclassstudent.Tclassstudent;
import cn.edu.nsu.InfoManagement.db.tclassstudent.TclassstudentDAO;

public class TclassstudentDAOTest {


	private static TclassstudentDAO tclassstudentDAO = new TclassstudentDAO();
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
				tclassstudentDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(tclassstudentDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(tclassstudentDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Tclassstudent dataObj = new Tclassstudent();
		
		dataObj.setTclassStudent_id(4);
		dataObj.setTclasses_id(1);
		dataObj.setStudents_id(2);
		
		tclassstudentDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Tclassstudent dataObj = new Tclassstudent();
		
		dataObj.setTclassStudent_id(4);
		dataObj.setTclasses_id(1);
		dataObj.setStudents_id(1);
		
		tclassstudentDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		tclassstudentDAO.delete(4);
	}

}
