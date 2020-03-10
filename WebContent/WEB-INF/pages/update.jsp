<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" ;charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		padding:0;
		margin:0;
	}
	#container {
	    position: absolute;
	    top: 40%;
	    left: 40%;
	   } 
	table{
		border:solid 1px #000;
		border-collapse:collapse;
	}
	table th,td{
		border:solid 1px #000;
		padding:5px 10px;
	}
</style>
</head>
<body>
	<%-- 
	<form action="doupdate" method="post" >
			编号：<input name="uno" value="${admin.uno }"><br>
			姓名：<input name="name" value="${admin.name }"><br>
			密码：<input name="password" value="${admin.password }"><br>
			性别：<input name="sex" value="${admin.sex }"><br>
			年龄：<input name="age" value="${admin.age }"><br>
			爱好：<input name="hobby" value="${admin.hobby }"><br>
			<input type="submit" value="提交">
	</form> --%>
<%--  ${admin }  --%>
	<div id="container">
	    <form action = "doupdate" method = "post">
	   		<table border="1" style="border-collapse:collapse;">
	            <!-- <tr align = "center">
	               <td colspan="2">修改</td>    
	            </tr> -->
	            <tr>
	               <td>编&nbsp;&nbsp;&nbsp;号：</td>
	               <td>
	                 <input type = "text" name = "uno" value="${admin.uno }"/>
	               </td>  
	             </tr>
	            <tr>
	               <td>用户名：</td>
	               <td>
	                 <input type = "text" name = "name" value="${admin.name }"/>
	               </td>  
	             </tr>
	             <tr>
	               <td>密&nbsp;&nbsp;&nbsp;码：</td>
	               <td>
	                 <input type = "password" name = "password" value="${admin.password }"/>
	               </td>
	            </tr>
	            <tr>
	               <td>性&nbsp;&nbsp;&nbsp;别：</td>
	               <td>
	               	  <lable>男：<input type = "radio" name = "sex" value="男" <c:if test="${admin.sex=='男' }">checked="checked"</c:if>></lable>
				   	  <lable>女：<input type = "radio" name = "sex" value="女" <c:if test="${admin.sex=='女' }">checked="checked"</c:if>></lable>
	               </td>
	            </tr>
	            <tr>
	               <td>年&nbsp;&nbsp;&nbsp;龄：</td>
	               <td>
	                 <input type = "text" name = "age" value="${admin.age }"/>
	               </td>  
	             </tr>
	            <tr>
	               <td>爱&nbsp;&nbsp;&nbsp;好：</td>
	               <td>
	                 <lable>
	                	 <input type = "checkbox" name = "hobby1" value="看电影" <c:if test="${admin.hobby=='看电影' }">checked="checked"</c:if>>看电影
	                 </lable>
	                 <lable>
	                 	<input type = "checkbox" name = "hobby2" value="看书" <c:if test="${admin.hobby=='看书' }">checked="checked"</c:if>>看书
	                 </lable>
	                 <lable>
	                	 <input type = "checkbox" name = "hobby3" value="听音乐" <c:if test="${admin.hobby=='听音乐' }">checked="checked"</c:if>>打游戏
	                 </lable></br>
	                 <lable>
	                 	<input type = "checkbox" name = "hobby4" value="打游戏" <c:if test="${admin.hobby=='打游戏' }">checked="checked"</c:if>>听音乐
	                 </lable>
	                 <lable>
	                	 <input type = "checkbox" name = "hobby5" value="打球" <c:if test="${admin.hobby=='打球' }">checked="checked"</c:if>>打球
	                 </lable>
	                 <lable>
	                 	<input type = "checkbox" name = "hobby6" value="旅游" <c:if test="${admin.hobby=='旅游' }">checked="checked"</c:if>>旅游
	                 </lable>  
	               </td>
	               <!-- <td>
	                 <input type = "checkbox" name = "hobby" value="看电影"/> 看电影
	                 <input type = "checkbox" name = "hobby" value="看书"/> 看书
	                 <input type = "checkbox" name = "hobby" value="打游戏"/> 打游戏</br>
	                 <input type = "checkbox" name = "hobby" value="听音乐"/> 听音乐
	                 <input type = "checkbox" name = "hobby" value="打球"/> 打球
	                 <input type = "checkbox" name = "hobby" value="旅游"/> 旅游                   
	               </td> -->
	              </tr>
	             <tr align = "center">
	               <td colspan = "2">
	               	 <input type = "submit" value ="提交" />
	               </td>    
	             </tr>
	        </table>
	    </form>
    </div>
</body>
</html>