package org.cvtc.agilitree;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetEvents")
public class GetEvents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DB database;
       
    public GetEvents() {
        super();
        database = DB.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResultSet results = database.query("SELECT * FROM events");
		String json = "";
		try {
			json = ServletHelper.ResultSetToJSON(results);
			System.out.println(json);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
