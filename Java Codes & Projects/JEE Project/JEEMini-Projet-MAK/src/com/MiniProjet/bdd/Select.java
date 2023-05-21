package com.MiniProjet.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.MiniProjet.beans.Etudiant;

/**
 * Select PreparedStatement JDBC Example
 * 
 * @author Ramesh Fadatare
 *
 */
public class Select {
    private static final String QUERY = "select * from etudiant";

    public  List<Etudiant> SelectResult() {
    	List<Etudiant> ets = new ArrayList<Etudiant>();

    	 try {
 			Class.forName("com.mysql.jdbc.Driver");
 		} catch (ClassNotFoundException e1) {
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}

        // using try-with-resources to avoid closing resources (boiler plate code)

        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/jeeminiprojet", "root", "");

            // Step 2:Create a statement using connection object
            Statement Statement = connection.createStatement();) {
            System.out.println(Statement);
            // Step 3: Execute the query or update query
            ResultSet rs = Statement.executeQuery(QUERY);

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
            	Etudiant et = new Etudiant();
            	
                et.setCIN(rs.getString("CIN")) ;
                et.setNom(rs.getString("Nom"));
                et.setPrenom(rs.getString("Prenom"));
                et.setDN(rs.getString("DNaissance"));
                et.setDI(rs.getString("DInscription"));
                et.setSexe(rs.getString("Sexe"));
                et.setTel(rs.getString("Telephone"));
                
                System.out.println(et.getCIN());
                
                ets.add(et) ;
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        // Step 4: try-with-resource statement will auto close the connection.
		return ets;
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}