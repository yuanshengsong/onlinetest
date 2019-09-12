package cn.edu.nsu.xiaoxueqi.db.unit;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  cn.edu.nsu.xiaoxueqi.db.unit.Unit;
import cn.edu.nsu.xiaoxueqi.db.unit.UnitDAO;
/**
 * Servlet implementation class viewservlet
 */
//@WebServlet("/viewservlet")
public class unitdelservlet extends HttpServlet {
private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
    public unitdelservlet() {
      super();
//        // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	 UnitDAO typedao = new UnitDAO();
	 
			try {
			   String idstr = request.getParameter("Unit_ID");
	          int Type_id = Integer.parseInt(idstr);
		     typedao.delete(Type_id);
			     
		    ArrayList<Unit> unit = typedao.getAll();
			request.setAttribute("unit", unit);
			request.getRequestDispatcher("/pages/admin/QuestionBankManage/unit.jsp").forward(request,response);
	
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
