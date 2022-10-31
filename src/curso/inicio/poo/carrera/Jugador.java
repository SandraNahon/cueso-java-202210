package curso.inicio.poo.carrera;

import java.util.Scanner;

public class Jugador {

	private String nombre;
	private double saldo;
	private Apuesta apuesta;
	
	//constructor
	public Jugador(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		
	}

	//get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = d;
	}

	public Apuesta getApuesta() {
		return apuesta;
	}

	public void setApuesta(Apuesta apuesta) {
		this.apuesta = apuesta;
	}
	
	// metodo
	public void apostar(Caballo[] caballo) {
		
		Scanner input = new Scanner(System.in);
		int cant = 0;
		int dorsal = 0;
		boolean apuestaCorrecta = false;
		
		//controlo que la cantidad sea correcta
		do {
			System.out.println("¿Cuanto quieres apostar?");
			cant = input.nextInt();
			apuestaCorrecta = compruebaApuesta(cant);
	   }while (!apuestaCorrecta);
		
		System.out.println("¿Sobre que caballo quiere apostar (1, 2 o 3)?");
		for(Caballo caballos : caballo) {
			//texto += caballo.getDorsal() + ", ";
			}
		apuestaCorrecta = false;
		
		//creo la apuesta
		Apuesta apuesta = new Apuesta(dorsal, null);
		//Asigno la apuesta al jugador
		this.setApuesta(apuesta);
		//Actualizo el saldo quitandole la cant apostada
		this.saldo -= cant;
		
		}
		
		
	
/*	public void apostar(int saldo, Apuesta apuesta) {
		
		Scanner input = new Scanner(System.in);
		int cant = 0;
		int dorsal = 0;
		
		System.out.println("¿Cuanto quieres apostar?");
		cant = input.nextInt();
		if(cant < saldo) {
			System.out.println("No hay suficiente saldo");
		}else {
			System.out.println("¿Sobre que caballo quiere apostar (1, 2 o 3)?");
			int cab = input.nextInt();
			cab = Caballo.getDorsal();
				
			
		}
			
	}*/
		private boolean compruebaDorsal(int dorsal, Caballo [] caballo) {
			boolean apuestaDorsalCorrecta = false;
		
			for(Caballo caballos : caballo) {
				if(caballos.getDorsal() == dorsal) {
					apuestaDorsalCorrecta = true;
				}
		    }
			return apuestaDorsalCorrecta;
		}


	private boolean compruebaApuesta(double  cant) {
		 
		return cant <= this.saldo && cant > 0;
	}


}
