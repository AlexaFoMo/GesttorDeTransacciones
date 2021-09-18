package tiendaGenerica;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.tableCustomerDAO;
import modelo.tableCustomerDto;

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
	}

}
