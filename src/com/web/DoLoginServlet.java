package com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDao;
import com.dao.AdminImpl;
import com.pojo.Administrator;



@WebServlet("/dologin")
public class DoLoginServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");      //获取用户名
        String pwd = req.getParameter("password");	 //获取密码
        /*System.out.println(name+"-------"+pwd);*/
        
        AdminDao dao = new AdminImpl();
        Administrator admin = dao.getone(name);
        if (admin!=null) {
        	if(admin.getPassword().equals(pwd)) {        		
        		resp.sendRedirect("index");
        	}else {
        		req.setAttribute("message", "用户名与密码不匹配请重新输入");
            	req.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(req, resp);
        	}
        	
        }else {
        	req.setAttribute("error", "用户不存在请重新输入");
        	req.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(req, resp);
        }
	}
}
