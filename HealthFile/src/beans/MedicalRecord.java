package beans;

import java.util.List;

public class MedicalRecord {

	  private Patient patient;
	  private List<String> medications;
	  private List<String> allergies;
	  private List<String> medicalConditions;
	  private List<String> immunizations;
	  private List<String> medicalProcedures;
	  private List<String> testResults;
	  private List<String> medicalNotes;
	  
	  
	  public MedicalRecord(Patient patient, List<String> medications, List<String> allergies,
			List<String> medicalConditions, List<String> immunizations, List<String> medicalProcedures,
			List<String> testResults, List<String> medicalNotes) {
		super();
		this.patient = patient;
		this.medications = medications;
		this.allergies = allergies;
		this.medicalConditions = medicalConditions;
		this.immunizations = immunizations;
		this.medicalProcedures = medicalProcedures;
		this.testResults = testResults;
		this.medicalNotes = medicalNotes;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public List<String> getMedications() {
		return medications;
	}


	public void setMedications(List<String> medications) {
		this.medications = medications;
	}


	public List<String> getAllergies() {
		return allergies;
	}


	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}


	public List<String> getMedicalConditions() {
		return medicalConditions;
	}


	public void setMedicalConditions(List<String> medicalConditions) {
		this.medicalConditions = medicalConditions;
	}


	public List<String> getImmunizations() {
		return immunizations;
	}


	public void setImmunizations(List<String> immunizations) {
		this.immunizations = immunizations;
	}


	public List<String> getMedicalProcedures() {
		return medicalProcedures;
	}


	public void setMedicalProcedures(List<String> medicalProcedures) {
		this.medicalProcedures = medicalProcedures;
	}


	public List<String> getTestResults() {
		return testResults;
	}


	public void setTestResults(List<String> testResults) {
		this.testResults = testResults;
	}


	public List<String> getMedicalNotes() {
		return medicalNotes;
	}


	public void setMedicalNotes(List<String> medicalNotes) {
		this.medicalNotes = medicalNotes;
	}
	
	public void addPatient(int id, String name, int age, String gender, String address, String phoneNumber) {
		  // Crée un nouveau Patient avec les informations données
		  Patient patient = new Patient(id, name, age, gender, address, phoneNumber);
	}
}
