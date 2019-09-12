package cn.edu.nsu.xiaoxueqi.db.questiontype;

import java.sql.SQLException;



public class QuesTypeDAOTest {
	private static QuestionTypeDAO questiontypeDAO = new QuestionTypeDAO();
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
				questiontypeDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(questiontypeDAO.getAll());
		
	}

	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(questiontypeDAO.getById(1));
		
	}

	private static void addTest() throws ClassNotFoundException, SQLException {
		QuestionType dataObj = new QuestionType();
		
		dataObj.setType_id(3);
		dataObj.setType_name("ÅÐ¶Ï");
		
		questiontypeDAO.add(dataObj);
		
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException {
		QuestionType dataObj = new QuestionType();
		
		
		dataObj.setType_name("¼ò´ð");
		dataObj.setType_id(2);
		
		questiontypeDAO.modify(dataObj);
		
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException {
		questiontypeDAO.delete(3);
		
	}
	
}
