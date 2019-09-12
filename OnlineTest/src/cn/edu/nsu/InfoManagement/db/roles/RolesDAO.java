package cn.edu.nsu.InfoManagement.db.roles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;

public class RolesDAO extends DBMain<Roles>
{

	@Override
	public ArrayList<Roles> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from roles";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Roles> roles = new ArrayList<Roles>();
		 while(rst.next())
		 {
			 roles.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return roles;
	}

	@Override
	public Roles getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from roles where roles_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Roles roles = null;
		 while(rst.next())
		 {
			 roles = assemble(rst);
		 }
		//关闭DB连接
		 return roles;
	}

	public void add(Roles dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into roles(roles_name,roles_shortName,roles_note) VALUES(?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setString(1,dataObj.getRoles_name());
		pst.setString(2,dataObj.getRoles_shortName());
		pst.setString(3, dataObj.getRoles_note());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Roles newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update eclasses set roles_name = ?,roles_shortName = ?,roles_note = ? where roles_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			pst.setString(1, newDataObj.getRoles_name());
			pst.setString(2, newDataObj.getRoles_shortName());
			pst.setString(3, newDataObj.getRoles_note());
			pst.setInt(4, newDataObj.getRoles_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM roles WHERE roles_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Roles assemble(ResultSet rst) throws SQLException {

		Roles role = new Roles();
		role.setRoles_id(rst.getInt("roles_id"));
		role.setRoles_name(rst.getString("roles_name"));
		role.setRoles_shortName(rst.getString("roles_shortName"));
		role.setRoles_note(rst.getString("roles_note"));
		return role;
	
	}

}
