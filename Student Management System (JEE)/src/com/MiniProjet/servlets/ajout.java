package com.MiniProjet.servlets;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MiniProjet.bdd.Insert;
import com.MiniProjet.beans.Etudiant;

/**
 * Servlet implementation class ajout
 */
@WebServlet("/ajout")
public class ajout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		
		
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

		 String CIN=request.getParameter("CIN");
		 String N=request.getParameter("N");
		 String P=request.getParameter("P");
		 String DN=request.getParameter("DN");
		 String DI=request.getParameter("DI");
		 String Sexe=request.getParameter("Sexe");
		 String TEL=request.getParameter("TEL");
		 
		 Etudiant et = new Etudiant() ;
		 et.setCIN(CIN);
		 et.setNom(N) ;
		 et.setPrenom(P);
		 et.setDN(DN);
		 et.setDI(DI);
		 et.setSexe(Sexe);
		 et.setTel(TEL);
		 
	      Insert X = new Insert();
	        try {
				X.insertRecord(et);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		 this.getServletContext().getRequestDispatcher("/GererEtudiant.jsp").forward(request, response);
			 
		

		

	
	
	}
}