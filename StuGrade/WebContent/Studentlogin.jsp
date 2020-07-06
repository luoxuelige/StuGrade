 <%@ page isELIgnored="false" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%> 
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

	<!-- 	<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />	 -->
	
      
		<style type="text/css">
		body {
			 background:url(images/bg.gif);
			}
	</style>
        
	</head>

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="6" align='center'>&nbsp;学生界面&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="18%">ID</td>
					
					<td width="18%">English</td>
					<td width="18%">Math</td>
					<td width="18%">Web</td>
					<td width="18%">java</td>
					
		        </tr>	
				
				<tr align='center' bgcolor="#FFFFFF" height="22">
				    <td bgcolor="#FFFFFF" align="center">
					    ${sb.id}
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
						${sb.gradeone}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${sb.gradetwo}
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    ${sb.gradethree}
					</td>
					<td bgcolor="#FFFFFF" align="center">
					   ${sb.gradefour}
					</td>
				
			
			</table>
			
			
		</div>
		<div align="center"><a href="/StuGrade/index.jsp">点击这里返回</a>
		</div>

	</body>
</html>