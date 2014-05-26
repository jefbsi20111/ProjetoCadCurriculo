package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import models.Candidato;


public class CandidatoDAO{
	// a conexão com o banco de dados
	private Connection connection;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	  
	  
	  public CandidatoDAO() {
		    this.connection = new ConnectionFactory().getConnection();
		  }
	  
	  /**
	   * Método responsável por adicionar uma empresa ao BD. 
	 * @throws Throwable 
	   * **/
	  public void adicionar(Candidato candidato) throws Throwable{
		  
		  String sql = "insert into Candidato" +
                  " (nome_candidato,email_candidato,senha_candidato,data_nasc_candidato,cpf_candidato,end_candidato,telefone_candidato,escolaridade_candidato,exp_candidato,area_atuacao_candidato,apendices_candidato)" +
                  " values (?,?,?,?,?,?,?,?,?,?,?)";
		  try {
			  
			  PreparedStatement stmt = connection.prepareStatement(sql);
		
			  // seta os valores
		      //stmt.setInt(1, (Integer) null);
		      stmt.setString(1,candidato.getNome_candidato());
		      stmt.setString(2,candidato.getEmail_candidato());
		      stmt.setString(3,candidato.getSenha_candidato());
		      stmt.setString(3,candidato.getSenha_candidato());
		      java.util.Date d = new java.sql.Date(sdf.parse(candidato.getData_nasc_candidato()).getTime());
		      stmt.setDate(4,(Date) d);
		      stmt.setString(5,candidato.getCpf_candidato());
		      stmt.setString(6,candidato.getEnd_candidato());
		      stmt.setString(7,candidato.getTelefone_candidato());
		      stmt.setInt(8,candidato.getEscolaridade_candidato());
		      stmt.setString(9,candidato.getExp_candidato());
		      stmt.setString(10,candidato.getArea_atuacao_candidato());
		      stmt.setString(11,candidato.getApendices_candidato());
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
	 * @throws ParseException 
	   * **/
	  public List<Candidato> listar() throws ParseException {
		     try {
		         List<Candidato> candidatos = new ArrayList<Candidato>();
		         PreparedStatement stmt = this.connection.
		                 prepareStatement("select * from Candidato");
		         ResultSet rs = stmt.executeQuery();
		         SimpleDateFormat in= new SimpleDateFormat("yyyy-MM-dd");  
		         SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");  
		           
		          
		         while (rs.next()) {
		             // criando o objeto Empresa
		        	 Candidato candidato = new Candidato();
		        	 candidato.setId_candidato(rs.getLong("id_candidato"));
		        	 candidato.setNome_candidato(rs.getString("nome_candidato"));
		        	 candidato.setEmail_candidato(rs.getString("email_candidato"));
		        	 candidato.setSenha_candidato(rs.getString("senha_candidato"));
		        	 java.util.Date data = new java.util.Date();
		        	 data = rs.getDate("data_nasc_candidato");
		        	 String result = out.format(in.parse(data.toString()));
		        	 candidato.setData_nasc_candidato(result);
		        	 candidato.setCpf_candidato(rs.getString("cpf_candidato"));
		        	 candidato.setEnd_candidato(rs.getString("end_candidato"));
		        	 candidato.setTelefone_candidato(rs.getString("telefone_candidato"));
		        	 candidato.setEscolaridade_candidato(rs.getInt("escolaridade_candidato"));
		        	 candidato.setExp_candidato(rs.getString("exp_candidato"));
		        	 candidato.setArea_atuacao_candidato(rs.getString("area_atuacao_candidato"));
		        	 candidato.setApendices_candidato(rs.getString("apendices_candidato"));
		 
		        	// adicionando o objeto à lista
		        	 candidatos.add(candidato);
		         }
		         rs.close();
		         stmt.close();
		         return candidatos;
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }
	  
	  /**
	   * Método responsável por retornar uma lista de objetos Empresa;
	   * **/
	  
	  
	  /**
	   * Método para alterar um objeto no BD
	 * @throws ParseException 
	   * **/
	  public void alterar(Candidato candidato, String email) throws ParseException {
		  //Não funciona
		  String sql = "update Candidato set id_candidato=?,nome_candidato=?,email_candidato=?,senha_candidato=?,data_nasc_candidato=?,cpf_candidato=?,end_candidato=?,telefone_candidato=?,escolaridade_candidato=?,exp_candidato=?,area_atuacao_candidato=?,apendices_candidato=? where email_candidato=?";
		  try {
		         PreparedStatement stmt = connection.prepareStatement(sql);
		         stmt.setLong(1,candidato.getId_candidato());
		         stmt.setString(2,candidato.getNome_candidato());
			      stmt.setString(3,candidato.getEmail_candidato());
			      stmt.setString(4,candidato.getSenha_candidato());
			      java.util.Date d = new java.sql.Date(sdf.parse(candidato.getData_nasc_candidato()).getTime());
			      stmt.setDate(5,(Date) d);
			      stmt.setString(6,candidato.getCpf_candidato());
			      stmt.setString(7,candidato.getEnd_candidato());
			      stmt.setString(8,candidato.getTelefone_candidato());
			      stmt.setInt(9,candidato.getEscolaridade_candidato());
			      stmt.setString(10,candidato.getExp_candidato());
			      stmt.setString(11,candidato.getArea_atuacao_candidato());
			      stmt.setString(12,candidato.getApendices_candidato());
		          stmt.setString(13,email);
		         stmt.execute();
		         stmt.close();
		     } catch (SQLException e) {
		    	 throw new RuntimeException(e);
		     }
	  }
	  
	  
	  public void remover(String s) {
		     try {
		         PreparedStatement stmt = connection.prepareStatement("delete from Candidato where nome_candidato=?");
		         stmt.setString(1, s);
		         stmt.execute();
		         stmt.close();
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }
	  
	  /**
	   * --------------------------------------------------------
	   * -----------PESQUISAS POR FILTROS------------------------
	   * --------------------------------------------------------
	   * **/
	  /**
	   * Método que retorna um candidato, pelo email;
	   * Passa o email do usuário da seção junto com o identificador de seção usuário (coisas da view);
	   **/
	  public Candidato filtro_email(String email) {
		     try {
		         PreparedStatement stmt = this.connection.prepareStatement("select * from Candidato where email_candidato=?");
		         stmt.setString(1, email);
		         ResultSet rs = stmt.executeQuery();
		         Candidato candidato = new Candidato();
		         while (rs.next()) {
		             // criando o objeto Candidato
		        	 //A senha do candidato vai no objeto, é uma má prática?
		        	 candidato.setId_candidato(rs.getLong("id_candidato"));
		        	 candidato.setNome_candidato(rs.getString("nome_candidato"));
		        	 candidato.setEmail_candidato(rs.getString("email_candidato"));
		        	 candidato.setSenha_candidato(rs.getString("senha_candidato"));
		        	 candidato.setData_nasc_candidato(rs.getString("data_nasc_candidato"));
		        	 candidato.setCpf_candidato(rs.getString("cpf_candidato"));
		        	 candidato.setEnd_candidato(rs.getString("end_candidato"));
		        	 candidato.setTelefone_candidato(rs.getString("telefone_candidato"));
		        	 candidato.setEscolaridade_candidato(rs.getInt("escolaridade_candidato"));
		        	 candidato.setExp_candidato(rs.getString("exp_candidato"));
		        	 candidato.setArea_atuacao_candidato(rs.getString("area_atuacao_candidato"));
		        	 candidato.setApendices_candidato(rs.getString("apendices_candidato"));
		         }
		         rs.close();
		         stmt.close();
		         return candidato;
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }
	  
	  /**
	   * Método que retorna um candidato, pelo CPF;
	   * Passa o CPF do usuário da seção junto com o identificador de seção usuário (coisas da view);
	   **/
	  public Candidato filtro_cpf(String cpf) {
		     try {
		         PreparedStatement stmt = this.connection.prepareStatement("select * from Candidato where cpf_candidato=?");
		         stmt.setString(1, cpf);
		         ResultSet rs = stmt.executeQuery();
		         Candidato candidato = new Candidato();
		         while (rs.next()) {
		             // criando o objeto Candidato
		        	 //A senha do candidato vai no objeto, é uma má prática?
		        	 candidato.setId_candidato(rs.getLong("id_candidato"));
		        	 candidato.setNome_candidato(rs.getString("nome_candidato"));
		        	 candidato.setEmail_candidato(rs.getString("email_candidato"));
		        	 candidato.setSenha_candidato(rs.getString("senha_candidato"));
		        	 candidato.setData_nasc_candidato(rs.getString("data_nasc_candidato"));
		        	 candidato.setCpf_candidato(rs.getString("cpf_candidato"));
		        	 candidato.setEnd_candidato(rs.getString("end_candidato"));
		        	 candidato.setTelefone_candidato(rs.getString("telefone_candidato"));
		        	 candidato.setEscolaridade_candidato(rs.getInt("escolaridade_candidato"));
		        	 candidato.setExp_candidato(rs.getString("exp_candidato"));
		        	 candidato.setArea_atuacao_candidato(rs.getString("area_atuacao_candidato"));
		        	 candidato.setApendices_candidato(rs.getString("apendices_candidato"));
		         }
		         rs.close();
		         stmt.close();
		         return candidato;
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }
	  /**
	   * Método que retorna um candidato, pelo nome;
	   * Passa o nome do usuário da seção junto com o identificador de seção usuário (para chamar a pesquisa certa);
	   **/
	  public List<Candidato> filtro_nome(String nome) {
		     try {
		    	 List<Candidato> candidatos = new ArrayList<Candidato>();
		         PreparedStatement stmt = this.connection.prepareStatement("select * from Candidato where nome_candidato like ?");
		         stmt.setString(1, nome);
		         ResultSet rs = stmt.executeQuery();
		         
		         while (rs.next()) {
		             // criando o objeto Candidato
		        	 //A senha do candidato vai no objeto, é uma má prática?
		        	 Candidato candidato = new Candidato();
		        	 candidato.setId_candidato(rs.getLong("id_candidato"));
		        	 candidato.setNome_candidato(rs.getString("nome_candidato"));
		        	 candidato.setEmail_candidato(rs.getString("email_candidato"));
		        	 candidato.setSenha_candidato(rs.getString("senha_candidato"));
		        	 candidato.setData_nasc_candidato(rs.getString("data_nasc_candidato"));
		        	 candidato.setCpf_candidato(rs.getString("cpf_candidato"));
		        	 candidato.setEnd_candidato(rs.getString("end_candidato"));
		        	 candidato.setTelefone_candidato(rs.getString("telefone_candidato"));
		        	 candidato.setEscolaridade_candidato(rs.getInt("escolaridade_candidato"));
		        	 candidato.setExp_candidato(rs.getString("exp_candidato"));
		        	 candidato.setArea_atuacao_candidato(rs.getString("area_atuacao_candidato"));
		        	 candidato.setApendices_candidato(rs.getString("apendices_candidato"));
		        	 candidatos.add(candidato);
		         }
		         rs.close();
		         stmt.close();
		         return candidatos;
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		 }
}
