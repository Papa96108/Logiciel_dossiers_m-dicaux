package beans;

public class Medecin {
	  private long id;
	  private String nom;
	  private String titre;
	  private String specialites;
	  
	  
	  
	  public Medecin(long id, String nom, String titre, String specialites) {
		super();
		this.id = id;
		this.nom = nom;
		this.titre = titre;
		this.specialites = specialites;
	}
	  
	  
	public Medecin(String nom, String titre, String specialites) {
		
		this.nom = nom;
		this.titre = titre;
		this.specialites = specialites;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSpecialites() {
		return specialites;
	}
	public void setSpecialites(String specialites) {
		this.specialites = specialites;
	}
	  
	  
}
