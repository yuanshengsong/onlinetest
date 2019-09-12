<%@page import="cn.edu.nsu.xiaoxueqi.db.subject.SubjectDAO"%>
<%@page import="cn.edu.nsu.xiaoxueqi.db.unit.UnitDAO"%>
<%@page import="cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionTypeDAO"%>
<%@page import="cn.edu.nsu.xiaoxueqi.db.test.TestDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.xiaoxueqi.db.questiontype.QuestionType"%>
<%@page import="cn.edu.nsu.xiaoxueqi.db.subject.Subject"%>
<%@page import="cn.edu.nsu.xiaoxueqi.db.test.Test"%>
<%@page import="cn.edu.nsu.xiaoxueqi.db.unit.Unit"%>




<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<link rel="stylesheet" href="../../../../css/admin.css">
<link rel="stylesheet" href="../../../../css/pintuer.css">
<script src="../../../../js/jquery.js"></script>
<script src="../../../../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 添加试题</strong></div>
  <div class="padding border-bottom">  
  <button type="button" class="button border-yellow" onclick="window.location.href='#add'"><span class="icon-plus-square-o"></span> 添加试题</button>
  </div>
  <table class="table table-hover text-left">

    <tr>
      <th width="5%">ID</th>
      <th width="5%">题型</th>
      <th width="10%">对应学科</th>
     
      <th width="10%">单元名称</th>
      <th width="20%">试题内容</th>
      <th width="15%">试题选项</th>
       <th width="15%">试题答案</th>
       <th width="5%">试题难度</th>
      <th width="15%">操作</th>
    </tr>

 <% 
ArrayList<Unit> unit =(ArrayList<Unit>)request.getAttribute("unit"); 
 ArrayList<Test> test =(ArrayList<Test>)request.getAttribute("test"); 
 UnitDAO unitDAO=new UnitDAO();
 /* ArrayList<QuestionType> questionType =(ArrayList<QuestionType>)request.getAttribute("questionType");  */
 QuestionTypeDAO questiontypeDAO=new QuestionTypeDAO();
/*  ArrayList<Subject> subject =(ArrayList<Subject>)request.getAttribute("subject");  */
SubjectDAO subjectDAO= new SubjectDAO();
 for(int i=0;i<test.size();i++)
 {
	 Test test1=test.get(i);
	%>

    <tr>
      <td><%=test1.getTest_id() %></td>  
      <td><%=questiontypeDAO.getById(test1.getType_id()).getType_name() %></td> 
       <td><%=subjectDAO.getById(test1.getSubject_id()).getSubject_name()%></td> 
        <td><%=unitDAO.getById(test1.getUnit_id()).getUnit_name() %></td> 
        <td><%=test1.getTest_text() %>
        <td><%=test1.getTest_option() %>
        <td><%=test1.getTest_answer() %>
         <td><%=test1.getTest_score()%>
      
      <td><div class="button-group">
      <a class="button border-main" href="testmodify.jsp"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="<%=request.getContextPath() %>/DeleTest?test_id=<%=test1.getTest_id()%>" onclick="return del(1,1)"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr> 
    <%} %>
 <%-- <c:forEach items="${test}" var="test1">

  
    <tr>
      <td>${test1.test_id}</td>  
      
      <td> ${test1.type_id}</td>
       <td> ${test1.subject_id}</td>
        
       <td>${test1.test_text}</td>
       
       <td>${test1.test_option}</td>
        <td>${test1.test_answer}</td>
      <td>${test1.test_score}</td>
      <td><div class="button-group">
      <a class="button border-main" href="modify.html"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1)"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr> --%>


 
  </table>
</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 添加试题</strong></div>
  <div class="body-content">
    <form  action="<%=request.getContextPath()%>/AddTestServlet" method="post" class="form-x" >  
      <div class="form-group">
        <!-- <div class="label">
          <label>ID：</label>
        </div>
         <div class="field">
          <input type="text" class="input w50" value="" name="test_id" data-validate="required:ID" />
          <div class="tips"></div>
        </div>
      </div>   -->
  
    <div class="form-group">
        <div class="label">
          <label>题型：</label>
        </div>
         <div class="field">
          <input type="text" class="input w50" value="" name="type_name" data-validate="required:题型" />
          <div class="tips"></div>
        </div>
      </div>  
      
      <div class="form-group">
        <div class="label">
          <label>对应学科：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="subject_name" data-validate="required:请输入学科" />
          <div class="tips"></div>
        </div>
      </div>
       
       
       
      <div class="form-group">
        <div class="label">
          <label>单元名称：</label>
        </div>
         <div class="field">
          <input type="text" class="input w50" value="" name="unit_name" data-validate="required:单元名称" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>试题类容：</label>
        </div>
         <div class="field">
          <input type="text" class="input w50" value="" name="test_text" data-validate="required:试题类容" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>试题选项：</label>
        </div>
       <div class="field">
          <textarea type="text" class="input" name="test_option" value=""></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>试题答案：</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="test_answer" value=""></textarea>
          <div class="tips"></div>
        </div>
        <div class="label">
          <label>试题难度：</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="test_score" value=""></textarea>
          <div class="tips"></div>
        </div>
        
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
