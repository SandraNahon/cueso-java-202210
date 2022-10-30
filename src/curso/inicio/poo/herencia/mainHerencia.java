package curso.inicio.poo.herencia;

public class mainHerencia {

	public static void main(String[] args) {
	
	Estudiante estudiante = new Estudiante("alumno1", 18, true);
	estudiante.setAsignaturaFav("Matematicas");
	
	
	System.out.println("El nombre del estudiante es " + estudiante.getNombre()+" " + estudiante.getEdad() +" "  + estudiante.getAsignaturaFav());
	estudiante.metodo1();
	
	System.out.println(estudiante);
	
     }

}
