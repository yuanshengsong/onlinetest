<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>班级成绩汇总</title>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<c:set var="path" value="<%=basePath%>"></c:set>
</head>
<body style="background: url(/OnlineTest/images/3.png)">
	<div class="container">
		<table class="table table-hover"  >
			<tr style="background-color: rgb(249,249,249)" >
			    <th>学年</th>
				<th >学期</th>
				<th>姓名</th>
				<th>学号</th>
				<th>性别</th>
				<th>专业班级</th>
				<th>系部</th>
				<th>语文</th>
				<th>数学</th>
				<th>外语</th>
				<th>综合</th>
				<th>总分</th>
			</tr>

			<%
			try{
            Class.forName("com.mysql.jdbc.Driver");  ////驱动程序名
            String url = "jdbc:mysql://106.14.165.150:3306/examonline?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false"; //数据库名
            String username = "root";  //数据库用户名
            String password = "MGB123456789++";  //数据库用户密码
            Connection conn = DriverManager.getConnection(url, username, password);  //连接状态
			request.setCharacterEncoding("utf-8");
			if(conn != null){  
		
		out.println("<br />"); 
		out.print("<br />");            
		Statement stmt = null;  
		ResultSet rs = null;  
		
		String sql ="SELECT * FROM examonline"; //查询语句
		stmt = conn.createStatement();  
		rs = stmt.executeQuery(sql);		
			while (rs.next()) {
				
			%>

			<tr >
			    <td><%=rs.getString("school year")%></td>
				<td style="text-align: center";><%=rs.getString("semester")%></td>
				<td><%=rs.getString("name")%></td>
				<td><%=rs.getString("Student Id")%></td>
				<td><%=rs.getString("sex")%></td>
				<td><%=rs.getString("professional classes")%></td>
				<td><%=rs.getString("department")%></td>
				<td><%=rs.getString("chinese")%></td>
				<td><%=rs.getString("mathematics")%></td>
				<td><%=rs.getString("foreign languages")%></td>
				<td><%=rs.getString("comprehensive")%></td>
				<td><%=rs.getString("total score")%></td>
			</tr>

			<%
			}
			}
		else{  
			out.print("连接失败！");  
              }           
        }
		catch (Exception e) {        
            out.print("数据库连接异常！");  
             } 
			%>

		</table>
		
	</div>
	
	
	</body>
</html>