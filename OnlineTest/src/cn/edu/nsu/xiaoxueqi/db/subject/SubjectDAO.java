package cn.edu.nsu.xiaoxueqi.db.subject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import  cn.edu.nsu.xiaoxueqi.db.last.DBMain;

public class SubjectDAO extends DBMain<Subject> {

	@Override
	public ArrayList<Subject> getAll() throws ClassNotFoundException, SQLException {
		String sql ="SELECT * FROM subject";
		pst = getPrepareStatement(sql);
		rst=pst.executeQuery();
		ArrayList<Subject> subject= new ArrayList<Subject>();
		while(rst.next()) {
			subject.add(assemble(rst));
		}
		release();
		return subject;
	}

	@Override
	public Subject getById(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "SELECT * FROM subject WHERE Subject_Id = ?";
		pst = getPrepareStatement(sql);;
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Subject subject = null;
		while(rst.next()) {
			subject = assemble(rst);
		}
		release();
		return subject;
	}

	@Override
	public void add(Subject dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO subject(Subject_Id,Subject_name)"
				+ "VALUES(?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getSubject_Id());
		pst.setString(2, dataObj.getSubject_name());
		pst.executeUpdate();
		release();
		
	}

	@Override
	public void modify(Subject newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE subject SET subject_name = ?  WHERE subject_Id = ?";
		pst = getPrepareStatement(sql);
		pst.setString(1, newDataObj.getSubject_name());
		pst.setInt(2, newDataObj.getSubject_Id());
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM subject WHERE subject_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

   public Subject getByName(String name) throws ClassNotFoundException, SQLException {
		
		String sql = "SELECT * FROM subject WHERE Subject_name = ?";
		pst = getPrepareStatement(sql);;
		pst.setString(1, name);
		rst = pst.executeQuery();
		Subject subject = null;
		while(rst.next()) {
			subject = assemble(rst);
		}
		release();
		return subject;
}

	
	@Override
	public Subject assemble(ResultSet rst) throws SQLException {
		Subject subject =new Subject();
		subject.setSubject_Id(rst.getInt("subject_Id"));
		subject.setSubject_name(rst.getString("subject_name"));
		return subject;
	}
	
		
	}

