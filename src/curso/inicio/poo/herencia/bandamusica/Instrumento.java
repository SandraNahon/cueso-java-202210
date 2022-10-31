package curso.inicio.poo.herencia.bandamusica;

public class Instrumento {
	//Atributos
		private String nombre;
		private String tipo;
		private double precio;
		private String marca;
		private boolean afinado;
		
		//constructor
		public Instrumento(String nombre, String tipo, double precio, String marca) {
			super();
			this.nombre = nombre;
			this.tipo = tipo;
			this.precio = precio;
			this.marca = marca;
		}

		//getter y setters
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double isPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public boolean isAfinado() {
			return afinado;
		}

		public void setAfinado(boolean afinado) {
			this.afinado = afinado;
		}

		//metodos
		//Esta bien
		public void afinar() {
			//aleatorio 1 -10 , si > 8 no esta bien afinado
			int num = (int) (Math.random() *10);
			if(num < 8) {
				System.out.println(num);
				System.out.println("El instrumento " + this.getNombre() + " se ha afinado correctamente");
			    this.afinado = true;
			}else if(num >= 8) {
				System.out.println(num);
				System.out.println("El instrumento " + this.getNombre() + " no se ha afinado correctamente ");
				this.afinado = false;
				
			}
			
		}
		
		public void tocar() {
			if(isAfinado()) {
				System.out.println("tocando el intrumento " + this.nombre + " bien");
			}else {
				System.out.println("Tocando el instrumento " + this.nombre + " mal");
			}
			
			
		}

		@Override
		public String toString() {
			return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", marca=" + marca
					+ ", afinado=" + afinado + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		
		


}
