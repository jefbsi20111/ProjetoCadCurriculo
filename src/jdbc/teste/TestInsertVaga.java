package jdbc.teste;

import dao.VagaDAO;
import models.Vaga;

public class TestInsertVaga {

	public static void main(String[] args) throws Throwable {
		Vaga vaga = new Vaga();
		vaga.setCarga_horaria_vaga(3);
		vaga.setRemuneracao_vaga(500);
		vaga.setRequisitos_vaga("ser foda");
		vaga.setDescricao_vaga("fazer bruxaria");
		vaga.setEmpresa_id_empresa((long) 2);
		vaga.setEmpresa_email_empresa("nimb@labs.com");
		
		VagaDAO dao = new VagaDAO();
		dao.adicionar(vaga);
		System.out.println("Gravado!");
	}

}
