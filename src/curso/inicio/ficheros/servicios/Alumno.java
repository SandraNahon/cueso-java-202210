package curso.inicio.ficheros.servicios;

import java.util.Set;

import curso.inicio.poo.colecciones.ejercicios.estudiante.Asignatura;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private Set<String> asignaturas;
	
	

	public Alumno(String nombre, String apellidos, String dni, Set<String> asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.asignaturas = asignaturas;
	}



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
	
	

	public Set<String> getAsignaturas() {
		return asignaturas;
	}



	public void setAsignaturas(Set<String> asignaturas) {
		this.asignaturas = asignaturas;
	}



	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", asignaturas=" + asignaturas
				+ "]";
	}



}
