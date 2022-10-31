package curso.inicio.poo.herencia.bandamusica;

public class BandaMusica {

	public static void main(String[] args) {
		BandaMusica banda = new BandaMusica();
		Instrumento[] instrumentos = banda.crearBanda();
		banda.iniciarConcierto(instrumentos);
		
	}
	
	public Instrumento[] crearBanda() {
		Guitarra guitarra = new Guitarra("Guitarra1","Española", 55, "Alhambra", "madera", 5);
		GuitarraElectrica guitarraelectrica = new GuitarraElectrica("GE-1", "Electrica", 500, "fender", "plastico", 5, 120);
		Bateria bateria = new Bateria("Bateria1", "tipo1", 1000, "Marca1", 2, 2);
		Piano piano = new Piano("Piano1", "cola", 50, "Marca1", 4, 2);
		
		Instrumento[] instrumentos = {guitarra,guitarraelectrica, bateria, piano};
		
		
		return instrumentos;
		
	}
	
	private void iniciarConcierto(Instrumento[] instrumentos) {
		//Afinamos los instrumentos, lo recorro con un for
		for(Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		//Los ponemos a tocar
		for(Instrumento instrumento : instrumentos) {
			if(instrumento instanceof Bateria) {
			//((Bateria)instrumento).aporrear();
			Bateria b = (Bateria)instrumento;
			b.aporrear();
			
		}else {
			instrumento.tocar();
		}
		}
	}

}
