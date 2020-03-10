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


@WebServlet("/doregister")
public class DoRegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");           //获取用户名
		String pwd = req.getParameter("pwd");			  //获取密码
		String rpwd = req.getParameter("rpwd");           //重复密码
		String sex = req.getParameter("sex");             //获取性别
		String age = req.getParameter("age");             //获取年龄
		String hobby[] = req.getParameterValues("hobby");     //获取爱好
		/* System.out.println(name+"---"+pwd+"-----"+rpwd+"------"+sex+"------"+hobby);*/
		
		// 前台得到 用户输入数据
		 String str = "";
         for (int i = 0; i < hobby.length; i++) {
             str = str + hobby[i];
             // 得到每个元素
             if (i != (hobby.length - 1)) {
                 str += ",";
                 // 如果不为最后一个元素，将其尾部加一个‘,’隔开
             }
         }
        // for 循环拼接爱好数组中的数据
        
        Administrator h = new Administrator(); 
		h.setName(name);
		h.setPassword(pwd);
		h.setSex(sex);
		h.setAge(Integer.valueOf(age));
		h.setHobby(str);
		AdminDao dao  = new AdminImpl();
		Administrator hope = dao.getone(name);
		System.out.println(h);
		if(hope!=null){                                                  
			req.setAttribute("message", "用户名已存在，请重新输入");
			req.getRequestDispatcher("WEB-INF/pages/register.jsp").forward(req, resp);
		}else {
			if (pwd.equals(rpwd)) {
				dao.add(h);	
				resp.sendRedirect("login");
			}else {
				req.setAttribute("error", "两次密码不一致，请重新输入");
				req.getRequestDispatcher("WEB-INF/pages/register.jsp").forward(req, resp);
			}
		}
		
	}
}
