<%@page import="cn.edu.nsu.exam.roles.RolesDAO"%>
<%@page import="cn.edu.nsu.exam.roles.Roles"%>
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
		<div class="panel admin-panel">
			<div class="panel-head"><strong class="icon-reorder"> 开课管理</strong></div>
			<div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 功能基本信息</strong></div>
			<table class="table table-hover text-left">
				<tr>
					<th width="33%">名称</th>
					<th width="33%">URI</th>
					<th width="33%">说明</th>
				</tr>
				<%	
					FunctionDAO functionDAO = new FunctionDAO();
					String function_idStr = request.getParameter("function_id");
					
					int function_id = Integer.parseInt(function_idStr);
					Function function = functionDAO.getById(function_id);
					
				%>
				<tr>
					<td><%=function.getFunction_name() %></td>
					<td><%=function.getFunction_URI() %></td>
					<td><%=function.getFunction_note() %></td>
				</tr>

			</table>
		</div>

		<div class="panel admin-panel margin-top" id="add">
			<div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 能运用此功能的角色</strong></div>
			<div class="body-content">
				<form method="post" class="form-x" action="">
					<table class="table table-hover text-left">
						<thead>
							<tr>
								<th>选择</th>
								<th>名称</th>
								<th>职责</th>
							</tr>
						</thead>
						<%
							RolesDAO rolesDAO = new RolesDAO();
							ArrayList<Roles> roles = rolesDAO.getAll();
							for(int i = 0;i<roles.size();i++){
								Roles role = roles.get(i);
							
						%>
							<tbody>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td><%=role.getRoles_name() %></td>
								<td><%=role.getRoles_note() %></td>
							</tr>
						</tbody>
						<%
							}
						%>
					</table>
					</form>
			</div>
			</div>
		<div class="field">
			
			<a href="<%=request.getContextPath() %>/pages/admin/FunctionsManage/Functionlist.jsp"><button class="button bg-main icon-check-square-o" type="submit"> 返回</button></a>

			<a href="modifySuccess.jsp"><button class="button bg-main icon-check-square-o" type="submit"> 提交</button></a>
		</div>
	</body>

</html>