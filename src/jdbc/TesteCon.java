package jdbc;

import dao.CandidatoDAO;
import models.Candidato;



public class TesteCon {

	public static void main(String[] args)throws Throwable{
		Candidato c = new Candidato();
		 
		c.setNome_candidato("dudu");
		c.setEmail_candidato("dudu@mail.com");
		c.setSenha_candidato("parada");
		c.setData_nasc_candidato("11/01/1998");
		c.setCpf_candidato("666663333");
		c.setEnd_candidato("pertoDoPosto");		
		c.setTelefone_candidato("466343");
		c.setEscolaridade_candidato(3);
		c.setExp_candidato("programador front end");
		c.setArea_atuacao_candidato("em casa");
		c.setApendices_candidato("LekTronic");
		 // grave nessa conexão!!!
		 CandidatoDAO dao = new CandidatoDAO();
		 
		 // método elegante
		 dao.adicionar(c);
		 
		 System.out.println("Gravado!");


	}

}
