package curso.inicio.poo.colecciones.ejercicios.estudiante;

public class Asignatura {
	
	private String nombreAsignatura;
	private int nota;
	
	

	public Asignatura(String nombreAsignatura, int nota) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.nota = nota;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	

}
