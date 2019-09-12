package cn.edu.nsu.xiaoxueqi.db.subject;

import java.sql.SQLException;



public class SubjectDAOTest {

	private static SubjectDAO subjectDAO = new SubjectDAO();
	public static void main(String[] args) {
		try {
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
		} finally {
			try {
				subjectDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(subjectDAO.getAll());
		
	}

	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(subjectDAO.getById(1));
		
	}

	private static void addTest() throws ClassNotFoundException, SQLException {
		Subject dataObj = new Subject();
		
		dataObj.setSubject_Id(3);
		dataObj.setSubject_name("地理");
		
		subjectDAO.add(dataObj);
		
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Subject dataObj = new Subject();
		
		
		dataObj.setSubject_name("数据库");
		dataObj.setSubject_Id(2);
		
		subjectDAO.modify(dataObj);
		
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException {
		subjectDAO.delete(6);
		
	}
	
}
