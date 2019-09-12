package cn.edu.nsu.InfoManagement.db.users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;

public class UsersDAO extends DBMain<Users>{

	@Override
	public ArrayList<Users> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from users";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Users> users = new ArrayList<Users>();
		 while(rst.next())
		 {
			 users.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return users;
	}

	@Override
	public Users getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from users where users_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Users users = null;
		 while(rst.next())
		 {
			 users = assemble(rst);
		 }
		//�ر�DB����
		 return users;
	}

	public void add(Users dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into users(users_password) VALUES(?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setString(1, dataObj.getUsers_password());
		
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Users newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update users set users_password=? where users_id=?";
		 pst = getPrepareStatement(sql);
		//������
			
			pst.setString(1, newDataObj.getUsers_password());
			pst.setInt(2, newDataObj.getUsers_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM users WHERE users_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	}

	@Override
	public Users assemble(ResultSet rst) throws SQLException {

		Users user = new Users();
		user.setUsers_id(rst.getInt("users_id"));
		user.setUsers_password(rst.getString("users_password"));
		return user;
	
	}

}
