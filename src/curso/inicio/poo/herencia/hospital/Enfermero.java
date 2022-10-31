package curso.inicio.poo.herencia.hospital;

public class Enfermero extends Datos implements IInterfaz1{
	
	private String seccion;
	private Paciente [] paciente;
	private SalaDeEspera[] sala;

	public Enfermero(String nombre, String apellido, String dni, String seccion,SalaDeEspera[] sala) {
		super(nombre, apellido, dni);
		this.seccion = seccion;
		this.sala = sala;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public SalaDeEspera[] getSala() {
		return sala;
	}

	public void setSala(SalaDeEspera[] sala) {
		this.sala = sala;
	}

	/**
	 * va a coger al paciente de la sala de espera y 
	 * lo va a llevar a la consulta
	 * @param consultas 
	 * @param pacientes 
	 */
	
	public static void atenderPaciente(Paciente[] pacientes, Consulta consultas) {
		System.out.println("El enfermero " + getNombre()  + " lleva al paciente ");
		
	}

	
	
	@Override
	public  void fichar() {
		System.out.println("El enfermero con el nombre " + this.getNombre() + " ha fichado");
		
	}
}
