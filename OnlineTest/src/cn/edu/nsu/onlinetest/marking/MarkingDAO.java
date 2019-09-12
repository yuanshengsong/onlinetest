/**
 * 
 */
package cn.edu.nsu.onlinetest.marking;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.onlinetest.DBMain;
import cn.edu.nsu.onlinetest.marking.Marking;;

/**
 * @author ZhangXiaohua
 *
 */
public class MarkingDAO extends DBMain<Marking>
{

	@Override
	public ArrayList<Marking> getAll() throws ClassNotFoundException, SQLException 
	{

		//��װSQL
		String sql = "select * from question_test";
		 pst = getPrepareStatement(sql);
		//������
		//pst.setInt(1, 1);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 ArrayList<Marking> Marking = new ArrayList<Marking>();
		 while(rst.next())
		 {
			 Marking.add(assemble(rst));
		 }
		//�ر�DB����
		 return Marking;
	}

	@Override
	public Marking getById(String id) throws ClassNotFoundException, SQLException {
		//��װSQL
		String sql = "select * from question_test where test_num=?";
		 pst = getPrepareStatement(sql);
		//������
		pst.setString(1, id);
		//ִ��SQL
		 rst = pst.executeQuery();
		//ת������
		 Marking marking = null;
		 while(rst.next())
		 {
			 marking = assemble(rst);
		 }
		//�ر�DB����
		 return marking;
	}



	@Override
	public Marking assemble(ResultSet rst) throws SQLException {

		Marking marking = new Marking();
		marking.settest_num(rst.getInt("test_num"));
		marking.settest_que(rst.getString("test_que"));
		marking.settest_ans(rst.getString("test_ans"));
		marking.settest_xuan1(rst.getString("test_xuan1"));
		marking.settest_xuan2(rst.getString("test_xuan2"));
		marking.settest_xuan3(rst.getString("test_xuan3"));
		marking.settest_xuan4(rst.getString("test_xuan4"));
		return marking;
	
	}

	@Override
	public void add(Marking dataObj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}
	}
