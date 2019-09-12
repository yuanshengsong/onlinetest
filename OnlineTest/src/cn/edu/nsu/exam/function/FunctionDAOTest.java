package cn.edu.nsu.exam.function;

import java.sql.SQLException;
/**
 * @author YSS
 *
 */
public class FunctionDAOTest {
	private static FunctionDAO  functionDAO = new FunctionDAO();
	
	public static void main(String[] args) {
		try {
			//getAllTest();
			//getByIdTest();
			//addTest();
			//modifyTest();
			deleteTest();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				functionDAO.release();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	private static void getAllTest() throws ClassNotFoundException,SQLException{
		System.out.println(functionDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException,SQLException{
		System.out.println(functionDAO.getById(1));
	}
	private static void addTest() throws ClassNotFoundException,SQLException{
		Function dataObj = new Function();
		
		dataObj.setFunction_id(3);
//		dataObj.setRoles_id(3);
		dataObj.setFunction_name("���Թ���");
		dataObj.setFunction_URI("function");
		dataObj.setFunction_note("���Զ�ĳ�����ܽ��в���");
		
		functionDAO.add(dataObj);
	}
	private static void modifyTest() throws ClassNotFoundException,SQLException{
		Function dataObj = new Function();
		dataObj.setFunction_id(3);
		dataObj.setFunction_name("���Թ���1");
		dataObj.setFunction_URI("123");
		dataObj.setFunction_note("������Ϣ");
		
		functionDAO.modify(dataObj);
	}
	private static void deleteTest() throws ClassNotFoundException,SQLException{
		functionDAO.delete(3);
	}
	
}
























