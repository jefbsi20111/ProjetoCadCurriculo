package jdbc.teste;

import dao.CandidatoDAO;
import models.Candidato;



public class TesteCon {

	public static void main(String[] args)throws Throwable{
		Candidato c = new Candidato();
		 
		c.setNome_candidato("luke sky bixa");
		c.setEmail_candidato("luke@viado.com");
		c.setSenha_candidato("lukelea");
		c.setData_nasc_candidato("01/02/1995");
		c.setCpf_candidato("123456789");
		c.setEnd_candidato("Carnaubas");		
		c.setTelefone_candidato("4668643");
		c.setEscolaridade_candidato(3);
		c.setExp_candidato("tecnico das computarias");
		c.setArea_atuacao_candidato("pcs");
		c.setApendices_candidato("PCIConcursos");
		 // grave nessa conex�o!!!
		 CandidatoDAO dao = new CandidatoDAO();
		 
		 // m�todo elegante
		 dao.adicionar(c);
		 
		 System.out.println("Gravado!");


	}

}
