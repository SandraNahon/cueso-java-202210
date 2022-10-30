package curso.inicio.poo.herencia;

public class clasePadre {
	private String nombre;
	private int edad;
	private boolean mayorEdad;
	

	public clasePadre(String nombre, int edad, boolean mayorEdad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.mayorEdad = mayorEdad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isMayorEdad() {
		return mayorEdad;
	}
	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	public int metodo1() {
		int num = 9;
		System.out.println("LLamada al metodo 1 de la clase padre");
		return num;
	}
	
	public int metodo3() {
		int num = 9;
		return num;
	}
	

}
