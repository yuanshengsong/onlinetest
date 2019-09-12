package cn.edu.nsu.InfoManagement.db.teachers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.teachers.Teachers;

public class TeachersDAO extends DBMain<Teachers>
{

	@Override
	public ArrayList<Teachers> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from teachers";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Teachers> teachers = new ArrayList<Teachers>();
		 while(rst.next())
		 {
			 teachers.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return teachers;
	}

	@Override
	public Teachers getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from teachers where teachers_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Teachers teacher = null;
		 while(rst.next())
		 {
			 teacher = assemble(rst);
		 }
		//关闭DB连接
		 return teacher;
	}

	public void add(Teachers dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into teachers(roles_id,teams_id,teachers_name,teachers_photo,teachers_sex,teachers_profession,teachers_phone,teachers_idNum,teachers_email,teachers_birth,teachers_address,teachers_room) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,dataObj.getRoles_id());
		pst.setInt(2, dataObj.getTeams_id());
		pst.setString(3, dataObj.getTeachers_name());
		pst.setString(4, dataObj.getTeachers_photo());
		pst.setString(5, dataObj.getTeachers_sex());
		pst.setString(6, dataObj.getTeachers_profession());
		pst.setString(7, dataObj.getTeachers_phone());
		pst.setString(8, dataObj.getTeachers_idNum());
		pst.setString(9, dataObj.getTeachers_email());
		pst.setString(10, dataObj.getTeachers_birth());
		pst.setString(11, dataObj.getTeachers_address());
		pst.setString(12, dataObj.getTeachers_room());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Teachers newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update teachers set roles_id = ?,teams_id = ?,teachers_name = ?,teachers_photo = ?,teachers_sex = ?,teachers_profession = ?,teachers_phone = ?,teachers_idNum = ?,teachers_email = ?,teachers_birth = ?,teachers_address = ?,teachers_room = ? where teachers_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		 	pst.setInt(1,newDataObj.getRoles_id());
			pst.setInt(2, newDataObj.getTeams_id());
			pst.setString(3, newDataObj.getTeachers_name());
			pst.setString(4, newDataObj.getTeachers_photo());
			pst.setString(5, newDataObj.getTeachers_sex());
			pst.setString(6, newDataObj.getTeachers_profession());
			pst.setString(7, newDataObj.getTeachers_phone());
			pst.setString(8, newDataObj.getTeachers_idNum());
			pst.setString(9, newDataObj.getTeachers_email());
			pst.setString(10, newDataObj.getTeachers_birth());
			pst.setString(11, newDataObj.getTeachers_address());
			pst.setString(12, newDataObj.getTeachers_room());;
		pst.setInt(13, newDataObj.getTeachers_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM teachers WHERE teachers_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Teachers assemble(ResultSet rst) throws SQLException {

		Teachers teacher = new Teachers();
		teacher.setTeachers_id(rst.getInt("teachers_id"));
		teacher.setRoles_id(rst.getInt("roles_id"));
		teacher.setTeams_id(rst.getInt("teams_id"));
		teacher.setTeachers_name(rst.getString("teachers_name"));
		teacher.setTeachers_photo(rst.getString("teachers_photo"));
		teacher.setTeachers_sex(rst.getString("teachers_sex"));
		teacher.setTeachers_profession(rst.getString("teachers_profession"));
		teacher.setTeachers_phone(rst.getString("teachers_phone"));
		teacher.setTeachers_idNum(rst.getString("teachers_idNum"));
		teacher.setTeachers_email(rst.getString("teachers_email"));
		teacher.setTeachers_birth(rst.getString("teachers_birth"));
		teacher.setTeachers_address(rst.getString("teachers_address"));
		teacher.setTeachers_room(rst.getString("teachers_room"));
		return teacher;
	
	}

}

