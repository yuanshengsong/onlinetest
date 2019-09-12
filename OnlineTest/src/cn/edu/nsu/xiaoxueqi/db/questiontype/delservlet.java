package cn.edu.nsu.xiaoxueqi.db.questiontype;

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
/**
 * Servlet implementation class viewservlet
 */
//@WebServlet("/viewservlet")
public class delservlet extends HttpServlet {
private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
    public delservlet() {
      super();
//        // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	 QuestionTypeDAO typedao = new QuestionTypeDAO();
	 
			try {
			   String idstr = request.getParameter("Type_id");
	          int Type_id = Integer.valueOf(idstr);
		     typedao.delete(Type_id);
			     
		    ArrayList<QuestionType> questionType = typedao.getAll();
			request.setAttribute("questionType", questionType);
			request.getRequestDispatcher("/pages/admin/QuestionBankManage/QuestionTypes.jsp").forward(request,response);
	
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("数据库出现异常");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("数据库出现异常");
				e.printStackTrace();
			}finally {
				try {
					typedao.release();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
	
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doGet(request, response);
	}

}