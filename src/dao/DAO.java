package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO {
	/*
     * Outra forma de registrar o Driver. static { try { //Registrando o driver
     * no DriveManager DriverManager.registerDriver(new
     * com.mysql.jdbc.Driver()); } catch (SQLException ex) {
     * Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex); } }
     */

   /* static {
        try {
            // Registrando o driver da forma mais utilizada
            // Postgres
            //Drive
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOFuncionario.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }*/

    public Connection getConnection(boolean autoCommit) {        
        //Conectando-se ao SGBD
        Connection conn = null;
        try {
            //Conexão com o banco
            conn.setAutoCommit(autoCommit);            
        } catch(SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);            
        }
        //Só queremos que a operação seja confirmada após darmos um commit na conexão
        return conn;
    }
}
