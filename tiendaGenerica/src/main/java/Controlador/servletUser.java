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
		
		//INSERTAR
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
				response.sendRedirect("formInsertUsuario.jsp");
			}
			else {
				JOptionPane.showMessageDialog(null, "Failure, No se creo usuario.");
			}
		}
		

		
		//CONSULTAR
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
				
				response.sendRedirect("formConsultarUsuario.jsp?cedula="+cedula_usuario+"&&nombre="+nameUser+"&&email="+email_usuario+"&&usuario="+usuario+"&&password="+password);
			}
			else {
				JOptionPane.showMessageDialog(null, "No se encontró usuario");
			}
		}

		//ACTUALIZAR
	
		if(request.getParameter("buttonUpdate")!= null) {
			
		int dat=0;	
		email_usuario= request.getParameter("email_usuario");
		nameUser= request.getParameter("nameUser");
		password= request.getParameter("passwordUser");
		usuario= request.getParameter("user");
		cedula_usuario=Long.parseLong(request.getParameter("cedulaUser"));
		userdto=new tableUsuarioDto(cedula_usuario, email_usuario, nameUser, password, usuario);
		userdao=new tableUsuarioDAO();
		dat=userdao.actualizar(userdto);
		if(dat>0) {
			JOptionPane.showMessageDialog(null, "Usuario actualizado");
			response.sendRedirect("formConsultarUsuario.jsp");
		}
		else {
			JOptionPane.showMessageDialog(null, "No actualizado");
		}
		response.sendRedirect("formConsultarUsuario.jsp");
}

	
	//Eliminar usuario
	
	if(request.getParameter("buttonDelete")!=null) {
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
			JOptionPane.showMessageDialog(null, "No eliminado");
			
		}
		response.sendRedirect("formConsultarUsuario.jsp");
		
	}
}
}
