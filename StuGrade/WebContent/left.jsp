<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="<%=path %>/CSS/base.css" type="text/css" />
	<link rel="stylesheet" href="<%=path %>/CSS/dtree.css" type="text/css" />
	<style type="text/css">
	    div {
			padding:0px;
			margin:0px;
		}
		
		body {
		 scrollbar-base-color:#bae87c;
		 scrollbar-arrow-color:#FFFFFF;
		 scrollbar-shadow-color:#c1ea8b;
		 padding:0px;
		 margin:auto;
		 text-align:center;
		 background-color:#ffffff;
		 background:url(images/bg.gif);
		}
		
		.bitem {
		  background:url(images/side_snow.gif);
		  height:26px;
		  line-height:26px;
		  text-align:center;
		  cursor:pointer;
		  background-repeat: no-repeat;
		  margin-top:0px;
			
		}
		
	</style>
	<script language='javascript'>var curopenItem = '1';</script>

	<base target="main" />
  </head>
  <body target="main">
  	
  	<div class='bitem'>
  		<div class='title'><tr >学生成绩</tr><br/></div>
  		<tr><a href='<%=path %>/studentInfo' target='main'>学生成绩管理</a></tr><br><!-- 内容在mainjsp页面显示 -->
  		

  	</div>
  	

  </body>
</html>