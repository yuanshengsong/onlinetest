<%@page import="com.sun.org.apache.bcel.internal.generic.FNEG"%>
<%@page import="cn.edu.nsu.exam.function.Function" %>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.exam.function.FunctionDAO" %>
<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>功能管理</title>
<meta charset="utf-8">
<!--全局CSS-->

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/admin.css">
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/pintuer.css">
		<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
		<script src="<%=request.getContextPath()%>/js/pintuer.js"></script>



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
  		FunctionDAO functionDAO = new FunctionDAO();
  		String function_idStr = request.getParameter("function_id");
  		int function_id = Integer.parseInt(function_idStr);
    	Function function = functionDAO.getById(function_id);
    %>
  <div class="panel-head"><strong class="icon-reorder"> 修改功能</strong></div>
  	<div class="panel admin-panel margin-top" id="add">
			<div class="body-content">
				<form method="post" class="form-x" action="<%=request.getContextPath() %>/pages/admin/FunctionsManage/modifySuccess.jsp?function_id=<%=function.getFunction_id()%>">
					<table class="table table-hover text-left">
						<div class="panel-body">
			         
		              <div class="form-group col-md-6 form-inline" >
		                  <label class="control-label-required">名称</label>
		                  <input class="form-control" type="text" name="function_name"
		                  value="<%=function.getFunction_name()%>"placeholder="请输入功能的名称">
		                </div>
		                <div class="form-group col-md-6 form-inline" >
		                  <label class="control-label-required">URI</label>
		                  <input class="form-control" type="text" name="function_URI" 
		                  value="<%=function.getFunction_URI() %>" placeholder="请输入功能的URI">
		                </div>
		                 <div class="form-group col-md-6 form-inline" >
		                  <label class="control-label-required">说明</label>
		                  <input class="form-control" type="text" name="function_note" 
		                  value="<%=function.getFunction_note() %>" placeholder="请输入功能的说明">
		                </div>
			    </div>
				</table>
				
			<div class="field">
			<a href="<%=request.getContextPath() %>/pages/admin/FunctionsManage/Functionlist.jsp"><button class="button bg-main icon-check-square-o" type="submit"> 返回</button></a>
			<button type="submit" class="button bg-main icon-check-square-o"><i class="fa fa-fw fa-lg fa-check-circle"></i>提交</button>
			</div>
			
			</div>
			</form>
			
		</div>

	
