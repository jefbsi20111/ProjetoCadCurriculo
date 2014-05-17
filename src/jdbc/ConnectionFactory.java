package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jeferson
 *
 */
public class ConnectionFactory {
	public Connection getConnection() {
	     try {
	         return DriverManager.getConnection("jdbc:mysql://localhost/ProjetoCadCurriculoBD", "root", "");
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
}