package curso.inicio.poo.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MainColegio {

	public static void main(String[] args) {
		
		MainColegio main = new MainColegio();
		Map<Colegio, List<Alumno>> colegios = main.crearColegio();
		
		main.mostrarDatosAlumnos(colegios);
		main.buscarAlumno(colegios, null);

	}
	
	
	private void buscarAlumno(Map<Colegio, List<Alumno>> colegios, String dni) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el dni del alumno a buscar : ");
		dni = input.next();
		
		for(Colegio cole : colegios.keySet()) {
			List<Alumno> alumnos = colegios.get(cole);
			for (Alumno alumno : alumnos) {
				if(alumno.getDni().equals(dni)) {
					System.out.println(cole);
					System.out.println(alumno);
				}
				
			}
		}
		
	}
	
	
	private void mostrarDatosAlumnos(Map<Colegio, List<Alumno>> colegios) {
		//primero la clave y a partir de la clave obtenemos su valor
		 //devuelve una coleccion de claves , en este caso de tipo colegio
		for(Colegio cole : colegios.keySet()) {
			System.out.println(cole);
			List<Alumno> alumnos = colegios.get(cole);
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
		}
		System.out.println("==============================================");
		
		
		//de manera direrccta
		//Accerder de manera directa a la clave y al valor
	
		/* 
		Set<Entry<Colegio,List<Alumno>>> colegiosEntry = colegios.entrySet();
		for (Entry<Colegio, List<Alumno>> entry : colegiosEntry) {
			Colegio cole = entry.getKey();
			System.out.println(cole);
			List<Alumno> alumnos = entry.getValue();
			for (Alumno  alumno : alumnos) {
				System.out.println(alumno);
			}
			*/
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue().toString());
		//}
		
	}
	
	private Map<Colegio, List<Alumno>> crearColegio() {
		
		Colegio cole1 = new Colegio("cole1", "dir1");
		Colegio cole2 = new Colegio("cole2", "dir2");
		
		Alumno alum1 = new Alumno("nombre1", "apellido1", "1111A");
		Alumno alum2 = new Alumno("nombre2", "apellido2", "2222B");
		Alumno alum3 = new Alumno("nombre3", "apellido3", "3333C");
		List<Alumno> alumnos1 = new ArrayList<>();
		alumnos1.add(alum1);
		alumnos1.add(alum2);
		alumnos1.add(alum3);

		Alumno alum4 = new Alumno("nombre4", "apellido4", "4444D");
		Alumno alum5 = new Alumno("nombre5", "apellido5", "5555E");
		Alumno alum6 = new Alumno("nombre6", "apellido6", "6666F");
		List<Alumno> alumnos2 = new ArrayList<>();
		alumnos2.add(alum4);
		alumnos2.add(alum5);
		alumnos2.add(alum6);
		
		//key tipo colegio valor alumno
		Map<Colegio, List<Alumno>> colegios = new HashMap<Colegio,List<Alumno>>();
		colegios.put(cole2, alumnos2); //seria la clave, 
		colegios.put(cole1, alumnos1);
		
		return colegios;
		
	}

}
