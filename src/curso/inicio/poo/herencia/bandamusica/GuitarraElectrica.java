package curso.inicio.poo.herencia.bandamusica;

public class GuitarraElectrica extends Guitarra{

	//Atributos
	private double potencia;
	
	//contructor
	
	public GuitarraElectrica(String nombre, String tipo, int precio, String marca, String material, int numCuerdas,double potencia) {
		super(nombre, tipo, precio, marca, material, numCuerdas);
		this.potencia = potencia;
	}



	//get y set
	public double isPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	
	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + ", getMaterial()=" + getMaterial() + ", getNumCuerdas()="
				+ getNumCuerdas() + ", getNombre()=" + getNombre() + ", getTipo()=" + getTipo() + ", isPrecio()="
				+ isPrecio() + ", getMarca()=" + getMarca() + ", isAfinado()=" + isAfinado() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	//Metodos
	@Override
	public void tocar() {
		//concatenar
		super.tocar();
		System.out.println(" electrica con la potencia " + this.potencia);
	}


}
