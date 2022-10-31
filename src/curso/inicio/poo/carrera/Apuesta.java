package curso.inicio.poo.carrera;

public class Apuesta {
	

	private int cantidad;
	private Caballo caballo;
	private int dorsal;
	
	//
	public Apuesta(int cantidad, Caballo caballo) {
		super();
		this.cantidad = cantidad;
		this.caballo = caballo;
	}
	
	public Apuesta(int cantidad, int  dorsal) {
		super();
		this.cantidad = cantidad;
		this.dorsal = dorsal;
	}

	//get y set
	public int getCantidad() {
		return cantidad;
	}

	public Caballo getCaballo() {
		return caballo;
	}

	public int getDorsal() {
		return dorsal;
	}

}
