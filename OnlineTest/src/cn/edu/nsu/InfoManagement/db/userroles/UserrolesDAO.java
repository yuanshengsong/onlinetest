package cn.edu.nsu.InfoManagement.db.userroles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.userroles.Userroles;

public class UserrolesDAO extends DBMain<Userroles>
{

	@Override
	public ArrayList<Userroles> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from userroles";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Userroles> userroles = new ArrayList<Userroles>();
		 while(rst.next())
		 {
			 userroles.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return userroles;
	}

	@Override
	public Userroles getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from userroles where userroles_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Userroles userroles = null;
		 while(rst.next())
		 {
			 userroles = assemble(rst);
		 }
		//�ر�DB����
		 return userroles;
	}

	public void add(Userroles dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into userroles(users_id,roles_id) VALUES(?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,dataObj.getUsers_id());
		pst.setInt(2, dataObj.getRoles_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Userroles newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update userroles set users_id = ?,roles_id = ? where userroles_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setInt(1, newDataObj.getUsers_id());
			pst.setInt(2, newDataObj.getRoles_id());
			pst.setInt(3, newDataObj.getUserroles_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM userroles WHERE userroles_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	}

	@Override
	public Userroles assemble(ResultSet rst) throws SQLException {

		Userroles team = new Userroles();
		team.setUserroles_id(rst.getInt("userroles_id"));
		team.setUsers_id(rst.getInt("users_id"));
		team.setRoles_id(rst.getInt("roles_id"));
		return team;
	
	}



}
