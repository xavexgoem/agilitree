package org.cvtc.agilitree;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestSQL")
public class TestSQL extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DB database;
       
    public TestSQL() {
        super();
        database = DB.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResultSet results = database.query("SELECT * FROM users");
		try {
			while(results.next()) {
				String email = results.getString("emailAddress");
				String password = results.getString("password");
				System.out.println(email);
				System.out.println(password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
