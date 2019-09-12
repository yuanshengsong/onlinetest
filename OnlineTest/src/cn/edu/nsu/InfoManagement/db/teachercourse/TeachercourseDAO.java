package cn.edu.nsu.InfoManagement.db.teachercourse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.teachercourse.Teachercourse;

public class TeachercourseDAO extends DBMain<Teachercourse>
{

	@Override
	public ArrayList<Teachercourse> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from teachercourse";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Teachercourse> teachercourses = new ArrayList<Teachercourse>();
		 while(rst.next())
		 {
			 teachercourses.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return teachercourses;
	}

	@Override
	public Teachercourse getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from teachercourse where teacherCourse_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Teachercourse teachercourse = null;
		 while(rst.next())
		 {
			 teachercourse = assemble(rst);
		 }
		//关闭DB连接
		 return teachercourse;
	}

	public void add(Teachercourse dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into teachercourse(teachers_id,courses_id,teacherCourse_fromDate,teacherCourse_endDate) VALUES(?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, dataObj.getTeachers_id());
		pst.setInt(2, dataObj.getCourses_id());
		pst.setString(3, dataObj.getTeacherCourse_fromDate());
		pst.setString(4, dataObj.getTeacherCourse_endDate());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Teachercourse newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update teachercourse set teachers_id = ?,courses_id = ?,teacherCourse_fromDate=?,teacherCourse_endDate=? where teacherCourse_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setInt(1, newDataObj.getTeachers_id());
			pst.setInt(2, newDataObj.getCourses_id());
			pst.setString(3, newDataObj.getTeacherCourse_fromDate());
			pst.setString(4, newDataObj.getTeacherCourse_endDate());
		pst.setInt(5, newDataObj.getTeacherCourse_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM teachercourse WHERE teacherCourse_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Teachercourse assemble(ResultSet rst) throws SQLException {

		Teachercourse teachercourse = new Teachercourse();
		teachercourse.setTeacherCourse_id(rst.getInt("teacherCourse_id"));
		teachercourse.setTeachers_id(rst.getInt("teachers_id"));
		teachercourse.setCourses_id(rst.getInt("courses_id"));
		teachercourse.setTeacherCourse_fromDate(rst.getString("teacherCourse_fromDate"));
		teachercourse.setTeacherCourse_endDate(rst.getString("teacherCourse_endDate"));
		return teachercourse;
	
	}

}

