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
		//��װSQL
		String sql = "select * from courses";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Courses> courses = new ArrayList<Courses>();
		 while(rst.next())
		 {
			 courses.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return courses;
	}

	@Override
	public Courses getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from courses where courses_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Courses course = null;
		 while(rst.next())
		 {
			 course = assemble(rst);
		 }
		//�ر�DB����
		 return course;
	}

	public void add(Courses dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into courses(courses_NO,courses_name,courses_bookname) VALUES(?,?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setString(1,dataObj.getCourses_NO());
		pst.setString(2,dataObj.getCourses_name());
		pst.setString(3, dataObj.getCourses_bookname());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Courses newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update courses set courses_NO = ?,courses_name = ?,courses_bookname = ? where courses_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setString(1, newDataObj.getCourses_NO());
			pst.setString(2, newDataObj.getCourses_name());
			pst.setString(3, newDataObj.getCourses_bookname());
			pst.setInt(4, newDataObj.getCourses_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM courses WHERE courses_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
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
