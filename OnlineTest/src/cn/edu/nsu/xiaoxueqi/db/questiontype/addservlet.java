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
public class addservlet extends HttpServlet {
private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
    public addservlet() {
      super();
//        // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	 QuestionTypeDAO typedao = new QuestionTypeDAO();
	 request.setCharacterEncoding("utf-8");
			try {		
		    String type_id = request.getParameter("Type_id");   
		   int Type_id = Integer.parseInt(type_id);
		   
		   String Type_name = request.getParameter("Type_name");
		   
		   QuestionType questiontype = new QuestionType();
			   questiontype.setType_id(Type_id);
			   questiontype.setType_name(Type_name);
			   
			   typedao.add(questiontype);
							     
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