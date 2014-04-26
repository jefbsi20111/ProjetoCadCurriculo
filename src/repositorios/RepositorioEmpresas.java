package repositorios;

import java.sql.SQLException;

import models.Candidato;
import models.Empresa;

public interface RepositorioEmpresas {
	public void inserir(Empresa empresa) throws SQLException;
}
