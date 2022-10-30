package curso.inicio;

import java.util.Scanner;

import curso.funciones.Utils;

public class Ejercicio1 {

public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		
		int opcion;

		
		do {
			System.out.println("Selecciona una de las siguientes opciones:");
			System.out.println("1. Pintar cuadrado. ");
			System.out.println("2. Validar email. ");
			System.out.println("3. Serie Fibonacci. ");
			System.out.println("4. Insertar nombres. ");
			System.out.println("5. Terminar.");
			
			opcion = input.nextInt();
			/*
			Menus.pideMenu();
			
			si metemos nosotros otras opciones
			String [] menu = {'opcion1 ...};
			opcion =  Integer.parseInt(Menus.pideMenu(menu));

			opcion =  Integer.parseInt(Menus.pideMenu());
			
			 */
			
			switch(opcion) {
				case 1: {
					//pintaCuadrado();
					System.out.println("Introduce tamanio");
					int tamanio = input.nextInt();
					for(int fila = 0; fila < tamanio ; fila ++){
						for(int col = 0; col < tamanio ; col ++){
							if(fila==0 || fila==tamanio-1 || col==0 || col==tamanio-1)
							    System.out.print("*");
							else
								System.out.print(" ");
						}
						System.out.println();
					}
					break;
				}
				case 2: {
					validarEmail();
					break;
				
				}
				case 3 :{
					
					int fibo1, fibo2, numero;
					
					 do{
				            System.out.print("Indica cuantos numeros de la serie Fibonacci quieres mostrar:  ");
				            numero = input.nextInt();
				            
				        }while(numero<=1);
				  
				        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

				        fibo1=1;
				        fibo2=1;

				        System.out.print(fibo1 + " ");
				        
				        for(int i = 2; i <= numero; i++){
				        	
				            System.out.print(fibo2 + " ");
				            
				            fibo2 = fibo1 + fibo2;
				            fibo1 = fibo2 - fibo1;
				            
				        }
				
					break;
				
				}
				
				case 4 :{
					
					System.out.println("Introduce el numero de alumnos: ");
					int numAlumnos = input.nextInt();
					
					String [] alumnos = new String[numAlumnos];
					
					for(int i = 0; i < alumnos.length; i++) {
						alumnos[i] = Utils.pideValor("Introduce nombre alumno " + (i+1));			
					}
					
					
					for(String nombreAlumno : alumnos) {
						System.out.println(nombreAlumno);
					}
					
					break;
				
				}
				case 5 : {
					System.out.println("\n\t\t FIN DE PROGRAMA");
					
					
				}
				default: {
					
					return;
				}
			}
			System.out.println();
			
		} while(opcion != 5);  
		System.out.println("Termina");
	}
	
	static void validarEmail() {
		
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("Introduce tu email");
		   String email = input.nextLine().trim();
		   //email = email.trim(); elimina a izq y dere espacios en blancio
		   String mensajeError = "";
		   
		   //validaciones email
		   //espacio es blanco
		   if(email.contains(" ")) {
			   mensajeError = "El email no puede contener espacios en blanco ";
		   }
		   
		   //solo una arroba
		   if(email.indexOf("@")==-1 || email.indexOf("@")!= email.lastIndexOf("@")) {
			   mensajeError = "Solo puede haber una @";

		   }
		   
		   //punto despues del @
		   
		   if(!email.substring(email.indexOf("@")).contains(".")) {
			   mensajeError = "Tiene que haber un punto despues del arroba";
		   }
		   
		   // 
		   
		   
		   if(mensajeError.equals("")) {
			   System.out.println("el email " + email + "es correcto");
		   } else {
			   System.out.println("el email " + email + "es incorrecto" + mensajeError);

		   }
		  
	}
	
	
}

