package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import models.Vaga;
import jdbc.ConnectionFactory;



public class VagaDAO{
	// a conex�o com o banco de dados
	  private Connection connection;
	  
	  
	  public VagaDAO() {
		    this.connection = new ConnectionFactory().getConnection();
		  }
	  
	  /**
	   * M�todo respons�vel por adicionar uma empresa ao BD. 
	 * @throws Throwable 
	   * **/
	  public void adicionar(Vaga vaga) throws Throwable{
		  
		  String sql = "insert into Vaga" +
                  " (carga_horaria_vaga,remuneracao_vaga,requisitos_vaga,descricao_vaga,Empresa_id_empresa,Empresa_email_empresa)" +
                  " values (?,?,?,?,?,?)";
		  try {
			  
			  PreparedStatement stmt = connection.prepareStatement(sql);
		
			  // seta os valores
		      //stmt.setInt(1, (Integer) null);
		      stmt.setInt(1,vaga.getCarga_horaria_vaga());
		      stmt.setFloat(2,vaga.getRemuneracao_vaga());
		      stmt.setString(3,vaga.getRequisitos_vaga());
		      stmt.setString(4,vaga.getDescricao_vaga());
		      stmt.setLong(5,vaga.getEmpresa_id_empresa());
		      stmt.setString(6,vaga.getEmpresa_email_empresa());
		      
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
	   * M�todo respons�vel por retornar uma lista de objetos Empresa;
	   * **/
	  public List<Vaga> listar() {
		     try {
		         List<Vaga> vagas = new ArrayList<Vaga>();
		         PreparedStatement stmt = this.connection.
		                 prepareStatement("select * from Vaga");
		         ResultSet rs = stmt.executeQuery();
		 
		         while (rs.next()) {
		             // criando o objeto Vaga
		        	 Vaga vaga = new Vaga();
		        	 vaga.setId_vaga(rs.getLong("id_vaga"));
		        	 vaga.setCarga_horaria_vaga(rs.getInt("carg_horaria_vaga"));
		        	 vaga.setRemuneracao_vaga(rs.getFloat("remuneracao_vaga"));
		        	 vaga.setRequisitos_vaga(rs.getString("requisitos_vaga"));
		        	 vaga.setDescricao_vaga(rs.getString("descricao_vaga"));
		        	 vaga.setEmpresa_id_empresa(rs.getLong("Empresa_id_empresa"));
		        	 vaga.setEmpresa_email_empresa(rs.getString("Empresa_email_empresa"));
		        	 
		        	// adicionando o objeto � lista
		        	 vagas.add(vaga);
		         }
		         rs.close();
		         stmt.close();
		         return vagas;
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }
	  
	  /**
	   * M�todo respons�vel por retornar uma lista de objetos Vaga;
	   * **/
	  
	  
	  /**
	   * M�todo para alterar um objeto no BD
	 * @throws ParseException 
	   * **/
	  public void alterar(Vaga vaga, String s) throws ParseException {
		  String sql = "update Vaga set id_vaga=?,carga_horaria_vaga=?,remuneracao_vaga=?,requisitos_vaga=?,descricao_vaga=?,Empresa_id_empresa=?,Empresa_email_empresa=? where Empresa_email_empresa=?";
		  try {
		         PreparedStatement stmt = connection.prepareStatement(sql);
		         stmt.setLong(1,vaga.getId_vaga());
		         stmt.setInt(2,vaga.getCarga_horaria_vaga());
			     stmt.setFloat(3,vaga.getRemuneracao_vaga());
			     stmt.setString(4,vaga.getRequisitos_vaga());
			     stmt.setString(5,vaga.getDescricao_vaga());
			     stmt.setLong(6,vaga.getEmpresa_id_empresa());
			     stmt.setString(7,vaga.getEmpresa_email_empresa());
		         stmt.setString(8,s);
		         stmt.execute();
		         stmt.close();
		     } catch (SQLException e) {
		    	 throw new RuntimeException(e);
		     }
	  }
	  
	  
	  public void remover(String s,long l) {
		     try {
		         PreparedStatement stmt = connection.prepareStatement("delete from Vaga where Empresa_email_empresa=? AND id_vaga=?");
		         stmt.setString(1, s);
		         stmt.setLong(2, l);
		         stmt.execute();
		         stmt.close();
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }

	}
