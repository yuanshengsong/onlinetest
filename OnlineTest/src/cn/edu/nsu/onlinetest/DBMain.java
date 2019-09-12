/**
 * 
 */
package cn.edu.nsu.onlinetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author ZhangXiaohua
 *
 */
public abstract class DBMain<E> 
{
	public Connection con = null;
	public PreparedStatement pst = null;
	public ResultSet rst = null;
	/**
	 * ��װָ����SQL���Ϊһ��PreparedStatement����
	 * @param sql Ҫ����װ��SQL���
	 * @return PreparedStatement����
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public PreparedStatement getPrepareStatement(String sql) throws ClassNotFoundException, SQLException
	{
		//����JDBC����
		Class.forName("com.mysql.cj.jdbc.Driver");
		//���DB����
		 con = DriverManager.getConnection("jdbc:mysql://106.14.165.150:3306/examonline?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false", "root", "MGB123456789++");
		//��װSQL
		 pst = con.prepareStatement(sql);
		 
		 return pst;
	}
	/**
	 * �ͷ����ݿ�����
	 * @throws SQLException
	 */
	public void release() throws SQLException
	{
		
		//�ر����ݿ�����
		if(rst != null)
		{
			rst.close();
		}
		if(pst != null)
		{
			pst.close();
		}
		if(con != null)
		{
			con.close();
		}
	}
	
	public abstract ArrayList<E> getAll() throws ClassNotFoundException,SQLException;
	
	public abstract E getById(String id) throws ClassNotFoundException,SQLException;
	
	public abstract void add(E dataObj) throws ClassNotFoundException,SQLException;
	
	
	public abstract void delete(int id) throws ClassNotFoundException,SQLException;
	
	public abstract  E assemble(ResultSet rst) throws SQLException;
}
