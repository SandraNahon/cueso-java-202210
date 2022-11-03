package curso.inicio.ficheros;

import curso.inicio.ficheros.servicios.ArchivoServicio;

public class EjemploLeerArchivo {
	
	public static void main(String[] args) {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
    	String nombreArchivo = "./recursos/java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo(nombreArchivo));
    }

}
