package org.cvtc.agilitree;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public Contact() {
//        super();
//        // TODO Auto-generated constructor stub
//		
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
		
			final String firstName = request.getParameter("firstName");
			final String lastName = request.getParameter("lastName");
			final String message = request.getParameter("commentsBox");
			
			final String fromActual = request.getParameter("contactEmail");
			final String from = "carlsemailmanagement@gmail.com";
			final String password = "ContactCarl";
			
			
			final String to = "gtheisen@student.cvtc.edu";
			final String subject = "A customer has tried to contact you";
			
			
			final String body = firstName + " "+ lastName + " wants you to know that: \n\n\""
										+ message + "\"\n\n Email them back at:\n" + fromActual;
			
			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println(to);
			System.out.println(subject);
			System.out.println(body);
			System.out.println(from);
			System.out.println(password);
			
			
			// this line is what triggers the errors
			SendEmail.send(from, password, to, subject, body);

			out.print("message has been sent successfully");
			out.close();
		
			System.out.println("finished");
			//response.sendRedirect("index.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
