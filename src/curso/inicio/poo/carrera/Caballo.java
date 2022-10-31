package curso.inicio.poo.carrera;

public class Caballo {
	private static int dorsal;
	private static String nombre;
	private int velocidad;
	private int expererncia ;
	private int edad;
	
	private int distanciaTotalAvanzada;
	
	public Caballo(int dorsal, String nombre, int velocidad, int expererncia, int edad) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.expererncia = expererncia;
		this.edad = edad;
	}


	public static int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public static String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public double getExpererncia() {
		return expererncia;
	}


	public void setExpererncia(int expererncia) {
		this.expererncia = expererncia;
	}


	public double getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getDistanciaTotalAvanzada() {
		return distanciaTotalAvanzada;
	}


	public void setDistanciaTotalAvanzada(int distanciaTotalAvanzada) {
		this.distanciaTotalAvanzada = distanciaTotalAvanzada;
	}


	//funciones vel + ex + random - edad
	public int correr() {
	    int	avanza = this.velocidad + this.expererncia - this.edad;
	   // avanza = velocidad + experencia - edad + Math.random();
	    this.distanciaTotalAvanzada += avanza;
		System.out.println("El caballo con el dorsal " + this.dorsal + " ha avanzado " + avanza + "metros, lleva en total : " + distanciaTotalAvanzada);
		return avanza;
		
	}


}
