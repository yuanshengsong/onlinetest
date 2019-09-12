package cn.edu.nsu.InfoManagement.db.users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;

public class UsersDAO extends DBMain<Users>{

	@Override
	public ArrayList<Users> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from users";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Users> users = new ArrayList<Users>();
		 while(rst.next())
		 {
			 users.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return users;
	}

	@Override
	public Users getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from users where users_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Users users = null;
		 while(rst.next())
		 {
			 users = assemble(rst);
		 }
		//关闭DB连接
		 return users;
	}

	public void add(Users dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into users(users_password) VALUES(?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setString(1, dataObj.getUsers_password());
		
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Users newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update users set users_password=? where users_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
			
			pst.setString(1, newDataObj.getUsers_password());
			pst.setInt(2, newDataObj.getUsers_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM users WHERE users_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Users assemble(ResultSet rst) throws SQLException {

		Users user = new Users();
		user.setUsers_id(rst.getInt("users_id"));
		user.setUsers_password(rst.getString("users_password"));
		return user;
	
	}

}
