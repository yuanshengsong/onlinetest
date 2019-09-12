/**
 * 
 */
package cn.edu.nsu.onlinetest.exam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.onlinetest.DBMain;
import cn.edu.nsu.onlinetest.exam.Exams;;

/**
 * @author ZhangXiaohua
 *
 */
public class ExamsDAO extends DBMain<Exams>
{

	@Override
	public ArrayList<Exams> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from exam";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Exams> exams = new ArrayList<Exams>();
		 while(rst.next())
		 {
			 exams.add(assemble(rst));
		 }
		//关闭DB连接
		 return exams;
	}

	@Override
	public Exams getById(String id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from exam where score_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setString(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Exams exam = null;
		 while(rst.next())
		 {
			 exam = assemble(rst);
		 }
		//关闭DB连接
		 return exam;
	}

	@Override
	public void add(Exams dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into exam(unit_id,student_name,student_id,course_name,course_id,exam_id,score_id,answer_1,answer_2,answer_3,answer_4,answer_5,answer_6,answer_7,answer_8,answer_9,answer_10,answer_11,answer_12,score) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,dataObj.getunit_id());
		pst.setString(2, dataObj.getstudent_name());
		pst.setString(3, dataObj.getstudent_id());
		pst.setString(4, dataObj.getcourse_name());
		pst.setString(5, dataObj.getcourse_id());
		pst.setString(6, dataObj.getexam_id());
		pst.setString(7, dataObj.getscore_id());
		pst.setString(8, dataObj.getanswer_1());
		pst.setString(9, dataObj.getanswer_2());
		pst.setString(10, dataObj.getanswer_3());
		pst.setString(11, dataObj.getanswer_4());
		pst.setString(12, dataObj.getanswer_5());
		pst.setString(13, dataObj.getanswer_6());
		pst.setString(14, dataObj.getanswer_7());
		pst.setString(15, dataObj.getanswer_8());
		pst.setString(16, dataObj.getanswer_9());
		pst.setString(17, dataObj.getanswer_10());
		pst.setString(18, dataObj.getanswer_11());
		pst.setString(19, dataObj.getanswer_12());
		pst.setInt(20,dataObj.getscore());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM exam WHERE score_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}

	@Override
	public Exams assemble(ResultSet rst) throws SQLException {

		Exams exam = new Exams();
		exam.setunit_id(rst.getInt("unit_id"));
		exam.setstudent_name(rst.getString("student_name"));
		exam.setstudent_id(rst.getString("student_id"));
		exam.setcourse_name(rst.getString("course_name"));
		exam.setcourse_id(rst.getString("course_id"));
		exam.setexam_id(rst.getString("exam_id"));
		exam.setscore(rst.getInt("score"));
		exam.setscore_id(rst.getString("score_id"));
		exam.setanswer_1(rst.getString("answer_1"));
		exam.setanswer_2(rst.getString("answer_2"));
		exam.setanswer_3(rst.getString("answer_3"));
		exam.setanswer_4(rst.getString("answer_4"));
		exam.setanswer_5(rst.getString("answer_5"));
		exam.setanswer_6(rst.getString("answer_6"));
		exam.setanswer_7(rst.getString("answer_7"));
		exam.setanswer_8(rst.getString("answer_8"));
		exam.setanswer_9(rst.getString("answer_9"));
		exam.setanswer_10(rst.getString("answer_10"));
		exam.setanswer_11(rst.getString("answer_11"));
		exam.setanswer_12(rst.getString("answer_12"));
		return exam;
	
	}
	}
