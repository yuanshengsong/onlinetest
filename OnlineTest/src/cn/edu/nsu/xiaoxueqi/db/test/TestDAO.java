package cn.edu.nsu.xiaoxueqi.db.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import  cn.edu.nsu.xiaoxueqi.db.last.DBMain;
import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionType;


public class TestDAO extends DBMain<Test>{

	@Override
	public ArrayList<Test> getAll() throws ClassNotFoundException, SQLException {
		String sql ="SELECT * FROM test";
		pst = getPrepareStatement(sql);
		rst=pst.executeQuery();
		ArrayList<Test> test= new ArrayList<Test>();
		while(rst.next()) {
			test.add(assemble(rst));
		}
		release();
		return test;

	}

	@Override
	public Test getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM test WHERE test_id = ?";
		pst = getPrepareStatement(sql);;
		pst.setInt(1, id);
		rst = pst.executeQuery();
	    Test test = null;
		while(rst.next()) {
			test=assemble(rst);
		}
		release();
		return test;
	}

	@Override
	public void add(Test dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO test(Type_id,Subject_Id,Unit_ID,Test_Text,Test_Option,Test_Answer,Test_Score)"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getType_id());
		pst.setInt(2, dataObj.getSubject_id());
		pst.setInt(3, dataObj.getUnit_id());
		pst.setString(4, dataObj.getTest_text());
		pst.setString(5, dataObj.getTest_option());
		pst.setString(6, dataObj.getTest_answer());
		pst.setInt(7, dataObj.getType_id());
		pst.executeUpdate();
		release();
		
	}

	@Override
	public void modify(Test newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE test SET Type_id=?,Subject_Id=?,Unit_ID=?,Test_Text=?,Test_Option=?,Test_Answer=?,Test_Score=?  WHERE Test_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, newDataObj.getType_id());
		pst.setInt(2, newDataObj.getSubject_id());
		pst.setInt(3, newDataObj.getUnit_id());
		pst.setString(4, newDataObj.getTest_text());
		pst.setString(5, newDataObj.getTest_option());
		pst.setString(6, newDataObj.getTest_answer());
		pst.setInt(7, newDataObj.getTest_score());
		pst.setInt(8, newDataObj.getTest_id());
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM test WHERE test_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	    release();
	}

	@Override
	public Test assemble(ResultSet rst) throws SQLException {
		Test test=new Test();
		test.setTest_id(rst.getInt("Test_Id"));
		test.setType_id(rst.getInt("type_id"));
		test.setSubject_id(rst.getInt("subject_id"));
		test.setUnit_id(rst.getInt("unit_id"));
		test.setTest_text(rst.getString("test_text"));
		test.setTest_option(rst.getString("test_option"));
		test.setTest_answer(rst.getString("Test_Answer"));
		test.setTest_score(rst.getInt("Test_Score"));
		return test;
	}

}
