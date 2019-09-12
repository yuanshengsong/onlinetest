package cn.edu.nsu.InfoManagement.db.students;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.students.Students;
import cn.edu.nsu.InfoManagement.db.students.StudentsDAO;

public class StudentsDAOTest {


	private static StudentsDAO studentsDAO = new StudentsDAO();
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
				studentsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(studentsDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(studentsDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Students dataObj = new Students();
		
		dataObj.setStudents_id(3);
		dataObj.setRoles_id(1);
		dataObj.setEclasses_id(1);
		dataObj.setStudents_name("小李");
		dataObj.setStudents_photo("123");
		dataObj.setStudents_sex("男");
		dataObj.setStudents_phone("12345678901");
		dataObj.setStudents_idNum("513030100001013327");
		dataObj.setStudents_Email("123456789@qq.com");
		dataObj.setStudents_birth("1000-01-01");
		dataObj.setStudents_address("四川省达州市");
		dataObj.setStudents_room("D5-1001");
		studentsDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Students dataObj = new Students();
		
		dataObj.setStudents_id(3);
		dataObj.setRoles_id(1);
		dataObj.setEclasses_id(1);
		dataObj.setStudents_name("小张");
		dataObj.setStudents_photo("123");
		dataObj.setStudents_sex("男");
		dataObj.setStudents_phone("12345678901");
		dataObj.setStudents_idNum("513030100001013327");
		dataObj.setStudents_Email("123456789@qq.com");
		dataObj.setStudents_birth("1000-01-01");
		dataObj.setStudents_address("四川省达州市");
		dataObj.setStudents_room("D5-1001");
		
		studentsDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		studentsDAO.delete(3);
	}

}
