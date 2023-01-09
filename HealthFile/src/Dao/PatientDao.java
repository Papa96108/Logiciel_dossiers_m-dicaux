package Dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import beans.Patient;


public class PatientDao {

	private static final String INSERT_PATIENT = "INSERT INTO patients (name, age, gender, address, phone_number) VALUES (?, ?, ?, ?, ?);";
	private static final String DELETE_PATIENT = "DELETE FROM Patient WHERE id = ?;";
	private static final String UPDATE_PATIENT = "UPDATE Patient set nom = ?, prenom = ?, login = ?, password = ? where id = ?;";
	private static final String ALL_PATIENT = "SELECT * FROM public.patients;";
	private static final String GET_PATIENT = "SELECT id, nom, prenom, login, password FROM Patient WHERE id =?";
	private static final String GET_USER_AUTH = "SELECT id, nom, prenom, login, password FROM Medecin WHERE login = ? AND password = ?";



	public static Connection connexion() {
		 Connection conn = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/medical_records", "postgres", "passer123");
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



	public static boolean ajouter(Patient patient) {
		try {
			Connection conn = connexion();
			PreparedStatement preparedInsertStatement = conn.prepareStatement(INSERT_PATIENT);
			preparedInsertStatement.setString(1, patient.getName());
			preparedInsertStatement.setInt(2, patient.getAge());
			preparedInsertStatement.setString(3, patient.getGender());
			preparedInsertStatement.setString(4, patient.getAddress());
			preparedInsertStatement.setString(5, patient.getPhoneNumber());
		    preparedInsertStatement.executeUpdate();
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public static List<Patient> lister(){
		List<Patient> patients = new ArrayList<Patient>();
		try {
			Connection conn = connexion();
			PreparedStatement preparedSelectStatement = conn.prepareStatement(ALL_PATIENT);
			ResultSet rs = preparedSelectStatement.executeQuery();
			while (rs.next()) {
                patients.add(new Patient(rs.getInt("id"),rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("phone_number")));
            }
		}
		catch(Exception e) {
			return null;
		}
		return patients;
	}
	
	/*
	 * public static Patient get(int id) { for(Patient patient : patient) {
	 * if(patient.getId() == id) { return patient; } } return null; }
	 */
	
}


