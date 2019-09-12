<%@page import="javax.jws.WebService"%>
<%@page import="cn.edu.nsu.exam.function.Function"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.exam.function.FunctionDAO"%>
<%@page contentType="text/html; charset=utf-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<!--全局CSS-->
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/admin.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/pintuer.css">
<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/js/pintuer.js"></script>

<!--私有CSS-->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/myModal.css">
</head>

<body>
	<!-- 页面顶部导航条 -->
	<div class="row panel titlePanel">
		<div class="col-md-12">
			<div class="col-md-3">
				<h3>
					<div class="panel-head">
						<strong class="icon-reorder"> 功能管理</strong>
					</div>
				</h3>
			</div>
			<div class="col-md-6">
				<div style="text-align: center;"></div>
			</div>
		</div>
	</div>
	<!-- 页面内容体 -->

	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default" style="margin-bottom: 0px;">
				<div id="collapseFunctionQuery" class="panel-collapse collapse"></div>
			</div>
		</div>


		<div class="panel-body">

			<table width="539"
				class="table table-hover table-bordered table-striped"
				id="dataTable">
				<thead>
					<tr>
						<th width="102">名称</th>
						<th width="147">URI</th>
						<th width="111">说明</th>
						<th width="159">操作</th>
					</tr>
				</thead>
				<tbody>
					<%
						FunctionDAO functionDAO = new FunctionDAO();
						ArrayList<Function> function = functionDAO.getAll();
						for (int i = 0; i < function.size(); i++) {
							Function fun = function.get(i);
					%>
					<tr>
						<td height="48"><%=fun.getFunction_name()%></td>
						<td><%=fun.getFunction_URI()%></td>
						<td><%=fun.getFunction_note()%></td>
						<td><a
							href="<%=request.getContextPath()%>/pages/admin/FunctionsManage/detail.jsp?function_id=<%=fun.getFunction_id()%>"><button
									class="button alert-blue" type="button">详情</button></a> <a
							href="<%=request.getContextPath()%>/pages/admin/FunctionsManage/modify.jsp?function_id=<%=fun.getFunction_id()%>"><button
									class="button alert-green" type="button">修改</button></a> <a
							href="<%=request.getContextPath()%>/pages/admin/FunctionsManage/predom.jsp?function_id=<%=fun.getFunction_id()%>"><button
									class="button alert-yellow" type="button">配置权限</button></a> <a
							href="<%=request.getContextPath()%>/DeletServlet?function_id=<%=fun.getFunction_id()%>"><button class="button alert-red"
									type="button">删除</button></a></td>
					</tr>

					<%
						}
					%>

				</tbody>
			</table>

		</div>
		<!--<div class="panel-footer">
			    	 <div class="row paginationBox">
			    		<div class="col-md-4">
			    			<div class="paginationInfo">显示第 1 至 10 项结果，共 57 项</div>
			    		</div>
			    		<!--<div class="col-md-4"></div>
			    		<div class="col-md-4">
			    			<ul class="pagination">
			    			    <li><a href="#">&laquo;</a></li>
			    			    <li class="active"><a href="#">1</a></li>
			    			    <li><a href="#">2</a></li>
			    			    <li><a href="#">3</a></li>
			    			    <li><a href="#">4</a></li>
			    			    <li><a href="#">5</a></li>
			    			    <li><a href="#">&raquo;</a></li>
			    			  </ul>
			    		</div>
			    	</div>-->
	</div>
	</div>
	</div>

	</div>
	<!--添加/修改模态框 -->
	<div class="row panel titlePanel">
		<div class="col-md-12">
			<div class="col-md-3">
				<h3>
					<div class="panel-head">
						<strong class="icon-reorder"> 增加功能</strong>
					</div>
				</h3>
			</div>
			<div class="col-md-6">
				<div style="text-align: center;"></div>
			</div>
		</div>
	</div>
	<div>
		<form action="<%=request.getContextPath()%>/AddServlet" method="post"
			class="form-x">
			<div class="form-group">

				<div class="form-group">
					<div class="label">
						<label>名称</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="function_name"
							data-validate="required:功能名称" />
						<div class="tips"></div>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>URI</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="function_URI"
							data-validate="required:功能地址" />
						<div class="tips"></div>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>说明</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="function_note"
							data-validate="required:功能说明" />
						<div class="tips"></div>
					</div>
				</div>


				<div class="field">
					<button class="button bg-main icon-check-square-o" type="submit">
						提交</button>
				</div>
			</div>
		</form>
	</div>


	<script src="<%=request.getContextPath()%>/js/myModal.js"></script>
</body>

</html>