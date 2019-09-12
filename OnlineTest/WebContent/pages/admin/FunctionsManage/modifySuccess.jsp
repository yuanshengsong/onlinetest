<%@page import="cn.edu.nsu.exam.function.Function" %>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.exam.function.FunctionDAO" %>
<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/admin.css">
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/pintuer.css">
		<script src="<%=request.getContextPath() %>/js/jquery.js"></script>
		<script src="<%=request.getContextPath() %>/js/pintuer.js"></script>

</head>
<body>
<div class="">
  <div class="panel-head"><strong class="icon-reorder"> 功能管理</strong></div>
  	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-head"style="text-align: center;">操作成功</h3>
					
				</div>
				<%
				request.setCharacterEncoding("utf-8");
				Function functions = new Function();
				String function_id = request.getParameter("function_id");
				String function_name = request.getParameter("function_name");
				String function_URI = request.getParameter("function_URI");
				String function_note = request.getParameter("function_note");
				functions.setFunction_id(Integer.parseInt(function_id));
				functions.setFunction_name(function_name);
				functions.setFunction_note(function_note);
				functions.setFunction_URI(function_URI);
				FunctionDAO functionsDAO = new FunctionDAO();
				functionsDAO.modify(functions);
				%>
				<div class="panel-body">
		               <div class="alert alert-success"><h4>功能修改成功！</h4></div>
		                
			    </div>
			    <div class="field">
					<a href="<%=request.getContextPath() %>/pages/admin/FunctionsManage/Functionlist.jsp"><button class="button bg-main icon-check-square-o" type="submit"> 返回</button></a>
				</div>
			</div>
		</div>
		
	</div>
</body></html>