package curso.inicio.ficheros;

import java.io.FileNotFoundException;

import java.util.List;

import curso.inicio.ficheros.servicios.Alumno;
import curso.inicio.ficheros.servicios.LecturaFicheros;


public class Ejercicio1 {
/*
 * Ejercicio 1
	 leer el fichero alumnos.txt
	 creamos 1 objeto de tipo Alumno --> Guardar en una lista
	 Cuantos alumnos habia en el fichero
 
 */
	
	
	private static  final String FICHERO1 = "./recursos/alumnos.txt";
	private static  final String FICHERO2 = "./recursos/alumnos-colegio.txt";

	public static void main(String[] args) {
		
		LecturaFicheros lecturaFichero = new LecturaFicheros();
		
		try {
			List<Alumno> alumnos = lecturaFichero.leerArchivoEjercicio1(FICHERO1);
			System.out.println(alumnos.size());
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
}
