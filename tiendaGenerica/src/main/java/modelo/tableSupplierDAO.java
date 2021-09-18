package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tiendaGenerica.ConexionBD;

public class tableSupplierDAO {
	
	ConexionBD conex=new ConexionBD();
	Connection cnx=conex.conexionbd();
	
	PreparedStatement ps;
	ResultSet rs;
	
	public boolean insertSupplier(tableSupplierDTO Supp) {
		
		int S;
		boolean dat=false;
		
		try {
			ps=cnx.prepareStatement("INSERT INTO proveedores Values (?,?,?,?,?)");
			ps.setLong(1, Supp.getNitSupplier());
			ps.setString(2, Supp.getCiudad_Supplier());
			ps.setString(3, Supp.getDireccion_Supplier());
			ps.setString(4, Supp.getNombre_Supplier());
			ps.setString(5, Supp.getTelefono_Supplier());
			S=ps.executeUpdate();
			if(S>0) {
				dat=true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dat;
	}
}
