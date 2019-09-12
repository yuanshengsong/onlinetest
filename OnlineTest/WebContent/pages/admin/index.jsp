<%@page contentType="text/html; charset=utf-8"  %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>examOnline后台管理系统</title>
    <link rel="stylesheet" href="/OnlineTest/css/pintuer.css"> 
    <link rel="stylesheet" href="/OnlineTest/css/admin.css">
    <script src="/OnlineTest/js/jquery.js"></script>   

</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="/OnlineTest/images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />examOline</h1>
  </div>
  
  
  
  	<ul class="adminm">
  		<li>
  		<a href="#">admin
  		<span class="layui-nav-more"></span>
  		
  		</a>
        <ul class="layui-nav-child layui-anim layui-anim-upbit">
        	<li><a href="#">个人信息</a></li>
        	<li><a href="#">切换账户</a></li>
        	<li><a href="login.html">退出</a></li>
        </ul>
        
  	
  		</li>
  	</ul>

  
  
  
<!--  <div class="head-l"><a class="button button-little bg-green" href="" target="_blank"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="##" class="button button-little bg-blue"><span class="icon-wrench"></span> 清除缓存</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="login.html"><span class="icon-power-off"></span> 退出登录</a> </div>
-->
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>功能列表</strong></div>
  <h2><span class="icon-user"></span>信息管理</h2>
  <ul>
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/DepartmentManagement/department.jsp" target="right"><span class="icon-caret-right"></span>系部管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/ProfessionManagement/profession.jsp" target="right"><span class="icon-caret-right"></span>专业管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/CourseManagement/Course.jsp" target="right"><span class="icon-caret-right"></span>课程管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/OcourseManagement/Ocourse.jsp" target="right"><span class="icon-caret-right"></span>开课管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/ScourseManagement/Scourse.jsp" target="right"><span class="icon-caret-right"></span>选课管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/TeacherManagement/teacher.jsp" target="right"><span class="icon-caret-right"></span>教师管理</a></li>   
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/StudentManagement/student.jsp" target="right"><span class="icon-caret-right"></span>学生管理</a></li>     
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/EclassManagement/Eclass.jsp" target="right"><span class="icon-caret-right"></span>行政班管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/TclassManagement/Tclass.jsp" target="right"><span class="icon-caret-right"></span>教学班管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/SemesterManagement/semester.jsp" target="right"><span class="icon-caret-right"></span>学期学年管理</a></li>
  </ul>    
  <h2><span class="icon-key"></span>权限管理</h2>
  <ul>
    <li><a href="<%=request.getContextPath()%>/pages/admin/RolesManage/RolesList.jsp" target="right"><span class="icon-caret-right"></span>职位管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/FunctionsManage/Functionlist.jsp" target="right"><span class="icon-caret-right"></span>功能管理</a></li>
    <!--<li><a href="Spermission.html" target="right"><span class="icon-caret-right"></span>权限配置</a></li>
    <li><a href="Cpermission.html" target="right"><span class="icon-caret-right"></span>权限控制</a></li>        -->
  </ul> 
  <h2><span class="icon-book"></span>题库管理</h2>
  <ul>
    <li><a href="<%=request.getContextPath()%>/uvservlet" target="right"><span class="icon-caret-right"></span>单元管理</a></li>
    <li><a href="<%=request.getContextPath()%>/viewservlet" target="right"><span class="icon-caret-right"></span>题型管理</a></li>
    <li><a href="<%=request.getContextPath()%>/Test" target="right"><span class="icon-caret-right"></span>试题管理</a></li>  
  </ul>  
  <h2><span class="icon-pencil"></span>考试管理系统</h2>
  <ul>
    <li><a href="<%=request.getContextPath()%>/pages/admin/ExamManage/exam.jsp" target="right"><span class="icon-caret-right"></span>考试管理</a></li>
    <li><a href="<%=request.getContextPath()%>/pages/admin/ExamManage/randomtest.jsp" target="right"><span class="icon-caret-right"></span>随机组卷</a></li> 
  </ul>  
  <h2><span class="icon-pencil-square-o"></span>在线考试管理</h2>
  <ul>
    <li><a href="<%=request.getContextPath()%>/pages/admin/grades/grades.jsp" target="right"><span class="icon-caret-right"></span>教学班成绩汇总</a></li>  
  </ul>  
  
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread">
  <li><a href="{:U('Index/info')}" target="right" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt">网站信息</a></li>
  <li><b>当前语言：</b><span style="color:red;">中文</php></span></li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="welcome.jsp" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>