<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="cn.edu.nsu.xiaoxueqi.db.subject.Subject" %>
<%@ page import="cn.edu.nsu.xiaoxueqi.db.subject.SubjectDAO" %>
<%@ page import="cn.edu.nsu.xiaoxueqi.db.unit.Unit" %>
<%@ page import="cn.edu.nsu.xiaoxueqi.db.unit.UnitDAO" %>
<%@ page import= "javax.servlet.ServletException"%>
<%@ page import="javax.servlet.http.HttpServlet" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<%

    String
 path = request.getRequestURI();

    String
 basePath = request.getScheme() + "://"

            +
 request.getServerName() + ":" + request.getServerPort()

            +
 path;

%>

<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="../../../css/admin.css">
<link rel="stylesheet" href="../../../css/pintuer.css">
<script src="../js/jquery.js"></script>
<script src="../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 添加单元</strong></div>
  <div class="padding border-bottom">  
  <button type="button" class="button border-yellow" onclick="#"><span class="icon-plus-square-o"></span> 添加单元</button>
  </div>
  <table class="table table-hover text-left">
    <tr>
      <th width="10%">学科ID</th>
      <th width="20%">对应学科</th>
      <th width="15%">单元序号</th>
      <th width="20%">单元名称</th>
      <th width="10%">单元ID</th>
      <th width="15%">操作</th>
    </tr>
   
       <% 
         // ArrayList<Subject> subject = (ArrayList<Subject>)request.getAttribute("subject");
          ArrayList<Unit> unit = (ArrayList<Unit>)request.getAttribute("unit");
          SubjectDAO subdao = new SubjectDAO();
          for(int i = 0;i < unit.size(); i++){
        	 // Subject subjec = subject.get(i);
              Unit uni = unit.get(i);
          %>
   
    <tr>
      <td><%=uni.getSubject_Id()%></td>     
      <td><%=subdao.getById(uni.getSubject_Id()).getSubject_name() %></td>  
      
      <td><%=uni.getUnit_Number() %></td>
      <td><%=uni.getUnit_name() %></td>
        <td><%=uni.getUnit_ID() %> </td>
      
      <td><div class="button-group">
      <a class="button border-main" href="unitmodify.jsp"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="<%=request.getContextPath() %>/unitdelservlet?Unit_ID=<%=uni.getUnit_ID() %>" onclick="return del(1,1)"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
      <%
      }
          
      %>
     
      
   
  </table>
</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong ><span class="icon-pencil-square-o"></span>添加单元</strong></div>
  <div class="body-content">
    <form action="<%=request.getContextPath() %>/unitaddservlet" method="post" class="form-x" >    
      <div class="form-group">
        <div class="label">
          <label>对应学科：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="Subject_name" data-validate="required:请输入学科" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>单元序号：</label>
        </div>
         <div class="field">
          <input type="text" class="input w50" value="" name="Unit_Number" data-validate="required:单元序号" />
          <div class="tips"></div>
        </div>>
      </div>
      <div class="form-group">
        <div class="label">
          <label>单元名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="Unit_name" data-validate="required:单元名称" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>单元ID：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="Unit_ID" data-validate="required:单元名称" />
          <div class="tips"></div>
        </div>
      </div>
     <!--  <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="Remarks" value=""></textarea>
          <div class="tips"></div>
        </div>
      </div> -->
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
</body></html>