package cn.edu.nsu.FunctionServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nsu.exam.function.Function;
import cn.edu.nsu.exam.function.FunctionDAO;

/**
 * Servlet implementation class FunctionListServlst
 */
//@WebServlet("/FunctionListServlst")
public class FunctionListServlst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FunctionListServlst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FunctionDAO functionDAO = new FunctionDAO();
		try {
			//�����ѯ����
			//��DB��function���в�ѯ�����м�¼
			ArrayList<Function> functions = functionDAO.getAll();
			//���ݹ���
			request.setAttribute("functions", functions);
			//�����ɷ�
			request.getRequestDispatcher("/pages/admin/FunctionsManage/Functionlist.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				functionDAO.release();
			} catch (Exception e) {
				// TODO: handle exception
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
