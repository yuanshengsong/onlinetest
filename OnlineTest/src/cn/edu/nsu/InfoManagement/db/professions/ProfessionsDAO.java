package cn.edu.nsu.InfoManagement.db.professions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.professions.Professions;

public class ProfessionsDAO extends DBMain<Professions>{
	@Override
	public ArrayList<Professions> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from professions";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Professions> professions = new ArrayList<Professions>();
		 while(rst.next())
		 {
			 professions.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return professions;
	}

	@Override
	public Professions getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from professions where professions_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Professions profession = null;
		 while(rst.next())
		 {
			 profession = assemble(rst);
		 }
		//关闭DB连接
		 return profession;
	}

	public void add(Professions dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into professions(teams_id,professions_name) VALUES(?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, dataObj.getTeams_id());
		pst.setString(2, dataObj.getProfessions_name());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Professions newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update professions set teams_id = ?,professions_name = ? where professions_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setInt(1, newDataObj.getTeams_id());
			pst.setString(2, newDataObj.getProfessions_name());
			pst.setInt(3, newDataObj.getProfessions_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM professions WHERE professions_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Professions assemble(ResultSet rst) throws SQLException {

		Professions profession = new Professions();
		profession.setProfessions_id(rst.getInt("professions_id"));
		profession.setTeams_id(rst.getInt("teams_id"));
		profession.setProfessions_name(rst.getString("professions_name"));
		return profession;
	}



}
