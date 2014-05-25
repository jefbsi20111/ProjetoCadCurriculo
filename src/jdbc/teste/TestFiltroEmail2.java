package jdbc.teste;

import models.Empresa;
import dao.EmpresaDAO;


public class TestFiltroEmail2 {

	public static void main(String[] args) {
		EmpresaDAO dao = new EmpresaDAO();
		Empresa empresa = new Empresa();
		empresa = dao.filtro_email("nimb@labs.com");
		
		System.out.println("Série Cadastro: " + empresa.getId_empresa());
		System.out.println("Nome: " + empresa.getNome_empresa());
		System.out.println("Email: " + empresa.getEmail_empresa());
		System.out.println("Senha: " + empresa.getSenha_empresa());
		System.out.println("Data Nasc: " + empresa.getCnpj_empresa());
		System.out.println("Endereço: " + empresa.getEnd_empresa());
		System.out.println("Telefone: " + empresa.getTelefone_empresa());
		System.out.println("-----------------\n");

	}

}
