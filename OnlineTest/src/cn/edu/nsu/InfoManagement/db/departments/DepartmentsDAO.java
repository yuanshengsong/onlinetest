package cn.edu.nsu.InfoManagement.db.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.departments.Departments;


public class DepartmentsDAO extends DBMain<Departments>
{

	@Override
	public ArrayList<Departments> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from departments";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Departments> departments = new ArrayList<Departments>();
		 while(rst.next())
		 {
			 departments.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return departments;
	}

	@Override
	public Departments getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from departments where departments_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Departments department = null;
		 while(rst.next())
		 {
			 department = assemble(rst);
		 }
		//�ر�DB����
		 return department;
	}

	public void add(Departments dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into departments(departments_name,departments_TNum,departments_SNum,departments_address) VALUES(?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setString(1, dataObj.getDepartments_name());
		pst.setInt(2,dataObj.getDepartments_TNum());
		pst.setInt(3,dataObj.getDepartments_SNum());
		pst.setString(4, dataObj.getDepartments_address());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Departments newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update departments set departments_name = ?,departments_TNum = ?,departments_SNum = ?,departments_address = ?where departments_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setString(1, newDataObj.getDepartments_name());
			pst.setInt(2, newDataObj.getDepartments_TNum());
			pst.setInt(3, newDataObj.getDepartments_SNum());
			pst.setString(4, newDataObj.getDepartments_address());
		pst.setInt(5, newDataObj.getDepartments_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM departments WHERE departments_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	}

	@Override
	public Departments assemble(ResultSet rst) throws SQLException {

		Departments department = new Departments();
		department.setDepartments_id(rst.getInt("departments_id"));
		department.setDepartments_name(rst.getString("departments_name"));
		department.setDepartments_TNum(rst.getInt("departments_TNum"));
		department.setDepartments_SNum(rst.getInt("departments_SNum"));
		department.setDepartments_address(rst.getString("departments_address"));
		return department;
	
	}
}

