<%@page import="cn.edu.nsu.InfoManagement.db.courses.Courses"%>
<%@page import="cn.edu.nsu.InfoManagement.db.courses.CoursesDAO"%>
<%@page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>修改课程</title>  
    <link rel="stylesheet" type="text/css" href="../../../../css/admin.css">
	<link rel="stylesheet" type="text/css" href="../../../../css/pintuer.css">
	<script src="../../../../js/jquery.js"></script>
	<script src="../../../../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel margin-top">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>修改课程</strong></div>
  <div class="body-content">
    <form action="" method="post" class="form-x">
    <%
       	   //从courses表中查询修改用户数据
       	   String courses_idStr = request.getParameter("courses_id");
       	   int courses_id = Integer.parseInt(courses_idStr);
       	   CoursesDAO coursesDAO = new CoursesDAO();
       	   Courses course = coursesDAO.getById(courses_id);
       	   //显示修改用户
			              	   
        %>    
      <input type="hidden" name="id"  value="" />  
      
      
      <div class="form-group">
        <div class="label">
          <label>课程名称：</label>
        </div>
        <div class="field">
          <input name="courses_name" value="<%=course.getCourses_name() %>" type="text" class="input w50" name="title" value="" data-validate="required:请输入课程名称" />         
          <div class="tips"></div>
        </div>
      </div> 
    
      <div class="form-group">
        <div class="label">
          <label>开设专业：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="title" value="" data-validate="required:请输入专业名称" />         
          <div class="tips"></div>
          </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>开设年级：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="s_title" value=""/>         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>课程概述：</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="s_desc" style="height:100px;" ></textarea>        
        </div>
     </div>
    
      
     <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>
