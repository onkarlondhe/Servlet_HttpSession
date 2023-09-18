package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstSession
 */
@WebServlet("/FirstSession")
public class FirstSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		if(username.equalsIgnoreCase("Ram") && password.equals("1234")) {
			 request.setAttribute("username", "Ram");
			 HttpSession session = request.getSession();
			 session.setAttribute("username", username);
		
			 RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			 rd.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			out.println("<h2 style='color:red'>Something Went Wrong..</h2>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
