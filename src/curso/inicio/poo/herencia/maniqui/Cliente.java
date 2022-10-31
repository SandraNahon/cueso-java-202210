package curso.inicio.poo.herencia.maniqui;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dni;
	private double importeCompra = 0;
	

	public Cliente(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}

	
	public double getImporteCompra() {
		return importeCompra;
	}



	// funciones
	void comprar (double valorCompra) {
		this.importeCompra += valorCompra; //se actualiza con la ultima compra que haga
	}
	


}
