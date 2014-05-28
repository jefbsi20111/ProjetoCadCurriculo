package jdbc.teste;

import java.io.IOException;

import com.itextpdf.text.DocumentException;

import negocio.GeradorPDF;
import models.Candidato;

public class TestPDF {

	public static void main(String[] args) throws DocumentException, IOException {
		Candidato c = new Candidato();
		 
		c.setNome_candidato("Dudú Lelek");
		c.setEmail_candidato("dudu@lelek.com");
		c.setSenha_candidato("lektronic");
		c.setData_nasc_candidato("01/02/1995");
		c.setCpf_candidato("123456789");
		c.setEnd_candidato("Caicós");		
		c.setTelefone_candidato("4668643");
		c.setEscolaridade_candidato(3);
		c.setExp_candidato("Manjador dos Fornt-Ends");
		c.setArea_atuacao_candidato("WebDevelopment");
		c.setApendices_candidato("Bebe breja.");
		
		GeradorPDF pdf = new GeradorPDF();
		pdf.criarDocumento(c);;
	}

}
