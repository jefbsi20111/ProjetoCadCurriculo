package jdbc.teste;

import models.Candidato;
import models.Vaga;
import dao.CandidatoDAO;
import dao.CandidatoHasVagaDAO;
import dao.VagaDAO;

public class TestInsertCHV {

	public static void main(String[] args) throws Throwable  {
		CandidatoDAO cd = new CandidatoDAO();
		VagaDAO vd = new VagaDAO();
		CandidatoHasVagaDAO chvdao = new CandidatoHasVagaDAO();
		
		Candidato candidato = new Candidato();		
		Vaga vaga = new Vaga();
		
		candidato = cd.filtro_email("chico@mail.com");System.out.println("cd.filtro_email -----> Done!");
		vaga = vd.filtro_vagas_id((long) 2);System.out.println("cd.filtro_vagas_id -----> Done!");
		
		System.out.println("Série Usuário: "+candidato.getId_candidato());
		System.out.println("Email Usuário: "+candidato.getEmail_candidato());
		System.out.println("Série  Vaga: "+vaga.getId_vaga());
		System.out.println("Série Empresa: "+vaga.getEmpresa_id_empresa());
		System.out.println("Email Empresa: "+vaga.getEmpresa_email_empresa());
		System.out.println("---------------------------------------\n");
		chvdao.adicionar(candidato,vaga);System.out.println("Adicionado!");
	}

}
