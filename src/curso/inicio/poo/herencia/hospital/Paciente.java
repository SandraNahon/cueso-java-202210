package curso.inicio.poo.herencia.hospital;

public class Paciente extends Datos{
		
		private String sintomas;

		public Paciente(String nombre, String apellido, String dni, String sintomas) {
			super(nombre, apellido, dni);
			this.sintomas = sintomas;
		}

		public String getSintomas() {
			return sintomas;
		}

		public void setSintomas(String sintomas) {
			this.sintomas = sintomas;
		}
		

}
