package cn.edu.nsu.InfoManagement.db.courses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.courses.Courses;

public class CoursesDAO extends DBMain<Courses>{

	@Override
	public ArrayList<Courses> getAll() throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "select * from courses";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Courses> courses = new ArrayList<Courses>();
		 while(rst.next())
		 {
			 courses.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return courses;
	}

	@Override
	public Courses getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from courses where courses_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Courses course = null;
		 while(rst.next())
		 {
			 course = assemble(rst);
		 }
		//关闭DB连接
		 return course;
	}

	public void add(Courses dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into courses(courses_NO,courses_name,courses_bookname) VALUES(?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setString(1,dataObj.getCourses_NO());
		pst.setString(2,dataObj.getCourses_name());
		pst.setString(3, dataObj.getCourses_bookname());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Courses newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update courses set courses_NO = ?,courses_name = ?,courses_bookname = ? where courses_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setString(1, newDataObj.getCourses_NO());
			pst.setString(2, newDataObj.getCourses_name());
			pst.setString(3, newDataObj.getCourses_bookname());
			pst.setInt(4, newDataObj.getCourses_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM courses WHERE courses_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Courses assemble(ResultSet rst) throws SQLException {

		Courses course = new Courses();
		course.setCourses_id(rst.getInt("courses_id"));
		course.setCourses_NO(rst.getString("courses_NO"));
		course.setCourses_name(rst.getString("courses_name"));
		course.setCourses_bookname(rst.getString("courses_bookname"));
		return course;
	}

}
