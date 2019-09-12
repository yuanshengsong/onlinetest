package cn.edu.nsu.InfoManagement.db.students;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.InfoManagement.db.DBMain;
import cn.edu.nsu.InfoManagement.db.students.Students;

public class StudentsDAO extends DBMain<Students>{

	@Override
	public ArrayList<Students> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from students";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Students> students = new ArrayList<Students>();
		 while(rst.next())
		 {
			 students.add(assemble(rst));
		 }
		
		//�ر�DB����
		 return students;
	}

	@Override
	public Students getById(int id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from students where students_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Students students = null;
		 while(rst.next())
		 {
			 students = assemble(rst);
		 }
		//�ر�DB����
		 return students;
	}

	public void add(Students dataObj) throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "INSERT into students(roles_id,Eclasses_id,students_name,students_photo,students_sex,students_phone,students_idNum,students_Email,students_birth,students_address,students_room) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,dataObj.getRoles_id());
		pst.setInt(2,dataObj.getEclasses_id());
		pst.setString(3,dataObj.getStudents_name());
		pst.setString(4, dataObj.getStudents_photo());
		pst.setString(5, dataObj.getStudents_sex());
		pst.setString(6, dataObj.getStudents_phone());
		pst.setString(7, dataObj.getStudents_idNum());
		pst.setString(8, dataObj.getStudents_Email());
		pst.setString(9, dataObj.getStudents_birth());
		pst.setString(10, dataObj.getStudents_address());
		pst.setString(11, dataObj.getStudents_room());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void modify(Students newDataObj)throws ClassNotFoundException, SQLException {

		//��װSQL
		String sql = "update students set roles_id = ?,Eclasses_id = ?,students_name = ?,students_photo = ?,students_sex = ?,students_phone = ?,students_idNum = ?,students_Email = ?,students_birth = ?,students_address = ?,students_room = ? where students_id=?";
		 pst = getPrepareStatement(sql);
		//������
			pst.setInt(1, newDataObj.getRoles_id());
			pst.setInt(2, newDataObj.getEclasses_id());
			pst.setString(3, newDataObj.getStudents_name());
			pst.setString(4, newDataObj.getStudents_photo());
			pst.setString(5, newDataObj.getStudents_sex());
			pst.setString(6, newDataObj.getStudents_phone());
			pst.setString(7, newDataObj.getStudents_idNum());
			pst.setString(8, newDataObj.getStudents_Email());
			pst.setString(9, newDataObj.getStudents_birth());
			pst.setString(10, newDataObj.getStudents_address());
			pst.setString(11, newDataObj.getStudents_room());
			pst.setInt(12, newDataObj.getStudents_id());
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//��װSQL
		String sql = "DELETE FROM students WHERE students_id=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setInt(1,id);
		//ִ��SQL
	    pst.executeUpdate();
		//����������			
		//�ر�DB����	
	}

	@Override
	public Students assemble(ResultSet rst) throws SQLException {

		Students student = new Students();
		student.setStudents_id(rst.getInt("students_id"));
		student.setRoles_id(rst.getInt("roles_id"));
		student.setEclasses_id(rst.getInt("Eclasses_id"));
		student.setStudents_name(rst.getString("students_name"));
		student.setStudents_photo(rst.getString("students_photo"));
		student.setStudents_sex(rst.getString("students_sex"));
		student.setStudents_phone(rst.getString("students_phone"));
		student.setStudents_idNum(rst.getString("students_idNum"));
		student.setStudents_Email(rst.getString("students_Email"));
		student.setStudents_birth(rst.getString("students_birth"));
		student.setStudents_address(rst.getString("students_address"));
		student.setStudents_room(rst.getString("students_room"));
		return student;
	}



}
