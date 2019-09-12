<%@page import="javax.jws.WebService"%>
<%@page import="cn.edu.nsu.exam.roles.Roles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.exam.roles.RolesDAO"%>
<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">

	<head>，<br />
		<meta charset="utf-8">
		<!--全局CSS-->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/admin.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/pintuer.css">
	<script src="<%=request.getContextPath() %>/js/jquery.js"></script>
	<script src="<%=request.getContextPath() %>/js/pintuer.js"></script>

		<!--私有CSS-->
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/myModal.css">
	</head>

	<body>
		<!-- 页面顶部导航条 -->
		<div class="row panel titlePanel">
			<div class="col-md-12">
				<div class="col-md-3">
					<h3>
				<div class="panel-head"><strong class="icon-reorder"> 职位管理</strong></div>
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

						<table width="539" class="table table-hover table-bordered table-striped" id="dataTable">
							<thead>
								<tr>
									<th width="102">名称</th>
									<th width="147">职责</th>
									<th width="159">操作</th>
								</tr>
							</thead>
							<tbody>
							
							<%
								RolesDAO rolesDAO = new RolesDAO();
								ArrayList<Roles> roles = rolesDAO.getAll();
								for(int i= 0;i<roles.size();i++){
									Roles role = roles.get(i);
									%>
								<tr>
									<td height="48"><%=role.getRoles_name() %></td>
									<td><%=role.getRoles_note() %></td>
									<td>
										<a href="<%=request.getContextPath() %>/pages/admin/RolesManage/detail.jsp?rolse_id=<%=role.getRoles_id()%>"><button class="button alert-blue" type="button">详情</button></a>
										<a href="<%=request.getContextPath() %>/pages/admin/RolesManage/modify.jsp?rolse_id=<%=role.getRoles_id()%>"><button class="button alert-green" type="button">修改</button></a>
										<a href="<%=request.getContextPath() %>/pages/admin/RolesManage/predom.jsp?rolse_id=<%=role.getRoles_id()%>"><button class="button alert-yellow" type="button">配置权限</button></a>
										
									</td>
								</tr>
									<%
								}
							
							%>
							</tbody>
						</table>

					</div>
					
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
						<input type="text" class="input w50" value="" name="roles_name"
							data-validate="required:职位名称" />
						<div class="tips"></div>
					</div>
				</div>


				<div class="form-group">
					<div class="label">
						<label>说明</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="roles_note"
							data-validate="required:职位说明" />
						<div class="tips"></div>
					</div>
				</div>


				<div class="field">
					<button class="button bg-main icon-check-square-o" type="submit">提交</button>
				</div>
			</div>
		</form>
	</div>
		
		<!--私有JS-->
		<script src="<%=request.getContextPath() %>/js/myModal.js"></script>
		
		</script>
	</body>

</html>