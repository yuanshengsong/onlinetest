/**
 * 
 */
package cn.edu.nsu.InfoManagement.db.departments;

import java.sql.SQLException;

import cn.edu.nsu.InfoManagement.db.departments.Departments;
import cn.edu.nsu.InfoManagement.db.departments.DepartmentsDAO;

/**
 * @author 阿战
 *
 */
public class DepartmentsDAOTest {

	private static DepartmentsDAO departmentsDAO = new DepartmentsDAO();
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
				departmentsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(departmentsDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(departmentsDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Departments dataObj = new Departments();
		
		dataObj.setDepartments_id(1);
		dataObj.setDepartments_name("计算机科学与工程系");
		dataObj.setDepartments_TNum(25);
		dataObj.setDepartments_SNum(369);
		dataObj.setDepartments_address("C2-3楼");
		
		departmentsDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Departments dataObj = new Departments();
		
		dataObj.setDepartments_id(1);
		dataObj.setDepartments_name("信息与软件工程系");
		dataObj.setDepartments_TNum(25);
		dataObj.setDepartments_SNum(369);
		dataObj.setDepartments_address("C2-3楼");
		
		departmentsDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		departmentsDAO.delete(7);
	}
}

