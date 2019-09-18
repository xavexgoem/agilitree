package org.cvtc.agilitree;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestSQL
 */
@WebServlet("/TestSQL")
public class TestSQL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestSQL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try
	    {
	      // create our mysql database connection
	      String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/test";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "");
	      
	      // our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      String query = "SELECT * FROM users";

	      // create the java statement
	      Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
	      
	      // iterate through the java resultset
	      while (rs.next())
	      {
	        int id = rs.getInt("id");
	        String firstName = rs.getString("first_name");
	        String lastName = rs.getString("last_name");
	        Date dateCreated = rs.getDate("date_created");
	        boolean isAdmin = rs.getBoolean("is_admin");
	        int numPoints = rs.getInt("num_points");
	        
	        // print the results
	        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
