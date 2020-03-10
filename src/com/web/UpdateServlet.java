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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        int uno = Integer.parseInt(req.getParameter("uno"));
//		String name = req.getParameter("name");
		AdminDao dao = new AdminImpl();
//		Administrator admin = dao.getone(name);
		Administrator admin = dao.one(uno);
		System.out.println(admin);
		req.setAttribute("admin", admin);
		req.getRequestDispatcher("WEB-INF/pages/update.jsp").forward(req, resp);
	}
}
