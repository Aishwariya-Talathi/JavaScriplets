package com.AishwariyaTalathi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	 protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			 throws ServletException, IOException {
		 PrintWriter writer = response.getWriter();
		 writer.println("<html>");
		 writer.println("<head>");
		 writer.println("<title>MyPage</title>");
		 writer.println("</head>");
		 writer.println("<body>");
		 writer.println("<h1>Welcome to My Page!</h1>");
		 writer.println("<h3>Hi, This is Aishwariya Talathi</h3>");
		 writer.println("<p>Have a great Day!</p>");
		 writer.println("</body>");
		 writer.println("</html>"); 		 
	}
	  
}
