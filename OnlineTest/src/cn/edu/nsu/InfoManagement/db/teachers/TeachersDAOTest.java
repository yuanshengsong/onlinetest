package cn.edu.nsu.InfoManagement.db.teachers;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.teachers.Teachers;
import cn.edu.nsu.InfoManagement.db.teachers.TeachersDAO;


public class TeachersDAOTest {


	private static TeachersDAO teachersDAO = new TeachersDAO();
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
				teachersDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(teachersDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(teachersDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Teachers dataObj = new Teachers();
		
		dataObj.setTeachers_id(3);
		dataObj.setRoles_id(1);
		dataObj.setTeams_id(1);
		dataObj.setTeachers_name("小李");
		dataObj.setTeachers_photo("123");
		dataObj.setTeachers_sex("男");
		dataObj.setTeachers_profession(null);
		dataObj.setTeachers_phone("12345678901");
		dataObj.setTeachers_idNum("513030100001013327");
		dataObj.setTeachers_email("123456789@qq.com");
		dataObj.setTeachers_birth("1000-01-01");
		dataObj.setTeachers_address("四川省达州市");
		dataObj.setTeachers_room("D5-1001");
		
		teachersDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Teachers dataObj = new Teachers();
		
		dataObj.setTeachers_id(3);
		dataObj.setRoles_id(1);
		dataObj.setTeams_id(1);
		dataObj.setTeachers_name("小张");
		dataObj.setTeachers_photo("123");
		dataObj.setTeachers_sex("男");
		dataObj.setTeachers_profession(null);
		dataObj.setTeachers_phone("12345678901");
		dataObj.setTeachers_idNum("513030100001013327");
		dataObj.setTeachers_email("123456789@qq.com");
		dataObj.setTeachers_birth("1000-01-01");
		dataObj.setTeachers_address("四川省达州市");
		dataObj.setTeachers_room("D5-1001");
		
		teachersDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		teachersDAO.delete(3);
	}

}
