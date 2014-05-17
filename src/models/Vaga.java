package models;

public class Vaga {
	
	private String cargaHoraria;
	private String remuneracao;
	private String requisitos;
	private String desc;
	

	/**
	 * @return the cargaHoraria
	 */
	public Vaga(String cargaHoraria, String remuneracao, String requisitos) {
		super();
		this.cargaHoraria = cargaHoraria;
		this.remuneracao = remuneracao;
		this.requisitos = requisitos;
	}


	public String getCargaHoraria() {
		return cargaHoraria;
	}
	/**
	 * @return the remuneracao
	 */
	public String getRemuneracao() {
		return remuneracao;
	}
	/**
	 * @return the requisitos
	 */
	public String getRequisitos() {
		return requisitos;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param cargaHoraria the cargaHoraria to set
	 */
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	/**
	 * @param remuneracao the remuneracao to set
	 */
	public void setRemuneracao(String remuneracao) {
		this.remuneracao = remuneracao;
	}
	/**
	 * @param requisitos the requisitos to set
	 */
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
