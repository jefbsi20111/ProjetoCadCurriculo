package repositorios;

import java.sql.SQLException;
import java.util.Collection;

import models.Candidato;



public interface RepositorioCandidatos {
	
	
	public void inserir(Candidato candidato) throws SQLException;
}
