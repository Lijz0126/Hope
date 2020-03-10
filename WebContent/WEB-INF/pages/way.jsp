<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 
	String s = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	/* 	
	getScheme() 获取协议
	getServerName()  获取实际ip
	getServerPort()  获取代理端口
	getContextPath() 获取项目的根路径
	*/

	/* 当端口号是80的时候可以默认不写 */
	if(request.getServerPort()==80){
		s=request.getScheme()+"://"+request.getServerName()+":"+request.getContextPath();
	}else{
		s = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	}
	pageContext.setAttribute("basePath", s);

%>