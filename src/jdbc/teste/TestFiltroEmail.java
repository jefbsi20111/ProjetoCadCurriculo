package jdbc.teste;

import models.Candidato;
import dao.CandidatoDAO;

public class TestFiltroEmail {

	public static void main(String[] args) {
		CandidatoDAO dao = new CandidatoDAO();
		Candidato candidato = new Candidato();
		candidato = dao.filtro_email("maria@mail.com");
		
		System.out.println("S�rie Cadastro: " + candidato.getId_candidato());
		System.out.println("Nome: " + candidato.getNome_candidato());
		System.out.println("Email: " + candidato.getEmail_candidato());
		System.out.println("Senha: " + candidato.getSenha_candidato());
		System.out.println("Data Nasc: " + candidato.getData_nasc_candidato());
		System.out.println("CPF: " + candidato.getCpf_candidato());
		System.out.println("Endere�o: " + candidato.getEnd_candidato());
		System.out.println("Telefone: " + candidato.getTelefone_candidato());
		System.out.println("Escolaridade: " + candidato.getEscolaridade_candidato());
		System.out.println("Area Atua��o: " + candidato.getArea_atuacao_candidato());
		System.out.println("Experi�ncias: " + candidato.getExp_candidato());
		System.out.println("Apendices: " + candidato.getApendices_candidato());
		System.out.println("-----------------\n");

	}

}
