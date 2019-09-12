package cn.edu.nsu.InfoManagement.db.grademajor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.grademajor.GradeMajor;

public class GradeMajorDAO extends DBMain<GradeMajor>{

	@Override
	public ArrayList<GradeMajor> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from grademajor";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<GradeMajor> gradeMajors = new ArrayList<GradeMajor>();
		 while(rst.next())
		 {
			 gradeMajors.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return gradeMajors;
	}

	@Override
	public GradeMajor getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from grademajor where gradeMajor_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 GradeMajor gradeMajor = null;
		 while(rst.next())
		 {
			 gradeMajor = assemble(rst);
		 }
		//�ر�DB����
		 return gradeMajor;
	}

	public void add(GradeMajor dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into grademajor(grade_id,professions_id,gradeMajor_name) VALUES(?,?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,dataObj.getGrade_id());
		pst.setInt(2,dataObj.getProfessions_id());
		pst.setString(3, dataObj.getGradeMajor_name());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(GradeMajor newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update grademajor set grade_id = ?,professions_id = ?,gradeMajor_name = ? where gradeMajor_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setInt(1, newDataObj.getGrade_id());
			pst.setInt(2, newDataObj.getProfessions_id());
			pst.setString(3, newDataObj.getGradeMajor_name());
			pst.setInt(4, newDataObj.getGradeMajor_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM grademajor WHERE gradeMajor_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	}

	@Override
	public GradeMajor assemble(ResultSet rst) throws SQLException {

		GradeMajor gradeMajor = new GradeMajor();
		gradeMajor.setGradeMajor_id(rst.getInt("gradeMajor_id"));
		gradeMajor.setGrade_id(rst.getInt("grade_id"));
		gradeMajor.setProfessions_id(rst.getInt("professions_id"));
		gradeMajor.setGradeMajor_name(rst.getString("gradeMajor_name"));
		return gradeMajor;
	}


}
