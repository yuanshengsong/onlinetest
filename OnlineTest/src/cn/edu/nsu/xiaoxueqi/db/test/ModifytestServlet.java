package cn.edu.nsu.xiaoxueqi.db.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionType;
import  cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionTypeDAO;
import  cn.edu.nsu.xiaoxueqi.db.subject.Subject;
import  cn.edu.nsu.xiaoxueqi.db.subject.SubjectDAO;
import cn.edu.nsu.xiaoxueqi.db.unit.Unit;
import cn.edu.nsu.xiaoxueqi.db.unit.UnitDAO;

/**
 * Servlet implementation class Modifytest
 */
@WebServlet("/Modifytest")
public class ModifytestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifytestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String pathInfo=request.getPathInfo();
		TestDAO testDAO=new TestDAO();
		UnitDAO unitDAO=new UnitDAO();
	    SubjectDAO subjectDAO=new SubjectDAO();
		QuestionTypeDAO questiontypeDAO=new QuestionTypeDAO();
		request.setCharacterEncoding("utf-8");
		try {
			
			
			 
			
			  String Test_id =request.getParameter("test_id"); int
			  test_id=Integer.parseInt(Test_id);
		
			 
			 
			String Type_name=request.getParameter("type_name");
			QuestionType questiontype =questiontypeDAO.getByName(Type_name);
			int type_id=questiontype.getType_id();
			
			String Subject_name=request.getParameter("subject_name");
			Subject subject=subjectDAO.getByName(Subject_name);
			int subject_id=subject.getSubject_Id();
			
			String Unit_name=request.getParameter("unit_name");
			Unit unit=unitDAO.getByName(Unit_name);
			int unit_id =unit.getUnit_ID();
			
			String test_text=request.getParameter("test_text");
			String test_option=request.getParameter("test_option");
			String test_answer=request.getParameter("test_answer");
			
			String Test_score=request.getParameter("test_score");
			int test_score=Integer.parseInt(Test_score);
			
			Test test1 =new Test();
			test1.setTest_id(test_id);
			
			test1.setType_id(type_id);
			
			test1.setSubject_id(subject_id);
			test1.setUnit_id(unit_id);
			test1.setTest_text(test_text);
			test1.setTest_option(test_option);
			test1.setTest_answer(test_answer);
			test1.setTest_score(test_score);
			
			testDAO.modify(test1);
			ArrayList<Test> test= testDAO.getAll();
			request.setAttribute("test", test);
		
			request.getRequestDispatcher("/pages/admin/QuestionBankManage/Test/test.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				testDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
