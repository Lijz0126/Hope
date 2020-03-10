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

@WebServlet("/doupdate")
public class DoupdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		int uno = Integer.parseInt(req.getParameter("uno"));
		String name = req.getParameter("name");
		String pwd = req.getParameter("password");
		String sex = req.getParameter("sex");
		int age = Integer.parseInt(req.getParameter("age"));
		String hobby[] = req.getParameterValues("hobby"); 
		System.out.println(sex);
		for (String string : hobby) {
			System.out.println(string);
		}
		
		String str = "";
        for (int i = 0; i < hobby.length; i++) {
            str = str + hobby[i];
            if (i != (hobby.length - 1)) {
                str += ",";
            }
        }
        
		Administrator h = new Administrator();
		h.setUno(uno);
		h.setName(name);
		h.setPassword(pwd);
		h.setSex(sex);
		h.setAge(age);
		h.setHobby(str);
		AdminDao dao = new AdminImpl();
		System.out.println(h);
		dao.update(h);
		resp.sendRedirect("index");
	}

	
}
