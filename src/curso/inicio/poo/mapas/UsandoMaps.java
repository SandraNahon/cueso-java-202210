package curso.inicio.poo.mapas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import curso.inicio.poo.colecciones.ejercicios.estudiante.Estudiante;
import curso.inicio.poo.herencia.hospital.Datos;

//import curso.inicio.poo.herencia.Estudiante;

public class UsandoMaps {

	public static void main(String[] args) {
		
		Map<String, Estudiante> mapa1 = new HashMap<String, Estudiante>();
		
		//para añadir informacion
		//creamo un objeto
		/*Estudiante est1 = new Estudiante("nombre1", 18, true);
		mapa1.put("111A", est1);*/
		Estudiante est1 = new Estudiante("nombre1", "apellido1", "111A");
		Estudiante est2 = new Estudiante("nombre2", "apellido2", "222B");
		mapa1.put(est1.getDni(), est1);
	//	mapa1.put(est2.getDni(), est2);
		
		Estudiante e = mapa1.put(est1.getDni(), est2);
		
		System.out.println(e.getNombre());
		
		//para buscar informacion
		
		Estudiante estudiante = mapa1.get("111A");
		System.out.println(mapa1.get("111A").getNombre());
		
		//System.out.println(estudiante.getNombre());
		
		Map <String, List<Datos>> hospital = new HashMap <String, List<Datos>>();
		hospital.put("Doctores", null);
		hospital.put("enfermeros", null);
		hospital.put("pacientes", null);
		
		
		/*if (mapa1.containsKey("111A")){
			
		}*/
		
		//devuelve un set con todas las claves de ese mapa
		for (String clave : mapa1.keySet()) {
			System.out.println(clave);
			System.out.println((mapa1.get(clave).getNombre()));
			
		}
		
		//te entrega todos los valores del mapa
		
		for( Estudiante estu : mapa1.values()) {
			System.out.println(estu.getNombre());
		}
		
		//devuelve la clave y el valor asociado a esa clave
		
		Set<Entry<String, Estudiante>> entrySet = mapa1.entrySet();
		
		for (Entry<String, Estudiante> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getNombre());
		}
		
		//
		
		

	}

}
