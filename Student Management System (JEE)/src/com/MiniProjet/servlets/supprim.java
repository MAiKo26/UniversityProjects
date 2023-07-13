package com.MiniProjet.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MiniProjet.bdd.Delete;
import com.MiniProjet.bdd.Insert;

/**
 * Servlet implementation class supprim
 */
@WebServlet("/supprim")
public class supprim extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public supprim() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String CIN = request.getParameter("CIN") ;
		
		 Delete X = new Delete();
	        try {
				X.deleteRecord(CIN);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		 this.getServletContext().getRequestDispatcher("/GererEtudiant.jsp").forward(request, response);
	
	
	}

}
