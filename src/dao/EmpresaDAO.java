package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import models.Empresa;


public class EmpresaDAO{
	// a conexão com o banco de dados
	  private Connection connection;
	  
	  public EmpresaDAO() {
		    this.connection = new ConnectionFactory().getConnection();
		  }
	  
	  /**
	   * Método responsável por adicionar uma empresa ao BD. 
	 * @throws Throwable 
	   * **/
	  public void adicionar(Empresa empresa) throws Throwable{
		  
		  String sql = "insert into Empresa" +
                  " (nome_empresa,email_empresa,senha_empresa,cnpj_empresa,telefone_empresa,end_empresa)" +
                  " values (?,?,?,?,?,?)";
		  try {
			  
			  PreparedStatement stmt = connection.prepareStatement(sql);
		
			  // seta os valores
		      //stmt.setInt(1, (Integer) null);
		      stmt.setString(1,empresa.getNome_empresa());
		      stmt.setString(2,empresa.getEmail_empresa());
		      stmt.setString(3,empresa.getSenha_empresa());
		      stmt.setString(4,empresa.getCnpj_empresa());
		      stmt.setString(5,empresa.getEnd_empresa());
		      stmt.setString(6,empresa.getTelefone_empresa());
		
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
	   * Método responsável por retornar uma lista de objetos Empresa;
	   * **/
	  public List<Empresa> listar() {
		     try {
		         List<Empresa> empresas = new ArrayList<Empresa>();
		         PreparedStatement stmt = this.connection.
		                 prepareStatement("select * from Empresa");
		         ResultSet rs = stmt.executeQuery();
		 
		         while (rs.next()) {
		             // criando o objeto Empresa
		        	 Empresa empresa = new Empresa();
		        	 empresa.setId_empresa(rs.getLong("id_empresa"));
		        	 empresa.setNome_empresa(rs.getString("nome_empresa"));
		        	 empresa.setEmail_empresa(rs.getString("email_empresa"));
		        	 empresa.setSenha_empresa(rs.getString("senha_empresa"));
		        	 empresa.setCnpj_empresa(rs.getString("cnpj_empresa"));
		        	 empresa.setEnd_empresa(rs.getString("end_empresa"));
		        	 empresa.setTelefone_empresa(rs.getString("telefone_empresa"));
		 
		        	// adicionando o objeto à lista
		        	 empresas.add(empresa);
		         }
		         rs.close();
		         stmt.close();
		         return empresas;
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }
	  
	  /**
	   * Método responsável por retornar uma lista de objetos Empresa;
	   * **/
	  
	  
	  /**
	   * Método para alterar um objeto no BD
	   * **/
	  public void alterar(Empresa empresa, String s) {
		  //Não funciona
		  String sql = "update Empresa set nome_empresa=?, email_empresa=?, senha_empresa=?, cnpj_empresa=?, end_empresa=?,telefone_empresa=? where nome_empresa=?";
		  try {
		         PreparedStatement stmt = connection.prepareStatement(sql);
		         stmt.setString(1,empresa.getNome_empresa());
			     stmt.setString(2,empresa.getEmail_empresa());
			     stmt.setString(3,empresa.getSenha_empresa());
			     stmt.setString(4,empresa.getCnpj_empresa());
			     stmt.setString(5,empresa.getEnd_empresa());
			     stmt.setString(6,empresa.getTelefone_empresa());
			     stmt.setString(7,s);
		         
		         stmt.execute();
		         stmt.close();
		     } catch (SQLException e) {
		    	 throw new RuntimeException(e);
		     }
	  }
	  
	  
	  public void remover(String s) {
		     try {
		         PreparedStatement stmt = connection.prepareStatement("delete" +
		                 " from Empresa where nome_empresa=?");
		         stmt.setString(1, s);
		         stmt.execute();
		         stmt.close();
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }

	}
