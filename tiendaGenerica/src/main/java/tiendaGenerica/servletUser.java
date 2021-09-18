package tiendaGenerica;

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
		
		boolean x;
		long cedula_usuario;
		String nameUser;
		String email_usuario;
		String password;
		String usuario;
		tableUsuarioDto userdto;
		tableUsuarioDAO userdao;
		if(request.getParameter("buttonInsert")!= null) {
			
			cedula_usuario= Long.parseLong (request.getParameter("cedulaUser"));
			nameUser= request.getParameter("nameUser");
			email_usuario= request.getParameter("email_usuario");
			password= request.getParameter("passwordUser");
			usuario= request.getParameter("usuario");
			
			
			userdto=new tableUsuarioDto(cedula_usuario, nameUser, email_usuario, password, usuario);
			userdao=new tableUsuarioDAO();
			x=userdao.insertarUsuario(userdto);
			if(x== true) {
				JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
				response.sendRedirect("usuario.jsp");
			}
		}
	}

}
