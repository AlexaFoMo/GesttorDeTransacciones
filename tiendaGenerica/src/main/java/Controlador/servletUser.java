package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.tableUsuarioDAO;
import modelo.tableUsuarioDto;

/**
 * Servlet implementation class servlettUser
 */
@WebServlet("/servletUser")
public class servletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
		boolean usuarioInsertado;
		long cedula_usuario;
		String nameUser;
		String email_usuario;
		String password;
		String usuario;
		tableUsuarioDto userdto;
		tableUsuarioDAO userdao;
		tableUsuarioDto registro;
		
		
		if(request.getParameter("buttonInsert")!= null) {
			
			cedula_usuario= Long.parseLong (request.getParameter("cedulaUser"));
			nameUser= request.getParameter("nameUser");
			email_usuario= request.getParameter("email_usuario");
			password= request.getParameter("passwordUser");
			usuario= request.getParameter("user");
			
			
			userdto=new tableUsuarioDto(cedula_usuario, nameUser, email_usuario, password, usuario);
			userdao=new tableUsuarioDAO();
			usuarioInsertado=userdao.insertarUsuario(userdto);
			if(usuarioInsertado== true) {
				JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
				response.sendRedirect("usuario.jsp");
			}
		}
		
//		//consultar tableUsuarios
//		
		if(request.getParameter("buttonConsult")!= null) {
			
			
			cedula_usuario= Long.parseLong (request.getParameter("cedulaUser"));
			nameUser= request.getParameter("nameUser");
			email_usuario= request.getParameter("email_usuario");
			password= request.getParameter("passwordUser");
			usuario= request.getParameter("user");
			
			
			userdto=new tableUsuarioDto(cedula_usuario, nameUser, email_usuario, password, usuario);
			userdao=new tableUsuarioDAO();
			registro = userdao.consultar(userdto);
			
			if(registro!= null) {
				cedula_usuario = (registro.getCedula_usuario());
				nameUser = (registro.getNombre_usuario());
				email_usuario = (registro.getEmail_usuario());
				password = (registro.getPassword());
				usuario = (registro.getUsuario());
				
				response.sendRedirect("usuario.jsp");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se encontr� usuario");
			}
		}

		//Actualizar tableUsuarios
	
		if(request.getParameter("buttonUpdate")!= null) {
			
		int dat;	
		cedula_usuario=Long.parseLong(request.getParameter("cedulaUser"));
		nameUser= request.getParameter("nameUser");
		email_usuario= request.getParameter("email_usuario");
		password= request.getParameter("passwordUser");
		usuario= request.getParameter("user");
		userdto=new tableUsuarioDto(cedula_usuario, nameUser, email_usuario, password, usuario);
		userdao=new tableUsuarioDAO();
		dat=userdao.actualizar(userdto);
		if(dat>0) {
			JOptionPane.showMessageDialog(null, "Usuario actualizado");
			response.sendRedirect("usuario.jsp");
		}
		else {
			JOptionPane.showMessageDialog(null, "Usuario no actualizado");
		}
		response.sendRedirect("usuario.jsp");
}

	
	//Eliminar usuario
	
	if(request.getParameter("buttonDlete")!=null) {
		int dat;
		cedula_usuario=Long.parseLong(request.getParameter("cedulaUser"));
		nameUser= request.getParameter("nameUser");
		email_usuario= request.getParameter("email_usuario");
		password= request.getParameter("passwordUser");
		usuario= request.getParameter("user");
		userdto=new tableUsuarioDto(cedula_usuario, nameUser, email_usuario, password, usuario);
		userdao=new tableUsuarioDAO();
		dat=userdao.eliminar(userdto);
		if(dat>0) {
			JOptionPane.showMessageDialog(null, "Usuario eliminado");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Usuario no eliminado");
			
		}
		response.sendRedirect("usuario.jsp");
		
	}
}
}