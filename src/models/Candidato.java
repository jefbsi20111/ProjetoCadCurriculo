package models;



public class Candidato {
<<<<<<< HEAD
	private Long id;
	private String nome_candidato;
	private String email_candidato;
	private String senha_candidato;
	private String data_nasc_candidato;
	private String cpf_candidato;
	private String end_candidato;
	private String telefone_candidato;
	private int escolaridade_candidato;
	private String exp_candidato;
	private String area_atuacao_candidato;
	private String apendices_candidato;
	/**
	 * @return the nome_candidato
	 */
	public String getNome_candidato() {
		return nome_candidato;
=======
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String senha;
	private String end;
	private String nasc;
	private String escolaridade;
	private String exp;
	private String area;
	private String apendices;
	
	public Candidato(String nome, String cpf, String email, String escolaridade,
	 String exp, String area) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		/*this.telefone = telefone;*/
		this.email = email;
		/*this.end = end;*/
		/*this.nasc = nasc;*/
		this.escolaridade = escolaridade;
		this.exp = exp;
		this.area = area;
		/*this.apendices = apendices;*/
<<<<<<< HEAD
>>>>>>> fe8309730806b02c1ec3b8fe803c88ff70ba57bd
=======
>>>>>>> fe8309730806b02c1ec3b8fe803c88ff70ba57bd
	}
	/**
	 * @return the email_candidato
	 */
	public String getEmail_candidato() {
		return email_candidato;
	}
	/**
	 * @return the senha_candidato
	 */
	public String getSenha_candidato() {
		return senha_candidato;
	}
	/**
	 * @return the data_nasc_candidato
	 */
	public String getData_nasc_candidato() {
		return data_nasc_candidato;
	}
	/**
	 * @return the cpf_candidato
	 */
	public String getCpf_candidato() {
		return cpf_candidato;
	}
	/**
	 * @return the end_candidato
	 */
	public String getEnd_candidato() {
		return end_candidato;
	}
	/**
	 * @return the telefone_candidato
	 */
	public String getTelefone_candidato() {
		return telefone_candidato;
	}
	/**
	 * @return the escolaridade_candidato
	 */
	public int getEscolaridade_candidato() {
		return escolaridade_candidato;
	}
	/**
	 * @return the exp_candidato
	 */
	public String getExp_candidato() {
		return exp_candidato;
	}
	/**
	 * @return the area_atuacao_candidato
	 */
	public String getArea_atuacao_candidato() {
		return area_atuacao_candidato;
	}
	/**
	 * @return the apendices_candidato
	 */
	public String getApendices_candidato() {
		return apendices_candidato;
	}

	public String getSenha(){
		return senha;
	}

<<<<<<< HEAD
=======
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

>>>>>>> fe8309730806b02c1ec3b8fe803c88ff70ba57bd
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @param nome_candidato the nome_candidato to set
	 */
	public void setNome_candidato(String nome_candidato) {
		this.nome_candidato = nome_candidato;
	}
	/**
	 * @param email_candidato the email_candidato to set
	 */
	public void setEmail_candidato(String email_candidato) {
		this.email_candidato = email_candidato;
	}
	/**
	 * @param senha_candidato the senha_candidato to set
	 */
	public void setSenha_candidato(String senha_candidato) {
		this.senha_candidato = senha_candidato;
	}
	/**
	 * @param data_nasc_candidato the data_nasc_candidato to set
	 */
	public void setData_nasc_candidato(String data_nasc_candidato) {
		this.data_nasc_candidato = data_nasc_candidato;
	}
	/**
	 * @param cpf_candidato the cpf_candidato to set
	 */
	public void setCpf_candidato(String cpf_candidato) {
		this.cpf_candidato = cpf_candidato;
	}
	/**
	 * @param end_candidato the end_candidato to set
	 */
	public void setEnd_candidato(String end_candidato) {
		this.end_candidato = end_candidato;
	}
	/**
	 * @param telefone_candidato the telefone_candidato to set
	 */
	public void setTelefone_candidato(String telefone_candidato) {
		this.telefone_candidato = telefone_candidato;
	}
	/**
	 * @param escolaridade_candidato the escolaridade_candidato to set
	 */
	public void setEscolaridade_candidato(int escolaridade_candidato) {
		this.escolaridade_candidato = escolaridade_candidato;
	}
	/**
	 * @param exp_candidato the exp_candidato to set
	 */
	public void setExp_candidato(String exp_candidato) {
		this.exp_candidato = exp_candidato;
	}
	/**
	 * @param area_atuacao_candidato the area_atuacao_candidato to set
	 */
	public void setArea_atuacao_candidato(String area_atuacao_candidato) {
		this.area_atuacao_candidato = area_atuacao_candidato;
	}
	/**
	 * @param apendices_candidato the apendices_candidato to set
	 */
	public void setApendices_candidato(String apendices_candidato) {
		this.apendices_candidato = apendices_candidato;
	}
	
	public boolean equals(Candidato a) {
        if (a.getEmail_candidato() == this.email_candidato) {
            return true;
        } else {
            return false;
        }
    }
	public Long getId_candidato() {
		return id;
	}
	public void setId_candidato(Long id) {
		this.id = id;
	}

}
