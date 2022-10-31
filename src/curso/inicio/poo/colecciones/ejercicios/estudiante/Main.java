package curso.inicio.poo.colecciones.ejercicios.estudiante;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	private List <Estudiante> estudiante ;
	
	public Main() {
		super();
		this.estudiante =  new ArrayList<Estudiante>();;
	}


	public static void main(String[] args) {
		
		Main main = new Main();
		main.crearEstudiantes();
		main.mostrarDatos();
		main.mostrarDatosMates();
		main.mostrarDatosAprobados();
		main.eliminarSuspendidos();

		
		
	}


	private void crearEstudiantes() {
		//ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		//Alumno 1
		Asignatura asig1Alum1 = new Asignatura("Matematicas", 7);
		Asignatura asig2Alum1 = new Asignatura("Fisica", 5);
		Asignatura asig3Alum1 = new Asignatura("lengua", 4);
		Asignatura asig4Alum1 = new Asignatura("biologia",3);
		
		//Asignatura[] asignaturas = {asig1,asig2,asig3,asig4};
		
		Set <Asignatura> asignaturas1 = new HashSet<Asignatura>();
		asignaturas1.add(asig1Alum1);
		asignaturas1.add(asig2Alum1);
		asignaturas1.add(asig3Alum1);
		asignaturas1.add(asig4Alum1);
		
		Estudiante estudiante1 = new Estudiante("Estudiante 1 "," A1 A2", "1111A", asignaturas1);
		estudiante.add(estudiante1);
		
		//Alumno 2
		Asignatura asig1Alum2 = new Asignatura("Matematicas", 5);
		Asignatura asig2Alum2 = new Asignatura("Fisica", 8);
		Asignatura asig3Alum2 = new Asignatura("lengua", 6);
		Asignatura asig4Alum2 = new Asignatura("biologia",3);
		
		Set <Asignatura> asignaturas2 = new HashSet<Asignatura>();
		asignaturas2.add(asig1Alum2);
		asignaturas2.add(asig2Alum2);
		asignaturas2.add(asig3Alum2);
		asignaturas2.add(asig4Alum2);
		
		Estudiante estudiante2 = new Estudiante("Estudiante 2"," A1 A2", "2222A", asignaturas2);
		estudiante.add(estudiante2);
		
		Asignatura asignaturas21 = new Asignatura("biologia",3);

		
		//Alumno 3
		Asignatura asig2Alum3 = new Asignatura("Fisica", 6);
		Asignatura asig3Alum3 = new Asignatura("lengua", 6);
		Asignatura asig4Alum3 = new Asignatura("biologia",4);
		
		Set <Asignatura> asignaturas3 = new HashSet<Asignatura>();
		asignaturas3.add(asig2Alum3);
		asignaturas3.add(asig3Alum3);
		asignaturas3.add(asig4Alum3);
		
		Estudiante estudiante3 = new Estudiante("Estudiante 3"," A1 A2", "3333A", asignaturas3);
		estudiante.add(estudiante3);
		
		//Alumno 4
		Asignatura asig1Alum4 = new Asignatura("Matematicas", 6);
		Asignatura asig2Alum4 = new Asignatura("Fisica", 7);
		Asignatura asig3Alum4 = new Asignatura("lengua", 6);
		Asignatura asig4Alum4 = new Asignatura("biologia",3);
		
		Set <Asignatura> asignaturas4 = new HashSet<Asignatura>();
		asignaturas4.add(asig1Alum4);
		asignaturas4.add(asig2Alum4);
		asignaturas4.add(asig3Alum4);
		asignaturas4.add(asig4Alum4);
		
		Estudiante estudiante4 = new Estudiante("Estudiante 4"," A1 A2", "4444A", asignaturas4);
		estudiante.add(estudiante4);
		
		//Alumno 5
		
		Asignatura asig2Alum5 = new Asignatura("Fisica", 8);
		Asignatura asig3Alum5 = new Asignatura("lengua", 7);
		Asignatura asig4Alum5 = new Asignatura("biologia",8);
		
		Set <Asignatura> asignaturas5 = new HashSet<Asignatura>();
	
		asignaturas5.add(asig2Alum5);
		asignaturas5.add(asig3Alum5);
		asignaturas5.add(asig4Alum5);
		
		Estudiante estudiante5 = new Estudiante("Estudiante 5"," A1 A2", "5555A", asignaturas5);
		estudiante.add(estudiante5);

	}
	
	private void mostrarDatos() {
		for (Estudiante es : estudiante) {
			System.out.println( es);
			for(Asignatura asignatura : es.getAsignaturas()) {
				System.out.println(asignatura);
			}
		}
		
	}
	
	private void mostrarDatosMates() {
		for (Estudiante es : estudiante) {
			boolean hayMates = false;
		for(Asignatura asignatura : es.getAsignaturas()) {
				if(asignatura.getNombreAsignatura().equals("Matematicas")) {
					hayMates = true;
				}
			}
		
		if(hayMates) {
			System.out.println(es);
		}
		
		}
	}
	
	private void mostrarDatosAprobados() {
		for (Estudiante es : estudiante) {
			double totalsuma = 0;
			int asign = 0;
		for(Asignatura asignatura : es.getAsignaturas()) {
			totalsuma += asignatura.getNota();
				asign++;
			}
		
		if(totalsuma/asign >= 5) {
			System.out.println("Alumno aprobado");
			System.out.println(es);
		}
		
		}
	}
	
	private void eliminarSuspendidos() {
		//elimina los suspendisos en lengua
		for (Estudiante es : estudiante) {
		for(Asignatura asignatura : es.getAsignaturas()) {
			if(asignatura.getNombreAsignatura().equals("Lengua") && asignatura.getNota() < 5) {
				estudiante.remove(es);
				
			}
		 }
	  }
   }
	
	

}




