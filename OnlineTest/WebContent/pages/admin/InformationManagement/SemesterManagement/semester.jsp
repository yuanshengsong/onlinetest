<%@page contentType="text/html; charset=utf-8" %>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<meta name="renderer" content="webkit">
	<title>学期学年管理</title>
	<link rel="stylesheet" type="text/css" href="../../../../css/admin.css">
	<link rel="stylesheet" type="text/css" href="../../../../css/pintuer.css">
	<script src="../../../../js/jquery.js"></script>
	<script src="../../../../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 学期学年列表</strong></div>
  <div class="padding border-bottom">  
  <button type="button" class="button border-yellow" onclick="window.location.href='#add'"><span class="icon-plus-square-o"></span> 添加学期学年</button>
  </div>
   <table class="table table-hover text-left table-bordered table-striped" id="dataTable">
    <tr>
      <th width="10%">ID</th>
      <th width="10%">学年</th>
      <th width="10%">学期</th>
      <th width="15%">开学日期</th>
      <th width="15%">放假日期</th>
      <th width="20%">备注</th>
      <th width="20%">操作</th>
    </tr>
   
    <tr>
      <td>1</td>
      <td>2019-2020学年</td>
      <td>第1学期</td>
      <td>2019年9月15日</td>
      <td>2020年2月03日</td>
      <td></td>
      <td>
      	<a href="<%=request.getContextPath()%>/pages/admin/InformationManagement/SemesterManagement/modify.html"><button class="button border-main" type="button"><span class="icon-edit"></span>修改</button></a>
		<a href="javascript:void(0)" onclick="return del(17)"><button class="button border-red" type="button"><span class="icon-trash-o"></span>删除</button></a>
      </td>
    </tr>
    <tr>
      <td>2</td>
      <td>2019-2020学年</td>
      <td>第1学期</td>
      <td>2019年9月15日</td>
      <td>2020年2月03日</td>
      <td></td>
      <td>
      	<a href="/examOline/pages/admin/InformationManagement/SemesterManagement/modify.html"><button class="button border-main" type="button"><span class="icon-edit"></span>修改</button></a>
		<a href="javascript:void(0)" onclick="return del(17)"><button class="button border-red" type="button"><span class="icon-trash-o"></span>删除</button></a>
      </td>
    </tr>
    <tr>
      <td>3</td>
      <td>2019-2020学年</td>
      <td>第1学期</td>
      <td>2019年9月15日</td>
      <td>2020年2月03日</td>
      <td></td>
      <td>
      	<a href="/examOline/pages/admin/InformationManagement/SemesterManagement/modify.html"><button class="button border-main" type="button"><span class="icon-edit"></span>修改</button></a>
		<a href="javascript:void(0)" onclick="return del(17)"><button class="button border-red" type="button"><span class="icon-trash-o"></span>删除</button></a>
      </td>
    </tr>
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