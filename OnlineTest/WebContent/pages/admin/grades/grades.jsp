<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>教学班成绩汇总</title>
<link rel="stylesheet" href="../../../css/admin1.css">
<link rel="stylesheet" href="../../../css/pintuer.css">
<script src="../jquery.js"></script>
<script src="../pintuer.js"></script>
<style>
	
</style>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder">教学班成绩汇总</strong></div>
  <div class="padding border-bottom">  
  <button type="button" class="button border-yellow" onclick="window.location.href='#add'"><span class="icon-plus-square-o"></span> 添加班级</button>
  </div>
  <table class="table table-hover text-left">
    <tr>
      <th width="20%">学年</th>
      <th width="20%">学期</th>
      <th width="20%">系部</th>
      <th width="20%">班级</th>
      <th width="20%"></th>
    </tr>
   
    <tr>
      <td>2019-2020学年</td>
      <td>第一学期</td>
      <td>信息与软件工程系</td>
      <td>信息工程17202</td>
      <td><div class="button-group">
      <a class="button border-main" href="index.jsp"><span class="icon-edit"></span>查询</a>
      <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1)"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
    <tr>
      <td>2019-2020学年</td>
      <td>第一学期</td>
      <td>计算机科学与工程系</td>
      <td>网络工程17202</td>
      <td><div class="button-group">
      <a class="button border-main" href="index.jsp"><span class="icon-edit"></span>查询</a>
      <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1)"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
    <tr>
      <td>2019-2020学年</td>
      <td>第一学期</td>
      <td>信息管理系</td>
      <td>电子商务17202</td>
      <td><div class="button-group">
      <a class="button border-main" href="index.jsp"><span class="icon-edit"></span>查询</a>
      <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1)"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
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
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 增加班级</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="">    
      <div class="form-group">
        <div class="label">
          <label>学年：</label>
        </div>
        <div class="field">
          <select style="width:600px;height:37px;">
            <option value="0">2018-2019学年</option>
            <option value="1">2019-2020学年</option>
            <option value="2">2020-2021学年</option>
        </select>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>学期：</label>
        </div>
        <div class="field">
        	<select style="width:600px;height:37px;">
      	    <option value="0">第一学期</option>
            <option value="1">第二学期</option>
            <option value="2">第三学期</option>
        </select>
         
          <div class="tips"></div>
        </div>
      </div>
       
      <div class="form-group">
        <div class="label">
          <label>系部：</label>
        </div>
        <div class="field">
        <select style="width:600px;height:37px;">
      	    <option value="0">计算机科学与工程系</option>
            <option value="1">信息与软件工程系</option>
            <option value="2">信息管理系</option>
            <option value="3">商务管理系</option>
            <option value="4">数字艺术系</option>
            <option value="5">应用外语系</option>
        </select>	
        
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>班级：</label>
        </div>
        <div class="field">
        <select style="width:600px;height:37px;">
      	    <option value="0">软件工程17201</option>
            <option value="1">信息工程17201</option>
            <option value="3">信息工程17202</option>
            <option value="4">计算机17201</option>
            <option value="5">网络工程17202</option>
            <option value="6">物联网17201</option>
            <option value="7">电子商务17202</option>
            <option value="8">信息系统17201</option>
            <option value="9">财务管理17202</option>
            <option value="10">英语17201</option>
            <option value="11">动画17202</option>
            <option value="12">数字媒体技术17201</option>
        </select>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="note" value=""></textarea>
          <div class="tips"></div>
        </div>
      </div>
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