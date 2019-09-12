package cn.edu.nsu.xiaoxueqi.db.questiontype;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.xiaoxueqi.db.last.DBMain;
import  cn.edu.nsu.xiaoxueqi.db.subject.Subject;


public class QuestionTypeDAO extends DBMain<QuestionType>{

	@Override
	public ArrayList<QuestionType> getAll() throws ClassNotFoundException, SQLException {
		String sql ="SELECT * FROM questiontype";
		pst = getPrepareStatement(sql);
		rst=pst.executeQuery();
		ArrayList<QuestionType> questiontype= new ArrayList<QuestionType>();
		while(rst.next()) {
			questiontype.add(assemble(rst));
		}
       	release();
		return questiontype;
	}

	@Override
	public QuestionType getById(int id) throws ClassNotFoundException, SQLException {

		String sql = "SELECT * FROM questiontype WHERE Type_id = ?";
		pst = getPrepareStatement(sql);;
		pst.setInt(1, id);
		rst = pst.executeQuery();
		QuestionType questiontype = null;
		while(rst.next()) {
			questiontype = assemble(rst);
		}
		release();
		return questiontype;
	}
	
	
	public QuestionType getByName(String name) throws ClassNotFoundException, SQLException {

		String sql = "SELECT * FROM questiontype WHERE Type_name= ?";
		pst = getPrepareStatement(sql);;
		pst.setString(1, name);
		rst = pst.executeQuery();
		QuestionType questiontype = null;
		while(rst.next()) {
			questiontype = assemble(rst);
		}
		release();
		return questiontype;
	}


	@Override
	public void add(QuestionType dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO questiontype(Type_id,Type_name)"
				+ "VALUES(?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getType_id());
		pst.setString(2, dataObj.getType_name());
		pst.executeUpdate();
		release();
		
	}

	@Override
	public void modify(QuestionType newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE questiontype SET Type_name = ?  WHERE Type_id = ?";
		pst = getPrepareStatement(sql);
		pst.setString(1, newDataObj.getType_name());
		pst.setInt(2, newDataObj.getType_id());
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM questiontype WHERE Type_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	@Override
	public QuestionType assemble(ResultSet rst) throws SQLException {
		QuestionType questiontype=new QuestionType();
		questiontype.setType_id(rst.getInt("type_id"));
		questiontype.setType_name(rst.getString("type_name"));
		return questiontype;
	}

}
