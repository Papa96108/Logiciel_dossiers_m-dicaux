package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Utilisateur;

public class loginDao {

	private static final String ALL_USER = "SELECT login, password from public.user where login = '?' and password = '?'";
	public static Connection connexion() {
		 Connection conn = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gesusers", "postgres", "passer123");
	         //Statement statement = conn.createStatement();
	         System.out.println("Connexion reussie");
	         return conn;
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
		return null;
	}
	public static boolean checkUser(Utilisateur utilisateur) {
		try {
			Connection conn = connexion();
			PreparedStatement preparedInsertStatement = conn.prepareStatement(ALL_USER);
			preparedInsertStatement.setString(1, utilisateur.getLogin());
			preparedInsertStatement.setString(2, utilisateur.getPassword());
		    ResultSet result = preparedInsertStatement.executeQuery();
		    result.next();
		    return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
}

