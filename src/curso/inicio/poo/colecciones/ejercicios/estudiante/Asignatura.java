package curso.inicio.poo.colecciones.ejercicios.estudiante;

public class Asignatura {
	
	private String nombreAsignatura;
	private double nota;
	
	

	public Asignatura(String nombreAsignatura, double nota) {
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

	public double getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "\t Asignatura [nombreAsignatura=" + nombreAsignatura + ", nota=" + nota + "]";
	}
	

	

}
