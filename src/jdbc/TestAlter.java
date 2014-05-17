package jdbc;

import java.text.ParseException;

import models.Candidato;
import dao.CandidatoDAO;

public class TestAlter {

	public static void main(String[] args) throws ParseException {
		Candidato c = new Candidato();
		String s = "dudu";
		 
		c.setId_candidato((long) 1);
		c.setNome_candidato("Eduardo");
		c.setEmail_candidato("dudu@mail.com");
		c.setSenha_candidato("parada");
		c.setData_nasc_candidato("22/05/1998");
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
		 dao.alterar(c,s);

	}

}
