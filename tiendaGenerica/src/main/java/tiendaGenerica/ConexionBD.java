package tiendaGenerica;

import java.sql.*;

import javax.swing.JOptionPane;

public class ConexionBD {
	Connection cnn;

	public Connection conexionbd() {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnn=DriverManager.getConnection("jdbc:mysql://localhost/tiendagenerica","root","root");
			JOptionPane.showMessageDialog(null, "Conexion ok");
		} catch (SQLException e) {
			e.printStackTrace();

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	return cnn;
}
}