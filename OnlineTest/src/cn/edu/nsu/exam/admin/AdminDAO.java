package cn.edu.nsu.exam.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.exam.db.DBMain;;

public class AdminDAO extends DBMain<Admin> {
	@Override
	public ArrayList<Admin> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from Admin";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Admin> admins = new ArrayList<Admin>();
		 while(rst.next())
		 {
			 admins.add(assemble(rst));
		 }
		
		//关闭DB连接
		 return admins;
	}

	@Override
	public Admin getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from admin where admin_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Admin admin = null;
		 while(rst.next())
		 {
			 admin = assemble(rst);
		 }
		//关闭DB连接
		 return admin;
	}

	public void add(Admin dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into admin(roles_id,admin_name,admin_phoneNum,admin_room) VALUES(?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,dataObj.getRoles_id());
		pst.setString(2,dataObj.getAdmin_name());
		pst.setString(3,dataObj.getAdmin_phoneNum());
		pst.setString(4,dataObj.getAdmin_room());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Admin newDataObj)throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update admin set roles_id=?,admin_name=?,admin_phoneNum=?,admin_room=? where admin_id = ?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		 	pst.setInt(1,newDataObj.getRoles_id());
			pst.setString(2,newDataObj.getAdmin_name());
			pst.setString(3,newDataObj.getAdmin_phoneNum());
			pst.setString(4,newDataObj.getAdmin_room());
			pst.setInt(5, newDataObj.getAdmin_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM Admin WHERE admin_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Admin assemble(ResultSet rst) throws SQLException {

		Admin admin = new Admin();
		admin.setAdmin_id(rst.getInt("admin_id"));
		admin.setRoles_id(rst.getInt("roles_id"));
		admin.setAdmin_name(rst.getString("admin_name"));
		admin.setAdmin_phoneNum(rst.getString("admin_phoneNum"));
		admin.setAdmin_room(rst.getString("admin_room"));
		return admin;
	
	}

}
