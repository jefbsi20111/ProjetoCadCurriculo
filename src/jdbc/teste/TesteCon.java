package jdbc.teste;

import dao.CandidatoDAO;
import models.Candidato;



public class TesteCon {

	public static void main(String[] args)throws Throwable{
		Candidato c = new Candidato();
		 
		c.setNome_candidato("armando");
		c.setEmail_candidato("armando@mail.com");
		c.setSenha_candidato("ocihc");
		c.setData_nasc_candidato("1998-02-20");
		c.setCpf_candidato("123456789");
		c.setEnd_candidato("Carnaubas");		
		c.setTelefone_candidato("4668643");
		c.setEscolaridade_candidato(3);
		c.setExp_candidato("tecnico das computarias");
		c.setArea_atuacao_candidato("pcs");
		c.setApendices_candidato("PCIConcursos");
		 // grave nessa conexão!!!
		 CandidatoDAO dao = new CandidatoDAO();
		 
		 // método elegante
		 dao.adicionar(c);
		 
		 System.out.println("Gravado!");


	}

}
