package curso.inicio.poo.colecciones.ejercicios.estudiante;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();
		
		Estudiante estudiante1 = new Estudiante("Estudiante 1 "," A1 A2", "1111A", null);
		Estudiante estudiante2 = new Estudiante("Estudiante 2"," A1 A2", "2222A", null);
		Estudiante estudiante3 = new Estudiante("Estudiante 3"," A1 A2", "3333A", null);
		Estudiante estudiante4 = new Estudiante("Estudiante 4"," A1 A2", "4444A", null);
		Estudiante estudiante5 = new Estudiante("Estudiante 5"," A1 A2", "5555A", null);
		
		System.out.println(estudiante1.getNombre());
		
		for (Estudiante estu : estudiante) {
			System.out.println(estu.getNombre());
		}
	
		//Asignatura asig1 = new Asignatura(null, 0);
		
		
		Asignatura asig1 = new Asignatura("Matematicas", 7);
		Asignatura asig2 = new Asignatura("Fisica", 5);
		Asignatura asig3 = new Asignatura("lengua", 4);
		Asignatura asig4 = new Asignatura("biologia",3);
		
		//Asignatura[] a = {asig1,asig2, asig3, asig4};
		
		Set<Asignatura> asig = new HashSet<Asignatura>();
		
		System.out.println(asig.add(asig1));
		System.out.println(asig.add(asig2));
		System.out.println(asig.add(asig3));
		System.out.println(asig.add(asig4));
		
	/*	for (Asignatura a : asig) {
			for (Estudiante es : estudiante) {
				System.out.println(es.getNombre());
			}
			System.out.println(a.getNombreAsignatura()+ " = " + a.getNota());
		}*/
		System.out.println();
		System.out.println(estudiante1.getNombre()+" : \n" + asig1.getNombreAsignatura()+ " = " + asig1.getNota());
		System.out.println();
		System.out.println(estudiante2.getNombre()+" : \n" + asig2.getNombreAsignatura()+ " = " + asig2.getNota() +", " + asig1.getNombreAsignatura()+ " = " + asig1.getNota());
		System.out.println();
		
		System.out.println("Alumnos que han cursado matematicas");
		
		
		
		/*
		 Set<Boton> botones = new HashSet<Boton>();
		Boton boton1 = new Boton("rojo","redondo");
		Boton boton2 = new Boton("verde","cuadrado");
		
		System.out.println(botones.add((boton1)));
		System.out.println(botones.add((boton2)));
		System.out.println(botones.size());
		 */
		
		

	}

}

