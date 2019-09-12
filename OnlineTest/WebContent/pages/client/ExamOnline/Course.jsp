<%@page contentType="text/html; charset=utf-8"  %>
<%@page import="java.util.Calendar" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="/OnlineTest/css/btn.css" />
		<title></title>
	</head>
	<body bgcolor="beige">
		
		<form name="fm1" id="fm1" method="post">
		
			<div>
			<input type="radio" name="unit" value="第一章" checked="checked" />第一章</p>
			<input type="radio" name="unit" value="第二章" />第二章</p>
			<input type="radio" name="unit" value="第三章" />第三章</p>
			<input type="radio" name="unit" value="第四章" />第四章</p>
			<input type="radio" name="unit" value="第五章" />第五章</p>
			<input type="radio" name="unit" value="第六章" />第六章</p>
			<input type="radio" name="unit" value="第七章" />第七章</p>
			</div>
			<div id="login_click">
				<input type="button"name="btn1" class="btn btn"   value="开始测试" onclick="document.fm1.action='<%=request.getContextPath()%>/Client/ExamOnline/exam';document.fm1.submit();">
			    <input type="button"name="btn2" class="btn btn"   value="查看试卷" onclick="document.fm1.action='<%=request.getContextPath()%>/Client/ExamOnline/view'; document.fm1.submit();">
			</div>
			
		</form>
		<div>
			
		</div>
		
		
	</body>
</html>
