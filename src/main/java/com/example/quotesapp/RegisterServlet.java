package com.example.quotesapp;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @param dispatcher 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, RequestDispatcher dispatcher) 
			throws ServletException, IOException {
		
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		RequestDispatcher dispatcher1 = null;
		
		PrintWriter out = response.getWriter();
		out.print(uname);
		out.print(uemail);
		out.print(upwd);	
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:localhost:3306/Userinfo","root","root");
			PreparedStatement pst = con.prepareStatement("insert into users(uname,upwd,uemail) values (?,?,?)");
			pst.setString(1, uname);
			pst.setString(2, upwd);
			pst.setString(3, uemail);
			
			int rowCount = pst.executeUpdate();
			dispatcher1 = request.getRequestDispatcher("register.jsp");
			if (rowCount > 0) {
				request.setAttribute("status", "Success");
			} else {
				request.setAttribute("Status", "Failed");
			}
			
			dispatcher1.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
		}
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
