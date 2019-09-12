<%@page import="cn.edu.nsu.xiaoxueqi.db.test.Test"%>
<%@page import="cn.edu.nsu.xiaoxueqi.db.test.TestDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
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

</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 修改</strong></div>
  <div class="body-content">
     <form  action="<%=request.getContextPath()%>/Modifytest" method="post" class="form-x" >  
      <div class="form-group">
         <div class="label">
          <label>ID：</label>
        </div>
         <div class="field">
          <input type="text" class="input w50" value="" name="test_id" data-validate="required:ID" />
          <div class="tips"></div>
        </div>
      </div>   
  
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
</body></html>