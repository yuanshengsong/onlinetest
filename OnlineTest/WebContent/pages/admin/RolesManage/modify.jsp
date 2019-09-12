<%@page import="com.sun.org.apache.bcel.internal.generic.FNEG"%>
<%@page import="cn.edu.nsu.exam.roles.Roles" %>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.exam.roles.RolesDAO" %>
<%@page contentType="text/html; charset=utf-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>功能管理-网上书店</title>
<meta charset="utf-8">
<!--全局CSS-->

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/admin.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/pintuer.css">
<script src="<%=request.getContextPath() %>/js/jquery.js"></script>
<script src="<%=request.getContextPath() %>/js/pintuer.js"></script>
<!--私有CSS-->

</head>
<body>
    <!-- 页面顶部导航条 -->
	<div class="row panel titlePanel">
		<div class="col-md-12">
			<div class="col-md-3">
				<h3>
					<i class="fa fa-dashboard"></i> 
				</h3>
			</div>
			<div class="col-md-6">
				<div style="text-align: center;"></div>
			</div>
		
		</div>
	</div>
    <!-- 页面内容体 -->
    <%
    	RolesDAO rolesDAO = new RolesDAO();
    	String role_idStr = request.getParameter("rolse_id");
    	int rolse_id = Integer.parseInt(role_idStr);
    	Roles rolse = rolesDAO.getById(rolse_id);
    
    %>
   <div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 修改功能</strong></div>
  	<div class="panel admin-panel margin-top" id="add">
			<div class="body-content">
				<form method="post" class="form-x" action="<%=request.getContextPath() %>/pages/admin/RolesManage/modifySuccess.jsp?<%=rolse.getRoles_id()%>">
					<table class="table table-hover text-left">
						<div class="panel-body">
			         
		              <div class="form-group col-md-6 form-inline" >
		                  <label class="control-label-required">名称</label>
		                  <input class="form-control" type="text" value="<%=rolse.getRoles_name() %>" name="rolse_name"
		                  placeholder="请输入职位名称">
		                </div>
		                <<div class="form-group col-md-6 form-inline" >
		                  <label class="control-label-required">名称</label>
		                  <input class="form-control" type="text" value="<%=rolse.getRoles_note() %>" name="rolse_note"
		                  placeholder="请输入职位说明">
		                </div>
			    </div>
				</table>
		<div class="field">
			<a href="<%=request.getContextPath() %>/pages/admin/RolesManage/RolesList.jsp"><button class="button bg-main icon-check-square-o" type="submit"> 返回</button></a>
			<button type="submit" class="button bg-main icon-check-square-o"><i class="fa fa-fw fa-lg fa-check-circle"></i>提交</button>
		</div>	
			</div>
			</form>
		</div>
		
		
		
	

	<!--全局JS -->
	<script src="/bookshop/js/admin/share/jquery-3.2.1.min.js"></script>
	<script src="/bookshop/js/admin/share/bootstrap.min.js"></script> 
	<script src="/bookshop/js/admin/share/share.js"></script>
	<!--私有JS-->
	
</body>