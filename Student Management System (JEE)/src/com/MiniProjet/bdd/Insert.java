package com.MiniProjet.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.MiniProjet.beans.Etudiant;

/**
 * Insert PrepareStatement JDBC Example
 * 
 * @author Ramesh Fadatare
 *
 */
public class Insert {
    private static final String INSERT_USERS_SQL = "INSERT INTO etudiant" +
        "  (CIN, Nom, Prenom, DNaissance, DInscription, Sexe, Telephone) VALUES " +
        " (?, ?, ?, ?, ?, ?, ?);";

  

    public void insertRecord(Etudiant et) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
         try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/jeeminiprojet", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, et.getCIN());
            preparedStatement.setString(2, et.getNom());
            preparedStatement.setString(3, et.getPrenom());
            preparedStatement.setString(4, et.getDN());
            preparedStatement.setString(5, et.getDI());
            preparedStatement.setString(6, et.getSexe());
            preparedStatement.setString(7, et.getTel());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
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
