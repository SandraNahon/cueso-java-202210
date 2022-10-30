package curso.funciones;

import java.util.Scanner;

public class Utils {
	
	public static String pideValor(String texto) {
		String reply = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		reply = input.nextLine();
		
		
		return reply;
	}
	
	
	/**
	 * Función para solicitar un valor por consola
	 * variable = Integer.parseInt(Utils.pideValor("Introduce una opcion"));
	 * @returnString con el valor introducido
	 */
	
	public static String pideValor() {
		return pideValor("Introduce una opcion");
			
	}
	
	/**
	 * 
	 * @param textos
	 * @return
	 */
	
	public static String pideValor(String [] textos) {
		return pideValor("Introduce una opcion");
			
	}


}
