package cn.edu.nsu.InfoManagement.db.grade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.grade.Grade;

public class GradeDAO extends DBMain<Grade>{

	@Override
	public ArrayList<Grade> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from grade";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Grade> grades = new ArrayList<Grade>();
		 while(rst.next())
		 {
			 grades.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return grades;
	}

	@Override
	public Grade getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from grade where grade_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Grade grade = null;
		 while(rst.next())
		 {
			 grade = assemble(rst);
		 }
		//�ر�DB����
		 return grade;
	}

	public void add(Grade dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into grade(grade_name) VALUES(?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setString(1,dataObj.getGrade_name());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Grade newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update grade set grade_name = ? where grade_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setString(1, newDataObj.getGrade_name());
			pst.setInt(2, newDataObj.getGrade_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM grade WHERE grade_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	}

	@Override
	public Grade assemble(ResultSet rst) throws SQLException {

		Grade grade = new Grade();
		grade.setGrade_id(rst.getInt("grade_id"));
		grade.setGrade_name(rst.getString("grade_name"));
		return grade;
	}
}
