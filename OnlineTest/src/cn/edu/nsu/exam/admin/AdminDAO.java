package cn.edu.nsu.exam.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.exam.db.DBMain;;

public class AdminDAO extends DBMain<Admin> {
	@Override
	public ArrayList<Admin> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from Admin";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Admin> admins = new ArrayList<Admin>();
		 while(rst.next())
		 {
			 admins.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return admins;
	}

	@Override
	public Admin getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from admin where admin_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Admin admin = null;
		 while(rst.next())
		 {
			 admin = assemble(rst);
		 }
		//�ر�DB����
		 return admin;
	}

	public void add(Admin dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into admin(roles_id,admin_name,admin_phoneNum,admin_room) VALUES(?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,dataObj.getRoles_id());
		pst.setString(2,dataObj.getAdmin_name());
		pst.setString(3,dataObj.getAdmin_phoneNum());
		pst.setString(4,dataObj.getAdmin_room());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Admin newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update admin set roles_id=?,admin_name=?,admin_phoneNum=?,admin_room=? where admin_id = ?";
		 pst = getPrepareStatement(sql);
		//������
		 	pst.setInt(1,newDataObj.getRoles_id());
			pst.setString(2,newDataObj.getAdmin_name());
			pst.setString(3,newDataObj.getAdmin_phoneNum());
			pst.setString(4,newDataObj.getAdmin_room());
			pst.setInt(5, newDataObj.getAdmin_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM Admin WHERE admin_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
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
