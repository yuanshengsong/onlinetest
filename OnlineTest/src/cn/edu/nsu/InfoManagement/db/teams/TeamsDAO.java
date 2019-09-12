package cn.edu.nsu.InfoManagement.db.teams;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;

public class TeamsDAO extends DBMain<Teams>
{

	@Override
	public ArrayList<Teams> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from teams";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Teams> teams = new ArrayList<Teams>();
		 while(rst.next())
		 {
			 teams.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return teams;
	}

	@Override
	public Teams getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from teams where teams_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Teams teams = null;
		 while(rst.next())
		 {
			 teams = assemble(rst);
		 }
		//�ر�DB����
		 return teams;
	}

	public void add(Teams dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into teams(departments_id,teams_name) VALUES(?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,dataObj.getDepartments_id());
		pst.setString(2, dataObj.getTeams_name());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Teams newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update teams set departments_id = ?,teams_name = ?where teams_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setInt(1, newDataObj.getDepartments_id());
			pst.setString(2, newDataObj.getTeams_name());
			pst.setInt(3, newDataObj.getTeams_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM teams WHERE teams_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	}

	@Override
	public Teams assemble(ResultSet rst) throws SQLException {

		Teams team = new Teams();
		team.setTeams_id(rst.getInt("teams_id"));
		team.setDepartments_id(rst.getInt("departments_id"));
		team.setTeams_name(rst.getString("teams_name"));
		return team;
	
	}


}
