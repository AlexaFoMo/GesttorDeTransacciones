package modelo;

public class tableCustomerDto {
	private long cedula_Customer;
	private String direccion_Customer;
	private String email_Customer;
	private String nombre_Customer;
	private String telefono_Customer;
	
	
	public tableCustomerDto(long cedula_Customer, String direccion_Customer, String email_Customer,
			String nombre_Customer, String telefono_Customer) {
		this.cedula_Customer = cedula_Customer;
		this.direccion_Customer = direccion_Customer;
		this.email_Customer = email_Customer;
		this.nombre_Customer = nombre_Customer;
		this.telefono_Customer = telefono_Customer;
	}


	public long getCedula_Customer() {
		return cedula_Customer;
	}


	public void setCedula_Customer(long cedula_Customer) {
		this.cedula_Customer = cedula_Customer;
	}


	public String getDireccion_Customer() {
		return direccion_Customer;
	}


	public void setDireccion_Customer(String direccion_Customer) {
		this.direccion_Customer = direccion_Customer;
	}


	public String getEmail_Customer() {
		return email_Customer;
	}


	public void setEmail_Customer(String email_Customer) {
		this.email_Customer = email_Customer;
	}


	public String getNombre_Customer() {
		return nombre_Customer;
	}


	public void setNombre_Customer(String nombre_Customer) {
		this.nombre_Customer = nombre_Customer;
	}


	public String getTelefono_Customer() {
		return telefono_Customer;
	}


	public void setTelefono_Customer(String telefono_Customer) {
		this.telefono_Customer = telefono_Customer;
	}
	
	
	
	
	
}
