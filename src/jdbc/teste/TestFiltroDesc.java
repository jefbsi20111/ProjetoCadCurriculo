package jdbc.teste;

import java.util.List;


import models.Empresa;
import models.Vaga;
import dao.EmpresaDAO;
import dao.VagaDAO;

public class TestFiltroDesc {
//o método retorna todas as vagas que tenham a incidencia str na pesquisa. 
//é feita uma pesuisa por email em empresa para exibir o nome de da empresa por vaga
	public static void main(String[] args) {
		String str = "s";
		VagaDAO dao = new VagaDAO();
		List<Vaga> vagas = dao.filtro_vagas("%"+str+"%");
		EmpresaDAO dao2 = new EmpresaDAO();
		
		for (Vaga vaga : vagas) {
			Empresa empresa = new Empresa();
			empresa = dao2.filtro_email(vaga.getEmpresa_email_empresa());
			System.out.println("Empresa: " + empresa.getNome_empresa());
			System.out.println("Série Vaga: " + vaga.getId_vaga());
			System.out.println("Carga Horária: " + vaga.getCarga_horaria_vaga());
			System.out.println("Remuneração: " + vaga.getRemuneracao_vaga());
			System.out.println("Requisitos: " + vaga.getRequisitos_vaga());
			System.out.println("Descrição: " + vaga.getDescricao_vaga());
			System.out.println("-----------------\n");
			}



	}

}
