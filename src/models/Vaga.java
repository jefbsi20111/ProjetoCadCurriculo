package models;

public class Vaga {
	
	private Long id_vaga;
	private int carga_horaria_vaga;
	private float remuneracao_vaga;
	private String requisitos_vaga;
	private String descricao_vaga;
	private Long Empresa_id_empresa;
	private String Empresa_email_empresa;
	public Long getId_vaga() {
		return id_vaga;
	}
	public int getCarga_horaria_vaga() {
		return carga_horaria_vaga;
	}
	public float getRemuneracao_vaga() {
		return remuneracao_vaga;
	}
	public String getRequisitos_vaga() {
		return requisitos_vaga;
	}
	public String getDescricao_vaga() {
		return descricao_vaga;
	}
	public Long getEmpresa_id_empresa() {
		return Empresa_id_empresa;
	}
	public String getEmpresa_email_empresa() {
		return Empresa_email_empresa;
	}
	public void setId_vaga(Long id_vaga) {
		this.id_vaga = id_vaga;
	}
	public void setCarga_horaria_vaga(int carga_horaria_vaga) {
		this.carga_horaria_vaga = carga_horaria_vaga;
	}
	public void setRemuneracao_vaga(float remuneracao_vaga) {
		this.remuneracao_vaga = remuneracao_vaga;
	}
	public void setRequisitos_vaga(String requisitos_vaga) {
		this.requisitos_vaga = requisitos_vaga;
	}
	public void setDescricao_vaga(String descricao_vaga) {
		this.descricao_vaga = descricao_vaga;
	}
	public void setEmpresa_id_empresa(Long empresa_id_empresa) {
		Empresa_id_empresa = empresa_id_empresa;
	}
	public void setEmpresa_email_empresa(String empresa_email_empresa) {
		Empresa_email_empresa = empresa_email_empresa;
	}
	
	public boolean equals(Vaga v) {
        if (v.getId_vaga() == this.id_vaga) {
            return true;
        } else {
            return false;
        }
    }
	
}
