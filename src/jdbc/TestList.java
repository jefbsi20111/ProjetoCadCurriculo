package jdbc;

import java.util.List;

import models.Candidato;
import dao.CandidatoDAO;




public class TestList {

	public static void main(String[] args) {
		CandidatoDAO dao = new CandidatoDAO();
		List<Candidato> candidatos = dao.listar();
		
		for (Candidato candidato : candidatos) {
			System.out.println("Série Cadastro: " + candidato.getId_candidato());
			System.out.println("Nome: " + candidato.getNome_candidato());
			System.out.println("Email: " + candidato.getEmail_candidato());
			System.out.println("Senha: " + candidato.getSenha_candidato());
			System.out.println("Data Nasc: " + candidato.getData_nasc_candidato());
			System.out.println("CPF: " + candidato.getCpf_candidato());
			System.out.println("Endereço: " + candidato.getEnd_candidato());
			System.out.println("Telefone: " + candidato.getTelefone_candidato());
			System.out.println("Escolaridade: " + candidato.getEscolaridade_candidato());
			System.out.println("Area Atuação: " + candidato.getArea_atuacao_candidato());
			System.out.println("Experiências: " + candidato.getExp_candidato());
			System.out.println("Apendices: " + candidato.getApendices_candidato());
			System.out.println("-----------------\n");
			}


	}

}
