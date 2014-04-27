package models;


public class Empresa {

/*private String razaoSocial;*/
private String nomeFantasia;
private String cnpj;
private String telefone;
private String end;
private String email;
private String senha;

public Empresa(String nomeFantasia, String cnpj, String email, 
String end, String senha) {
	
	super();

	this.nomeFantasia = nomeFantasia;
	this.cnpj = cnpj;
	/*this.telefone = telefone;*/
	this.email = email;
	/*this.end = end;*/
	this.senha = senha;

}


	
	

	/**
	 * @return the  nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * @return the end
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param nome the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}


	
	

	/**
	 * @param nomeFantasia the cnpj to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(String end) {
		this.end = end;
	}
}
