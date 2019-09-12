package cn.edu.nsu.exam.function;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import cn.edu.nsu.exam.db.DBMain;

public class FunctionDAO extends DBMain<Function> {

	@Override
	public ArrayList<Function> getAll() throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from function";
		pst = getPrepareStatement(sql);
		//执行SQL语句
		rst = pst.executeQuery();
		//数据转存
		ArrayList<Function> function = new ArrayList<Function>();
		while(rst.next()) {
			function.add(assemble(rst));
		}
		//释放内存
		release();
		return function;
	}

	@Override
	public Function getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT *FROM function WHERE function_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Function function = null;
		while(rst.next()) {
			function = assemble(rst);
		}
		release();
		return function;
	}

	@Override
	public void add(Function dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO function(function_name, function_URI, function_note)VALUES( ?, ?, ?)";
		pst = getPrepareStatement(sql);
//		pst.setInt(1, dataObj.getFunction_id());
//		pst.setInt(2, dataObj.getRoles_id());
		pst.setString(1, dataObj.getFunction_name());
		pst.setString(2, dataObj.getFunction_URI());
		pst.setString(3, dataObj.getFunction_note());
		
		pst.executeUpdate();
		release();
		
	}

	@Override
	public void modify(Function newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE function SET function_name = ?, function_URI = ?, function_note = ? WHERE function_id = ?";
		pst = getPrepareStatement(sql);
		pst.setString(1, newDataObj.getFunction_name());
		pst.setString(2, newDataObj.getFunction_URI());
		pst.setString(3, newDataObj.getFunction_note());
		pst.setInt(4, newDataObj.getFunction_id());
		pst.executeUpdate();
		
		release();
		
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM function WHERE function_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
		
	}

	@Override
	public Function assemble(ResultSet rst) throws SQLException {
		Function functions = new Function();
		functions.setFunction_id(rst.getInt("function_id"));
		functions.setFunction_name(rst.getString("function_name"));
		functions.setFunction_URI(rst.getString("function_URI"));
		functions.setFunction_note(rst.getString("function_note"));
		
		return functions;
	}
	
	
}
