package models;
//Se o id é 0, é candidato. Se o id é 

public class User {

	private String email;
	private String senha;
	private int id;
	
	public user(String email, String senha, int id) {
		this.email = email;
		this.senha = senha;
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setId(String id) {
		this.id = id;
	}