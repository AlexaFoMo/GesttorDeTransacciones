package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class tiendaServlet
 */
@WebServlet("/servletPageLogin")
public class servletPageLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletPageLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String Usuario = request.getParameter("Usuario");
//		String Contrasena = request.getParameter("Contrasena");
//		PrintWriter writer = response.getWriter();
//		if( Usuario != null && Contrasena != null) {
//			writer.println("Bienvenido "+Usuario+" a la Tienda Generica");
//		}
//		else
//			writer.println("Error: Usuario o Contraseña faltante");
//		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario, contrasena;
		usuario=request.getParameter("usuario");
		contrasena=request.getParameter("contrasena");
		if(usuario.equals("admininicial")&& contrasena.equals("admin123456")) {
			JOptionPane.showMessageDialog(null, "Datos correctos");
			response.sendRedirect("menuPrincipal.jsp");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Datos incorrectos");
			response.sendRedirect("PageLogin.jsp");
		}
		
		
	}

}
