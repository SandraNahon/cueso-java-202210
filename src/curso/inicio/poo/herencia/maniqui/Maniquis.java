package curso.inicio.poo.herencia.maniqui;

public class Maniquis {
	private int id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	//Constructor
	public Maniquis(int id) {
		super();
		this.id = id;
		
	}
	public Maniquis(int id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
		System.out.println("vistiendo al maniqui con id" + id + "con un vestido de color " + vestido.getColor());
	}
	
	public Maniquis(int id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
		
		System.out.println("vistiendo al maniqui con id" + id + "con un pantalon y camisa");

	}

	//Get y Set
	public int getId() {
		return id;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
	//funciones

	void vestir(Camisa camisa, Pantalon pantalon) {
		desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;
		System.out.println("vistiendo al maniqui con id" + this.getId() + "con un pantalon y camisa");

		
	}
	
    void vestir(Vestido vestido) {
		this.vestido = vestido;
		System.out.println("vistiendo al maniqui con id" + this.getId() + "con un vestido de color " + vestido.getColor());

	}
	
	void desvestir() {
	/*	camisa = null;
		pantalon = null;
		vestido = null;*/
		if(camisa != null)
			camisa = null;
		//setCamisa(null); tamb vale
		
		if(pantalon != null)
			pantalon = null;
		
		if(vestido != null)
			vestido = null;
		
		
	}


}
