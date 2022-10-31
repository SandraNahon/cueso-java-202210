package curso.inicio.poo.herencia.hospital;

public class Hospital {
	
	/*
	- 4 Pacientes --> SalaDeEspera
	- 2 Doctores --> Cada uno de ellos en una consulta
	 2 Enfermeros --> cogen a los pacientes de la sala de espera, 
	 y los asignan a una consulta
	 De la consulta a la que se ha aginado el paciente, 
	 el doctor le diagnostica, si el paciente esta gravé(aleatorio >7) 
	 se ingresa al Enfermo en la primera habitacion vacia

	 Empleados del Hospital fichar()
	 enfermeros y los doctores

	 */
	
	//salaDeEspera(4) y Habitaciones(3)
	private String nombre;
	private String [] SalaDeEspera;
	private Consulta [] consultas;
	private String [] habitaciones;
	private Enfermero [] enfermeros;
	
	private Doctor[] doctor;
	

	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
	}
	


	public static void main(String[] args) {
		Hospital hospital = new Hospital("Hospital La Paz");
		
		Paciente[] pacientes = hospital.salaEspera();
		hospital.consultas(pacientes);

	}
	
	
	public void crearDoctores() {
		//Doctor doctor1 = new Doctor(nombre, nombre, nombre, nombre);
		doctor = new Doctor[2];
		doctor[0] = new Doctor("Marc", "Sloan", "1111A", "otorrinolaringólogo");
		doctor[1] = new Doctor("Dereck", "Sheperd", "2222B", "Neurologo");
				
	}
	
	public void crearEnfermeros() {
		enfermeros = new Enfermero[2];
		enfermeros[0] = new Enfermero("Lexy", "Grey", "3333C", "Cardio", null);
		enfermeros[2] = new Enfermero("Miranda", "Baely", "4444D", "rayos", null);

	}
	
	public Paciente[] salaEspera() {
		Paciente[] paciente = new Paciente[4];
		paciente[0] = new Paciente("Caliope", "Torres", "5555E", "Dolor de pecho");
		paciente[2] = new Paciente("Arizona", "Robins", "6666F", "Dolor abdominal");
		paciente[3] = new Paciente("Alex", "Garcia", "7777G", "Rotura ligamentos");
		paciente[4] = new Paciente("Ben", "Hernandez", "8888H", "Dolor de cabeza");
		
	    Paciente[] pacientes = {paciente[0], paciente[1], paciente[2], paciente[3]};
		
		return pacientes;
	}
	
	public void consultas(Paciente[] pacientes) {
		consultas = new Consulta[2];
		Enfermo [] habitaciones = new Enfermo[3];
		boolean resultados;
		
		
		//Recooro S.E
		for(int i = 0; i < pacientes.length ; i++) {
			if(pacientes[i] == null) {
				consultas[0] = new Consulta(doctor[0], null); 
				consultas[1] = new Consulta(doctor[1], null);
			} else {
				
				//Recorro el array y asigno al paciente
				for(int j = 0; j < consultas.length; j++) {
					enfermeros[i].atenderPaciente(pacientes, consultas[j]);
					System.out.println("El paciente " + consultas[j].getPaciente() + "le esta atendiendo el doctor " + consultas[j].getDoctor());
					consultas[0] = new Consulta(doctor[0], pacientes[i]); 
					consultas[1] = new Consulta(doctor[1], pacientes[i]);
					resultados = consultas[j].getDoctor().diagnosticar(consultas[j].getPaciente());

					pacientes[i] = null;
					
					if(resultados == true) {
					Enfermo enfermoIngresado = new Enfermo(nombre, nombre, nombre, nombre);
					
					habitaciones[0] = new Enfermo(nombre, nombre, nombre, nombre);
					habitaciones[1] = new Enfermo(nombre, nombre, nombre, nombre);
					habitaciones[2] = new Enfermo(nombre, nombre, nombre, nombre);
					}
				}
			}
		}
	}
	

}
