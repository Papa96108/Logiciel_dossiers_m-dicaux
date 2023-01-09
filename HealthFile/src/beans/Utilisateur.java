package beans;

public class Utilisateur {
	private String login ;
	private String password;
	private String role;
	
	public Utilisateur(String login, String password, String role) {
		super();
		this.login = login;
		this.password = password;
		this.role = role;
	}
	public Utilisateur(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
