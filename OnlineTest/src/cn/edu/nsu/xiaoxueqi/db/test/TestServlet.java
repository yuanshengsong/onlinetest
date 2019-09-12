package cn.edu.nsu.xiaoxueqi.db.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionType;
import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionTypeDAO;
import cn.edu.nsu.xiaoxueqi.db.subject.Subject;
import cn.edu.nsu.xiaoxueqi.db.subject.SubjectDAO;
import cn.edu.nsu.xiaoxueqi.db.unit.Unit;
import cn.edu.nsu.xiaoxueqi.db.unit.UnitDAO;

/**
 * Servlet implementation class TestServlet
 */
//@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
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
		
		try {
			//处理查询请求
			//从DB的users表中查询出所有记录
			ArrayList<Test> test=testDAO.getAll();
			ArrayList<Unit> unit=unitDAO.getAll();
			
			//数据共享
			request.setAttribute("test", test);
			request.setAttribute("unit", unit);
			//请求派发
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
