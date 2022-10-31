package curso.inicio.poo.excepciones;

public class Bar {
	
	/*
	  1 objeto de tipo CoffeCup(temperatura 1 - 100)
    1 objeto Cliente
 Cliente tome la taza de cafe, El cliente se ha quemado
                               El cliente deja el cafe  
	 */

	public static void main(String[] args) {
		//creamos un objeto coffecup
		CoffeCup cafe = new CoffeCup(Math.random()*100);
		
		//objeto de tipo cliente
		Cliente cliente = new Cliente("Cliente1");
		
		try {
			cliente.tomarCafe(cafe);
		} catch (TooHotTemperatureException e) {
			System.out.println("El cliente se ha quemado " + e.getMessage());
		} catch (TooColdTemperatureException e1) {
			System.out.println("El cliente se ha dejado el cafe " + e1.getMessage());
		}

	}

}
