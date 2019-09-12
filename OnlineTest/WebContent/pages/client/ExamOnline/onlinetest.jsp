<%@page import="cn.edu.nsu.onlinetest.testpaper.TestpaperDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.onlinetest.marking.Marking"%>
<%@page import="cn.edu.nsu.onlinetest.marking.MarkingDAO"%>
<%@page import="cn.edu.nsu.onlinetest.testpaper.Testpaper"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=utf-8"  %>
<%@page import="java.util.Calendar" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="/OnlineTest/css/btn.css" />
		<style type="text/css">
			#div1{
				font-family: "new york";
				margin:5px 6PX 7PX 8PX;
				
			}
			#div2{
				position: fixed;
				left: 50%;
				bottom: 0 px;
				background: beige;
			}
			
		</style>
		<title>在线测试</title>
		<%
					int EndTime = 120;//总时长
					Calendar calendar = Calendar.getInstance();
					int Min = (int)request.getAttribute("Min");
					int Sec = (int)request.getAttribute("Sec");
					int Hour = (int)request.getAttribute("Hour");
					System.out.println("102"+Min);
					
					%>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js">
	
			
			</script>
			<script>
			
	var box = window.setInterval(tt,1000)
	function tt(){
		var time=new Date();
		var hour=time.getHours();
		if(hour>=12){
			hour=hour-12;
		}

		var minute=time.getMinutes();

		var seconds=time.getSeconds();
		var eTime = <%=EndTime*60%>+ <%=(Min*60+Hour*3600+Sec)%> - (minute*60+hour*3600+seconds);
		
		var NowHour = parseInt(eTime/3600);
		var NowMin = parseInt((eTime-NowHour*3600)/60);
		var NowSec = eTime%60;
	 	var str=changTime(NowHour)+':'+changTime(NowMin)+':'+changTime(NowSec);
		document.getElementById('span1').innerHTML = str; 
	}
		function changTime(obj){
		return obj<10 ? ('0'+obj):obj;
				}
		if(NowSec == 0){
		window.clearInterval(box);//清除计时器
		}
</script>
	</head>
		
	<body style="background: beige;">
	
	
		<h1 align="center">成都东软学院在线测试</h1>
		<div>
			<img src="<%=request.getContextPath()%>/images/timg.png" width="300px" height="300px">
		</div>
		<div>
			<h1>一、选择题</h1>
		</div>
		
				<div class="div2" id="div2"><svg height="76" version="1.1" width="319"  style="overflow: hidden; position: relative; left: -0.9625px; top: -0.5875px;">
				<font color="red"> 当前时间:</font>
				<span id="span1" class="a"></span>
		
				</div>
				<form action="<%=request.getContextPath()%>/pages/client/ExamOnline/result.html" method="post">
				<div class="div1" id="div1">
				<%
				TestpaperDAO testpaperDAO = new TestpaperDAO();
				ArrayList<Testpaper> test = testpaperDAO.getAll();
				MarkingDAO markingDAO = new MarkingDAO();
				String strque = null;
				Testpaper tests = test.get(0);
				for(int i = 0;i<10;i++){
					if(i == 0){
						strque = Integer.toString(tests.getquestion1());
					}
					if(i ==1){
						strque = Integer.toString(tests.getquestion2());
					}
					if(i==2)
					{
						strque = Integer.toString(tests.getquestion3());
					}
					if(i==3)
					{
						strque = Integer.toString(tests.getquestion4());
						
					}
					if(i==4)
					{
						strque = Integer.toString(tests.getquestion5());
					}
					if(i==5)
					{
						strque = Integer.toString(tests.getquestion6());
					}
					if(i==6)
					{
						strque = Integer.toString(tests.getquestion7());
					}
					if(i==7)
					{
						strque = Integer.toString(tests.getquestion8());
					}
					if(i==8)
					{
						strque = Integer.toString(tests.getquestion9());
					}
					if(i==9)
					{
						strque = Integer.toString(tests.getquestion10());
					}
					Marking marking = markingDAO.getById(strque);
					
					
				%>	
				<div>
					<td><%=i+1 %>.<%=marking.gettest_que() %></td></p>
					<label><input type="radio" name="<%=tests.getquestion1()%>"value="<%=marking.gettest_xuan1()%>" />a.<%=marking.gettest_xuan1()%></label></p>
					<label><input type="radio" name="<%=tests.getquestion1()%>"value="<%=marking.gettest_xuan2()%>" />a.<%=marking.gettest_xuan2()%></label></p>
					<label><input type="radio" name="<%=tests.getquestion1()%>"value="<%=marking.gettest_xuan3()%>" />a.<%=marking.gettest_xuan3()%></label></p>
					<label><input type="radio" name="<%=tests.getquestion1()%>"value="<%=marking.gettest_xuan4()%>" />a.<%=marking.gettest_xuan4()%></label></p>	
					
				</div>
			<%}
				%>
				
				
				
				</div>
				<div class="login_click" align="center">
				<button type="submit" class="btn btn">提交</button>
				</div>
				
			</form>
			
			
	</body>
	
</html>

