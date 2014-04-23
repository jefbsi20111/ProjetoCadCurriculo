package models;

public class Empresa {
private String nome;
private String cnpj;
private String telefone;
private String email;
private String end;
/**
 * @return the nome
 */
public String getNome() {
	return nome;
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
 * @param nome the nome to set
 */
public void setNome(String nome) {
	this.nome = nome;
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
