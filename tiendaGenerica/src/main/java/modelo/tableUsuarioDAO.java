package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import tiendaGenerica.ConexionBD;

public class tableUsuarioDAO {
	ConexionBD con = new ConexionBD();
	Connection cnn = con.conexionbd();
	PreparedStatement ps;

	public boolean insertarUsuario(tableUsuarioDto Us) {
		int r;
		boolean dat=false;
		
		try {
			ps=cnn.prepareStatement("INSERT INTO usuario values(?,?,?,?,?)");
			ps.setLong(1, Us.getCedula_usuario());
			ps.setString(2, Us.getEmail_usuario());
			ps.setString(3, Us.getNombre_usuario());
			ps.setString(4, Us.getPassword());
			ps.setString(5, Us.getUsuario());
			r=ps.executeUpdate();
			if(r>0) {
				dat=true;
			}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return dat;
}
}