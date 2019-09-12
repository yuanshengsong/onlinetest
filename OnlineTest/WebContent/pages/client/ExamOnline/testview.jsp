<%@page import="cn.edu.nsu.onlinetest.exam.Exams"%>
<%@page import="cn.edu.nsu.onlinetest.exam.ExamsDAO"%>
<%@page contentType="text/html; charset=utf-8" %>
<%@page import="cn.edu.nsu.onlinetest.testpaper.TestpaperDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.onlinetest.marking.Marking"%>
<%@page import="cn.edu.nsu.onlinetest.marking.MarkingDAO"%>
<%@page import="cn.edu.nsu.onlinetest.testpaper.Testpaper"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="/OnlineTest/css/btn.css"/>
		<link rel="stylesheet" href="/OnlineTest/css/summary.css" />
		<title>查看试卷</title>
		<style>
		#div1{
			font-family: "new york";
			margin:5px 6PX 7PX 8PX;
			
		}
		</style>
	</head>
	<body>
	<div class="l-panel col-xs-8  purpel">
    <div class="l-panel-head ">
        <div class="text-left">
            <i class="fa fa-gittip l-img"></i>
            <span>试卷详情</span>
        </div>
    </div>
    <div class="row">
    <%
    ExamsDAO examsDAO = new ExamsDAO();
    Exams exam = examsDAO.getById("1731092023510086");
    
    
    %>
        <h5 class="col-xs-4"><span>分数：<%=exam.getscore()%></span></h5>
       <div class="div1" id="div1">
		.
		<%
				TestpaperDAO testpaperDAO = new TestpaperDAO();
				ArrayList<Testpaper> test = testpaperDAO.getAll();
				MarkingDAO markingDAO = new MarkingDAO();
				String strque = null;
				Testpaper tests = test.get(1);
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
					你的答案是：<%=marking.gettest_xuan2()%></p>
					<div style="color: red;"><td>正确答案是：<%=marking.gettest_ans()%></td></p></div>
				</div>
			<%}
				%>
		
		
		<div align="center" id="login_click">
		<a href="examOnRead.html" id="login_click">返回</a>
		</div>
	</body>
</html>
