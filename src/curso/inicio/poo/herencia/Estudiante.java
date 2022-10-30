package curso.inicio.poo.herencia;

public class Estudiante extends clasePadre{
	
	private String asignaturaFav;

	// 
	
	
	public Estudiante(String nombre, int edad, boolean mayorEdad) {
		super(nombre, edad, mayorEdad);
		//this.asignaturaFav = asignaturaFav;
	}
	
	public Estudiante(String nombre, int edad, boolean mayorEdad, String asignaturaFav) {
		super(nombre, edad, mayorEdad);
		this.asignaturaFav = asignaturaFav;
	}


	//get y set 
	
	public String getAsignaturaFav() {
		return asignaturaFav;
	}

	public void setAsignaturaFav(String asignaturaFav) {
		this.asignaturaFav = asignaturaFav;
	}
	
	//
	
	public void metodo2() {
		/* si no estuviera la clase padre creariamos un objeto
		ClasePadre cp = new ClasePadre(" ", 13, false);
		cp = 
		*/
		// sin crear un objeto puedo entyrar a esos objetos
		System.out.println(getNombre());
	}
	
	
	
	@Override
	public String toString() {
		return "Estudiante [asignaturaFav=" + asignaturaFav + ", getNombre()=" + getNombre() + ", getEdad()="
				+ getEdad()  + "]";
	}

	@Override
	public int metodo1() {
		// TODO Auto-generated method stub
		int numeroPadre = super.metodo1();
		int numeroHijo = numeroPadre + 7;
		//super.metodo1();
		System.out.println("Llamada metodo hija");
		return numeroHijo;
	}

}
