package cn.edu.nsu.InfoManagement.db.tclasses;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.tclasses.Tclasses;
import cn.edu.nsu.InfoManagement.db.tclasses.TclassesDAO;;

public class TclassesDAOTest {


	private static TclassesDAO tclassesDAO = new TclassesDAO();
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
				tclassesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(tclassesDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(tclassesDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Tclasses dataObj = new Tclasses();
		
		dataObj.setTclasses_id(1);
		dataObj.setTeacherCourse_id(1);
		dataObj.setTclasses_year("2017-2018学年");
		dataObj.setTclasses_semester("第2学期");
		dataObj.setTclasses_name("javaweb");
		tclassesDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Tclasses dataObj = new Tclasses();
		
		dataObj.setTclasses_id(4);
		dataObj.setTeacherCourse_id(1);
		dataObj.setTclasses_year("2017-2018学年");
		dataObj.setTclasses_semester("第3学期");
		dataObj.setTclasses_name("javaweb");
		tclassesDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		tclassesDAO.delete(5);
	}

}
