package jdbc.teste;

import dao.CandidatoDAO;
import models.Candidato;



public class TesteCon {

	public static void main(String[] args)throws Throwable{
		Candidato c = new Candidato();
		 
		c.setNome_candidato("tioga");
		c.setEmail_candidato("tioga@mail.com");
		c.setSenha_candidato("concursos");
		c.setData_nasc_candidato("11/01/1998");
		c.setCpf_candidato("66666323");
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
