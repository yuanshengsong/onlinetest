package cn.edu.nsu.xiaoxueqi.db.test;

import java.sql.SQLException;

import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionType;
import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionTypeDAO;

public class TestDAOTest {
	private static TestDAO testDAO = new TestDAO();
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
				testDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(testDAO.getAll());
		
	}

	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(testDAO.getById(1));
		
	}

	private static void addTest() throws ClassNotFoundException, SQLException {
	Test dataObj = new Test();
	    dataObj.setTest_id(5);
		dataObj.setType_id(1);
		dataObj.setSubject_id(1);
		dataObj.setUnit_id(1);
		dataObj.setTest_text("3+3=");
		dataObj.setTest_option("");
		dataObj.setTest_answer("6");
		dataObj.setTest_score(2);
		
		testDAO.add(dataObj);
		
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Test dataObj = new Test();
		
		
		
		dataObj.setSubject_id(1);
		dataObj.setType_id(1);
		dataObj.setUnit_id(1);
		dataObj.setTest_text("3+4=");
		dataObj.setTest_option("");
		dataObj.setTest_answer("7");
		dataObj.setTest_score(2);
		dataObj.setTest_id(4);
		testDAO.modify(dataObj);
		
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException {
		testDAO.delete(3);
		
	}
	
}
