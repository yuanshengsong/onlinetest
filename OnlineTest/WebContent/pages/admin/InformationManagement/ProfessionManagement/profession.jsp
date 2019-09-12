<%@page import="cn.edu.nsu.InfoManagement.db.professions.ProfessionsDAO"%>
<%@page import="cn.edu.nsu.InfoManagement.db.professions.Professions" %>
<%@page contentType="text/html; charset=utf-8" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<meta name="renderer" content="webkit">
	<title>专业管理</title>
	<link rel="stylesheet" type="text/css" href="../../../../css/admin.css">
	<link rel="stylesheet" type="text/css" href="../../../../css/pintuer.css">
	<script src="../../../../js/jquery.js"></script>
	<script src="../../../../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 专业列表</strong></div>
  <div class="padding border-bottom">  
  <button type="button" class="button border-yellow" onclick="window.location.href='#add'"><span class="icon-plus-square-o"></span> 添加专业</button>
  </div>
   <table class="table table-hover text-left table-bordered table-striped" id="dataTable">
    <tr>
      <th width="15%">ID</th>
      <th width="15%">专业名</th>
      <th width="15%">辅导员</th>
      <th width="25%">备注</th>
      <th width="20%">操作</th>
    </tr>
   
   <%	
		//从DB中course表中查询所有记录
		ProfessionsDAO professionsDAO = new ProfessionsDAO();
	 	ArrayList<Professions> professions = professionsDAO.getAll();
		//显示得到的所有数据
		for(int i=0;i<professions.size();i++){
			Professions profession = professions.get(i);
	  %>
    <tr>
      <td><%=profession.getProfessions_id() %></td>       
      <td><%=profession.getProfessions_name() %></td>
      <td></td>
      <td></td>
      <td>
	    <a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/ProfessionManagement/modify.jsp?professions_id=<%=profession.getProfessions_id()%>"><button class="button border-main" type="button"><span class="icon-edit"></span>修改</button></a>
	    <a href="javascript:void(0)" onclick="return del(17)"><button class="button border-red" type="button"><span class="icon-trash-o"></span>删除</button></a>
      </td>
    </tr>
   	<% 
   	}
	%>
    
	<tr>
	<td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
	</tr>
    
  </table>
</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>
</body></html>
