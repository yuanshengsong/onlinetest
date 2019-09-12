<%@page contentType="text/html; charset=utf-8" %>
<%@page import="cn.edu.nsu.InfoManagement.db.courses.Courses"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.InfoManagement.db.courses.CoursesDAO"%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>课程管理</title>  
    <link rel="stylesheet" type="text/css" href="../../../../css/admin.css">
	<link rel="stylesheet" type="text/css" href="../../../../css/pintuer.css">
	<script src="../../../../js/jquery.js"></script>
	<script src="../../../../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 课程列表</strong></div>
  <div class="padding border-bottom">
  <a class="button border-yellow" href=""><span class="icon-plus-square-o"></span> 添加课程</a>
  </div> 
  <table class="table table-hover text-left table-bordered table-striped" id="dataTable">
	<thead>
	  <tr>
	    <th width="10%">ID</th>
	    <th width="15%">课程名称</th>
	    <th width="15%">授课老师</th>
	    <th width="15%">开始日期</th>
	    <th width="15%">开始日期</th>
	    <th width="10%">课程概述</th>
	    <th width="20%">操作</th>
	  </tr>
	</thead>
	
	<tbody>
	 <%	
		//从DB中course表中查询所有记录
		CoursesDAO coursesDAO = new CoursesDAO();
	 	ArrayList<Courses> courses = coursesDAO.getAll();
		
		//显示得到的所有数据
		for(int i=0;i<courses.size();i++){
			Courses course = courses.get(i);
	  %>
			<tr>
			  <td><%=course.getCourses_id()%></td>
			  <td><%=course.getCourses_name() %></td>
			  <td><% %></td>
			  <td></td>
			  <td></td>
			  <td></td>
	                    
			  <td>
				<a href="<%=request.getContextPath() %>/pages/admin/InformationManagement/CourseManagement/modify.jsp?courses_id=<%=course.getCourses_id() %>"><button class="button border-main" type="button"><span class="icon-edit"></span>修改</button></a>
				<a href="javascript:void(0)" onclick="return del(17)"><button class="button border-red" type="button"><span class="icon-trash-o"></span>删除</button></a>
  		      </td>
			</tr>
			<% 
		}
		%>
	</tbody>
   
    
    
    <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
  </table>
</div>
<script>
function del(id){
	if(confirm("您确定要删除吗?")){
		
	}
}
</script>

</body></html>