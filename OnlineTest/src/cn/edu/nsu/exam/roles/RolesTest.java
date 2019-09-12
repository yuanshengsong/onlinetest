package cn.edu.nsu.exam.roles;

import java.sql.SQLException;

public class RolesTest {
	
	private static RolesDAO rolesDAO = new RolesDAO();
	
	public static void main(String[] args) {
		try 
		{
			//getAllTest();
			//getByIdTest();
			//addTest();
			//modifyTest();
			deleteTest();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rolesDAO.release();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		


		}

	private static void getAllTest() throws ClassNotFoundException,SQLException{
		System.out.println(rolesDAO.getAll());
	}
	private static void getByIdTest() throws ClassNotFoundException,SQLException{
		System.out.println(rolesDAO.getById(1));
	}
	private static void addTest() throws ClassNotFoundException, SQLException {
		Roles dataObj = new Roles();
		dataObj.setRoles_name("����Ȩ��");
		dataObj.setRoles_note("�鿴�Ͳ���");
		
		rolesDAO.add(dataObj);
	}
	
	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Roles dataObj = new Roles();
		dataObj.setRoles_id(3);
		dataObj.setRoles_name("ϵ������");
		dataObj.setRoles_note("�鿴�Ͳ���");
		
		rolesDAO.modify(dataObj);
	}
	
	private static void deleteTest() throws ClassNotFoundException, SQLException {
		rolesDAO.delete(3);
	}
	
}
