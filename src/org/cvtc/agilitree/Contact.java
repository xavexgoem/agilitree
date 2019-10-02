package org.cvtc.agilitree;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


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
 
 
 String target = null;
 try {
 
  final String firstName = request.getParameter("firstName");
  final String lastName = request.getParameter("lastName");
  final String email = request.getParameter("contactEmail");
  final String message = request.getParameter("commentsBox");
 
  PrintWriter writer = response.getWriter();
  if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || message.isEmpty()) {
//   RequestDispatcher rd = request.getRequestDispatcher("contact.jsp");
//   writer.println("<font color=red>Please fill all the fields</font>");
//   rd.include(request,  response);  
  target = "index.jsp";
 
  } else {
   
  System.out.println("First Name: " + firstName);
  System.out.println("Last Name: " + lastName);
  System.out.println("Email: " + email);
  System.out.println("Message=: " + message);
  target = "index.jsp";
 
  }
} catch (Exception e) {
 e.printStackTrace();
}

 response.sendRedirect("index.jsp");
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
}
}