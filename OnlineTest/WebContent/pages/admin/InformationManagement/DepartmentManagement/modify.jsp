<%@page import="cn.edu.nsu.InfoManagement.db.departments.Departments"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.InfoManagement.db.departments.DepartmentsDAO"%>
<%@page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>修改系部</title>  
    <link rel="stylesheet" type="text/css" href="../../../../css/admin.css">
	<link rel="stylesheet" type="text/css" href="../../../../css/pintuer.css">
	<script src="../../../../js/jquery.js"></script>
	<script src="../../../../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 修改系部</strong></div>
  <div class="body-content">
    <form action="" method="post" class="form-x"> 
    <%
       	   //从departments表中查询修改用户数据
       	   String departments_idStr = request.getParameter("departments_id");
       	   int departments_id = Integer.parseInt(departments_idStr);
       	   DepartmentsDAO departmentsDAO = new DepartmentsDAO();
       	   Departments department = departmentsDAO.getById(departments_id);
       	   //显示修改用户
			              	   
        %>   
      <div class="form-group">
        
        <div class="label">
          <label>系部名称：</label>
        </div>
        <div class="field">
        <input name="departments_name" value="<%=department.getDepartments_name() %>" type="text" class="input w50" name="title" value="" data-validate="required:请输入系名" />
          <div class="tips"></div>
        </div>
      </div>
      
      
      <div class="form-group">
        <div class="label">
          <label>老师人数：</label>
        </div>
        <div class="field">
          <input name="departments_TNum" value="<%=department.getDepartments_TNum() %>" type="text" class="input w50" name="title" value="" data-validate="required:请输入老师人数" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>学生人数：</label>
        </div>
        <div class="field">
          <input name="departments_SNum" value="<%=department.getDepartments_SNum() %>" type="text" class="input w50" name="title" value="" data-validate="required:请输入学生人数" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>系部地址：</label>
        </div>
        <div class="field">
          <input name="departments_address" value="<%=department.getDepartments_address() %>" type="text" class="input w50" name="title" value="" data-validate="required:请输入系部地址" />
          <div class="tips"></div>
        </div>
      </div>
      
      <!-- <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="note" value=""></textarea>
          <div class="tips"></div>
        </div>
      </div> -->
       
       <div class="field" style="text-align: center;">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
       
    </form>
  </div>
</div>
</body>
</html>