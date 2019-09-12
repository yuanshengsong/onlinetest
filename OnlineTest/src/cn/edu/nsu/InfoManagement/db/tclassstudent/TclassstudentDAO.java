package cn.edu.nsu.InfoManagement.db.tclassstudent;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.tclassstudent.Tclassstudent;

public class TclassstudentDAO extends DBMain<Tclassstudent>
{

	@Override
	public ArrayList<Tclassstudent> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from tclassstudent";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Tclassstudent> tclassstudents = new ArrayList<Tclassstudent>();
		 while(rst.next())
		 {
			 tclassstudents.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return tclassstudents;
	}

	@Override
	public Tclassstudent getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from tclassstudent where TclassStudent_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Tclassstudent tclassstudent = null;
		 while(rst.next())
		 {
			 tclassstudent = assemble(rst);
		 }
		//关闭DB连接
		 return tclassstudent;
	}

	public void add(Tclassstudent dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into tclassstudent(Tclasses_id,students_id) VALUES(?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, dataObj.getTclasses_id());
		pst.setInt(2, dataObj.getStudents_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Tclassstudent newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update tclassstudent set Tclasses_id = ?,students_id = ? where TclassStudent_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setInt(1, newDataObj.getTclasses_id());
			pst.setInt(2, newDataObj.getStudents_id());
		pst.setInt(3, newDataObj.getTclassStudent_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM tclassstudent WHERE Tclassstudent_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Tclassstudent assemble(ResultSet rst) throws SQLException {

		Tclassstudent tclassstudent = new Tclassstudent();
		tclassstudent.setTclassStudent_id(rst.getInt("TclassStudent_id"));
		tclassstudent.setTclasses_id(rst.getInt("Tclasses_id"));
		tclassstudent.setStudents_id(rst.getInt("students_id"));
		return tclassstudent;
	
	}

}

