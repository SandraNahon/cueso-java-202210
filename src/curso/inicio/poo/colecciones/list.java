package curso.inicio.poo.colecciones;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		
		
//      ArrayList lista1 = new ArrayList();
		 
		 //vamos añadiendo , me permite guardar objetos de distintos tipos
//       lista1.add("hola");
//       lista1.add(1);
//		   lista1.add(new Boton("",""));
		 
		 //le decimos que tipo de elementos metemos en nuestro saco
		 //en este caso de tipo String
		
		 ArrayList<String> lista1 = new ArrayList<String>();
		 lista1.add("hola");
		 lista1.add("que");
		 lista1.add("tal?");
		 
		 //lo devuelve en orden excepto que indiques en 
		 //que posicion quieres insertarlo
		 
		 lista1.add(1,"Hoy es viernes por fin!!!");
		 
		 //como los recuperamos
		 for (String texto : lista1) {
			System.out.println(texto);
		}
		 //nos da el tamaño de nuestra lista
		 System.out.println(lista1.size());
		 //nis dice si esta vacio con un booleano
		 System.out.println(lista1.isEmpty());
		 //meter otra lista en la lista
		 lista1.addAll(lista1);
		 //nos dice si contiene un determinado valor o objeto
		  System.out.println(lista1.contains("Hola"));
		  //devuelve el obejeto que esta en una determinada posicion
		  lista1.get(3);
		  //en una determinada posicion cambia el valor
		  lista1.set(0, "hey");
		  
		  //eliminariamos la posicion 0
		   lista1.remove(0);
		   
		   //borrar por objeto
		   lista1.remove("hola");

	}

}
