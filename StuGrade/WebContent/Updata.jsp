<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
        
        <link rel="stylesheet" type="text/css" href="<%=path %>/CSS/base.css" />
        
        <script language="javascript">
        	function check4(){
				 var  f=document.formAdd;
					 
		  if(f.gradeone.value==""||f.gradeone.value<=0||f.gradeone.value>=100)
		   
	        {
			  alert("请输入正确的英语成绩");
			  f.gradeone.focus();
			  return false;
		    }
		  

		  if(f.gradetwo.value==""||f.gradetwo.value<=0||f.gradetwo.value>=100)
		   
	        {
			  alert("请输入正确的数学成绩");
			  f.gradetwo.focus();
			  return false;
		    }
		  
		   

		  if(f.gradethree.value==""||f.gradethree.value<=0||f.gradethree.value>=100)
		   
	        {
			  alert("请输入正确的Web语言成绩");
			  f.gradethree.focus();
			  return false;
		    }
		  

		  if(f.gradefour.value==""||f.gradefour.value<=0||f.gradefour.value>=100)
		   
	        {
			  alert("请输入正确的java语言成绩");
			  f.gardefour.focus();
			  return false;
		    }
		  
			 document.formAdd.submit();
			}
        </script>
        <style type="text/css">
	body {
		 background:url(images/bg.gif);
		}
	</style>  
	</head>

	<body leftmargin="2" topmargin="9" >
			<form action="<%=path %>/modifyUser" name="formAdd" method="post" >
				     <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
						<tr bgcolor="#EEF4EA">
					        <td colspan="3" class='title' align='center'><span>学生信息修改</span></td>
					    </tr>
					     <input type="text" name="id" size="20" value="${user.id}" readonly/><!-- readonly只读，￥{user.id}为el表达式 -->
					    
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						   
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						       English：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="gradeone" size="20" value="${user.gradeone}"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						       Math：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="gradetwo" id="userPw" size="22"  value="${user.gradetwo}"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						       Web：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="gradethree" id="userSex" size="22" value="${user.gradethree}"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						    java：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="gradefour" id="userEm" size="22" value="${user.gradefour}"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        &nbsp;
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						       <input type="button" value="修改" onClick="check4()"/>&nbsp; 
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>
