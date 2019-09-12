package cn.edu.nsu.exam.roles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.exam.db.DBMain;

public class RolesDAO extends DBMain<Roles> {

	@Override
	public ArrayList<Roles> getAll() throws ClassNotFoundException, SQLException {
		//封装SQL
				String sql = "select * from roles";
				pst = getPrepareStatement(sql);
				//执行SQL语句
				rst = pst.executeQuery();
				//数据转存
				ArrayList<Roles> roles = new ArrayList<Roles>();
				while(rst.next()) {
					roles.add(assemble(rst));
				}
				//释放内存
				release();
				return roles;
	}

	@Override
	public Roles getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT *FROM roles WHERE roles_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Roles roles = null;
		while(rst.next()) {
			roles = assemble(rst);
		}
		release();
		return roles;
	}

	@Override
	public void add(Roles dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO roles(roles_id,roles_name, roles_note)VALUES(?, ?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getRoles_id());
		pst.setString(2, dataObj.getRoles_name());
		pst.setString(3, dataObj.getRoles_note());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(Roles newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE roles SET roles_name = ?, roles_note = ? WHERE roles_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(3, newDataObj.getRoles_id());
		pst.setString(1, newDataObj.getRoles_name());
		pst.setString(2, newDataObj.getRoles_note());
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM roles WHERE roles_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	@Override
	public Roles assemble(ResultSet rst) throws SQLException {
		Roles roles = new Roles();
		roles.setRoles_id(rst.getInt("roles_id"));
		roles.setRoles_name(rst.getString("roles_name"));
		roles.setRoles_note(rst.getString("roles_note"));
		
		return roles;
	}

	/* (non-Javadoc)
	 * @see cn.edu.nsu.exam.db.DBMain#getAll()
	 */
	/* (non-Javadoc)
	 * @see cn.edu.nsu.exam.db.DBMain#getAll()
	 */
	
}
