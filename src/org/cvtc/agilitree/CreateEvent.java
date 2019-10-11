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

@WebServlet("/CreateEvent")
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
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("emailAddress");
		String password = request.getParameter("password");
		String eventTitle = request.getParameter("eventTitle");
		String categoryNumber = request.getParameter("catNumber");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
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
		if (eventTitle.isEmpty() || startDate.isEmpty() || eventDescription.isEmpty())  {
			RequestDispatcher rd = request.getRequestDispatcher("createEvent.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request,  response);
			
		} else {
			
			
			try { 
				ResultSet userResults = database.query("select userName as name, password from users");
				while(userResults.next()) {
					if(userResults.getObject("userName").equals(username) &&
							userResults.getObject("password").equals(password)) {
						String query = "select * from events";
						
						ResultSet results = database.query(query);
						
						results.moveToInsertRow();
						
						results.updateString(2, categoryNumber);
						results.updateString(3, startDate);
						results.updateString(4, endDate);
						results.updateString(5, eventTitle);
						results.updateString(6, eventDescription);
						results.updateString(7, startTime);
						results.updateString(8, endTime);
						
						results.insertRow();
						break;
					}
				}
				
				
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
		doGet(request, response);
	}

}

