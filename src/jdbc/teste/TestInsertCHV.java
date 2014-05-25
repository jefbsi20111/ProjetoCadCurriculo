package jdbc.teste;

import models.Candidato;
import models.Vaga;
import dao.CandidatoDAO;
import dao.CandidatoHasVagaDAO;
import dao.VagaDAO;

public class TestInsertCHV {

	public static void main(String[] args) throws Throwable {
		CandidatoDAO cd = new CandidatoDAO();
		VagaDAO vd = new VagaDAO();
		Candidato candidato = cd.filtro_email("fulano@mail.hue");
		Vaga vaga = vd.filtro_vagas_id((long) 3);
		
		CandidatoHasVagaDAO chvdao = new CandidatoHasVagaDAO();
		chvdao.adicionar(candidato,vaga);
		System.out.println("Adicionado!");

	}

}
