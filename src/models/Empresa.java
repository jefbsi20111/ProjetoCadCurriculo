package models;



public class Empresa {
	private Long id_empresa;
	private String nome_empresa;
	private String email_empresa;
	private String senha_empresa;
	private String cnpj_empresa;
	private String telefone_empresa;
	private String end_empresa;
	
	
	
	
	/**
	 * @return the id_empresa
	 */
	public Long getId_empresa() {
		return id_empresa;
	}




	/**
	 * @param id_empresa the id_empresa to set
	 */
	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}




	/**
	 * @return the nome_empresa
	 */
	public String getNome_empresa() {
		return nome_empresa;
	}




	/**
	 * @return the email_empresa
	 */
	public String getEmail_empresa() {
		return email_empresa;
	}




	/**
	 * @return the senha_empresa
	 */
	public String getSenha_empresa() {
		return senha_empresa;
	}




	/**
	 * @return the cnpj_empresa
	 */
	public String getCnpj_empresa() {
		return cnpj_empresa;
	}




	/**
	 * @return the telefone_empresa
	 */
	public String getTelefone_empresa() {
		return telefone_empresa;
	}




	/**
	 * @return the end_empresa
	 */
	public String getEnd_empresa() {
		return end_empresa;
	}




	/**
	 * @param nome_empresa the nome_empresa to set
	 */
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}




	/**
	 * @param email_empresa the email_empresa to set
	 */
	public void setEmail_empresa(String email_empresa) {
		this.email_empresa = email_empresa;
	}




	/**
	 * @param senha_empresa the senha_empresa to set
	 */
	public void setSenha_empresa(String senha_empresa) {
		this.senha_empresa = senha_empresa;
	}




	/**
	 * @param cnpj_empresa the cnpj_empresa to set
	 */
	public void setCnpj_empresa(String cnpj_empresa) {
		this.cnpj_empresa = cnpj_empresa;
	}




	/**
	 * @param telefone_empresa the telefone_empresa to set
	 */
	public void setTelefone_empresa(String telefone_empresa) {
		this.telefone_empresa = telefone_empresa;
	}




	/**
	 * @param end_empresa the end_empresa to set
	 */
	public void setEnd_empresa(String end_empresa) {
		this.end_empresa = end_empresa;
	}




	public boolean equals(Empresa e) {
        if (e.getEmail_empresa() == this.email_empresa) {
            return true;
        } else {
            return false;
        }
    }
}