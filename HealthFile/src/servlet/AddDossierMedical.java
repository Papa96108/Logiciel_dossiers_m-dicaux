package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DossierMedical;
import beans.Medecin;

/**
 * Servlet implementation class AddDossierMedical
 */
@WebServlet("/AddDossierMedical")
public class AddDossierMedical extends HttpServlet {
	private static final long serialVersionUID = 1L;

       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  // Récupération des données du formulaire
		String patientNom = request.getParameter("patientNom");
	    String patientAge = request.getParameter("patientAge");
	    String patientGenre = request.getParameter("patientGenre");
	    String patientAdresse = request.getParameter("patientAdresse");
	    String medecinNom = request.getParameter("medecinNom");
	    String medecinTitre = request.getParameter("medecinTitre");
	    String[] medecinSpecialites = request.getParameterValues("medecinSpecialites");
	}
	// Création de l'objet Médecin
	/*
	 * Medecin medecin = new Medecin(patientNom, medecinTitre,
	 * Arrays.asList(medecinSpecialites));
	 */
    // Création de l'objet Dossier médical
	/* DossierMedical dossierMedical = new DossierMedical(patient, medecin); */

}
