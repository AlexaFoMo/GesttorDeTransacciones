package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tiendaGenerica.ConexionBD;

public class tableCustomerDAO {
	ConexionBD con = new ConexionBD();
	Connection cnn = con.conexionbd();
	PreparedStatement ps;

	public boolean insertarUsuario(tableCustomerDto Us) {
		int r;
		boolean dat=false;
		
		try {
			ps=cnn.prepareStatement("INSERT INTO clientes values(?,?,?,?,?)");
			
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