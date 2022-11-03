package curso.inicio.ficheros;

import curso.inicio.ficheros.servicios.ArchivoServicio;

public class EjemploCrearArchivo {

	 public static void main(String[] args) {
	    	//Ruta relativa a la carpeta del proyecto
	        String nombreArchivo = "./recursos/java3.txt";

	        ArchivoServicio service = new ArchivoServicio();
	        service.crearArchivo2(nombreArchivo);
	    }

}
