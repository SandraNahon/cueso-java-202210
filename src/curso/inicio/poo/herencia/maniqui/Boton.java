package curso.inicio.poo.herencia.maniqui;

/**
 *  Clase que representa a un objeto de tipo boton.
 * @author nahon
 *
 */
public class Boton {
	
	private String color;
	private String forma;
	
	
	public Boton(String color, String forma) {
		super();
		this.color = color;
		this.forma = forma;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	

}
