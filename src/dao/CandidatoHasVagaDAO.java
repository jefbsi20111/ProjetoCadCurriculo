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
		        	chvs.add(cdv);
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
		 * vagas que o candidato está pleiteando, através de seu id.;
		 * **/
		public List<CandidatoHasVaga> filtro_id(Long id){
				String sql = "select * from Candidato_has_Vaga where Candidato_id_candidato=? ";
			try {
				List<CandidatoHasVaga> chvs = new ArrayList<CandidatoHasVaga>();
				
				PreparedStatement stmt = this.connection.prepareStatement(sql);
				stmt.setLong(1,id);
		        ResultSet rs = stmt.executeQuery();
				
		        while (rs.next()) {
		             // criando o objeto CandidatoHasVaga
		        	CandidatoHasVaga cdv = new CandidatoHasVaga();
		        	cdv.setCandidato_id_candidato(rs.getLong("Candidato_id_candidato"));
		        	cdv.setCandidato_email_candidato(rs.getString("Candidato_email_candidato"));
		        	cdv.setVaga_id_vaga(rs.getLong("Vaga_id_vaga"));
		        	cdv.setVaga_Empresa_id_empresa(rs.getLong("Vaga_Empresa_id_empresa"));
		        	cdv.setVaga_Empresa_email_empresa(rs.getString("Vaga_Empresa_email_empresa"));
		        	
		        	chvs.add(cdv);
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
		 * vagas que o candidato está pleiteando, através de seu id.;
		 * **/
		public List<CandidatoHasVaga> filtro_email(String email){
				String sql = "select * from Candidato_has_Vaga where Candidato_email_candidato=? ";
			try {
				List<CandidatoHasVaga> chvs = new ArrayList<CandidatoHasVaga>();
				
				PreparedStatement stmt = this.connection.prepareStatement(sql);
				stmt.setString(1,email);
		        ResultSet rs = stmt.executeQuery();
				
		        while (rs.next()) {
		             // criando o objeto CandidatoHasVaga
		        	CandidatoHasVaga cdv = new CandidatoHasVaga();
		        	cdv.setCandidato_id_candidato(rs.getLong("Candidato_id_candidato"));
		        	cdv.setCandidato_email_candidato(rs.getString("Candidato_email_candidato"));
		        	cdv.setVaga_id_vaga(rs.getLong("Vaga_id_vaga"));
		        	cdv.setVaga_Empresa_id_empresa(rs.getLong("Vaga_Empresa_id_empresa"));
		        	cdv.setVaga_Empresa_email_empresa(rs.getString("Vaga_Empresa_email_empresa"));
		        	
		        	chvs.add(cdv);
		        }
		        rs.close();
		        stmt.close();
		        return chvs;
			}catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		}
		/**
		 * Método para cancelar a candidatura a uma vaga.
		 * Recebe um Objeto 'CandidatoHasVaga', e o remove da tabela 'Candidato_has_Vaga';
		 * **/
		public void remove(CandidatoHasVaga chv){
			try {
		         PreparedStatement stmt = connection.prepareStatement("delete from Candidato_has_Vaga where Candidato_id_candidato=? and Vaga_id_vaga=? and Vaga_Empresa_id_empresa=?");
		         stmt.setLong(1, chv.getCandidato_id_candidato());
		         stmt.setLong(2, chv.getVaga_id_vaga());
		         stmt.setLong(3, chv.getVaga_Empresa_id_empresa());
		         stmt.execute();
		         stmt.close();
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		}
		/**
		 * Retorna uma vaga do candidato. Parametros: email(candidato) e id(vaga).
		 * Usei para testar a remoção de candidatura a vaga, junto com remove(CandidatoHasVaga chv)
		 * **/
		
		public CandidatoHasVaga filtro_email_id(String email,Long id){
			String sql = "select * from Candidato_has_Vaga where Candidato_email_candidato=? and Vaga_id_vaga=?";
		try {			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1,email);
			stmt.setLong(2,id);
	        ResultSet rs = stmt.executeQuery();
	        CandidatoHasVaga chv = new CandidatoHasVaga();
	        while (rs.next()) {
	             // criando o objeto CandidatoHasVaga
	        	
	        	chv.setCandidato_id_candidato(rs.getLong("Candidato_id_candidato"));
	        	chv.setCandidato_email_candidato(rs.getString("Candidato_email_candidato"));
	        	chv.setVaga_id_vaga(rs.getLong("Vaga_id_vaga"));
	        	chv.setVaga_Empresa_id_empresa(rs.getLong("Vaga_Empresa_id_empresa"));
	        	chv.setVaga_Empresa_email_empresa(rs.getString("Vaga_Empresa_email_empresa"));	        	
	        }
	        rs.close();
	        stmt.close();
	        return chv;
		}catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	}

}
