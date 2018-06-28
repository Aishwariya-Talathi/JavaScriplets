package com.AishwariyaTalathi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/logins.do")
public class LoginServlet extends HttpServlet {
	 protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			 throws ServletException, IOException {
		//Redirecting request from this servlet to JSP by giving 
		// The path of the JSP file in the requestdispatcher
		  
		 request.setAttribute("name", request.getParameter("name"));
		 request.setAttribute("University", request.getParameter("University"));
		 request.setAttribute("Major", request.getParameter("Major"));
		 request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
	}
	  
}
