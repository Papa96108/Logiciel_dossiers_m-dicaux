package beans;

import java.util.List;

public class DossierMedical {
	  private long id;
	  private Patient patient;
	  private List<RendezVous> rendezVous;
	  private List<Prescription> prescriptions;
	  private String antécédentsMédicaux;
	  private List<String> allergies;
	  private List<String> médicamentsEnCours;
	  private List<Diagnostic> diagnostics;
	
	  
	  public DossierMedical(long id, Patient patient, List<RendezVous> rendezVous, List<Prescription> prescriptions,
			String antécédentsMédicaux, List<String> allergies, List<String> médicamentsEnCours,
			List<Diagnostic> diagnostics) {
		super();
		this.id = id;
		this.patient = patient;
		this.rendezVous = rendezVous;
		this.prescriptions = prescriptions;
		this.antécédentsMédicaux = antécédentsMédicaux;
		this.allergies = allergies;
		this.médicamentsEnCours = médicamentsEnCours;
		this.diagnostics = diagnostics;
	}
	  


	public DossierMedical(Patient patient) {
		super();
		this.patient = patient;
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}


	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}


	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}


	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}


	public String getAntécédentsMédicaux() {
		return antécédentsMédicaux;
	}


	public void setAntécédentsMédicaux(String antécédentsMédicaux) {
		this.antécédentsMédicaux = antécédentsMédicaux;
	}


	public List<String> getAllergies() {
		return allergies;
	}


	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}


	public List<String> getMédicamentsEnCours() {
		return médicamentsEnCours;
	}


	public void setMédicamentsEnCours(List<String> médicamentsEnCours) {
		this.médicamentsEnCours = médicamentsEnCours;
	}


	public List<Diagnostic> getDiagnostics() {
		return diagnostics;
	}


	public void setDiagnostics(List<Diagnostic> diagnostics) {
		this.diagnostics = diagnostics;
	}
	  
	 public List<RendezVous> getHistoriqueRendezVous() {
		    return rendezVous;
		  }

		  public void addDiagnostic(Diagnostic diagnostic) {
		    diagnostics.add(diagnostic);
		  }
	  
	  
}
