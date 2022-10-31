package curso.inicio.poo.herencia.bandamusica;

public class Bateria extends Instrumento{

	//atributos
	private int numTimbales;
	private int numPlatos;
	
	//constructor
	public Bateria(String nombre, String tipo, int precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}

	public Bateria(String nombre, String tipo, int precio, String marca, int numTimbales, int numPlatos) {
		super(nombre, tipo, precio, marca);
		this.numTimbales = numTimbales;
		this.numPlatos = numPlatos;
	}
	
	//get y set
	public int getNumTimbales() {
		return numTimbales;
	}

	public void setNumTimbales(int numTimbales) {
		this.numTimbales = numTimbales;
	}

	public int getNumPlatos() {
		return numPlatos;
	}

	public void setNumPlatos(int numPlatos) {
		this.numPlatos = numPlatos;
	}
	
	//metodos
	
	@Override
	public String toString() {
		return "Bateria [numTimbales=" + numTimbales + ", numPlatos=" + numPlatos + ", getNombre()=" + getNombre()
				+ ", getTipo()=" + getTipo() + ", isPrecio()=" + isPrecio() + ", getMarca()=" + getMarca()
				+ ", isAfinado()=" + isAfinado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void aporrear() {
		System.out.println("Aporreando la bateria " + this.getNombre());
	}
	


}
