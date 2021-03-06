package repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.ConnectionFactory;
import models.Candidato;
import models.Empresa;

public class RepositorioEmpresasBD extends ConnectionFactory implements RepositorioEmpresas {

	@Override
	public void inserir(Empresa empresa) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Connection con = null;
		        PreparedStatement pstmt = null;
		        ResultSet rs = null;

		        try {
		            con = getConnection(false);
		            pstmt = con.prepareStatement("INSERT INTO EMPRESA (RAZAOSOCIAL, NOMEFANTASIA, CNPJ, TELEFONE, EMAIL (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
          
		            pstmt.setString(1, empresa.getNomeFantasia());
		            pstmt.setString(2, empresa.getCnpj());
		            pstmt.setString(3, empresa.getTelefone());
		            pstmt.setString(4, empresa.getEmail());
		            pstmt.executeUpdate();
		            rs = pstmt.getGeneratedKeys();

		            

		            con.commit();

		        } catch (SQLException ex) {
		            try {
		                con.rollback();
		            } catch (SQLException ex1) {
		                throw new SQLException(ex1);
		            }

		            throw new SQLException(ex);
		        } finally {
		            try {
		                if (rs != null) {
		                    rs.close();
		                }

		                if (pstmt != null) {
		                    pstmt.close();
		                }

		                if (con != null) {
		                    con.close();
		                }
		            } catch (SQLException ex) {
		                throw new SQLException(ex);
		            }
		        }
	}

	
	
}
