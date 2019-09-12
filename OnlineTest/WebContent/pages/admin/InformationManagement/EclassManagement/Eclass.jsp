<%@page import="cn.edu.nsu.InfoManagement.db.eclasses.Eclasses"%>
<%@page import="cn.edu.nsu.InfoManagement.db.eclasses.EclassesDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<meta name="renderer" content="webkit">
	<title>行政班管理</title>
	<link rel="stylesheet" type="text/css" href="../../../../css/admin.css">
	<link rel="stylesheet" type="text/css" href="../../../../css/pintuer.css">
	<script src="../../../../js/jquery.js"></script>
	<script src="../../../../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <form method="post" action="" id="listform">
  <div class="panel admin-panel">
    <div><strong class="icon-reorder"> 行政班列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
    <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-yellow icon-plus-square-o" href="add.html"> 添加行政班</a> </li>
        <li >搜索：</li>
        <li>系部
          <select name="department" class="input" onchange="changesearch()" style="width:200px; line-height:17px; display:inline-block">
            <option value="0">信息与软件工程系</option>
            <option value="1">计算机科学与技术系</option>
          </select>
          &nbsp;&nbsp;
          专业
          <select name="profession" class="input" onchange="changesearch()"  style="width:200px; line-height:17px;display:inline-block">
            <option value="0">信息工程</option>
            <option value="1">软件工程</option>
            <option value="2">大数据科学与技术</option>
          </select>
          &nbsp;&nbsp;
          班级
          <select name="class" class="input" onchange="changesearch()"  style="width:200px; line-height:17px;display:inline-block">
            <option value="0">信工17201</option>
            <option value="1">信工17202</option>
            <option value="2">大数据17201</option>
            <option value="3">大数据17202</option>
          </select>
        </li>
        <li>
          <input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a></li>
      </ul>
    </div>
		<table class="table table-hover text-left table-bordered table-striped" id="dataTable">	 <tr>
	  <th width="10%">ID</th>
	  <th width="20%">班导师</th>
	   <th width="20%">班长/副班长</th>
	   <th width="15%">人数</th>
	   <th width="20%">备注</th>
	   <th width="15%">操作</th>
	 </tr>
	 <tr>
      <td>17201</td>
      <td></td>
      <td></td>
      <td>46</td>
      <td>信息工程一班</td>
	  <td>
      	<a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/EclassManagement/modify.html"><button class="button border-main" type="button"><span class="icon-edit"></span>修改</button></a>
		<a href="javascript:void(0)" onclick="return del(17)"><button class="button border-red" type="button"><span class="icon-trash-o"></span>删除</button></a>
      </td>
     </tr>
     <tr>
      <td/>17201</td>
      <td></td>
      <td></td>
      <td>46</td>
      <td>信息工程一班</td>
	  <td>
      	<a href="/examOline/pages/admin/InformationManagement/EclassManagement/modify.html"><button class="button border-main" type="button"><span class="icon-edit"></span>修改</button></a>
		<a href="javascript:void(0)" onclick="return del(17)"><button class="button border-red" type="button"><span class="icon-trash-o"></span>删除</button></a>
      </td>
     </tr>
     <tr>
       <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
     </tr>
   </table>
  </div>
</form>
</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>

</body></html>