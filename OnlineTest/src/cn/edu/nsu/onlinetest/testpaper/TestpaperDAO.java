/**
 * 
 */
package cn.edu.nsu.onlinetest.testpaper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.onlinetest.DBMain;;	

/**
 * @author ZhangXiaohua
 *
 */
public class TestpaperDAO extends DBMain<Testpaper>
{

	@Override
	public ArrayList<Testpaper> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from testpaper";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Testpaper> Testpaper = new ArrayList<Testpaper>();
		 while(rst.next())
		 {
			 Testpaper.add(assemble(rst));
		 }
		//关闭DB连接
		 return Testpaper;
	}

	@Override
	public Testpaper getById(String id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from testpaper where testpaper_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setString(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Testpaper test = null;
		 while(rst.next())
		 {
			 test = assemble(rst);
		 }
		//关闭DB连接
		 return test;
	}

	@Override
	public void add(Testpaper dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into testpaper(testpaper_num,testpaper_id,question1,question2,question3,question4,question5,question6,question7,question8,question9,question10) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,dataObj.gettestpaper_Num());
		pst.setString(2, dataObj.gettestpaper_id());
		pst.setInt(3,dataObj.getquestion1());
		pst.setInt(4,dataObj.getquestion2());
		pst.setInt(5,dataObj.getquestion3());
		pst.setInt(6,dataObj.getquestion4());
		pst.setInt(7,dataObj.getquestion5());
		pst.setInt(8,dataObj.getquestion6());
		pst.setInt(9,dataObj.getquestion7());
		pst.setInt(10,dataObj.getquestion8());
		pst.setInt(11,dataObj.getquestion9());
		pst.setInt(12,dataObj.getquestion10());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
//		//封装SQL
//		String sql = "DELETE FROM test WHERE score_id=?";
//		 pst = getPrepareStatement(sql);
//		//参数绑定
//		pst.setInt(1,id);
//		//执行SQL
//	    pst.executeUpdate();
//		//处理结果数据			
//		//关闭DB连接	
	}

	@Override
	public Testpaper assemble(ResultSet rst) throws SQLException {

		Testpaper test = new Testpaper();
		test.settestpaper_Num(rst.getInt("testpaper_num"));
		test.settestpaper_id(rst.getString("testpaper_id"));
		test.setquestion1(rst.getInt("question1"));
		test.setquestion2(rst.getInt("question2"));
		test.setquestion3(rst.getInt("question3"));
		test.setquestion4(rst.getInt("question4"));
		test.setquestion5(rst.getInt("question5"));
		test.setquestion6(rst.getInt("question6"));
		test.setquestion7(rst.getInt("question7"));
		test.setquestion8(rst.getInt("question8"));
		test.setquestion9(rst.getInt("question9"));
		test.setquestion10(rst.getInt("question10"));
		return test;
	
	}
	}
