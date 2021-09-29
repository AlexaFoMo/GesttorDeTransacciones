package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.ConexionBD;

public class tableUsuarioDAO {
	ConexionBD con = new ConexionBD();
	Connection cnn = con.conexionbd();
	
	
	PreparedStatement ps;
	ResultSet rs;
	tableUsuarioDto dat = null;
	
	// INSERTAR
	public boolean insertarUsuario(tableUsuarioDto Us) {
		int r;
		boolean dat = false;

		try {
			ps = cnn.prepareStatement("INSERT INTO usuario values(?,?,?,?,?)");
			ps.setLong(1, Us.getCedula_usuario());
			ps.setString(2, Us.getNombre_usuario());
			ps.setString(3, Us.getEmail_usuario());
			ps.setString(4, Us.getUsuario());
			ps.setString(5, Us.getPassword());
			
			r = ps.executeUpdate();
			if (r > 0) {
				dat = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dat;
	}

	// CONSULTAR
	public tableUsuarioDto consultar(tableUsuarioDto User) {
		JOptionPane.showMessageDialog(null, User.getCedula_usuario());
		ResultSet rs;
		tableUsuarioDto dat = null;
		try {
			ps = cnn.prepareStatement("SELECT * FROM usuario WHERE cedula_usuario=?");
			ps.setLong(1, User.getCedula_usuario());
			rs = ps.executeQuery();
			if (rs.next()) {
				dat = new tableUsuarioDto(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dat;
	}

	//ACTUALIZAR
	public int actualizar(tableUsuarioDto usuarios) {
		int x = 0;

		try {
			ps = cnn.prepareStatement(
					"UPDATE usuario SET , email_usuario=?, nombre_usuario=?, password=?, usuario=? WHERE cedula_usuario=?");
			ps.setLong(1, usuarios.getCedula_usuario());
			ps.setString(2, usuarios.getEmail_usuario());
			ps.setString(3, usuarios.getNombre_usuario());
			ps.setString(4, usuarios.getPassword());
			ps.setString(5, usuarios.getPassword());
			ps.setString(6, usuarios.getUsuario());
			x = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return x;
	}

//ELIMINAR
	public int eliminar(tableUsuarioDto usuarios) {
		int x = 0;
		try {
			ps = cnn.prepareStatement("DELETE FROM usuario WHERE cedula_usuario=?");
			ps.setLong(1, usuarios.getCedula_usuario());
			x = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}
	
	
	
	//Consulta "masiva"
	public ArrayList<tableUsuarioDto> consultaMasiva(){
		ArrayList<tableUsuarioDto>consultaUsuarios=new ArrayList<tableUsuarioDto>();
		try {
			ps=cnn.prepareStatement("SELECT * FROM usuarios");
			rs=ps.executeQuery();
			while(rs.next()) {
				dat=new tableUsuarioDto(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				consultaUsuarios.add(dat);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return consultaUsuarios;
		
		
		
		
	}
}