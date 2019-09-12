package cn.edu.nsu.InfoManagement.db.eclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;

public class EclassesDAO extends DBMain<Eclasses>
{

	@Override
	public ArrayList<Eclasses> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from eclasses";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Eclasses> eclasses = new ArrayList<Eclasses>();
		 while(rst.next())
		 {
			 eclasses.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return eclasses;
	}

	@Override
	public Eclasses getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from departments where departments_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Eclasses departments = null;
		 while(rst.next())
		 {
			 departments = assemble(rst);
		 }
		//关闭DB连接
		 return departments;
	}

	public void add(Eclasses dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into eclasses(Eclasses_id,teachers_id,gradeMajor_id,Eclasses_grade) VALUES(?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, dataObj.getEclasses_id());
		pst.setInt(2,dataObj.getTeachers_id());
		pst.setInt(3,dataObj.getGradeMajor_id());
		pst.setString(4, dataObj.getEclasses_grade());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Eclasses newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update eclasses set teachers_id = ?,gradeMajor_id = ?,Eclasses_grade = ? where Eclasses_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setInt(1, newDataObj.getEclasses_id());
			pst.setInt(2, newDataObj.getGradeMajor_id());
			pst.setInt(3, newDataObj.getTeachers_id());
			pst.setString(4, newDataObj.getEclasses_grade());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM eclasses WHERE Eclasses_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Eclasses assemble(ResultSet rst) throws SQLException {

		Eclasses eclass = new Eclasses();
		eclass.setEclasses_id(rst.getInt("Eclasses_id"));
		eclass.setTeachers_id(rst.getInt("teachers_id"));
		eclass.setGradeMajor_id(rst.getInt("gradeMajor_id"));
		eclass.setEclasses_grade(rst.getString("Eclasses_grade"));
		return eclass;
	
	}

}
