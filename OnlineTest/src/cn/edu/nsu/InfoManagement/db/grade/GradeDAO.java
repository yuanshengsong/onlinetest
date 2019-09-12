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

		//封装SQL
		String sql = "select * from grade";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Grade> grades = new ArrayList<Grade>();
		 while(rst.next())
		 {
			 grades.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return grades;
	}

	@Override
	public Grade getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from grade where grade_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Grade grade = null;
		 while(rst.next())
		 {
			 grade = assemble(rst);
		 }
		//关闭DB连接
		 return grade;
	}

	public void add(Grade dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into grade(grade_name) VALUES(?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setString(1,dataObj.getGrade_name());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Grade newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update grade set grade_name = ? where grade_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setString(1, newDataObj.getGrade_name());
			pst.setInt(2, newDataObj.getGrade_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM grade WHERE grade_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Grade assemble(ResultSet rst) throws SQLException {

		Grade grade = new Grade();
		grade.setGrade_id(rst.getInt("grade_id"));
		grade.setGrade_name(rst.getString("grade_name"));
		return grade;
	}
}
