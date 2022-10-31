package curso.inicio.poo.herencia.hospital;

public class Doctor extends Datos{
	
	//Atributos
	private String especialidad;
	private Enfermo enfermo;

	//Constructor
	public Doctor(String nombre, String apellido, String dni, String especialidad) {
		super(nombre, apellido, dni);
		this.especialidad = especialidad;
	}
	
	//get y set
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	//metodos
	/**
	 * devuelve un enfermo
	 * @param paciente
	 * @return 
	 */
	public boolean  diagnosticar(Paciente paciente) {
		int num = (int) (Math.random() * 10);
		boolean grave = false;
		if(num >= 7) {
			grave = true;
			System.out.println("El enfermo esta grave, se ingresa");
		}else if(num < 7) {
			grave = false;
			System.out.println("EL enfermo no esta grave, se  va para su casa");
		}
		return grave;
	}

}
