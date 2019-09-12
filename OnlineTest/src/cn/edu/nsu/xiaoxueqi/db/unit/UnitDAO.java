package cn.edu.nsu.xiaoxueqi.db.unit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.xiaoxueqi.db.last.DBMain;
import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionType;
import  cn.edu.nsu.xiaoxueqi.db.subject.Subject;

public class UnitDAO extends DBMain<Unit>{

	@Override
	public ArrayList<Unit> getAll() throws ClassNotFoundException, SQLException {
		String sql ="SELECT * FROM unit";
		pst = getPrepareStatement(sql);
		rst=pst.executeQuery();
		ArrayList<Unit> unit= new ArrayList<Unit>();
		while(rst.next()) {
			unit.add(assemble(rst));
		}
		release();
		return unit;	
	}

	@Override
	public Unit getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM unit WHERE unit_id = ?";
		pst = getPrepareStatement(sql);;
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Unit unit = null;
		while(rst.next()) {
			unit = assemble(rst);
		}
		release();
		return unit;
	}

	@Override
	public void add(Unit dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO unit(unit_id,Subject_Id,Unit_Number,Unit_name,Remarks)"
				+ "VALUES(?, ?,?,?,?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getUnit_ID());
		pst.setInt(2, dataObj.getSubject_Id());
		pst.setInt(3, dataObj.getUnit_Number());
		pst.setString(4, dataObj.getUnit_name());
		pst.setString(5, dataObj.getRemarks());
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(Unit newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE unit SET Subject_Id = ? ,Unit_Number = ? ,Unit_name = ?, Remarks = ? WHERE unit_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, newDataObj.getSubject_Id());
		pst.setInt(2, newDataObj.getUnit_Number());
		pst.setString(3, newDataObj.getUnit_name());
		pst.setString(4, newDataObj.getRemarks());
		pst.setInt(5,newDataObj.getUnit_ID());
		pst.executeUpdate();
		release();
		
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM unit WHERE unit_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	public Unit getByName(String name) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM unit WHERE unit_name = ?";
		pst = getPrepareStatement(sql);;
		pst.setString(1, name);
		rst = pst.executeQuery();
		Unit unit = null;
		while(rst.next()) {
			unit = assemble(rst);
		}
		release();
		return unit;
	}

	
	@Override
	public Unit assemble(ResultSet rst) throws SQLException {
		Unit unit=new Unit();
		unit.setUnit_ID(rst.getInt("unit_id"));
		unit.setSubject_Id(rst.getInt("subject_id"));
		unit.setUnit_Number(rst.getInt("unit_number"));
		unit.setUnit_name(rst.getString("unit_name"));
		unit.setRemarks(rst.getString("Remarks"));
		return unit;
	}
	

}
