package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.ConexionBD;

public class tableCustomerDAO {
	ConexionBD con = new ConexionBD();
	Connection cnn = con.conexionbd();
	PreparedStatement preparedStatement;
	ResultSet resultset;

	
	
	//INSERTAR
	public boolean insertCustomer(tableCustomerDto Cus) {
		int r;
		boolean dat = false;

		try {
			preparedStatement = cnn.prepareStatement("INSERT INTO clientes values(?,?,?,?,?)");

			preparedStatement.setLong(1, Cus.getCedula_Customer());
			preparedStatement.setString(2, Cus.getDireccion_Customer());
			preparedStatement.setString(3, Cus.getEmail_Customer());
			preparedStatement.setString(4, Cus.getNombre_Customer());
			preparedStatement.setString(5, Cus.getTelefono_Customer());
			r = preparedStatement.executeUpdate();
			if (r > 0) {
				dat = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dat;
	}

	// CONSULTAR
	public tableCustomerDto consultar(tableCustomerDto Customer) {
		JOptionPane.showMessageDialog(null, Customer.getCedula_Customer());
		tableCustomerDto customerdto = null;

		try {
			preparedStatement = cnn.prepareStatement("SELECT * FROM clientes WHERE cedula_cliente=?");
			preparedStatement.setLong(1, Customer.getCedula_Customer());
			resultset = preparedStatement.executeQuery();
			if (resultset.next()) {
				customerdto = new tableCustomerDto(resultset.getLong(1), resultset.getString(2), resultset.getString(3),
						resultset.getString(4), resultset.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customerdto;
	}
}
