package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.tableCustomerDAO;
import modelo.tableCustomerDto;
import modelo.tableUsuarioDAO;
import modelo.tableUsuarioDto;

/**
 * Servlet implementation class servletCustomer
 */
@WebServlet("/servletCustomer")
public class servletCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletCustomer() {
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
		long cedula_cliente;
		String direccion_cliente;
		String email_cliente;
		String nombre_cliente;
		String telefono_cliente;
		tableCustomerDto Customerdto;
		tableCustomerDAO Customerdao;
		tableCustomerDto registro=null;
		
		
		//INSERTAR
		if(request.getParameter("buttonInsert")!= null) {
			
			cedula_cliente= Long.parseLong(request.getParameter("cedulaCustomer"));
			direccion_cliente= request.getParameter("directionCustomer");
			email_cliente= request.getParameter("email_customer");
			nombre_cliente= request.getParameter("nameCustomer");
			telefono_cliente=request.getParameter("phoneNumberCustomer");
			
			Customerdto=new tableCustomerDto(cedula_cliente, direccion_cliente, email_cliente, nombre_cliente, telefono_cliente);
			Customerdao=new tableCustomerDAO();
			x=Customerdao.insertCustomer(Customerdto);
			if(x== true) {
				JOptionPane.showMessageDialog(null, "Cliente creado exitosamente");
				response.sendRedirect("menuPrincipal.jsp");
			}
		}
	

	
	
	//CONSULTAR
			if(request.getParameter("buttonConsult")!= null) {
				
				
				cedula_cliente= Long.parseLong (request.getParameter("cedulaCustomer"));
				direccion_cliente= request.getParameter("directionCustomer");
				email_cliente= request.getParameter("email_customer");
				nombre_cliente= request.getParameter("nameCustomer");
				telefono_cliente= request.getParameter("phoneNumberCustomer");
				
				
				Customerdto=new tableCustomerDto(cedula_cliente, direccion_cliente, email_cliente, nombre_cliente, telefono_cliente);
				Customerdao=new tableCustomerDAO();
				registro = Customerdao.consultar(Customerdto);
				
				if(registro!= null) {
					cedula_cliente = (registro.getCedula_Customer() );
					direccion_cliente = (registro.getDireccion_Customer() );
					email_cliente = (registro.getEmail_Customer() );
					nombre_cliente = (registro.getNombre_Customer() );
					telefono_cliente = (registro.getTelefono_Customer());
					
					response.sendRedirect("formConsultarCustomer.jsp?cedula="+cedula_cliente+"&&direccion="+direccion_cliente+"&&email="+email_cliente+"&&nombre="+nombre_cliente+"&&telefono="+telefono_cliente);
				}
				else {
					JOptionPane.showMessageDialog(null, "No se encontró cliente");
				}
			}
	
}
}
