package models;



public class Candidato {

	private Long id_candidato;
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
	public Long getId_candidato() {
		return id_candidato;
	}
	public String getNome_candidato() {
		return nome_candidato;
	}
	public String getEmail_candidato() {
		return email_candidato;
	}
	public String getSenha_candidato() {
		return senha_candidato;
	}
	public String getData_nasc_candidato() {
		return data_nasc_candidato;
	}
	public String getCpf_candidato() {
		return cpf_candidato;
	}
	public String getEnd_candidato() {
		return end_candidato;
	}
	public String getTelefone_candidato() {
		return telefone_candidato;
	}
	public int getEscolaridade_candidato() {
		return escolaridade_candidato;
	}
	public String getExp_candidato() {
		return exp_candidato;
	}
	public String getArea_atuacao_candidato() {
		return area_atuacao_candidato;
	}
	public String getApendices_candidato() {
		return apendices_candidato;
	}
	public void setId_candidato(Long id) {
		this.id_candidato = id;
	}
	public void setNome_candidato(String nome_candidato) {
		this.nome_candidato = nome_candidato;
	}
	public void setEmail_candidato(String email_candidato) {
		this.email_candidato = email_candidato;
	}
	public void setSenha_candidato(String senha_candidato) {
		this.senha_candidato = senha_candidato;
	}
	public void setData_nasc_candidato(String data_nasc_candidato) {
		this.data_nasc_candidato = data_nasc_candidato;
	}
	public void setCpf_candidato(String cpf_candidato) {
		this.cpf_candidato = cpf_candidato;
	}
	public void setEnd_candidato(String end_candidato) {
		this.end_candidato = end_candidato;
	}
	public void setTelefone_candidato(String telefone_candidato) {
		this.telefone_candidato = telefone_candidato;
	}
	public void setEscolaridade_candidato(int escolaridade_candidato) {
		this.escolaridade_candidato = escolaridade_candidato;
	}
	public void setExp_candidato(String exp_candidato) {
		this.exp_candidato = exp_candidato;
	}
	public void setArea_atuacao_candidato(String area_atuacao_candidato) {
		this.area_atuacao_candidato = area_atuacao_candidato;
	}
	public void setApendices_candidato(String apendices_candidato) {
		this.apendices_candidato = apendices_candidato;
	}
	
	public boolean equals(Candidato c) {
	    if (c.getEmail_candidato() == this.email_candidato) {
	        return true;
	    } else {
	        return false;
	    }
	}

	
}
