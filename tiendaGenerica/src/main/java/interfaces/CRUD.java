package interfaces;

import java.util.List;

import modelo.tableUsuarioDto;

public interface CRUD {
	public List listar();
	public tableUsuarioDto list(long cedula_usuario); 
}
