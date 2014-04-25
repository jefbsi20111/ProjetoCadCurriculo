package repositorios;

import java.sql.SQLException;
import java.util.Collection;

import models.Candidato;



public interface RepositorioCandidatos {
	public int NOME = 0;
	public int SALARIO = 1;
	public int DATA_NASCIMENTO = 2;
	
	public void inserir(Candidato candidato) throws SQLException;
}
