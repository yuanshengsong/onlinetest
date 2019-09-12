<%@page import="cn.edu.nsu.InfoManagement.db.professions.ProfessionsDAO"%>
<%@page import="cn.edu.nsu.InfoManagement.db.professions.Professions" %>
<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>修改专业</title>  
    <link rel="stylesheet" type="text/css" href="../../../../css/admin.css">
	<link rel="stylesheet" type="text/css" href="../../../../css/pintuer.css">
	<script src="../../../../js/jquery.js"></script>
	<script src="../../../../js/pintuer.js"></script>
</head>
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 修改专业</strong></div>
  <div class="body-content">
    <form action="" method="post" class="form-x">
       <%
       String professions_idStr = request.getParameter("professions_id");
   	   int professions_id = Integer.parseInt(professions_idStr);
   	   ProfessionsDAO professionsDAO = new ProfessionsDAO();
   	   Professions profession = professionsDAO.getById(professions_id);
       	   //显示修改用户
			              	   
        %>    
      <div class="form-group">
        <div class="label">
          <label>专业名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="<%=profession.getProfessions_name() %>" name="title" data-validate="required:请输入专业名" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>辅导员：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="title" data-validate="required:请输入辅导员" />
          <div class="tips"></div>
        </div>
      </div>
	  
      <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="note" value=""></textarea>
          <div class="tips"></div>
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