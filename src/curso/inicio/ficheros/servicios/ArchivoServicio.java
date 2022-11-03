package curso.inicio.ficheros.servicios;


import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){

            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo escribiendo en un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        
        //muestra el contenido del directorio
        if(archivo.isDirectory()) {
        	String [] ficheros = archivo.list();
        	for (String fichero : ficheros) {
				System.out.println(fichero);
			}
        }
        
        
        
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){

            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo acá escribiendo un archivo...");
            buffer.printf("Hasta luego %s!", "Lucas");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            while ( (linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    public void mostarDirectorio(String directorio){
        File dir = new File(directorio);
        
        if(dir.isDirectory()) {
        	String [] ficheros = dir.list();
        	for (String nombreFichero : ficheros) {
				System.out.println(nombreFichero);
				
				String nuevoFichero = directorio + nombreFichero;
				File file = new File(nuevoFichero);
				
				if(file.isDirectory()) {
					System.out.println("Es un directorio");
				}else {
					System.out.println("No es un directorio");
				}
			}
        }
    }
        
    
}