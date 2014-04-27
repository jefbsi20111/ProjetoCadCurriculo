package models;

public class Candidato {
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
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
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
	 * @return the nasc
	 */
	public String getNasc() {
		return nasc;
	}
	/**
	 * @return the escolaridade
	 */
	public String getEscolaridade() {
		return escolaridade;
	}
	/**
	 * @return the exp
	 */
	public String getExp() {
		return exp;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @return the apendices
	 */
	public String getApendices() {
		return apendices;
	}

	public String getSenha(){
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	/**
	 * @param nasc the nasc to set
	 */
	public void setNasc(String nasc) {
		this.nasc = nasc;
	}
	/**
	 * @param escolaridade the escolaridade to set
	 */
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	/**
	 * @param exp the exp to set
	 */
	public void setExp(String exp) {
		this.exp = exp;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @param apendices the apendices to set
	 */
	public void setApendices(String apendices) {
		this.apendices = apendices;
	}

}
