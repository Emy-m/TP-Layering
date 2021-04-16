package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private Conexion() {
		
	}
	
	public static Connection conectar() throws PersistenciaException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/participantes_bd";
			String user = "root";
			String password = "";
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e1) {
			throw new PersistenciaException(e1.getMessage());
		}
	}
}
