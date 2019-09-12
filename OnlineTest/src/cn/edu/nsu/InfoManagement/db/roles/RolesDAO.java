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

		//��װSQL
		String sql = "select * from roles";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Roles> roles = new ArrayList<Roles>();
		 while(rst.next())
		 {
			 roles.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return roles;
	}

	@Override
	public Roles getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from roles where roles_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Roles roles = null;
		 while(rst.next())
		 {
			 roles = assemble(rst);
		 }
		//�ر�DB����
		 return roles;
	}

	public void add(Roles dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into roles(roles_name,roles_shortName,roles_note) VALUES(?,?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setString(1,dataObj.getRoles_name());
		pst.setString(2,dataObj.getRoles_shortName());
		pst.setString(3, dataObj.getRoles_note());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Roles newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update eclasses set roles_name = ?,roles_shortName = ?,roles_note = ? where roles_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setString(1, newDataObj.getRoles_name());
			pst.setString(2, newDataObj.getRoles_shortName());
			pst.setString(3, newDataObj.getRoles_note());
			pst.setInt(4, newDataObj.getRoles_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM roles WHERE roles_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
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
