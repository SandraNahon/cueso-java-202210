package curso.inicio.poo.colecciones;


import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		//set
		
		Set<String> colores = new HashSet<String>();
		
		
		boolean added = colores.add("amarillo");
		System.out.println(added);
		
		colores.add("Azul");
		colores.add("amarillo");//si hay un objeto duplicado no lo añade
		
		added = colores.add("amarillo");
		System.out.println(added);
		colores.add("rojo");
		colores.add("blanco");
		
		for (String colorin : colores) {
			System.out.println(colorin);
		}
		//no lo devuleve ordenado
		
		colores.isEmpty();
		//borrar
		colores.remove("rojo");
		System.out.println("=========================");
		for (String colorin : colores) {
			System.out.println(colorin);
		}
		// si contiene un determinado color
		colores.contains("blanco");
		// ----------------------------------------
		
		/*
		Set<Boton> botones = new HashSet<Boton>();
		Boton boton1 = new Boton("rojo","redondo");
		Boton boton2 = new Boton("verde","cuadrado");
		
		System.out.println(botones.add((boton1)));
		System.out.println(botones.add((boton2)));
		System.out.println(botones.size());
		
		//como recorremos un set
		for (Boton boton : botones) {
			System.out.println(boton.getColor());
		}
		*/
		
		//acceder a una determinada posicion
		
		
	}

}
