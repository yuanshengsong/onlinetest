package cn.edu.nsu.InfoManagement.db.teachercourse;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.teachercourse.Teachercourse;
import cn.edu.nsu.InfoManagement.db.teachercourse.TeachercourseDAO;

public class TeachercourseDAOTest {


	private static TeachercourseDAO teachercourseDAO = new TeachercourseDAO();
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
				teachercourseDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(teachercourseDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(teachercourseDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Teachercourse dataObj = new Teachercourse();
		
		dataObj.setTeacherCourse_id(1);
		dataObj.setTeachers_id(1);
		dataObj.setCourses_id(2);
		dataObj.setTeacherCourse_fromDate("2019/3/15");
		dataObj.setTeacherCourse_endDate("2019/6/16");
		teachercourseDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Teachercourse dataObj = new Teachercourse();
		
		dataObj.setTeacherCourse_id(10);
		dataObj.setTeachers_id(1);
		dataObj.setCourses_id(2);
		dataObj.setTeacherCourse_fromDate("2019/3/5");
		dataObj.setTeacherCourse_endDate("2019/6/6");
		teachercourseDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		teachercourseDAO.delete(10);
	}

}
