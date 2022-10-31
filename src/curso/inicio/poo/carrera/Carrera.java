package curso.inicio.poo.carrera;

public class Carrera {
	private String nombre;
	private int distancia = 0;
	private Caballo[] caballo;
	private Caballo caballoGanador;
	
	public Carrera(String nombre, int distancia, Caballo[] caballo) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballo = caballo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public Caballo[] getCaballo() {
		return caballo;
	}

	public void setCaballo(Caballo[] caballo) {
		this.caballo = caballo;
	}
	
	public Caballo getCaballoGanador() {
		return caballoGanador;
	}

	public void setCaballoGanador(Caballo caballoGanador) {
		this.caballoGanador = caballoGanador;
	}
	
	/**
	 * lanza la carrera de cqaballos y devuelve el dorsal del caballo ganador
	 * @return
	 */
	
	public int iniciarCarrera() {
		System.out.println("Empieza la carrera" + this.nombre);
		//Caballo caballoGanador = null;
		boolean hayGanador = false;
		
		do {
			
			System.out.println("Los caballos estan corriendo");
			for(Caballo caballos : caballo) {
				caballos.correr();
			}
			hayGanador = comprobarGanador();
			
		}while (!hayGanador);
			
			System.out.println("Ha ganado el caballo con dorsal : " + this.caballoGanador.getDorsal());
			return distancia;
		
	}

	private boolean comprobarGanador() {
		int mayorDistancia = 0;
		for(Caballo caballos : caballo) {
			//para saber que caballos han llegado al final
			if(caballos.getDistanciaTotalAvanzada() > this.distancia) {
				//para saber cual ha ganado
				if(caballos.getDistanciaTotalAvanzada() > mayorDistancia) {
					mayorDistancia = caballos.getDistanciaTotalAvanzada();
					this.caballoGanador = caballos;
				}
			}
		}
		//System.out.println();
		return this.caballoGanador != null;
	}
	

}
