package br.com.medical_sistema.model;

public class Usuario {

	private Long id = 1L;
	private String login;
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public boolean compareUser(String usuario, String senha) {
		if (this.login.equals(usuario) && this.password.equals(senha)) {
			
			System.out.println(login.equals(usuario));
			System.out.println(password.equals(senha));
			return true;
		}
		System.out.println(login.equals(usuario));
		System.out.println(password.equals(senha));
		return false;
	}

}
