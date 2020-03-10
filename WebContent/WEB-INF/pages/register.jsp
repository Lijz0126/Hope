<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
</style>
</head>
<body>
	<div id="container">
		<form action="doregister" method="post">
			<table border="1" style="border-collapse:collapse;">
	            <tr align = "center">
	               <td colspan="2">用户注册</td>    
	            </tr>
	            <tr>
	               <td>用户名：</td>
	               <td>
	                 <input type = "text" name = "name"/>
	                 <span style = "color:red; font-size:13px;" id = "td2">${message }</span> 
	               </td>  
	             </tr>
	             <tr>
	               <td>密&nbsp;&nbsp;&nbsp;码：</td>
	               <td>
	                 <input type = "password" name = "pwd"/>                      
	               </td>
	            </tr>
	            <tr>
	               <td>确认密码：</td>
	               <td>
	                 <input type = "password" name = "rpwd"/>  
	                 <span style = "color:red; font-size:13px;" id = "td2">${error }</span>                    
	               </td>
	            </tr>
	            <tr>
	               <td>性&nbsp;&nbsp;&nbsp;别：</td>
	               <td>
	                 <input type = "radio" name = "sex" value="男" checked="checked"/> 男   
	                 <input type = "radio" name = "sex" value="女" /> 女                  
	               </td>
	            </tr>
	            <tr>
	               <td>年&nbsp;&nbsp;&nbsp;龄：</td>
	               <td>
	                 <input type = "text" name = "age"/>
	               </td>  
	             </tr>
	            <tr>
	               <td>爱&nbsp;&nbsp;&nbsp;好：</td>
	               <td>
	                 <input type = "checkbox" name = "hobby" value="看电影"/> 看电影
	                 <input type = "checkbox" name = "hobby" value="看书"/> 看书
	                 <input type = "checkbox" name = "hobby" value="打游戏"/> 打游戏</br>
	                 <input type = "checkbox" name = "hobby" value="听音乐"/> 听音乐
	                 <input type = "checkbox" name = "hobby" value="打球"/> 打球
	                 <input type = "checkbox" name = "hobby" value="旅游"/> 旅游                   
	               </td>
	            </tr>
	             <tr align = "center">
	               <td colspan = "2">
	                 <input type="submit" value="注册" id="btn" />
	               </td>    
	             </tr>
	        </table>
		</form>
	</div>
	<!-- <script type="text/javascript">
		btn.onclick=function(){
			alert("注册成功");
		}
	</script>  -->
</body>
</html>