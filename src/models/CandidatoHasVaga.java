package models;

public class CandidatoHasVaga {
	private Long Candidato_id_candidato;
	private String Candidato_email_candidato;
	private Long Vaga_id_vaga;
	private Long Vaga_Empresa_id_empresa;
	private String Vaga_Empresa_email_empresa;
	
	public Long getCandidato_id_candidato() {
		return Candidato_id_candidato;
	}
	public String getCandidato_email_candidato() {
		return Candidato_email_candidato;
	}
	public Long getVaga_id_vaga() {
		return Vaga_id_vaga;
	}
	public Long getVaga_Empresa_id_empresa() {
		return Vaga_Empresa_id_empresa;
	}
	public String getVaga_Empresa_email_empresa() {
		return Vaga_Empresa_email_empresa;
	}
	public void setCandidato_id_candidato(Long candidato_id_candidato) {
		Candidato_id_candidato = candidato_id_candidato;
	}
	public void setCandidato_email_candidato(String candidato_email_candidato) {
		Candidato_email_candidato = candidato_email_candidato;
	}
	public void setVaga_id_vaga(Long vaga_id_vaga) {
		Vaga_id_vaga = vaga_id_vaga;
	}
	public void setVaga_Empresa_id_empresa(Long vaga_Empresa_id_empresa) {
		Vaga_Empresa_id_empresa = vaga_Empresa_id_empresa;
	}
	public void setVaga_Empresa_email_empresa(String vaga_Empresa_email_empresa) {
		Vaga_Empresa_email_empresa = vaga_Empresa_email_empresa;
	}

}
