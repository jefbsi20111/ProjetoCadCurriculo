package repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.Candidato;
import dao.DAO;



public class RepositorioCandidatosBD extends DAO implements RepositorioCandidatos{
	


	@Override
	public void inserir(Candidato candidato) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = getConnection(false);
            pstmt = con.prepareStatement("INSERT INTO CANDIDATO (NOME, CPF, TELEFONE, EMAIL, END, NASC ESCOLARIDADE, EXP, AREA, APENDICES) VALUES (?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, candidato.getNome());
            pstmt.setString(2, candidato.getCpf());
            pstmt.setString(3, candidato.getTelefone());
            pstmt.setString(4, candidato.getEmail());
            pstmt.setString(5, candidato.getEnd());
            pstmt.setString(6, candidato.getNasc());
            pstmt.setString(7, candidato.getEscolaridade());
            pstmt.setString(8, candidato.getExp());
            pstmt.setString(9, candidato.getArea());
            pstmt.setString(10, candidato.getApendices());
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
