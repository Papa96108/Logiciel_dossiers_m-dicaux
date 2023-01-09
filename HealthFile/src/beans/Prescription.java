package beans;

import java.time.LocalDateTime;
import java.util.List;

public class Prescription {
	  private long id;
	  private DossierMedical dossierMedical;
	  private Medecin medecin;
	  private LocalDateTime date;
	  private List<String> medicaments;
	
	  
	  public Prescription(long id, DossierMedical dossierMedical, Medecin medecin, LocalDateTime date,
			List<String> medicaments) {
		super();
		this.id = id;
		this.dossierMedical = dossierMedical;
		this.medecin = medecin;
		this.date = date;
		this.medicaments = medicaments;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public List<String> getMedicaments() {
		return medicaments;
	}


	public void setMedicaments(List<String> medicaments) {
		this.medicaments = medicaments;
	}
	  
	  
	  
}
