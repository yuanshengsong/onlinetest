package cn.edu.nsu.FunctionServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nsu.exam.function.Function;
import cn.edu.nsu.exam.function.FunctionDAO;
import cn.edu.nsu.exam.roles.Roles;
import cn.edu.nsu.exam.roles.RolesDAO;

/**
 * Servlet implementation class FunctionServlet
 */
//@WebServlet("/FunctionServlet")
public class FunctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FunctionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		FunctionDAO functionDAO = new FunctionDAO();
		RolesDAO rolesDAO = new RolesDAO();
		try {
			if("/Functionlist".equals(pathInfo)) {
				//处理查询请求
				//从DB的function表中查询出所有记录
				ArrayList<Function> functions = functionDAO.getAll();
				//数据共享
				request.setAttribute("functions", functions);
				//请求派发
				request.getRequestDispatcher("pages/admin/FunctionsManage/Functionlist.jsp").forward(request, response);
				
			}else if ("/OpenModify".equals(pathInfo)) {
				//处理用户修改表单功能的代码
				//处理请求
				//从function表中查询修改的用户
				String functions_idStr = request.getParameter("functions_isStr");
				int functions_id  =Integer.parseInt(functions_idStr);
				Function function = functionDAO.getById(functions_id);
				
				ArrayList<Roles> roles = rolesDAO.getAll();
				//数据共享
				request.setAttribute("function", function);
				request.setAttribute("roles", roles);
				//请求派发
				request.getRequestDispatcher("/pages/admin/FunctionsManage/modify.jsp").forward(request, response);
				
			}else if("/Modify".equals(pathInfo)) {
				//处理用户修改表单功能请求的代码
				
				//处理请求
				request.setCharacterEncoding("utf-8");
				//从请求中获取更改后的用户数据
				String function_id = request.getParameter("function_id");
				String roles_id = request.getParameter("rolse_id");
				String function_name = request.getParameter("function_name");;
				String function_URI = request.getParameter("function_URI");
				String function_note = request.getParameter("function_note");
				//将更改后的用户数据更新到function表中对应记录
				Function functions = new Function();
				functions.setFunction_id(Integer.parseInt(function_id));
				
				functions.setFunction_name(function_name);
				functions.setFunction_URI(function_URI);
				functions.setFunction_note(function_note);
				
				functionDAO.modify(functions);
				//共享处理结果
				//请求派发
				request.getRequestDispatcher("/pages/admin/FunctionsManage/modifySuccess.jsp").forward(request, response);
			}
			else if ("/OpenAdd".equals(pathInfo)) {
				
				
			}
			else if ("/Add".equals(pathInfo)) {
				
				
			}
			else if ("/Delete".equals(pathInfo)){
				
				
			}
			else if ("/Detail".equals(pathInfo)) {
				
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				functionDAO.release();
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
