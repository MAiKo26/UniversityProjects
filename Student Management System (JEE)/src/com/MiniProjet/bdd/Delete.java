package com.MiniProjet.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Delete Statement JDBC Example
 * 
 * @author Ramesh Fadatare
 *
 */
public class Delete {

    private static final String DELETE_USERS_SQL = "delete from etudiant where CIN = ?;";

    

    public void deleteRecord(String y) throws SQLException {
        System.out.println(DELETE_USERS_SQL);
        
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // no need to register driver manually

        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeminiprojet",
                "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setString(1, y);
            // Step 3: Execute the query or update query
            int result = statement.executeUpdate();
            System.out.println("Number of records affected :: " + result);
        } catch (SQLException e) {

            // print SQL exception information
            printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                // e.printStackTrace(System.err);
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