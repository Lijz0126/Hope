<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" ;charset="utf-8">
<title>登录</title>

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
</style>
</head>
<body>
	<div id="container">
	    <form id = "form1" action = "dologin" method = "post">
	   		<table border="1" style="border-collapse:collapse;">
	            <tr align = "center">
	               <td colspan="2">用户登录</td>    
	            </tr>
	            <tr>
	               <td>用户名：</td>
	               <td>
	                 <input type = "text" name = "name"/>
					 <span style = "color:red; font-size:13px;" id = "td2">${error }</span> 
	               </td>  
	             </tr>
	             <tr>
	               <td>密&nbsp;&nbsp;&nbsp;码：</td>
	               <td>
	                 <input type = "password" name = "password"/>
	                 <span style = "color:red; font-size:13px;" id = "td2">${message }</span>                         
	               </td>
	            </tr>
	             <tr align = "center">
	               <td colspan = "2">
	               	 <input type = "submit" name="login" value ="登录" />
	                 <a href="register"><input type = "button" name="register" value ="注册" /></a>
	               </td>    
	             </tr>
	        </table>
	    </form>
    </div>
</body> 
</html>