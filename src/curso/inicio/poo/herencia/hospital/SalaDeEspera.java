package curso.inicio.poo.herencia.hospital;

public class SalaDeEspera {
private Paciente[] paciente;
	

	public SalaDeEspera(Paciente[] paciente) {
		super();
		this.paciente = paciente;
	}
	

	public Paciente[] getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente[] paciente) {
		this.paciente = paciente;
	}
	

}
