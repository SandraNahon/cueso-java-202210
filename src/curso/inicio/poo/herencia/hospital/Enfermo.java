package curso.inicio.poo.herencia.hospital;

public class Enfermo extends Datos{
	
	private String enfermedad;

	public Enfermo(String nombre, String apellido, String dni, String enfermedad) {
		super(nombre, apellido, dni);
		this.enfermedad = enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	
}
