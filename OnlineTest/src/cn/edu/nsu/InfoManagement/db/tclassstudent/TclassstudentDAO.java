package cn.edu.nsu.InfoManagement.db.tclassstudent;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.tclassstudent.Tclassstudent;

public class TclassstudentDAO extends DBMain<Tclassstudent>
{

	@Override
	public ArrayList<Tclassstudent> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from tclassstudent";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Tclassstudent> tclassstudents = new ArrayList<Tclassstudent>();
		 while(rst.next())
		 {
			 tclassstudents.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return tclassstudents;
	}

	@Override
	public Tclassstudent getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from tclassstudent where TclassStudent_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Tclassstudent tclassstudent = null;
		 while(rst.next())
		 {
			 tclassstudent = assemble(rst);
		 }
		//�ر�DB����
		 return tclassstudent;
	}

	public void add(Tclassstudent dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into tclassstudent(Tclasses_id,students_id) VALUES(?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, dataObj.getTclasses_id());
		pst.setInt(2, dataObj.getStudents_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Tclassstudent newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update tclassstudent set Tclasses_id = ?,students_id = ? where TclassStudent_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setInt(1, newDataObj.getTclasses_id());
			pst.setInt(2, newDataObj.getStudents_id());
		pst.setInt(3, newDataObj.getTclassStudent_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM tclassstudent WHERE Tclassstudent_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	}

	@Override
	public Tclassstudent assemble(ResultSet rst) throws SQLException {

		Tclassstudent tclassstudent = new Tclassstudent();
		tclassstudent.setTclassStudent_id(rst.getInt("TclassStudent_id"));
		tclassstudent.setTclasses_id(rst.getInt("Tclasses_id"));
		tclassstudent.setStudents_id(rst.getInt("students_id"));
		return tclassstudent;
	
	}

}

