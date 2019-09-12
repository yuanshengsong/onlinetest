package cn.edu.nsu.InfoManagement.db.grademajor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.grademajor.GradeMajor;

public class GradeMajorDAO extends DBMain<GradeMajor>{

	@Override
	public ArrayList<GradeMajor> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from grademajor";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<GradeMajor> gradeMajors = new ArrayList<GradeMajor>();
		 while(rst.next())
		 {
			 gradeMajors.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return gradeMajors;
	}

	@Override
	public GradeMajor getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from grademajor where gradeMajor_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 GradeMajor gradeMajor = null;
		 while(rst.next())
		 {
			 gradeMajor = assemble(rst);
		 }
		//关闭DB连接
		 return gradeMajor;
	}

	public void add(GradeMajor dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into grademajor(grade_id,professions_id,gradeMajor_name) VALUES(?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,dataObj.getGrade_id());
		pst.setInt(2,dataObj.getProfessions_id());
		pst.setString(3, dataObj.getGradeMajor_name());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(GradeMajor newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update grademajor set grade_id = ?,professions_id = ?,gradeMajor_name = ? where gradeMajor_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setInt(1, newDataObj.getGrade_id());
			pst.setInt(2, newDataObj.getProfessions_id());
			pst.setString(3, newDataObj.getGradeMajor_name());
			pst.setInt(4, newDataObj.getGradeMajor_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM grademajor WHERE gradeMajor_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public GradeMajor assemble(ResultSet rst) throws SQLException {

		GradeMajor gradeMajor = new GradeMajor();
		gradeMajor.setGradeMajor_id(rst.getInt("gradeMajor_id"));
		gradeMajor.setGrade_id(rst.getInt("grade_id"));
		gradeMajor.setProfessions_id(rst.getInt("professions_id"));
		gradeMajor.setGradeMajor_name(rst.getString("gradeMajor_name"));
		return gradeMajor;
	}


}
