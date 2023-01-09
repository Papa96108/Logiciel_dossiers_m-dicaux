package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.DossierMedical;

public class DossierMedicalDAO {

	  private Connection connection;

	  public DossierMedicalDAO(Connection connection) {
	    this.connection = connection;
	  }

	  public void add(DossierMedical dossierMedical) throws SQLException {
	    // Création de la requête d'insertion
	    String sql = "INSERT INTO DossierMedical (patient_id, medecin_id, antecedents_medicaux) VALUES (?, ?, ?)";

	    // Préparation de la requête
	    PreparedStatement statement = connection.prepareStatement(sql);
	    statement.setLong(1, dossierMedical.getPatient().getId());
		/*
		 * statement.setLong(2, dossierMedical.getMedecin().getId());
		 * statement.setString(3, dossierMedical.getAntecedentsMedicaux());
		 */

	    // Exécution de la requête
	    statement.executeUpdate();
	  }

	  public void findById(long id) throws SQLException {
	    // Création de la requête de sélection
	    String sql = "SELECT * FROM DossierMedical WHERE id";
	    }
}
