package cn.edu.nsu.xiaoxueqi.db.unit;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nsu.xiaoxueqi.db.unit.Unit;
import cn.edu.nsu.xiaoxueqi.db.unit.UnitDAO;
import cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionType;
import cn.edu.nsu.xiaoxueqi.db.subject.Subject;
import cn.edu.nsu.xiaoxueqi.db.subject.SubjectDAO;
/**
 * Servlet implementation class viewservlet
 */
//@WebServlet("/viewservlet")
public class unitaddservlet extends HttpServlet {
private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
    public unitaddservlet() {
      super();
//        // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	 UnitDAO unitdao = new UnitDAO();
	 request.setCharacterEncoding("utf-8");
	 SubjectDAO subdao = new SubjectDAO();
			try {
			   String Subject_name = request.getParameter("Subject_name");
			   Subject	subject = subdao.getByName(Subject_name);//获取subject_id
		     int subjec_id = subject.getSubject_Id();//得到subject_id
		     
		     Unit units =  new Unit();
             //获取表单提交内容
		     String unit_number = request.getParameter("Unit_Number");
		     int Unit_Number = Integer.parseInt(unit_number);
		     
		     String Unit_name = request.getParameter("Unit_name");
		   
		     String unit_id = request.getParameter("Unit_ID");
		     int Unit_ID = Integer.parseInt(unit_id);
		     //设置unit表内容
		     units.setUnit_Number(Unit_Number);
		     units.setUnit_name(Unit_name);
		     units.setUnit_ID(Unit_ID);
		     units.setSubject_Id(subjec_id);
		     //添加进数据库
		     unitdao.add(units);
		     ArrayList<Unit> unit = unitdao.getAll();
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
					unitdao.release();
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