package curso.inicio.poo.herencia.maniqui;

public class Tienda {
private String nombreTienda;
	
	public Tienda(String nombreTienda) {
		super();
		this.nombreTienda = nombreTienda;
	}

	public static void main(String[] args) {
		
		Tienda tienda1 = new Tienda("Tienda1");
		Maniquis[] maniquis = tienda1.crearTienda();
		System.out.println("numero de maniquis " + maniquis.length);
		tienda1.importeTotalRopa(maniquis);
		//para quitar un boton
		maniquis[0].getCamisa().getBotones()[0] = null;
		/*
		 * con dos lineas de codigo
		Boton[] botonesCamisa = maniquis[0].getCamisa().getBotones()	
		botonesCamisa[0] = null;
				*/
				
	    maniquis[1].desvestir();
		

	}
	/**
	 * 
	 * @return
	 */
	
	private Maniquis[] crearTienda() {
		//Creamos botones
		Boton boton1 = new Boton("negro","redondo");
		Boton boton2 = new Boton("blanco","cuadrado");
		Boton boton3 = new Boton("verde","redondo");
		Boton boton4 = new Boton("azul","cuadrado");
		Boton boton5 = new Boton("negro","triangular");
		Boton boton6 = new Boton("rojo","redondo");
		
		
		Boton [] botonesCamisa1 = {boton1, boton2};
		Boton [] botonesCamisa2 = {boton3, boton4, boton5};
		
		//formas de ponerle los botones a la camisa
		Camisa camisa1  = new Camisa("Negra","L",40, botonesCamisa1);
		Camisa camisa2  = new Camisa("Negra","M",60);
		camisa2.setBotones(botonesCamisa2);
		
		Pantalon pantalon = new Pantalon("Vaquero", "40", 40, boton6);

		Vestido vestido = new Vestido("Verde","38",60);
		
		
		Maniquis maniqui1 = new Maniquis(1);
		Maniquis maniqui2 = new Maniquis(2, vestido);

		Maniquis[] maniquis ={maniqui1, maniqui2};
		
		maniqui1.vestir(camisa1,pantalon);
		
		return maniquis;
	}

	private void importeTotalRopa(Maniquis [] maniquis) {
		double totalImporte = 0.0;
		for(Maniquis maniqui : maniquis) {
			if(maniqui.getCamisa() != null)
				totalImporte += maniqui.getCamisa().getPrecio();
			
			if(maniqui.getVestido() != null)
				totalImporte += maniqui.getVestido().getPrecio();
			
			if(maniqui.getPantalon() != null)
				totalImporte += maniqui.getPantalon().getPrecio();
			
			// System.out.println(maniqui.getCamisa().getPrecio());
		}
		
		System.out.println("El precio de toda la ropa que llevan los maniquies es " + totalImporte);
	}


}
