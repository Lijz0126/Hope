package com.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDao;
import com.dao.AdminImpl;
import com.pojo.Administrator;


@WebServlet("/index")
public class AdminServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminDao dao = new AdminImpl();
		List<Administrator> lists = dao.select();
		System.out.println(lists);
		req.setAttribute("list", lists);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
       
	}
}
