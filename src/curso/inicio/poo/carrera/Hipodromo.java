package curso.inicio.poo.carrera;

public class Hipodromo {
	/*
	 (Main) creamos 1 carrera ,2 apostantes, 3 caballos --> 
    Por cada jugador llamamos a su metodo apostar() 
    una vez que todos hayan apostado se inicia la carrera
    jugador que acierte el caballo ganador( apuesta * 5)
	 */
	
	private String nombre;
	private Carrera carrera;
	private Jugador[] jugadores;
	private Caballo[] caballos;
	
	public Hipodromo(String nombre) {
		super();
		this.nombre = nombre;
	}
	

	public static void main(String[] args) {
		
		Hipodromo hipo1 = new Hipodromo("bienvenido al hipodromo de Madrid");
		hipo1.crearJugadores();
		hipo1.crearCaballos();
		hipo1.abrirHipodromo();
		
		//caballos
		//Caballo [] caballos = hipo1.crearCaballos();
		//hipo1.jugadorGanador(caballos);

	}
	
	private void crearJugadores() {
		jugadores = new Jugador[2];
		jugadores[0] = new Jugador("Jugador1", 1000);// En la posicion cero
		jugadores[1] = new Jugador("Jugador2", 2000);
		
	}
	
	private void crearCaballos() {
		caballos = new Caballo[3];
		caballos[0] = new Caballo(1,"Caballo1",8,3,10 );// En la posicion cero
		caballos[1] = new Caballo(2,"Caballo2",10,1,5);
		caballos[2] = new Caballo(3,"Caballo3",4,6,12);
	}
	
	private void abrirHipodromo() {
		this.carrera = new Carrera("Carrera1", 100,this.caballos);
		realizarApuesta();
		//se inicia la carrera
		int dorsalGanador = carrera.iniciarCarrera();
		
		//Comprobar apuestas
		comprobarApuestas(dorsalGanador);
	}
	
	private void realizarApuesta() {
		//Jugadores realizan apuestas
				for(Jugador jugador : jugadores) { //recorro todos los jugadores
					System.out.println("Jugador " + jugador.getNombre() + " Empieza a apostar");
					jugador.apostar(this.carrera.getCaballo());
				}
	}
	
	private void comprobarApuestas(int dorsalGanador) {
		for(Jugador jugador: jugadores) {
			if(dorsalGanador == jugador.getApuesta().getDorsal()) {

				double cantidadApostada = jugador.getApuesta().getCantidad();
				double saldo = jugador.getSaldo();
				System.out.println("El jugador " + jugador.getNombre() + "ha acertado la apuesta, ha ganado " + (cantidadApostada*5));
				jugador.setSaldo(saldo+=(cantidadApostada*5));
			}
			System.out.println("El jugador " + jugador.getNombre() + "tiene de saldo " + jugador.getSaldo());
			if(jugador.getSaldo() == 0) {
				System.out.println("El jugador " + jugador.getNombre() + " se ha arruinado");
			}
		}
	}
	
	/*
	private Caballo[] crearCaballos() {
		
		Caballo caballo1 = new Caballo(1, "Puka", 0, 0, 0);
		Caballo caballo2 = new Caballo(2, "Maika", 0, 0, 0);
		Caballo caballo3 = new Caballo(3, "Gus", 0, 0, 0);
		
		Jugador jugador1 = new Jugador("jugador1 ", 0);
		Jugador jugador2 = new Jugador("jugador2 ", 0);
		//por cada jugador llamamos al metodo apostar
		
		jugador1.apostar(null);
		jugador2.apostar(null);
		
		Carrera carrera1 = new Carrera("Carrera 1", 100, null);
		//una vez apostado se inicia la carrera
		carrera1.iniciarCarrera(null);
		return null;
	}*/
	

}


