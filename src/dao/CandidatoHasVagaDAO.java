package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import models.Candidato;
import models.CandidatoHasVaga;
import models.Vaga;

public class CandidatoHasVagaDAO {
	// a conexão com o banco de dados
		private Connection connection;
		
		public CandidatoHasVagaDAO(){
			this.connection = new ConnectionFactory().getConnection();
		}
		
		/**
		 * Método adicionar recebe um candidato e uma vaga como parâmetros.
		 * Optei por não trabalhar com o model 'CandidatoHasVaga', mas sim
		 * com os valores dos objetos envolvidos na seção.
		 * **/
		public void adicionar(Candidato candidato, Vaga vaga) throws Throwable{
			  
			  String sql = "insert into Candidato_has_Vaga"+
			  "(Candidato_id_candidato,Candidato_email_candidato,Vaga_id_vaga,Vaga_Empresa_id_empresa,Vaga_Empresa_email_empresa)"
			  +" values (?,?,?,?,?)";
			  try {
				  PreparedStatement stmt = connection.prepareStatement(sql);
				  
				  stmt.setLong(1,candidato.getId_candidato());
				  stmt.setString(2,candidato.getEmail_candidato());
				  stmt.setLong(3,vaga.getId_vaga());
				  stmt.setLong(4,vaga.getEmpresa_id_empresa());
				  stmt.setString(5,vaga.getEmpresa_email_empresa());
				// executa
			    stmt.execute();
			    stmt.close();
		
			  }catch(SQLException e) {
				throw new RuntimeException(e);
				//System.out.println(e);
			  } finally {
				connection.close();
			  }
			  
		  }
		
		/**
		 * O método listar trabálha com o model 'CandidatoHasVaga'.
		 * **/
		public List<CandidatoHasVaga> listar(){
			try {
				List<CandidatoHasVaga> chvs = new ArrayList<CandidatoHasVaga>();
				PreparedStatement stmt = this.connection.prepareStatement("select * from Candidato_has_Vaga");
		        ResultSet rs = stmt.executeQuery();
				
		        while (rs.next()) {
		             // criando o objeto CandidatoHasVaga
		        	CandidatoHasVaga cdv = new CandidatoHasVaga();
		        	cdv.setCandidato_id_candidato(rs.getLong("Candidato_id_candidato"));
		        	cdv.setCandidato_email_candidato(rs.getString("Candidato_email_candidato"));
		        	cdv.setVaga_id_vaga(rs.getLong("Vaga_id_vaga"));
		        	cdv.setVaga_Empresa_id_empresa(rs.getLong("Vaga_Empresa_id_empresa"));
		        	cdv.setVaga_Empresa_email_empresa(rs.getString("Vaga_Empresa_email_empresa"));
		        }
		        rs.close();
		         stmt.close();
		         return chvs;
			}catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		}
		
		/**
		 * O método listarVagasCandidato retorna da tabela Candidato_has_Vaga todas as 
		 * vagas que o candidato está pleiteando.;
		 * **/
		public List<CandidatoHasVaga> listarVagasCandidato(Long idc, Long ide, Long idv){
				String sql = "select Vaga_id_vaga,Vaga_Empresa_id_empresa,Vaga_Empresa_email_empresa"+
						" from Candidato,Candidato_has_Vaga,Empresa,Vaga"+
						" where id_candidato=1 and Vaga_Empresa_id_empresa=id_empresa and Vaga_id_vaga=id_vaga";
			try {
				List<CandidatoHasVaga> lvcs = new ArrayList<CandidatoHasVaga>();
				PreparedStatement stmt = this.connection.prepareStatement(sql);
		        ResultSet rs = stmt.executeQuery();
				
		        while (rs.next()) {
		             // criando o objeto CandidatoHasVaga
		        	CandidatoHasVaga cdv = new CandidatoHasVaga();
		        	cdv.setVaga_id_vaga(rs.getLong("Vaga_id_vaga"));
		        	cdv.setVaga_Empresa_id_empresa(rs.getLong("Vaga_Empresa_id_empresa"));
		        	cdv.setVaga_Empresa_email_empresa(rs.getString("Vaga_Empresa_email_empresa"));
		        	
		        	lvcs.add(cdv);
		        }
		        rs.close();
		        stmt.close();
		        return lvcs;
			}catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		}

}
