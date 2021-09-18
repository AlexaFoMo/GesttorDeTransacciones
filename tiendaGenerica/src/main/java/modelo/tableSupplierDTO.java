package modelo;

public class tableSupplierDTO {
	private long nitSupplier;
	private String ciudad_Supplier;
	private String direccion_Supplier;
	private String nombre_Supplier;
	private String telefono_Supplier;
	
	
	public tableSupplierDTO(long nitSupplier, String ciudad_Supplier, String direccion_Supplier, String nombre_Supplier,
			String telefono_Supplier) {
		this.nitSupplier = nitSupplier;
		this.ciudad_Supplier = ciudad_Supplier;
		this.direccion_Supplier = direccion_Supplier;
		this.nombre_Supplier = nombre_Supplier;
		this.telefono_Supplier = telefono_Supplier;
	}
	
	
	public long getNitSupplier() {
		return nitSupplier;
	}
	public void setNitSupplier(long nitSupplier) {
		this.nitSupplier = nitSupplier;
	}
	public String getCiudad_Supplier() {
		return ciudad_Supplier;
	}
	public void setCiudad_Supplier(String ciudad_Supplier) {
		this.ciudad_Supplier = ciudad_Supplier;
	}
	public String getDireccion_Supplier() {
		return direccion_Supplier;
	}
	public void setDireccion_Supplier(String direccion_Supplier) {
		this.direccion_Supplier = direccion_Supplier;
	}
	public String getNombre_Supplier() {
		return nombre_Supplier;
	}
	public void setNombre_Supplier(String nombre_Supplier) {
		this.nombre_Supplier = nombre_Supplier;
	}
	public String getTelefono_Supplier() {
		return telefono_Supplier;
	}
	public void setTelefono_Supplier(String telefono_Supplier) {
		this.telefono_Supplier = telefono_Supplier;
	}
	
	
}