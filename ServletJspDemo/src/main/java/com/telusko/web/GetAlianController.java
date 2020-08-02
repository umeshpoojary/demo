package com.telusko.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AlianDao;
import com.telusko.web.model.Alian;

/**
 * Servlet implementation class GetAlianController
 */
@SuppressWarnings("serial")
public class GetAlianController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		AlianDao dao = new AlianDao();
		Alian a = dao.getAlian(aid);
		request.setAttribute("alian", a);
		
		HttpSession session = request.getSession();
		session.setAttribute("alian",a);
		response.sendRedirect("ShowAlian.jsp");
		
		//RequestDispatcher rd = request.getRequestDispatcher("ShowAlian.jsp");
		//rd.forward(request, response);
		
		
}
}
