package cn.edu.nsu.FunctionServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.edu.nsu.exam.function.Function;
import cn.edu.nsu.exam.function.FunctionDAO;

/**
 * Servlet implementation class AddServlet
 */
//@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			request.setCharacterEncoding("utf-8");
			Function functions = new Function();
			FunctionDAO functionsDAO = new FunctionDAO();
//			String function_id = request.getParameter("function_id");
			String function_name = request.getParameter("function_name");
			String function_URI = request.getParameter("function_URI");
			String function_note = request.getParameter("function_note");
//			functions.setFunction_id(Integer.parseInt(function_id));
			functions.setFunction_name(function_name);
			functions.setFunction_note(function_note);
			functions.setFunction_URI(function_URI);
			functionsDAO.add(functions);
			request.getRequestDispatcher("/pages/admin/FunctionsManage/Functionlist.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(function_id);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
