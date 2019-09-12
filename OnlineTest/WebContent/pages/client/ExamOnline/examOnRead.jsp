<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.InfoManagement.db.courses.Courses"%>
<%@page import="cn.edu.nsu.InfoManagement.db.courses.CoursesDAO"%>
<%@page contentType="text/html; charset=utf-8"  %>
<%@page import="java.util.Calendar" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="/OnlineTest/css/btn.css" />
		<title>选择学科</title>
	</head>
	<body bgcolor="beige">
		
		<form name="fm1" id="fm1" method="post">
			<div>
			<%
			CoursesDAO cousesDAO = new CoursesDAO();
			ArrayList<Courses> courses = cousesDAO.getAll();
			
			for(int i = 0;i<courses.size();i++)
			{
				Courses course = courses.get(i);
			%>
			<input type="radio" name="course" value="<%=course.getCourses_name()%>" checked="checked"/><%=course.getCourses_name()%></p>
			</div>
			<%
			} %>
			<div id="login_click">
			
				<input type="button"name="btn1" class="btn btn"   value="下一步" onclick="document.fm1.action='<%=request.getContextPath() %>/Course';document.fm1.submit();">
			    
			</div>
			
		</form>
		<div>
			
		</div>
		<script type="text/javascript">
		
		
		
		</script>
		
	</body>
</html>
