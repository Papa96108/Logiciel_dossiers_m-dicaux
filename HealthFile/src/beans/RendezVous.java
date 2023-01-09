package beans;

import java.time.LocalDateTime;

public class RendezVous {
	  private DossierMedical dossierMedical;
	  private Medecin medecin;
	  private LocalDateTime dateHeure;
	  private String raison;
	
	  
	  public RendezVous(DossierMedical dossierMedical, Medecin medecin, LocalDateTime dateHeure, String raison) {
		super();
		this.dossierMedical = dossierMedical;
		this.medecin = medecin;
		this.dateHeure = dateHeure;
		this.raison = raison;
	}


	public DossierMedical getDossierMedical() {
		return dossierMedical;
	}


	public void setDossierMedical(DossierMedical dossierMedical) {
		this.dossierMedical = dossierMedical;
	}


	public Medecin getMedecin() {
		return medecin;
	}


	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}


	public LocalDateTime getDateHeure() {
		return dateHeure;
	}


	public void setDateHeure(LocalDateTime dateHeure) {
		this.dateHeure = dateHeure;
	}


	public String getRaison() {
		return raison;
	}


	public void setRaison(String raison) {
		this.raison = raison;
	}
	  
	  
	  
	  
}
