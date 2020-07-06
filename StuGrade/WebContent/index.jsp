<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	body{margin:0px; padding:0px; width:100%;text-align:center;
		
		 }
	.top{
		
		font-size:50px;
		padding-top:150px;
		text-align:center;
		
	}
	
	.bg{
		padding-left:50px;
		text-align:center;
		background:url("<%=path %>/images/background.jpg");
		background-repeat:no-repeat ;
		background-size:100% 100%;
   
		
	}
	.mid{
		padding-top:30px;
		text-align:center;

	}
	</style>
	  <script language="javascript">
	function check1(){
		
		if( document.getElementById("username").value==""){
			alert("请输入用户名");
			return false;
		}
		if( document.getElementById("password").value==""){
			alert("请输入密码");
			return false;
		}
		console.log(123);
		document.text.submit();
		
	}
	</script>
  </head>
  
  <body class="bg">
    <div  >
    	<div class="top">学生成绩管理系统  
    	</div>
    	<form name="text" action="Login" method="post">
    	<div class="mid" >
    		<tr>
    			<td>用户名：</td><td><input type="text" name="username" id="username" ></td>
    			<br>
    		<br>
    		</tr>
    		<tr>
    			<td >密 &nbsp;&nbsp;码：</td><td><input type="password" name="password" id="password"></td>
    		</tr>
    		<br><br>
    		<tr>
    			<td><input type="radio" name="shenfen" id="shenfen" value="1"  checked>管理员</td>&nbsp;&nbsp;&nbsp;
    			<td><input type="radio" name="shenfen" id="shenfen1" value="0"/>学生</td>
    		</tr>
    		<br><br>
    		<tr>
    			<td><input type="button" value="登陆" name="login" onClick="check1()"></td>&nbsp;&nbsp;
    			
    		</tr>
    	</div>
    	</form>
    </div>
  </body>

	

</html>
