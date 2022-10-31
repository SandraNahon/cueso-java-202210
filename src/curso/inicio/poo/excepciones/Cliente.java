package curso.inicio.poo.excepciones;

public class Cliente {
	private String nombre;

	//
	public Cliente( String nombre) {
		this.nombre = nombre;
		
	}

	//
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//
	public void tomarCafe(CoffeCup cafe) throws TooHotTemperatureException,TooColdTemperatureException{
		if(cafe.getTemperatura() < 20) {
			//System.out.println(cafe.getTemperatura());
			throw new TooColdTemperatureException(" Cafe muy frio " + cafe.getTemperatura());
			
		}else if(cafe.getTemperatura() > 80) {
			//System.out.println(cafe.getTemperatura());
			throw new TooHotTemperatureException(" Cafe muy caliente " + cafe.getTemperatura());
			
		}else {
			//System.out.println(cafe.getTemperatura());
			System.out.println("El cliente " + this.nombre + " se toma el cafe tranquilamente " + cafe.getTemperatura());
		}
	}

}
