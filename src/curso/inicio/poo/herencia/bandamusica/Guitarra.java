package curso.inicio.poo.herencia.bandamusica;

public class Guitarra extends Instrumento{
	
	//Atributos
	private String material;
	private int numCuerdas = 5;
	
	//Constructor

	public Guitarra(String nombre, String tipo, int precio, String marca, String material, int numCuerdas) {
		super(nombre, tipo, precio, marca);
		this.material = material;
		this.numCuerdas = numCuerdas;
	}

	//getter y setters
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	//metodos
	
	@Override
	public void tocar() {
		
		if(isAfinado()) {
			System.out.println("Se esta tocando la guitarra " + getNombre() + " bien");
		}else {
			System.out.println("Se esta tocando la guitarra " + getNombre() + " mal");
		}
	}

	@Override
	public String toString() {
		return "Guitarra [material=" + material + ", numCuerdas=" + numCuerdas + ", getNombre()=" + getNombre()
				+ ", getTipo()=" + getTipo() + ", isPrecio()=" + isPrecio() + ", getMarca()=" + getMarca()
				+ ", isAfinado()=" + isAfinado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	



}
