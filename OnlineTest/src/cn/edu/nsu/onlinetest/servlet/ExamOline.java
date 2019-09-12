package cn.edu.nsu.onlinetest.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nsu.onlinetest.marking.MarkingDAO;
import cn.edu.nsu.onlinetest.testpaper.Testpaper;
import cn.edu.nsu.onlinetest.testpaper.TestpaperDAO;

import java.util.ArrayList;
import java.util.Calendar;
/**
 * Servlet implementation class ExamOline
 */

public class ExamOline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExamOline() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		String unit = request.getParameter("unit");
		request.getSession().setAttribute("unit", unit);
		Calendar calendar = Calendar.getInstance();
		int Min = calendar.get(Calendar.MINUTE);
		int Sec = calendar.get(Calendar.SECOND);
		int Hour = calendar.get(Calendar.HOUR);
		request.setAttribute("Min", Min);
		request.setAttribute("Sec", Sec);
		request.setAttribute("Hour", Hour);
		System.out.println(Min);
		
		
		
	
			
			
			if("/view".equals(pathInfo))
			{
				
				request.getRequestDispatcher("/pages/client/ExamOnline/testview.jsp").forward(request, response);
			}
			if("/exam".equals(pathInfo)) {
				
			    request.getRequestDispatcher("/pages/client/ExamOnline/onlinetest.jsp").forward(request, response);
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
