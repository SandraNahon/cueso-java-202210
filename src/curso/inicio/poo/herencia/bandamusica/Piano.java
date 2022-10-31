package curso.inicio.poo.herencia.bandamusica;

public class Piano extends Instrumento{
	
	//atributo
	
	private int numOctavas;
	private int numPedales;
	
	//constructor
	public Piano(String nombre, String tipo, int precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}

	public Piano(String nombre, String tipo, int precio, String marca, int numOctavas, int numPedales) {
		super(nombre, tipo, precio, marca);
		this.numOctavas = numOctavas;
		this.numPedales = numPedales;
	}

	//set y get
	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public int getNumPedales() {
		return numPedales;
	}

	public void setNumPedales(int numPedales) {
		this.numPedales = numPedales;
	}

	@Override
	public String toString() {
		return "Piano [numOctavas=" + numOctavas + ", numPedales=" + numPedales + ", getNumOctavas()=" + getNumOctavas()
				+ ", getNumPedales()=" + getNumPedales() + ", getNombre()=" + getNombre() + ", getTipo()=" + getTipo()
				+ ", isPrecio()=" + isPrecio() + ", getMarca()=" + getMarca() + ", isAfinado()=" + isAfinado()
				+  ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
