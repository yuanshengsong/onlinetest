package cn.edu.nsu.xiaoxueqi.db.unit;

import java.sql.SQLException;

import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionType;
import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionTypeDAO;

public class UnitDAOTest {
	
	private static UnitDAO unitDAO = new UnitDAO();
	public static void main(String[] args) {
		try {
			//getAllTest();
			//getByIdTest();
			//addTest();
			modifyTest();
			//deleteTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				unitDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(unitDAO.getAll());
		
	}

	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(unitDAO.getById(1));
		
	}

	private static void addTest() throws ClassNotFoundException, SQLException {
		Unit dataObj = new Unit();
		
		dataObj.setUnit_ID(4);;
		dataObj.setSubject_Id(1);
		dataObj.setUnit_Number(4);
		dataObj.setUnit_name("第4单元");
		dataObj.setRemarks("");
		
		unitDAO.add(dataObj);
		
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Unit dataObj = new Unit();
		
		dataObj.setSubject_Id(1);
		dataObj.setUnit_Number(4);
		dataObj.setUnit_name("第4单元");
		dataObj.setRemarks("");
		dataObj.setUnit_ID(1);
		
		unitDAO.modify(dataObj);
		
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException {
		unitDAO.delete(4);
		
	}
	
}
