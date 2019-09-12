package cn.edu.nsu.InfoManagement.db.tclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.tclasses.Tclasses;

public class TclassesDAO extends DBMain<Tclasses>
{

	@Override
	public ArrayList<Tclasses> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from tclasses";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Tclasses> tclasses = new ArrayList<Tclasses>();
		 while(rst.next())
		 {
			 tclasses.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return tclasses;
	}

	@Override
	public Tclasses getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from tclasses where Tclasses_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Tclasses tclass = null;
		 while(rst.next())
		 {
			 tclass = assemble(rst);
		 }
		//关闭DB连接
		 return tclass;
	}

	public void add(Tclasses dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into tclasses(teacherCourse_id,Tclasses_year,Tclasses_semester,Tclasses_name) VALUES(?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, dataObj.getTeacherCourse_id());
		pst.setString(2,dataObj.getTclasses_year());
		pst.setString(3,dataObj.getTclasses_semester());
		pst.setString(4, dataObj.getTclasses_name());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Tclasses newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update tclasses set teacherCourse_id = ?,Tclasses_year = ?,Tclasses_semester = ?,Tclasses_name = ?where Tclasses_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setInt(1, newDataObj.getTeacherCourse_id());
			pst.setString(2, newDataObj.getTclasses_year());
			pst.setString(3, newDataObj.getTclasses_semester());
			pst.setString(4, newDataObj.getTclasses_name());
		pst.setInt(5, newDataObj.getTclasses_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM tclasses WHERE Tclasses_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Tclasses assemble(ResultSet rst) throws SQLException {

		Tclasses tclass = new Tclasses();
		tclass.setTclasses_id(rst.getInt("Tclasses_id"));
		tclass.setTeacherCourse_id(rst.getInt("teacherCourse_id"));
		tclass.setTclasses_year(rst.getString("Tclasses_year"));
		tclass.setTclasses_semester(rst.getString("Tclasses_semester"));
		tclass.setTclasses_name(rst.getString("Tclasses_name"));
		return tclass;
	
	}
}

