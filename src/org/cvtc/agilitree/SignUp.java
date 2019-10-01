package org.cvtc.agilitree;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DB database;
	
    public SignUp() {
        super();
        database = DB.getInstance();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("psw");
		String passwordConfirm = request.getParameter("psw-repeat");
		
		String target = null;
		
		try {
			target = "signup.jsp";
			request.getRequestDispatcher(target).forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// Validate given input
		if (email.isEmpty() || password.isEmpty() || passwordConfirm.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request,  response);
			
		} else {
			
			
			try { 
				
				String query = "select * from users";
				
				ResultSet results = database.query(query);
				
				results.moveToInsertRow();
				results.updateString(1, email);
				results.updateString(2, "Not on page");
				results.updateInt(3, 0);
				results.updateInt(4, 0);
				results.updateString(5, password);
				results.insertRow();
				
			} 
			
			catch(Exception e) {
				e.printStackTrace();
				
			}
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
