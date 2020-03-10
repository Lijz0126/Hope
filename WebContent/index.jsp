<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" ;charset="utf-8">
<title>首页</title>
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
	<div id="container">
		<table>
			<thead>
				<tr>
					<th></th>
					<th>姓名</th>
					<th>性别</th>
					<th>年龄</th>
					<th>爱好</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list }" var="admin">
				<tr>
					<td>
						<input type="checkbox" value="${admin.name } " />
					</td>
					<td>${admin.name }</td>
					<td>${admin.sex }</td>
					<td>${admin.age }</td>
					<td>${admin.hobby }</td>
					<td>
						<a href="update?uno=${admin.uno }"><input type = "button" name="update" value ="修改" /></a>
						<a href="delete?name=${admin.name }"><input type = "button" name="delete" value ="删除" /></a>
						
					</td>
				</tr>
				
			</c:forEach>
			
			</tbody>
		</table>
	</div>
	
</body>
</html>