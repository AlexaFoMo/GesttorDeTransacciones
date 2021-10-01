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
	public boolean insertCustomer(tableCustomerDto customer) {
		int registrado;
		boolean dat = false;

		try {
			preparedStatement = cnn.prepareStatement("INSERT INTO clientes values(?,?,?,?,?)");

			preparedStatement.setLong(1, customer.getCedula_Customer());
			preparedStatement.setString(2, customer.getDireccion_Customer());
			preparedStatement.setString(3, customer.getEmail_Customer());
			preparedStatement.setString(4, customer.getNombre_Customer());
			preparedStatement.setString(5, customer.getTelefono_Customer());
			registrado = preparedStatement.executeUpdate();
			if (registrado > 0) {
				dat = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dat;
	}

	// CONSULTAR
	public tableCustomerDto consultar(tableCustomerDto customer) {
		JOptionPane.showMessageDialog(null, customer.getCedula_Customer());
		tableCustomerDto customerdto = null;

		try {
			preparedStatement = cnn.prepareStatement("SELECT * FROM clientes WHERE cedula_cliente=?");
			preparedStatement.setLong(1, customer.getCedula_Customer());
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
	
	
	//ACTUALIZAR
		public int actualizar(tableCustomerDto customer) {
			int actualizado = 0;

			try {
				preparedStatement = cnn.prepareStatement(
				"UPDATE clientes SET direccion_cliente=?, email_cliente=?,  nombre_cliente=?, telefono_cliente=? WHERE cedula_cliente=?");
				preparedStatement.setString(1, customer.getDireccion_Customer() );
				preparedStatement.setString(2, customer.getEmail_Customer() );
				preparedStatement.setString(3, customer.getNombre_Customer() );
				preparedStatement.setString(4, customer.getTelefono_Customer() );
				preparedStatement.setLong(5, customer.getCedula_Customer() );
				
				actualizado = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return actualizado;
		}

	//ELIMINAR
		public int eliminar(tableCustomerDto customer) {
			int eliminado = 0;
			try {
				preparedStatement = cnn.prepareStatement("DELETE FROM usuario WHERE cedula_usuario=?");
				preparedStatement.setLong(1, customer.getCedula_Customer() );
				eliminado = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return eliminado;
		}
}
