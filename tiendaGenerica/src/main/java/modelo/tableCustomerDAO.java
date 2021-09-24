package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Controlador.ConexionBD;

public class tableCustomerDAO {
	ConexionBD con = new ConexionBD();
	Connection cnn = con.conexionbd();
	PreparedStatement ps;

	public boolean insertCustomer(tableCustomerDto Cus) {
		int r;
		boolean dat=false;
		
		try {
			ps=cnn.prepareStatement("INSERT INTO clientes values(?,?,?,?,?)");
			
			ps.setLong(1, Cus.getCedula_Customer());
			ps.setString(2, Cus.getDireccion_Customer());
			ps.setString(3, Cus.getEmail_Customer());
			ps.setString(4, Cus.getNombre_Customer());
			ps.setString(5, Cus.getTelefono_Customer());
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