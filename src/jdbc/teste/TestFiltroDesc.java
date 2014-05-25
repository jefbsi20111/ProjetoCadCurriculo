package jdbc.teste;

import java.util.List;


import models.Empresa;
import models.Vaga;
import dao.EmpresaDAO;
import dao.VagaDAO;

public class TestFiltroDesc {
//o m�todo retorna todas as vagas que tenham a incidencia str na pesquisa. 
//� feita uma pesuisa por email em empresa para exibir o nome de da empresa por vaga
	public static void main(String[] args) {
		String str = "s";
		VagaDAO dao = new VagaDAO();
		List<Vaga> vagas = dao.filtro_vagas("%"+str+"%");
		EmpresaDAO dao2 = new EmpresaDAO();
		
		for (Vaga vaga : vagas) {
			Empresa empresa = new Empresa();
			empresa = dao2.filtro_email(vaga.getEmpresa_email_empresa());
			System.out.println("Empresa: " + empresa.getNome_empresa());
			System.out.println("S�rie Vaga: " + vaga.getId_vaga());
			System.out.println("Carga Hor�ria: " + vaga.getCarga_horaria_vaga());
			System.out.println("Remunera��o: " + vaga.getRemuneracao_vaga());
			System.out.println("Requisitos: " + vaga.getRequisitos_vaga());
			System.out.println("Descri��o: " + vaga.getDescricao_vaga());
			System.out.println("-----------------\n");
			}



	}

}
