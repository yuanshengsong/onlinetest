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

		//��װSQL
		String sql = "select * from professions";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Professions> professions = new ArrayList<Professions>();
		 while(rst.next())
		 {
			 professions.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return professions;
	}

	@Override
	public Professions getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from professions where professions_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Professions profession = null;
		 while(rst.next())
		 {
			 profession = assemble(rst);
		 }
		//�ر�DB����
		 return profession;
	}

	public void add(Professions dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into professions(teams_id,professions_name) VALUES(?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, dataObj.getTeams_id());
		pst.setString(2, dataObj.getProfessions_name());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Professions newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update professions set teams_id = ?,professions_name = ? where professions_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setInt(1, newDataObj.getTeams_id());
			pst.setString(2, newDataObj.getProfessions_name());
			pst.setInt(3, newDataObj.getProfessions_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM professions WHERE professions_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
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
