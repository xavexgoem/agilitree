package org.cvtc.agilitree;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DB database;
	
    public CreateEvent() {
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
		String eventTitle = request.getParameter("eventTitle");
		String dateOfEvent = request.getParameter("dateOfEvent");
		String eventDescription = request.getParameter("eventDescription");
		
		String target = null;
		
		try {
			target = "createEvent.jsp";
			request.getRequestDispatcher(target).forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// Validate given input
		if (eventTitle.isEmpty() || dateOfEvent.isEmpty() || eventDescription.isEmpty())  {
			RequestDispatcher rd = request.getRequestDispatcher("createEvent.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request,  response);
			
		} else {
			
			
			try { 
				 System.out.println("Event Title" + eventTitle);
				//String query = "select * from events";
				
				//ResultSet results = database.query(query);
				
				//results.moveToInsertRow();
				//results.updateString(1, email);
				//results.updateString(2, "Not on page");
			//	results.updateInt(3, 0);
				//results.updateInt(4, 0);
			//	results.updateString(5, password);
				//results.insertRow();
				
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

