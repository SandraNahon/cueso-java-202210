package curso.inicio.poo.mapas;

import java.util.Set;

import curso.inicio.poo.colecciones.ejercicios.estudiante.Asignatura;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	
	

	public Alumno(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "\t Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni  + "]";
	}
	
	


}
