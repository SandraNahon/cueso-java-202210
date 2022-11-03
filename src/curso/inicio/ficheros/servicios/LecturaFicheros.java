package curso.inicio.ficheros.servicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import curso.inicio.ficheros.interfaces.IFicheros;

public class LecturaFicheros {
	
	 public List<Alumno>  leerArchivoEjercicio1(String nombre) throws FileNotFoundException{
	      
		 StringBuilder sb = new StringBuilder();
	     File archivo = new File(nombre);
	      
	     Scanner scan = new Scanner(archivo);
	     scan.useDelimiter("\n"); //accede a cada linea del fichero
	       
         //lista que almacena alumnos
         List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	        
         while (scan.hasNext()){
	    	  
            sb.append(scan.next()).append("\n");
            //me quedo con la linea que se esta leyendo
            String linea = scan.next();
            linea.strip(); //quita los espacios en blanco a izq y derch
            String [] datos = linea.strip().split("\\|"); //quita los espacios y y la contrabarra
            
            //cogemos la información
            String nombreAlumno = datos[0];
            String apellidoAlumno =  datos[1];
            String dniAlumno =  datos[2];
            String asignaturasAlumno = datos[3];
            
            String []asignaturas =  asignaturasAlumno.split(";");
            
            Set<String> setAsignaturaAlumno = new HashSet<String>();
            
            for (String asignatura : asignaturas) {
				setAsignaturaAlumno.add(asignatura);
			}
            
            //por cada linea tengo que generar un objeto
            Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, dniAlumno, setAsignaturaAlumno);
            
            //cada objeto se mete en una lista
            listaAlumnos.add(alumno);
            
            
	       }

	        return listaAlumnos;
	    }
	 
	 public Map<String,List<Alumno>> leerArchivoEjercicio2(String nombre) throws FileNotFoundException{
	        File archivo = new File(nombre);
	        Scanner scan = new Scanner(archivo);
	        scan.useDelimiter("\n");

	        //Creo el mapa donde almacenaré el nombre del colegio con los alumnos
	        Map<String,List<Alumno>> mapaColegioAlumnos = new HashMap<String,List<Alumno>>();
	        while (scan.hasNext()){
	        	String linea = scan.next();
	        	String[] datos = linea.strip().split("\\|");
	        	
	        	//Creacion de objetos
	        	//Recogemos información
	        	String colegio = datos[IFicheros.EJERCICIO2_POSICION_COLEGIO];
	        	String nombreAlumno=datos[IFicheros.EJERCICIO2_POSICION_NOMBRE];
	        	String apellidoAlumno=datos[IFicheros.EJERCICIO2_POSICION_APELLIDOS];
	        	String dniAlumno=datos[IFicheros.EJERCICIO2_POSICION_DNI];
	        	String asignaturasAlumno = datos[IFicheros.EJERCICIO2_POSICION_ASIGNATURAS];
	        	
	        	String [] asignaturas = asignaturasAlumno.split(";");
	        	
	        	Set<String> setAsignaturasAlumno = new HashSet<String>();
	        	for (String asignatura : asignaturas) {
	        		setAsignaturasAlumno.add(asignatura);
				}
	        	
	        	//Por cada línea genero un objeto
	        	Alumno alumno = new Alumno(nombreAlumno,apellidoAlumno,dniAlumno,setAsignaturasAlumno);
	            
	            //Miramos si el colegio esta en el mapa
	        	if (mapaColegioAlumnos.containsKey(colegio)) {
	        		List<Alumno> listaAlumnos = mapaColegioAlumnos.get(colegio);
	        		listaAlumnos.add(alumno);
	        		
	        	}else {//El colegio no está en el mapa, se añade nuevo
	        		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	        		listaAlumnos .add(alumno);
	        		mapaColegioAlumnos.put(colegio, listaAlumnos);
	        		//mapaColegioAlumnos.put(colegio, Arrays.asList(alumno));
	        	}
	        }

	        //Ejecución Varargs
	        //test("Azul","Rojo","Blanco","verde");
			
			return mapaColegioAlumnos;
		}
		
		//VARARGS
		private void test (String ...colores ) {
			for (String color : colores) {
				System.out.println(color);
			}
		}
		
		
 
}
