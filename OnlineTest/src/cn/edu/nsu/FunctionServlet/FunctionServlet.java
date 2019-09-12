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
				//�����ѯ����
				//��DB��function���в�ѯ�����м�¼
				ArrayList<Function> functions = functionDAO.getAll();
				//���ݹ���
				request.setAttribute("functions", functions);
				//�����ɷ�
				request.getRequestDispatcher("pages/admin/FunctionsManage/Functionlist.jsp").forward(request, response);
				
			}else if ("/OpenModify".equals(pathInfo)) {
				//�����û��޸ı����ܵĴ���
				//��������
				//��function���в�ѯ�޸ĵ��û�
				String functions_idStr = request.getParameter("functions_isStr");
				int functions_id  =Integer.parseInt(functions_idStr);
				Function function = functionDAO.getById(functions_id);
				
				ArrayList<Roles> roles = rolesDAO.getAll();
				//���ݹ���
				request.setAttribute("function", function);
				request.setAttribute("roles", roles);
				//�����ɷ�
				request.getRequestDispatcher("/pages/admin/FunctionsManage/modify.jsp").forward(request, response);
				
			}else if("/Modify".equals(pathInfo)) {
				//�����û��޸ı���������Ĵ���
				
				//��������
				request.setCharacterEncoding("utf-8");
				//�������л�ȡ���ĺ���û�����
				String function_id = request.getParameter("function_id");
				String roles_id = request.getParameter("rolse_id");
				String function_name = request.getParameter("function_name");;
				String function_URI = request.getParameter("function_URI");
				String function_note = request.getParameter("function_note");
				//�����ĺ���û����ݸ��µ�function���ж�Ӧ��¼
				Function functions = new Function();
				functions.setFunction_id(Integer.parseInt(function_id));
				
				functions.setFunction_name(function_name);
				functions.setFunction_URI(function_URI);
				functions.setFunction_note(function_note);
				
				functionDAO.modify(functions);
				//��������
				//�����ɷ�
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
